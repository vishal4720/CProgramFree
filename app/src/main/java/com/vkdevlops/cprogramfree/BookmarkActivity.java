package com.vkdevlops.cprogramfree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vkdevlops.cprogramfree.adapter.BookmarkAdapter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BookmarkActivity extends AppCompatActivity {

    ImageButton back;
    RecyclerView recyclerView;

    List<QuestionsModal> bookmarklist;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);

        loadAd();
        sharedPreferences = getSharedPreferences("MyPref",MODE_PRIVATE);
        editor = sharedPreferences.edit();
        gson = new Gson();
        getBookmark();

        back = findViewById(R.id.bookmark_back);
        recyclerView = findViewById(R.id.bookmark_rv);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);


        BookmarkAdapter adapter = new BookmarkAdapter(bookmarklist);
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onPause() {
        super.onPause();
        storeBookmarks();
    }

    private void getBookmark(){
        String json = sharedPreferences.getString("bookmark","");

        Type type = new TypeToken<List<QuestionsModal>>(){}.getType();

        bookmarklist = gson.fromJson(json,type);
        if (bookmarklist == null){
            bookmarklist = new ArrayList<>();
        }
    }

    private void storeBookmarks(){
        String json = gson.toJson(bookmarklist);
        editor.putString("bookmark",json);
        editor.apply();
    }

    private void loadAd(){
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}