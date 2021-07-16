package com.vkdevlops.cprogramfree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class Implement_Pattern_Programs extends AppCompatActivity {
    ImageView prog_img;
    TextView prog_name,prog;
    ImageButton back;
    ImageButton increase,decrease;
    int size = 13;
    Dialog mDialog;
    String program_start,program;
    SharedPreferences sharedPreferences;

    private RewardedAd mRewardedAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implement__pattern__programs);
        //loadAd();
        mDialog = new Dialog(this);
        prog_img = findViewById(R.id.program_img);
        prog_name = findViewById(R.id.program_name);
        prog = findViewById(R.id.real_program);
        back = findViewById(R.id.pattern_back);
        increase = findViewById(R.id.increase_size);
        decrease = findViewById(R.id.decrease_size);

        mRewardedAd = new RewardedAd(this,getString(R.string.VideoAd_id));


        sharedPreferences = getSharedPreferences("MyPref",MODE_PRIVATE);



        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));



        int postion = getIntent().getIntExtra("position",0);
        int image = getIntent().getIntExtra("image",0);
        String data = getIntent().getStringExtra("data");
        switch (postion){
            case 0:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61 5;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"*\"</font>);<font color=#3E3E3E>//can put any character</font><br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++)\n"+
                        "\t{\n" +
                        "\t\tfor(j=1;j<=5;j++)\n"+
                        "\t\t{\n" +
                        "\t\t\tprintf(\"*\");// can put any character\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;
            case 1:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61 5;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++)\n"+
                        "\t{\n" +
                        "\t\tfor(j=1;j<=5;j++)\n"+
                        "\t\t{\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 2:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61 5;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,j);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                 program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=1;j<=5;j++){\n" +
                        "\t\t\tprintf(\"%d\",j);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 3:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i='A';i&#60&#61'E';i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j='A';j&#60&#61'E';j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i='A';i<='E';i++){\n" +
                        "\t\tfor(j='A';j<='E';j++){\n" +
                        "\t\t\tprintf(\"%c\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 4:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i='A';i&#60&#61'E';i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j='A';j&#60&#61'E';j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,j);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i='A';i<='E';i++){\n" +
                        "\t\tfor(j='A';j<='E';j++){\n" +
                        "\t\t\tprintf(\"%c\",j);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 5:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=5;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61 5;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=5;i>=1;i--){\n" +
                        "\t\tfor(j=1;j<=5;j++){\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 6:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=5;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=5;j&#62&#61 1;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,j);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=5;i>=1;i--){\n" +
                        "\t\tfor(j=5;j>=1;j--){\n" +
                        "\t\t\tprintf(\"%d\",j);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 7:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i='E';i&#62&#61'A';i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j='E';j&#62&#61'A';j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i='E';i>='A';i--){\n" +
                        "\t\tfor(j='E';j>='A';j--){\n" +
                        "\t\t\tprintf(\"%c\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 8:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i='E';i&#62&#61'A';i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j='E';j&#62&#61'A';j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,j);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i='E';i>='A';i--){\n" +
                        "\t\tfor(j='E';j>='A';j--){\n" +
                        "\t\t\tprintf(\"%c\",j);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 9:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61i;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"*\"</font>);<font color=#3E3E3E>//can put any character</font><br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++)\n"+
                        "\t{\n" +
                        "\t\tfor(j=1;j<=5;j++)\n"+
                        "\t\t{\n" +
                        "\t\t\tprintf(\"*\");// can put any character\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 10:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61i;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=1;j<=i;j++){\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 11:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61i;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,j);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=1;j<=i;j++){\n" +
                        "\t\t\tprintf(\"%d\",j);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 12:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i='A';i&#60&#61'E';i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j='A';j&#60&#61i;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i='A';i<='E';i++){\n" +
                        "\t\tfor(j='A';j<=i;j++){\n" +
                        "\t\t\tprintf(\"%c\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 13:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=5;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"*\"</font>);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=5;j>=i;j--){\n" +
                        "\t\t\tprintf(\"*\");//put any character\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 14:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                    "&#160 clrscr();<br/>" +
                    "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                    "&#160 &#160 <font color=#F139A9>for</font>(j=5;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                    "&#160 &#160 &#160 printf(<font color=#EC1A70>\"*\"</font>)//put any character;<br/>" +
                    "&#160 &#160 &#125 <br/>" +
                    "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                    "&#160 &#125 <br/>" +
                    "&#160 getch();<br/>" +
                    "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=5;j>=i;j--){\n" +
                        "\t\t\tprintf(\"*\");//put any character\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 15:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=5;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=5;j>=i;j--){\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 16:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=5;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,j);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=5;j>=i;j--){\n" +
                        "\t\t\tprintf(\"%d\",j);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 17:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=5;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,64+i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=5;j>=i;j--){\n" +
                        "\t\t\tprintf(\"%c\",64+i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 18:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=5;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61i;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,64+j);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=5;i>=1;i--){\n" +
                        "\t\tfor(j=1;j<=i;j++){\n" +
                        "\t\t\tprintf(\"%c\",64+j);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 19:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=5;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60&#61i;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,i);<br/>" +
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=5;i>=1;i--){\n" +
                        "\t\tfor(j=1;j<=i;j++){\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 20:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                    "&#160 clrscr();<br/>" +
                    "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                    "&#160 &#160 <font color=#F139A9>for</font>(j=5;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                    "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,j);<br/>" +
                    "&#160 &#160 &#125 <br/>" +
                    "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                    "&#160 &#125 <br/>" +
                    "&#160 getch();<br/>" +
                    "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=5;j>=i;j--){\n" +
                        "\t\t\tprintf(\"%d\",j);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 21:program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                    "&#160 clrscr();<br/>" +
                    "&#160 <font color=#F139A9>for</font>(i=4;i&#62&#61 0;i--)<br/>&#160 &#123 <br/>" +
                    "&#160 &#160 <font color=#F139A9>for</font>(j=0;j&#60&#61i;j++)<br/>&#160 &#160 &#123 <br/>" +
                    "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,i+65);<br/>" +
                    "&#160 &#160 &#125 <br/>" +
                    "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                    "&#160 &#125 <br/>" +
                    "&#160 getch();<br/>" +
                    "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=4;i<=0;i--){\n" +
                        "\t\tfor(j=0;j>=i;j++){\n" +
                        "\t\t\tprintf(\"%d\",i+65);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 22:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                    "&#160 clrscr();<br/>" +
                    "&#160 <font color=#F139A9>for</font>(i=0;i&#60&#61 4;i++)<br/>&#160 &#123 <br/>" +
                    "&#160 &#160 <font color=#F139A9>for</font>(j=4;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                    "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>,j+65);<br/>" +
                    "&#160 &#160 &#125 <br/>" +
                    "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                    "&#160 &#125 <br/>" +
                    "&#160 getch();<br/>" +
                    "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=0;i<=4;i++){\n" +
                        "\t\tfor(j=4;j>=i;j--){\n" +
                        "\t\t\tprintf(\"%d\",j+65);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 23:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=5;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 if(i&#62&#61j)<br/>" +
                        "&#160 &#160 &#160 &#160 print(\"*\");<br/>"+
                        "&#160 &#160 &#160 else<br/>"+
                        "&#160 &#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125 <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=5;j>=i;j--){\n" +
                        "\t\t\tif(i>=j)\n"+
                        "\t\t\t\tprintf(\"*\");\n"+
                        "\t\t\telse\n"+
                        "\t\t\t\tprint(\" \");\n"+
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 24:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=4;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",k);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=4;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=4;k>=i;k--){\n" +
                        "\t\t\tprintf(\"%d\",k);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 25:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=4;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",k);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=5;i++){\n" +
                        "\t\tfor(j=4;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=i;k++){\n" +
                        "\t\t\tprintf(\"%d\",k);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 26:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=0;i&#60 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=4;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%c\",i+65)//ASCII of 'A' -> 65;<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=0;i<5;i++){\n" +
                        "\t\tfor(j=4;j>i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<=i;k++){\n" +
                        "\t\t\tprintf(\"%c\",i+65);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 27:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=0;i&#60 5;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=4;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%c\",k+65);//ASCII of 'A' -> 65<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=0;i<5;i++){\n" +
                        "\t\tfor(j=4;j>i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<=i;k++){\n" +
                        "\t\t\tprintf(\"%c\",k+65);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 28:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font>n=5;<font color=#3E3E3E>// size (max stars)</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=n;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"*\");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; // size (max stars)"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=n;i>=1;i--){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=i;k++){\n" +
                        "\t\t\tprintf(\"*\");\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 29:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font>n=5;<font color=#3E3E3E>// size </font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=n;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",i);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; // size"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=n;i>=1;i--){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=i;k++){\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 30:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font>n=5;<font color=#3E3E3E>// size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=n;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",k);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; // size"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=n;i>=1;i--){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=i;k++){\n" +
                        "\t\t\tprintf(\"%d\",k);\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 31:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font>n=5;<font color=#3E3E3E>// size (max stars)</font><br/>" +
                    "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                    "&#160 clrscr();<br/>" +
                    "&#160 <font color=#F139A9>for</font>(i=n-1;i&#62&#61 0;i--)<br/>&#160 &#123 <br/>" +
                    "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                    "&#160 &#160 &#160 print(\" \");<br/>"+
                    "&#160 &#160 &#125<br/>"+
                    "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                    "&#160 &#160 &#160 print(\"%c\",i+65);//ASCII of 'A' -> 65<br/>"+
                    "&#160 &#160 &#125<br/>"+
                    "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                    "&#160 &#125 <br/>" +
                    "&#160 getch();<br/>" +
                    "&#125 </font>";
            program = "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main(){\n" +
                    "\tint n=5; // size"+
                    "\tint i,j,k;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=n-1;i>=0;i--){\n" +
                    "\t\tfor(j=n-1;j>=i;j--){\n" +
                    "\t\t\tprintf(\" \");\n" +
                    "\t\t}\n" +
                    "\t\tfor(k=0;k<=i;k++){\n" +
                    "\t\t\tprintf(\"%c\",i+65);//ASCII of 'A' -> 65\n" +
                    "\t\t}\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}";
            break;

            case 32:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font>n=5;<font color=#3E3E3E>// size (max stars)</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=n-1;i&#62&#61 0;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60&#61i;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%c\",k+65);//ASCII of 'A' -> 65<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; // size"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=n-1;i>=0;i--){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<=i;k++){\n" +
                        "\t\t\tprintf(\"%c\",k+65);//ASCII of 'A' -> 65\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 33:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> min_stars = 1;<font color=#3E3E3E>/*<br/> change value of min_stars to set minimum no of stars in pyramid." +
                        "<br/>Take odd no fro odd no of stars in each row 1-3-5 etc.<br/>Take even no for even no of stars in each row 2-4-6 <br/>*/</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> p_height = 5;<font color=#3E3E3E>//change value to increase or decrease size of pyramid</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> p_space = p_height-1;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j,k;<br/>"+ "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=0;i&#62p_height;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=p_space;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60min_stars;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"*\");<br/>"+
                        "&#160 &#160 &#125<br/>"+"&#160 &#160 min_stars+=2<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint min_stars=1; \n/*\n\tchange value of min_stars to set minimum no of stars in pyramid.\nTake odd no fro odd no of stars in each row 1-3-5 etc.\nTake even no for even no of stars in each row 2-4-6.\n*/\n"+
                        "\tint p_height = 5;//change value to increase or decrease size of pyramid\n"+
                        "\tint p_space = p_height-1;\n" +
                        "\tint i,j,k\n"+
                        "\tclrscr();\n" +
                        "\tfor(i=0;i<p_height;i++){\n" +
                        "\t\tfor(j=p_space;j>i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<min_stars;k++){\n" +
                        "\t\t\tprintf(\"*\");\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 34:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font>n=5;<font color=#3E3E3E>// size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> z=1;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60z;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",i);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 z+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; // size\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=n;i++){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<z;k++){\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\tz+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 35:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=5;<font color=#3E3E3E>// size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> z=1;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#61z;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",z);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 z+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; // size\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=n;i++){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=z;k++){\n" +
                        "\t\t\tprintf(\"%d\",z);\n" +
                        "\t\t}\n" +
                        "\t\tz+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 36:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=1;<font color=#3E3E3E>// size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> p_height=5;<font color=#3E3E3E>//change value to increase or decrease size of pyramid</font><br/>"+"&#160 <font color=#EC1A70>int</font> p_space;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 p_space = p_height;<br/>"+
                        "&#160 <font color=#F139A9>for</font>(i=0;i&#60p_height;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=p_space;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60z;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%c\",i+65);<font color=#3E3E3E>//ASCII of 'A' = 65</font><br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 n+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=1; // size\n"+
                        "\tint p_height=5;//change value to increase or decrease size of pyramid\n"+
                        "\tint p_space;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tp_space = p_height;\n"+
                        "\tfor(i=0;i<p_height;i++){\n" +
                        "\t\tfor(j=p_space;j>i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<n;k++){\n" +
                        "\t\t\tprintf(\"%c\",i+65);//ASCII of 'A'= 65\n" +
                        "\t\t}\n" +
                        "\t\tn+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 37:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=0;<font color=#3E3E3E>// size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> p_height=5;<font color=#3E3E3E>//change value to increase or decrease size of pyramid</font><br/>"+"&#160 <font color=#EC1A70>int</font> p_space;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 p_space = p_height - 1;<br/>"+
                        "&#160 <font color=#F139A9>for</font>(i=0;i&#60p_height;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=p_space;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60n;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%c\",n+65);<font color=#3E3E3E>//ASCII of 'A' = 65</font><br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 n+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=0; // size\n"+
                        "\tint p_height=5;//change value to increase or decrease size of pyramid\n"+
                        "\tint p_space;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tp_space = p_height - 1;\n"+
                        "\tfor(i=0;i<p_height;i++){\n" +
                        "\t\tfor(j=p_space;j>i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<n;k++){\n" +
                        "\t\t\tprintf(\"%c\",n+65);//ASCII of 'A'= 65\n" +
                        "\t\t}\n" +
                        "\t\tn+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 38:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=5;<font color=#3E3E3E>//size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> z=1;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#61z;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",k);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 z+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; //size\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=n;i++){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=z;k++){\n" +
                        "\t\t\tprintf(\"%d\",k);\n" +
                        "\t\t}\n" +
                        "\t\tz+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 39:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=5;<font color=#3E3E3E>//size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> z=1;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=z;k&#62&#61 1;k--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",k);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 z+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; //size\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=n;i++){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=z;k>=1;k--){\n" +
                        "\t\t\tprintf(\"%d\",k);\n" +
                        "\t\t}\n" +
                        "\t\tz+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 40:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=1;<br/>" +
                        "&#160 <font color=#EC1A70>int</font> p_height=5;<font color=#3E3E3E>//change value to increase or decrease size of pyramid</font><br/>"+"&#160 <font color=#EC1A70>int</font> p_space;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 p_space = p_height - 1;<br/>"+
                        "&#160 <font color=#F139A9>for</font>(i=0;i&#60p_height;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=p_space;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60n;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%c\",k+65);<font color=#3E3E3E>//ASCII of 'A' = 65</font><br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 n+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=1;\n"+
                        "\tint p_height=5;//change value to increase or decrease size of pyramid\n"+
                        "\tint p_space;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tp_space = p_height - 1;\n"+
                        "\tfor(i=0;i<p_height;i++){\n" +
                        "\t\tfor(j=p_space;j>i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<n;k++){\n" +
                        "\t\t\tprintf(\"%c\",k+65);//ASCII of 'A'= 65\n" +
                        "\t\t}\n" +
                        "\t\tn+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 41:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=5;<br/>" +
                        "&#160 <font color=#EC1A70>int</font> z=0;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=0;k&#60&#61z;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%c\",z-k+65);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 z+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=5; //size\n"+
                        "\tint z=0;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=0;i<n;i++){\n" +
                        "\t\tfor(j=n-1;j>i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=0;k<=z;k++){\n" +
                        "\t\t\tprintf(\"%c\",z-k+65);\n" +
                        "\t\t}\n" +
                        "\t\tz+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 42:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/>#include&lt math.h&gt <br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=5;<font color=#3E3E3E>//size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> z=1;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=z;k&#62&#61 1;k--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",<font color=#EC1A70>abs</font>(k-1));<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 z+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "#include<math.h>\n"+
                        "void main(){\n" +
                        "\tint n=5; //size\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=n;i++){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=z;k>=1;k--){\n" +
                        "\t\t\tprintf(\"%d\",abs(k-1));\n" +
                        "\t\t}\n" +
                        "\t\tz+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 43:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/>#include&lt math.h&gt <br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=5;<font color=#3E3E3E>//size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> z=1,l=1;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=0;i&#60n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=4;j&#62i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#61z;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",<font color=#EC1A70>abs</font>(k-1)+65);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 l++;<br/>"+
                        "&#160 &#160 z+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "#include<math.h>\n"+
                        "void main(){\n" +
                        "\tint n=5; //size\n"+
                        "\tint z=1,l=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=0;i<n;i++){\n" +
                        "\t\tfor(j=4;j>i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=z;k++){\n" +
                        "\t\t\tprintf(\"%c\",abs(k-l)+65);\n" +
                        "\t\t}\n" +
                        "\t\tl++;\n"+
                        "\t\tz+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 44:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/>#include&lt math.h&gt <br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=4;<font color=#3E3E3E>//size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=i-1;k&#62&#61-(i-1);k--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",i-<font color=#EC1A70>abs</font>(k));<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "#include<math.h>\n"+
                        "void main(){\n" +
                        "\tint n=4; //size\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=1;i<=n;i++){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=i-1;k>=-(i-1);k--){\n" +
                        "\t\t\tprintf(\"%d\",i-abs(k));\n" +
                        "\t\t}\n" +
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 45:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/>#include&lt math.h&gt <br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=4;<font color=#3E3E3E>//size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> z=1;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=0;i&#60n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=n-1;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=i;k&#62&#61-i;k--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",i-<font color=#EC1A70>abs</font>(k)+65);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 z+=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "#include<math.h>\n"+
                        "void main(){\n" +
                        "\tint n=4; //size\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\tfor(i=0;i<n;i++){\n" +
                        "\t\tfor(j=n-1;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=i;k>=-i;k--){\n" +
                        "\t\t\tprintf(\"%c\",i-abs(k)+65);\n" +
                        "\t\t}\n" +
                        "\t\tz+=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 46:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> n=4;<font color=#3E3E3E>//size</font><br/>" +
                        "&#160 <font color=#EC1A70>int</font> px=1,py;<br/>" + "&#160 <font color=#EC1A70>int</font> i,j;<br/>" +
                        "&#160 clrscr();<br/>" + "&#160 py=n*2-1;<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=1;j&#60n*2;j++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 if(j&#62&#61px && j&#60&#61py)<br/>"+
                        "&#160 &#160 &#160 &#160 printf(\"*\");<br/>"+
                        "&#160 &#160 &#160 else<br/>"+
                        "&#160 &#160 &#160 &#160 printf(\" \");<br/>" +
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 px++;<br/>"+
                        "&#160 &#160 py--;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint n=4; //size\n"+
                        "\tint px=1,py;\n"+
                        "\tint i,j;\n" +
                        "\tclrscr();\n" +
                        "\tpy=n*2-1;\n"+
                        "\tfor(i=1;i<=n;i++){\n" +
                        "\t\tfor(j=1;j<n*2;j++){\n" +
                        "\t\t\tif(j>=px && j<=py)\n" +
                        "\t\t\t\tprintf(\"*\");"+
                        "\t\t\telse\n"+
                        "\t\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tpx++;\n"+
                        "\t\tpy++;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 47:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> p_height=4,width,p_space;<br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,j,k;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 width=p_height*2-1;<br/>"+
                        "&#160 p_space=p_height-1;<br/><br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=p_height;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=p_space;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#6width;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",i);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 width-=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint p_height=4,width,p_space;\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\twidth=p_height*2-1;"+
                        "p_space=p_height-1;"+
                        "\tfor(i=p_height;i>=1;i--){\n" +
                        "\t\tfor(j=p_space;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=width;k++){\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\twidth-=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 48:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> p_height=4,width,p_space;<br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,j,k;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 width=p_height*2-1;<br/>"+
                        "&#160 p_space=p_height-1;<br/><br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=p_height;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=p_space;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#6width;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",i);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 width-=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint p_height=4,width,p_space;\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\twidth=p_height*2-1;"+
                        "p_space=p_height-1;"+
                        "\tfor(i=p_height;i>=1;i--){\n" +
                        "\t\tfor(j=p_space;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=width;k++){\n" +
                        "\t\t\tprintf(\"%d\",i);\n" +
                        "\t\t}\n" +
                        "\t\twidth-=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            case 49:
                program_start="#include&lt stdio.h&gt <br/>#include&lt conio.h&gt<br/><font color=#EC1A70>void</font><font color=#36D574> main()</font>&#123 <br/>&#160 <font color=#EC1A70>int</font> p_height=4,width,p_space;<br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,j,k;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 width=p_height*2-1;<br/>"+
                        "&#160 p_space=p_height-1;<br/><br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=p_height;i&#62&#61 1;i--)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 <font color=#F139A9>for</font>(j=p_space;j&#62&#61i;j--)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\" \");<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 <font color=#F139A9>for</font>(k=1;k&#60&#6width;k++)<br/>&#160 &#160 &#123 <br/>" +
                        "&#160 &#160 &#160 print(\"%d\",k);<br/>"+
                        "&#160 &#160 &#125<br/>"+
                        "&#160 &#160 width-=2;<br/>"+
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\n\"</font>);<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 getch();<br/>" +
                        "&#125 </font>";
                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main(){\n" +
                        "\tint p_height=4,width,p_space;\n"+
                        "\tint z=1;\n"+
                        "\tint i,j,k;\n" +
                        "\tclrscr();\n" +
                        "\twidth=p_height*2-1;"+
                        "p_space=p_height-1;"+
                        "\tfor(i=p_height;i>=1;i--){\n" +
                        "\t\tfor(j=p_space;j>=i;j--){\n" +
                        "\t\t\tprintf(\" \");\n" +
                        "\t\t}\n" +
                        "\t\tfor(k=1;k<=width;k++){\n" +
                        "\t\t\tprintf(\"%d\",k);\n" +
                        "\t\t}\n" +
                        "\t\twidth-=2;\n"+
                        "\t\tprintf(\"\\n\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}";
                break;

            default:
                program_start= "Coming Soon";
                program = "Coming Soon";
                break;
        }
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (size<28) {
                    size += 1;
                    prog.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
                    setText();
                }
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (size>11) {
                    size -= 1;
                    prog.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
                    setText();
                }
            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        prog_img.setImageResource(image);
        prog_name.setText(data);
        setText();
    }

    public void setText(){
        prog.setText(Html.fromHtml(program_start));
    }


    public void PopUp(final View view){
        if (!program.contains("\n\n\n"+
                "-----******-----\n" +
                "C Programs Free\n\n"+
                "Get it on Google Play\n" +
                "https://play.google.com/store/apps/details?id=com.vkdevlops.cprogramfree")) {
            program = program.concat("\n\n\n" +
                    "-----******-----\n" +
                    "C Programs Free\n\n" +
                    "Get it on Google Play\n" +
                    "https://play.google.com/store/apps/details?id=com.vkdevlops.cprogramfree");
        }

        ImageButton share_final,rewarded;
        final TextView credits;

        mDialog.setContentView(R.layout.share_pop);
        share_final = mDialog.findViewById(R.id.share_final_btn);
        rewarded = mDialog.findViewById(R.id.rewarded_ad_btn);
        credits = mDialog.findViewById(R.id.credits_txt);
        setCountText(credits);
        share_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sharedPreferences.getInt("share_count",0)>0){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("share_count",sharedPreferences.getInt("share_count",0)-1);
                    editor.apply();
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, program);
                    sendIntent.setType("text/plain");
                    startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.app_name)));
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
        mDialog.show();

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
    }

    private void VideoAd(final TextView credits){
        Toast.makeText(this, "Please wait Video is loading !!", Toast.LENGTH_SHORT).show();
        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {
                // Ad successfully loaded.
                Toast.makeText(Implement_Pattern_Programs.this, "Rewarded Ad Loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRewardedAdFailedToLoad(LoadAdError adError) {
                // Ad failed to load.
                Toast.makeText(Implement_Pattern_Programs.this, "Failed to Load Ad!! Check your connection.", Toast.LENGTH_SHORT).show();
            }
        };

        mRewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);

        if (mRewardedAd.isLoaded()) {
            Activity activityContext = Implement_Pattern_Programs.this;
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
                    Toast.makeText(Implement_Pattern_Programs.this, "Credits Added Successfully", Toast.LENGTH_SHORT).show();
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