package com.vkdevlops.cprogramfree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.vkdevlops.cprogramfree.adapter.QuizzesCategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class Quizzes extends AppCompatActivity {

    ImageButton back;
    RecyclerView recyclerView;
    public static List<QuizzesModal> list;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference Myref = database.getReference();

    Dialog progressdialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        MobileAds.initialize(this);

        //loadAd();

        back = findViewById(R.id.quizzes_back);
        recyclerView = findViewById(R.id.quizzes_category_rv);
        progressdialog  = new Dialog(this);
        progressdialog.setContentView(R.layout.loading);
        progressdialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.button));
        progressdialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        progressdialog.setCancelable(false);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        list = new ArrayList<>();

        final QuizzesCategoryAdapter quizzesCategoryAdapter = new QuizzesCategoryAdapter(list,this);
        recyclerView.setAdapter(quizzesCategoryAdapter);

        progressdialog.show();
        Myref.child("Categories").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){

                    List<String> sets = new ArrayList<>();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.child("sets").getChildren()){
                        sets.add(dataSnapshot1.getKey());
                    }
                    list.add(new QuizzesModal(dataSnapshot.child("name").getValue().toString(),
                            sets,dataSnapshot.getKey()));
                }
                quizzesCategoryAdapter.notifyDataSetChanged();
                progressdialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_SHORT).show();
                progressdialog.dismiss();
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void loadAd(){
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}