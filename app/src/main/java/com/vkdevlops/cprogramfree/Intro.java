package com.vkdevlops.cprogramfree;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Intro extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;

    Animation top_anim,bottom_anim;
    ImageView intro_img;
    TextView main_text,text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);
        top_anim = AnimationUtils.loadAnimation(this,R.anim.top_intro_anim);
        bottom_anim = AnimationUtils.loadAnimation(this,R.anim.bottom_intro_anim);

        top_anim.setDuration(2000);
        bottom_anim.setDuration(1500);


        intro_img = findViewById(R.id.intro_img);
        main_text = findViewById(R.id.textView2);
        text = findViewById(R.id.textview3);

        intro_img.setAnimation(top_anim);
        main_text.setAnimation(bottom_anim);
        text.setAnimation(bottom_anim);

        final SharedPreferences sharedPreferences = getSharedPreferences("MyPref",MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sharedPreferences.getBoolean("getintro",true)){
                    editor.putInt("share_count",5);
                    editor.putBoolean("getintro",false);
                    editor.apply();
                    Intent intent = new Intent(Intro.this, Introduction.class);
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent = new Intent(Intro.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        },SPLASH_SCREEN);
    }
}
