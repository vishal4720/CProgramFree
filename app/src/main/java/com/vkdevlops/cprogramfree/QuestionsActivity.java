package com.vkdevlops.cprogramfree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class QuestionsActivity extends AppCompatActivity {

    ImageButton back;
    TextView question,question_no;
    FloatingActionButton bookmark;
    LinearLayout options;
    Button share,next;
    int count =0;
    List<QuestionsModal> list = new ArrayList<>();
    int position = 0;
    private int score = 0;
    private String setId;
    Dialog progressdialog,sharedialog;
    int matchedQuestionPosition;

    List<QuestionsModal> bookmarklist;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Gson gson;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference Myref = database.getReference();

    InterstitialAd interstitialAd;
    RewardedAd mRewardedAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        //loadAd();
        mRewardedAd = new RewardedAd(this,getString(R.string.VideoAd_id));

        sharedPreferences = getSharedPreferences("MyPref",MODE_PRIVATE);
        editor = sharedPreferences.edit();
        gson = new Gson();
        getBookmark();

        question = findViewById(R.id.question);
        back = findViewById(R.id.quizzes_sets_back);
        question_no = findViewById(R.id.question_no);
        bookmark = findViewById(R.id.bookmark_btn);
        options = findViewById(R.id.options_container);
        share = findViewById(R.id.share_btn);
        next = findViewById(R.id.next_btn);
        sharedialog = new Dialog(this);
        sharedialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        setId = getIntent().getStringExtra("setId");
        bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modelMatch()){
                    bookmarklist.remove(matchedQuestionPosition);
                    bookmark.setImageDrawable(getDrawable(R.drawable.bookmark_border));
                }else{
                    bookmarklist.add(list.get(position));
                    bookmark.setImageDrawable(getDrawable(R.drawable.bookmark));
                }
            }
        });



        progressdialog  = new Dialog(this);
        progressdialog.setContentView(R.layout.loading);
        progressdialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.button));
        progressdialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        progressdialog.setCancelable(false);



        list = new ArrayList<>();

        progressdialog.show();
        Myref.child("SETS").child(setId).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    String id = dataSnapshot.getKey();
                    String question = dataSnapshot.child("question").getValue().toString();
                    String a = dataSnapshot.child("optionA").getValue().toString();
                    String b = dataSnapshot.child("optionB").getValue().toString();
                    String c = dataSnapshot.child("optionC").getValue().toString();
                    String d = dataSnapshot.child("optionD").getValue().toString();
                    String correctAns = dataSnapshot.child("correctAns").getValue().toString();

                    list.add(new QuestionsModal(question,a,b,c,d,correctAns,id,setId));
                }
                if (list.size() > 0){
                    playanim(question,0,list.get(position).getQuestion());
                    for (int i=0;i<4;i++){
                        options.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                checkAnswer(((Button)v));
                            }
                        });
                    }
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            next.setEnabled(false);
                            next.setAlpha((float) 0.7);
                            enabledoption(true);
                            position++;
                            if (position == list.size()){
                                if (interstitialAd.isLoaded()){
                                    interstitialAd.show();
                                    return;
                                }
                                Intent intent = new Intent(getApplicationContext(),ScoreActivity.class);
                                intent.putExtra("score",score);
                                intent.putExtra("total",list.size());
                                startActivity(intent);
                                finish();
                                return;
                            }
                            count = 0;
                            playanim(question,0,list.get(position).getQuestion());
                        }
                    });

                    share.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ImageButton share_final,rewarded;
                            final TextView credits;

                            sharedialog.setContentView(R.layout.share_pop);
                            share_final = sharedialog.findViewById(R.id.share_final_btn);
                            rewarded = sharedialog.findViewById(R.id.rewarded_ad_btn);
                            credits = sharedialog.findViewById(R.id.credits_txt);
                            setCountText(credits);
                            share_final.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if (sharedPreferences.getInt("share_count",0)>0){
                                        SharedPreferences.Editor editor = sharedPreferences.edit();
                                        editor.putInt("share_count",sharedPreferences.getInt("share_count",0)-1);
                                        editor.apply();
                                        String body = "Q. " + list.get(position).getQuestion() + "\n" +
                                                list.get(position).getOptionA() +"\n" +
                                                list.get(position).getOptionB() +"\n" +
                                                list.get(position).getOptionC() +"\n" +
                                                list.get(position).getOptionD() + "\n\n\n" +
                                                "Test your own knowledge now !!" + "\n" +
                                                "https://play.google.com/store/apps/details?id=com.vkdevlops.cprogramfree";

                                        Intent intent = new Intent(Intent.ACTION_SEND);
                                        intent.setType("text/plain");
                                        intent.putExtra(Intent.EXTRA_TEXT,body);
                                        startActivity(Intent.createChooser(intent,"Share via"));
                                        setCountText(credits);
                                    }else{
                                        Toast.makeText(getApplication(),"Don't have enough points",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                            rewarded.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    VideoAd(credits);
                                }
                            });
                            sharedialog.show();

                        }
                    });
                    progressdialog.dismiss();
                }else{
                    finish();
                    Toast.makeText(getApplicationContext(),"No Question",Toast.LENGTH_SHORT).show();
                }
                progressdialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_SHORT).show();
                progressdialog.dismiss();
                finish();
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        storeBookmarks();
    }

    private void playanim(final View view, final int value, final String data){
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100)
                .setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                if (value == 0 && count < 4){
                    String option ="";
                    switch (count){
                        case 0:
                            option = list.get(position).getOptionA();
                            break;
                        case 1:
                            option = list.get(position).getOptionB();
                            break;
                        case 2:
                            option = list.get(position).getOptionC();
                            break;
                        case 3:
                            option = list.get(position).getOptionD();
                            break;
                    }
                    playanim(options.getChildAt(count),0,option);
                    count++;
                }
            }

            @Override
            public void onAnimationEnd(Animator animation) {

                if (value == 0){
                    try {
                        ((TextView)view).setText(data);
                        question_no.setText(String.valueOf(position+1)+"/"+String.valueOf(list.size()));

                        if (modelMatch()){
                            bookmark.setImageDrawable(getDrawable(R.drawable.bookmark));
                        }else{
                            bookmark.setImageDrawable(getDrawable(R.drawable.bookmark_border));
                        }

                    }catch (ClassCastException ex){
                        ((Button)view).setText(data);
                    }
                    view.setTag(data);
                    playanim(view,1,data);
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    private void checkAnswer(Button selectedoption){
        enabledoption(false);
        next.setEnabled(true);
        next.setAlpha(1);
        if (selectedoption.getText().toString().equals(list.get(position).getCorrectAns())){
            selectedoption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));
            score++;
        }else{
            selectedoption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff0000")));
            Button correctoption = (Button) options.findViewWithTag(list.get(position).getCorrectAns());
            correctoption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));
        }
    }

    private void enabledoption(boolean enable){
        for(int i = 0; i<4; i++) {
            options.getChildAt(i).setEnabled(enable);
            if (enable) {
                options.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#989898")));
            }
        }
    }

    private void getBookmark(){
        String json = sharedPreferences.getString("bookmark","");

        Type type = new TypeToken<List<QuestionsModal>>(){}.getType();

        bookmarklist = gson.fromJson(json,type);
        if (bookmarklist == null){
            bookmarklist = new ArrayList<>();
        }
    }

    private boolean modelMatch(){
        boolean matched = false;
        int i =0;
        for (QuestionsModal modal : bookmarklist){
            if (modal.getQuestion().equals(list.get(position).getQuestion())
            && modal.getCorrectAns().equals(list.get(position).getCorrectAns())
            && modal.getSetNo() == list.get(position).getSetNo()){
                matched = true;
                matchedQuestionPosition = i;
            }
            i++;
        }
        return matched;
    }

    private void storeBookmarks(){
        String json = gson.toJson(bookmarklist);
        editor.putString("bookmark",json);
        editor.apply();
    }

    public void setCountText(TextView text){
        String share = getResources().getString(R.string.share_text);
        share = share.concat(String.valueOf(sharedPreferences.getInt("share_count",0)));
        text.setText(share);
    }

    private void loadAd(){
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.InterstitialAd_id));
        interstitialAd.loadAd(new AdRequest.Builder().build());

        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(getApplicationContext(),ScoreActivity.class);
                intent.putExtra("score",score);
                intent.putExtra("total",list.size());
                startActivity(intent);
                finish();
                return;
            }
        });
    }

    private void VideoAd(final TextView credits){
        Toast.makeText(this, "Please wait Video is loading !!", Toast.LENGTH_SHORT).show();
        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {
                // Ad successfully loaded.
                Toast.makeText(QuestionsActivity.this, "Rewarded Ad Loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRewardedAdFailedToLoad(LoadAdError adError) {
                // Ad failed to load.
                Toast.makeText(QuestionsActivity.this, "Failed to Load Ad!! Check your connection.", Toast.LENGTH_SHORT).show();
            }
        };

        mRewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);

        if (mRewardedAd.isLoaded()) {
            Activity activityContext = QuestionsActivity.this;
            RewardedAdCallback adCallback = new RewardedAdCallback() {
                @Override
                public void onRewardedAdOpened() {
                    // Ad opened.
                }

                @Override
                public void onRewardedAdClosed() {
                    // Ad closed.
                }

                @Override
                public void onUserEarnedReward(@NonNull RewardItem reward) {
                    // User earned reward.
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("share_count",sharedPreferences.getInt("share_count",0)+2);
                    editor.apply();
                    setCountText(credits);
                    Toast.makeText(QuestionsActivity.this, "Credits Added Successfully", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onRewardedAdFailedToShow(AdError adError) {
                    // Ad failed to display.
                }
            };
            mRewardedAd.show(activityContext, adCallback);
        }
    }
}