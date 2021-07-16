package com.vkdevlops.cprogramfree;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.vkdevlops.cprogramfree.adapter.IntroductionPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class Introduction extends AppCompatActivity {

    private ViewPager screenpager;
    IntroductionPagerAdapter introductionPagerAdapter;
    TabLayout tabLayout;
    Button nxtButton,btngetstarted;
    int position;
    Animation btnanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_introduction);
        tabLayout = findViewById(R.id.intro_tabLayout);
        nxtButton = findViewById(R.id.nxt_btn);
        btngetstarted = findViewById(R.id.get_started);

        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("C Programs, Covering all Topics","Practicing basic and advance concepts of C Programming.",R.drawable.introduction_1));
        mList.add(new ScreenItem("Huge Collection of ASCII Pattern Programs","Understand how loops can be used to generate different ASCII art Patterns.",R.drawable.introduction_2));
        mList.add(new ScreenItem("Study Stuff","About C, Features, Comparision, Definitions and a lot more study stuff related to C programming.",R.drawable.introduction_3));
        mList.add(new ScreenItem("Quizzes","Practice your knowledge by giving Quizzes and you will get high quality questions with proper topics and difficulty Levels",R.drawable.introduction_4));

        screenpager = findViewById(R.id.introduction_pager);
        introductionPagerAdapter = new IntroductionPagerAdapter(this,mList);
        screenpager.setAdapter(introductionPagerAdapter);

        tabLayout.setupWithViewPager(screenpager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == mList.size()-1){
                    loadlastscreen();
                }else{
                    loadscreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        nxtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = screenpager.getCurrentItem();
                if (position<mList.size()){
                    position++;
                    screenpager.setCurrentItem(position);
                }
                if (position==mList.size()-1){
                    loadlastscreen();
                }
            }
        });
        btngetstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("intro",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("getintro",false);
                editor.apply();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void loadlastscreen(){
        btnanim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);
        btnanim.setDuration(600);
        nxtButton.setVisibility(View.INVISIBLE);
        btngetstarted.setVisibility(View.VISIBLE);
        tabLayout.setVisibility(View.INVISIBLE);
        btngetstarted.setAnimation(btnanim);

    }


    public void loadscreen(){
        nxtButton.setVisibility(View.VISIBLE);
        btngetstarted.setVisibility(View.INVISIBLE);
        tabLayout.setVisibility(View.VISIBLE);
    }
}