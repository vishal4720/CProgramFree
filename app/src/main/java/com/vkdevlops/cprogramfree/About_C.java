package com.vkdevlops.cprogramfree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class About_C extends AppCompatActivity {

    ImageButton back,increase,decrease;
    TextView data,title;
    int size = 14;
    String d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__c);
        loadAd();

        title = findViewById(R.id.about_c_title);
        data = findViewById(R.id.about_c_data);
        back = findViewById(R.id.about_c_back);
        increase = findViewById(R.id.increases_size_study);
        decrease = findViewById(R.id.decrease_size_study);

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size += 1;
                data.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
                data.setText(Html.fromHtml(d));
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size -= 1;
                data.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
                data.setText(Html.fromHtml(d));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        int pos = getIntent().getIntExtra("study",0);

        switch (pos){
            case 1:
                d = "C is a general-purpose procedure-oriented programming language developed by Dennis Ritchie in 1972 at Bell Telephone Laboratories.<br/><br/>C evolved from older languages like BCPL and B language<br/><br/>C is a middle-level language as it has features of both high-level (development of the program is more straight forward and more understandable) and low-level languages (direct interaction with hardware).<br/><br/>" +
                        "Previous languages (BCPL and B) from which C is evolved are 'type-less' languages, C introduced the concept of data-types and many other features.<br/><br/>Unix operating system and its applications are almost entirely written in C. The UNIX operating system's development started in 1969, and its code was rewritten in C in 1972. The C language was actually created to move the UNIX kernal code from assembly to a higher-level language, which would do the same task with fewer lines of code.<br/><br/>" +
                        "The latest version of C is 'C11' (released in 2011), and in 2018 its refined version 'C18' is published with only technical corrections and clarifications to defects.<br/>";
                data.setText(Html.fromHtml(d));
                title.setText("Introduction to C");
                break;

            case 3:
                d = "<b><font color=#F3612E>General-Purpose Programming Language :</font></b><br/>C is a general-purpose programming language which can be used to develop various applications of different domain.<br/><br/>" +
                        "<b><font color=#F3612E>Portable Language :</font></b><br/>C is a portable language. It means that C programs written for a computing environment can easily run on another computer having the same environment.<br/><br/>" +
                        "<b><font color=#F3612E>Block-Structural Language :</font></b><br/>C is a structural programming language that allows a complicated program tobe broken into manageable subprograms called functions. It allows free movement of data across these functions.<br/><br/>" +
                        "<b><font color=#F3612E>Reliable :</font></b><br/>It is more reliable as compared to its evolving languages.<br/><br/>" +
                        "<b><font color=#F3612E>Typed Language :</font></b><br/>C introduce the concept of data types and contains a powerful data definition. The data-type supported are characters, alphanumeric, integers, long integers, float, double. It also supports string manipulation in the form of character-array.<br/><br/>" +
                        "<b><font color=#F3612E>Mid-level Language :</font></b><br/>C is a middle-level language as it has features of both high-level(development of the program is straight forward, simple and more understandable) and low-level language(direct interaction with hardware).<br/><br/>" +
                        "<b><font color=#F3612E>Extensible :</font></b><br/>One of the essential aspects of C is its ability to extend itself, i.e. we can define and add our functions to C library<br/><br/>" +
                        "<b><font color=#F3612E>Vast Built-in Library :</font></b><br/>C language has a rich library that provides numerous built-in functions. It also offers dynamic memory allocation.<br/><br/>" +
                        "<b><font color=#F3612E>Powerful Operator Support :</font></b><br/>C supports a powerful set of operators.<br/><br/>" +
                        "<b><font color=#F3612E>Relation with Assembly :</font></b><br/>C works closely with machines and matches assembly language in many assemble language in many ways. We can directly insert the Assembly code into C programs.<br/><br/>" +
                        "<b><font color=#F3612E>Hardware Interaction :</font></b><br/>C can directly interact with the hardware, as a result the execution of program is faster.<br/><br/>" +
                        "<b><font color=#F3612E>Graphical Applications :</font></b><br/>C also supports robust graphics programming.<br/><br/><br/><br/>"+
                        "<font color=#395AF1 face='senf-serif'><big><big><b>Some Drawbacks of C :</b></big></big></font><br/><br/>" +
                        "&bull C does not provide any data security.<br/>" +
                        "&bull C does not support the concept of OOPs as it is a POP language.<br/>" +
                        "&bull C doesn't have the concept of the namespace.<br/>" +
                        "&bull C does not support runtime checking.<br/>" +
                        "&bull C is not strictly typed language, i.e. we can pass an integer value to a floating-type variable or vice-versa.<br/>";
                data.setText(Html.fromHtml(d));
                title.setText("Some widely known Products and application that use C.");
                break;

            case 2:
                d = "<b><font color=#F3612E>Operating Systems :</font></b><br/>Unix OS is entirely written in C, and the linus OS kernel is written in C with some portion developed in assembly.<br/><br/>" +
                        "<b><font color=#F3612E>Mobile OS :</font></b><br/>The Kernel of the world's most popular mobile operating system Android is also having a part written in C.<br/><br/>" +
                        "<b><font color=#F3612E>Programming Languages :</font></b><br/>Many modern programming languages including C++, Java, C#, Python, Ruby, PHP etc. are influenced by the C language and have their initial implementations written in C.<br/>";
                data.setText(Html.fromHtml(d));
                title.setText("Features and Advantages of C Language.");
                break;
        }
    }

    private void loadAd(){
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}