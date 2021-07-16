package com.vkdevlops.cprogramfree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.vkdevlops.cprogramfree.adapter.SetsAdapter;

import java.util.List;

public class SetsActivity extends AppCompatActivity {

    GridView gridView;
    ImageButton back;
    List<String> sets;
    InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);
        //loadAd();

        gridView = findViewById(R.id.gridview);
        back = findViewById(R.id.quizzes_sets_back);

        sets = Quizzes.list.get(getIntent().getIntExtra("position",0)).getSets();

        SetsAdapter setsAdapter = new SetsAdapter(sets,getIntent().getStringExtra("title"),interstitialAd);
        gridView.setAdapter(setsAdapter);

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

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.InterstitialAd_id));
        interstitialAd.loadAd(new AdRequest.Builder().build());

    }
}