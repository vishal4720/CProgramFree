package com.vkdevlops.cprogramfree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ShareCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.vkdevlops.cprogramfree.adapter.PagerAdapter;
import com.vkdevlops.cprogramfree.adapter.StudyStuffAdapter;
import com.vkdevlops.cprogramfree.adapter.SyntaxAdapter;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    ViewPager pager;
    TabLayout mTabLayout;
    TabItem pattern,other;
    PagerAdapter adapter;

    Dialog exit,about_dialog;
    Button yes,no;

    //Quizzes
    Button start_quiz,bookmarks;

    ConstraintLayout quizzes,syntax;

    //Study Stuff
    NestedScrollView scroll;
    ConstraintLayout defination;
    String[] s1;
    //About C
    CardView intro_c,aplication_c,features_c;

    //C Stuff
    CardView keyword,ascii,preceddence;

    //comparision
    CardView c_c,c_java,c_cs,c_python;
    RecyclerView recyclerView,syntaxrecycler;
    StudyStuffAdapter studyStuffAdapter;
    SyntaxAdapter syntaxAdapter;

    //about
    TextView about_txt;
    Button about_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //loadAd();

        quizzes =  findViewById(R.id.quizzes);

        //Study Stuff
        scroll = findViewById(R.id.study_scroll);
        s1 = getResources().getStringArray(R.array.study_stuff);
        recyclerView = findViewById(R.id.study_recycler);

        intro_c = findViewById(R.id.intro_to_C);
        aplication_c = findViewById(R.id.application_c);
        features_c = findViewById(R.id.features_c);
        syntax = findViewById(R.id.syntax);

        exit = new Dialog(this);
        exit.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        exit.setContentView(R.layout.exit_pop);
        yes = exit.findViewById(R.id.yes);
        no = exit.findViewById(R.id.no);

        about_dialog = new Dialog(this);
        about_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        about_dialog.setContentView(R.layout.about_pop);
        about_back = about_dialog.findViewById(R.id.about_back);
        about_txt = about_dialog.findViewById(R.id.about_text);

        keyword = findViewById(R.id.card_keyword);
        preceddence = findViewById(R.id.card_precedence);
        ascii = findViewById(R.id.card_ascii);
        c_c = findViewById(R.id.c_vs_c);
        c_java = findViewById(R.id.c_v_java);
        c_cs = findViewById(R.id.c_v_cs);
        c_python = findViewById(R.id.c_v_python);


        syntaxrecycler = findViewById(R.id.syntax_recycler);

        pager = findViewById(R.id.viewpager);
        defination = findViewById(R.id.defination);
        mTabLayout = findViewById(R.id.tablayout);
        pattern = findViewById(R.id.pattern);
        other = findViewById(R.id.other);

        start_quiz = findViewById(R.id.start_quiz);
        bookmarks = findViewById(R.id.bookmarks);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        navigationView.getMenu().findItem(R.id.study_menu).getIcon().setColorFilter(Color.parseColor("#b69260"), PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.study_defination).getIcon().setColorFilter(Color.parseColor("#7E3ADD"), PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.study_syntax).getIcon().setColorFilter(Color.parseColor("#FF0A23FF"), PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.cprograms).getIcon().setColorFilter(Color.parseColor("#FF12FFD0"), PorterDuff.Mode.SRC_ATOP);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        adapter = new PagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,mTabLayout.getTabCount());
        pager.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        studyStuffAdapter = new StudyStuffAdapter(this,s1);
        recyclerView.setAdapter(studyStuffAdapter);
        scroll.requestFocus();

        syntaxrecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        syntaxAdapter = new SyntaxAdapter(this,getResources().getStringArray(R.array.syntax));
        syntaxrecycler.setAdapter(syntaxAdapter);


        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                int action = e.getAction();
                switch (action) {
                    case MotionEvent.ACTION_MOVE:
                        rv.getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                }
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.getTabAt(0).setIcon(R.drawable.tab_1);
        mTabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_code_24);
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        start_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Quizzes.class);
                startActivity(intent);
            }
        });

        bookmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BookmarkActivity.class);
                startActivity(intent);
            }
        });







        c_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,StudyStuffPdf.class);
                i.putExtra("c_stuff",4);
                startActivity(i);
            }
        });

        c_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,StudyStuffPdf.class);
                i.putExtra("c_stuff",5);
                startActivity(i);
            }
        });

        c_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,StudyStuffPdf.class);
                i.putExtra("c_stuff",6);
                startActivity(i);
            }
        });

        c_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,StudyStuffPdf.class);
                i.putExtra("c_stuff",7);
                startActivity(i);
            }
        });
        preceddence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,StudyStuffPdf.class);
                i.putExtra("c_stuff",1);
                startActivity(i);
            }
        });

        ascii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),StudyStuffPdf.class);
                i.putExtra("c_stuff",2);
                startActivity(i);
            }
        });

        keyword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),StudyStuffPdf.class);
                i.putExtra("c_stuff",3);
                startActivity(i);
            }
        });

        intro_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),About_C.class);
                intent.putExtra("study",1);
                startActivity(intent);
            }
        });

        aplication_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),About_C.class);
                intent.putExtra("study",2);
                startActivity(intent);
            }
        });

        features_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),About_C.class);
                intent.putExtra("study",3);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        if (item.getItemId() == R.id.study_menu){
            mTabLayout.setVisibility(View.INVISIBLE);
            defination.setVisibility(View.INVISIBLE);
            scroll.setVisibility(View.VISIBLE);
            pager.setVisibility(View.INVISIBLE);
            quizzes.setVisibility(View.INVISIBLE);
            syntax.setVisibility(View.INVISIBLE);
        }
        else if(item.getItemId() == R.id.study_defination){
            mTabLayout.setVisibility(View.INVISIBLE);
            defination.setVisibility(View.VISIBLE);
            scroll.setVisibility(View.INVISIBLE);
            pager.setVisibility(View.INVISIBLE);
            quizzes.setVisibility(View.INVISIBLE);
            syntax.setVisibility(View.INVISIBLE);
        }
        else if(item.getItemId() == R.id.study_syntax){
            mTabLayout.setVisibility(View.INVISIBLE);
            defination.setVisibility(View.INVISIBLE);
            scroll.setVisibility(View.INVISIBLE);
            pager.setVisibility(View.INVISIBLE);
            quizzes.setVisibility(View.INVISIBLE);
            syntax.setVisibility(View.VISIBLE);
        }
        else if(item.getItemId() == R.id.quizzes){
            mTabLayout.setVisibility(View.INVISIBLE);
            scroll.setVisibility(View.INVISIBLE);
            pager.setVisibility(View.INVISIBLE);
            defination.setVisibility(View.INVISIBLE);
            quizzes.setVisibility(View.VISIBLE);
            syntax.setVisibility(View.INVISIBLE);
        }
        else if(item.getItemId() == R.id.cprograms){
            mTabLayout.setVisibility(View.VISIBLE);
            pager.setVisibility(View.VISIBLE);
            scroll.setVisibility(View.INVISIBLE);
            defination.setVisibility(View.INVISIBLE);
            quizzes.setVisibility(View.INVISIBLE);
            syntax.setVisibility(View.INVISIBLE);
            adapter = new PagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,mTabLayout.getTabCount());
            pager.setAdapter(adapter);
            pager.setCurrentItem(0);
        }
        else if(item.getItemId() == R.id.about){
            String text = "<font color=#00C9FF>Hi, Programming Learners</font><br/><br/>" +
                    "Here is a quick guide to use this app flawlessly.<br/><br/>" +
                    "This App is Full of Study Material, Programs, Quizzes. I hope you will find this application useful in your study, interview job, etc.<br/><br/>" +
                    "Some Tips for you :<br/><br/>" +
                    "&bull You will find useful study material in the <font color=#FF5500>'Study Stuff'</font> section which is helpful in order to improve your C Programming Knowledge. In Study Stuff section (in keywords, ASCII, etc) you may use <font color=#FF0083>'more info'</font> to know more about the topic.<br/><br/>" +
                    "&bull There is a separate section for <font color=#FF5500>'Definitions'</font> where you will find useful Definitions of One Line.<br/><br/>" +
                    "&bull In Addition to it you will find <font color=#FF5500>'Quizzes'</font> sections where you have multiple sets of questions to solve in Bulk or Topic wise.<br/><br/>" +
                    "If you have any doubts, queries, or suggestions, please feel free to use <font color=#FF5500>'Feedback/Query'</font> and <font color=#FFBD00>'Report Bug'</font> section.<br/><br/>" +
                    "<font color=#00C9FF>Happy Learning !!</font><br/><br/>" +
                    "<font color=#00FF0F>Vishal Patole</font>";
            about_txt.setText(Html.fromHtml(text));
            about_dialog.show();
            about_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    about_dialog.dismiss();
                }
            });
        }
        else if(item.getItemId() == R.id.rate){
            String url = "https://play.google.com/store/apps/details?id=com.vkdevlops.cprogramfree";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if(item.getItemId() == R.id.share){
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Learn 'C Programming'.\nAn Awesome App for Beginners. Collection of ASCII values, Programs, Quizzes, and many more.\n" +
                    "\nGet it on Google Play :\n" +
                    "https://play.google.com/store/apps/details?id=com.vkdevlops.cprogramfree");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        }
        else if(item.getItemId() == R.id.feedback){
            ShareCompat.IntentBuilder.from(this)
                    .setType("message/rfc822")
                    .addEmailTo("vishalpatole428@gmail.com")
                    .setSubject("Feedback/Query :")
                    .setChooserTitle("Send Email")
                    .startChooser();
        }
        else if(item.getItemId() == R.id.bug){
            ShareCompat.IntentBuilder.from(this)
                    .setType("message/rfc822")
                    .addEmailTo("vishalpatole428@gmail.com")
                    .setSubject("Report Bug :")
                    .setChooserTitle("Send Email")
                    .startChooser();
        }
        return false;
    }

    @Override
    public void onBackPressed() {
            exit.show();
            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    System.exit(0);
                }
            });

            no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    exit.dismiss();
                }
            });
    }

    private void loadAd(){
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}