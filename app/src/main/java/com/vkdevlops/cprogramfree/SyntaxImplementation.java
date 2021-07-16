package com.vkdevlops.cprogramfree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class SyntaxImplementation extends AppCompatActivity {
    ImageView img;
    TextView syntax_title,syntax;
    ImageButton back;
    String data;
    ImageButton increase,decrease;
    int size = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax_implementation);

        //loadAd();
        back = findViewById(R.id.syntax_back);
        syntax_title = findViewById(R.id.syntax_name);
        syntax = findViewById(R.id.syntax_description);
        img = findViewById(R.id.syntax_image);
        increase = findViewById(R.id.increase_size);
        decrease = findViewById(R.id.decrease_size);
        String title = getIntent().getStringExtra("title");
        int position = getIntent().getIntExtra("position",0);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        switch (position){
            case 0:
                data = "C language syntax specify rules for sequence of characters to be written in C language. In simple language it states how to form statements in a C language program - How should the line of code start, how it should end, where to use double quotes, where to use curly brackets etc.<br/><br/><br/>" +
                        "<b>Some basic syntax rule for C program :</b><br/><br/>" +
                        "&bull C is a case sensitive language so all C instructions must be written in lower case letter.<br/>" +
                        "&bull All C statement must end with a semicolon.<br/>" +
                        "&bull Whitespace is used in C to describe blanks and tabs.<br/>" +
                        "&bull Whitespace is required between keywords and identifiers. We will learn about keywords and identifiers in the next tutorial.<br/><br/>";

                SetData(title,R.drawable.basic);
                break;

            case 1:
                data = "<b>PRINTF() FUNCTION IN C LANGUAGE :</b><br/><br/>" +
                        "&bull In C programming language, printf() function is used to print the (“character, string, float, integer, octal and hexadecimal values”) onto the output screen.<br/>" +
                        "&bull We use printf() function with <font color=#F139A9>%d</font> format specifier to display the value of an integer variable.<br/>" +
                        "&bull Similarly <font color=#F139A9>%c</font> is used to display character, <font color=#F139A9>%f</font> for float variable, <font color=#F139A9>%s</font> for string variable, <font color=#F139A9>%lf</font> for double and <font color=#F139A9>%x</font> for hexadecimal variable.<br/>" +
                        "&bull To generate a newline,we use “\\n” in C printf() statement.<br/><br/>" +
                        "<b>Note :</b><br/>" +
                        "<br/>" +
                        "&bull C language is case sensitive. For example, printf() is different from Printf(). All characters in printf() function must be in lower case.<br/><br/>" +
                        "<b><font color=#F139A9>printf</font>(<font color=#F3612E>\"text with format specifier\"</font>,<font color=#2EF331>argument list</font>);</b><br/><br/>" +
                        "<b>Example :</b><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "int main()<br/>" +
                        "{<br/>" +
                        "&#160 char ch = 'A';<br/>" +
                        "&#160 char str[30] = \"C Programming by vishal\";<br/>" +
                        "&#160 float flt = 10.234;<br/>" +
                        "&#160 int no = 150;<br/>" +
                        "&#160 double dbl = 20.123456;<br/>" +
                        "&#160 printf(\"Character is %c \\n\", ch);<br/>" +
                        "&#160 printf(\"String is %s \\n\" , str);<br/>" +
                        "&#160 printf(\"Float value is %f \\n\", flt);<br/>" +
                        "&#160 printf(\"Integer value is %d\\n\" , no);<br/>" +
                        "&#160 printf(\"Double value is %lf \\n\", dbl);<br/>" +
                        "&#160 printf(\"Octal value is %o \\n\", no);<br/>" +
                        "&#160 printf(\"Hexadecimal value is %x \\n\", no);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "Character is A<br/>" +
                        "String is C Programming by vishal<br/>" +
                        "Float value is 10.234000<br/>" +
                        "Integer value is 150<br/>" +
                        "Double value is 20.123456<br/>" +
                        "Octal value is 226<br/>" +
                        "Hexadecimal value is 96<br/>";
                SetData(title,0);
                break;

            case 2:
                data = "<b>SCANF FUNCTION IN C LANGUAGE :</b><br/><br/>" +
                        "&bull In C programming language, scanf() function is used to read character, string, numeric data from keyboard<br/>" +
                        "&bull Consider below example program where user enters a character. This value is assigned to the variable “ch” and then displayed.<br/>" +
                        "&bull scanf() function is declared in “stdio.h” header file in C library." +
                        "&bull Then, user enters a string and this value is assigned to the variable “str” and then displayed.<br/><br/>" +
                        "<b><font color=#F139A9>scanf</font>(<font color=#F3612E>\"Format specifier\"</font>,<font color=#2EF331>argument list</font>);</b><br/><br/>" +
                        "<b>Example :</b><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "int main()<br/>" +
                        "{<br/>" +
                        "&#160 char ch;<br/>" +
                        "&#160 char str[100];<br/>" +
                        "&#160 printf(\"Enter any character \\n\");<br/>" +
                        "&#160 scanf(\"%c\", &ch);<br/>" +
                        "&#160 printf(\"Entered character is %c \\n\", ch);<br/>" +
                        "&#160 printf(\"Enter any string ( upto 100 character ) \\n\");<br/>" +
                        "&#160 scanf(\"%s\", &str);<br/>" +
                        "&#160 printf(\"Entered string is %s \\n\", str);<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "Enter any character<br/>" +
                        "a<br/>" +
                        "Entered character is a<br/>" +
                        "Enter any string ( upto 100 character )<br/>" +
                        "vishal<br/>" +
                        "Entered string is vishal<br/><br/>" +
                        "&bull The format specifier %d is used in scanf() statement. So that, the value entered is received as an integer and %s for string.<br/>" +
                        "&bull Ampersand is used before variable name “ch” in scanf() statement as &ch.<br/>" +
                        "&bull It is just like in a pointer which is used to point to the variable. For more information about how pointer works<br/><br/>";
                SetData(title,0);
                break;

            case 3:
                data = "<big>if(<font color=#F139A9>expression</font>)<br/>" +
                        "{<br/>" +
                        "&#160 <font color=#F3612E><i>statement inside;</i></font><br/>" +
                        "}<br/>" +
                        "&#160 <font color=#F3612E><i>statement outside;</i></font></big><br/><br/>" +
                        "&bull If the expression returns true, then the statement-inside will be executed, otherwise statement-inside is skipped and only the statement-outside is executed.<br/><br/>" +
                        "<b>Example :</b><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "void main( )<br/>" +
                        "{<br/>" +
                        "&#160 int x, y;<br/>" +
                        "&#160 x = 15;<br/>" +
                        "&#160 y = 13;<br/>" +
                        "&#160 if (x > y )<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(\"x is greater than y\");<br/>" +
                        "&#160 }<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "x is greater than y";
                SetData(title,0);
                break;

            case 4:
                data = "<big>if(<font color=#F139A9>expression)</font><br/>" +
                        "{<br/>" +
                        "&#160 <font color=#F3612E><i>statement block1;</i></font><br/>" +
                        "}<br/>" +
                        "else<br/>" +
                        "{<br/>" +
                        "&#160 <font color=#F3612E><i>statement block2;</i></font><br/>" +
                        "}</big><br/><br/>" +
                        "&bull If the <i>expression</i> is true, the <b>statement-block1</b> is executed, else <b>statement-block1</b> is skipped and <b>statement-block2</b> is executed<br/><br/>" +
                        "<b>Example :</b><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "void main( )<br/>" +
                        "{<br/>" +
                        "&#160 int x, y;<br/>" +
                        "&#160 x = 15;<br/>" +
                        "&#160 y = 18;<br/>" +
                        "&#160 if (x > y )<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(\"x is greater than y\");<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(\"y is greater than x\");<br/>" +
                        "&#160 }<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "y is greater than x<br/><br/>";
                SetData(title,0);
                break;

            case 5:
                data = "if( <font color=#F139A9>expression</font> )<br/>" +
                        "{<br/>" +
                        "&#160 if( <font color=#F139A9>expression1</font> )<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 <font color=#F3612E><i>statement block1;</i></font><br/>" +
                        "&#160 }<br/>" +
                        "&#160 else <br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 <font color=#F3612E><i>statement block2;</i></font><br/>" +
                        "&#160 }<br/>" +
                        "}<br/>" +
                        "else<br/>" +
                        "{<br/>" +
                        "    <font color=#F3612E><i>statement block3;</i></font><br/>" +
                        "}<br/><br/>" +
                        "&bull if <i>expression</i> is false then <b>statement-block3</b> will be executed, otherwise the execution continues and enters inside the first <font color=#F139A9>if</font> to perform the check for the next <font color=#F139A9>if</font> block, where if <i>expression 1</i> is true the <b>statement-block1</b> is executed otherwise <b>statement-block2</b> is executed.<br/><br/>" +
                        "<b>Example :</b><br/><br/>" +
                        "#include <stdio.h><br/>" +
                        "void main( )<br/>" +
                        "{<br/>" +
                        "&#160 int a, b, c;<br/>" +
                        "&#160 printf(\"Enter 3 numbers...\");<br/>" +
                        "&#160 scanf(\"%d%d%d\",&a, &b, &c);<br/>" +
                        "&#160 if(a > b)<br/>" +
                        "&#160 { <br/>" +
                        "&#160 &#160 if(a > c)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 printf(\"a is the greatest\");<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 else <br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 printf(\"c is the greatest\");<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(b > c)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 printf(\"b is the greatest\");<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 else<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 printf(\"c is the greatest\");<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "Enter 3 numbers...<br/>" +
                        "2<br/>3<br/>5<br/>" +
                        "c is greatest<br/><br/>";
                SetData(title,0);
                break;

            case 6:
                data = "Switch statement is a control statement that allows us to choose only one choice among the many given choices. The expression in switch evaluates to return an integral value, which is then compared to the values present in different cases. It executes that block of code which matches the case value. If there is no match, then default block is executed(if present). The general form of switch statement is,<br/><br/>" +
                        "switch(<font color=#F139A9>expression</font>)<br/>" +
                        "{<br/>" +
                        "&#160 case <font color=#F3612E>value-1</font>:<br/>" +
                        "&#160 &#160 block-1;<br/>" +
                        "&#160 &#160 break;<br/>" +
                        "&#160 case <font color=#F3612E>value-2</font>:<br/>" +
                        "&#160 &#160 block-2;<br/>" +
                        "&#160 &#160 break;<br/>" +
                        "&#160 case <font color=#F3612E>value-3</font>:<br/>" +
                        "&#160 &#160 block-3;<br/>" +
                        "&#160 &#160 break;<br/>" +
                        "&#160 case <font color=#F3612E>value-4</font>:<br/>" +
                        "&#160 &#160 block-4;<br/>" +
                        "&#160 &#160 break;<br/>" +
                        "&#160 default:<br/>" +
                        "&#160 &#160 default-block;<br/>" +
                        "&#160 &#160 break;<br/>" +
                        "}<br/><br/><br/>" +
                        "<big><b>Rules for using switch statement</b></big><br/><br/>" +
                        "&bull The expression (after switch keyword) must yield an integer value i.e the expression should be an integer or a variable or an expression that evaluates to an integer.<br/>" +
                        "&bull The case label values must be unique.<br/>" +
                        "&bull The case label must end with a colon(:)<br/>" +
                        "&bull The next line, after the case statement, can be any valid C statement.<br/><br/><br/>" +
                        "<big><b>Points to Remember</b></big><br/><br/>" +
                        "&bull We don't use those expressions to evaluate switch case, which may return floating point values or strings or characters.<br/>" +
                        "&bull break statements are used to exit the switch block. It isn't necessary to use break after each block, but if you do not use it, then all the consecutive blocks of code will get executed after the matching block<br/><br/><br/>" +
                        "<b>Example :</b><br/><br/>" +
                        "int i = 1;<br/>" +
                        "switch(i)<br/>" +
                        "{<br/>" +
                        "&#160 case 1:<br/>" +
                        "&#160 &#160 printf(\"A\");        // No break<br/>" +
                        "&#160 case 2:<br/>" +
                        "&#160 &#160 printf(\"B\");        // No break<br/>" +
                        "&#160 case 3:<br/>" +
                        "&#160 &#160 printf(\"C\");<br/>" +
                        "&#160 &#160 break;<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "A B C<br/><br/>" +
                        "&bull The output was supposed to be only 'A' but we have not used <b>break</b> that's why all cases are executed.<br/><br/>" +
                        "";
                SetData(title,0);
                break;

            case 7:
                data ="As per the above diagram, if the Test Condition is true, then the loop is executed, and if it is false then the execution breaks out of the loop. After the loop is successfully executed the execution again starts from the Loop entry and again checks for the Test condition, and this keeps on repeating.<br/><br/>" +
                        "<b>while loop can be addressed as an entry control loop. It is completed in 3 steps.</b><br/><br/>" +
                        "%bull Variable initialization.(e.g int x = 0;)<br/>" +
                        "%bull condition(e.g while(x <= 10))<br/>" +
                        "%bull Variable increment or decrement ( x++ or x-- or x = x + 2 )<br/><br/>" +
                        "<b>Syntax :</b><br/><br/>" +
                        "variable <font color=#F139A9><i>initialization;</i></font><br/>" +
                        "while(<font color=#F3612E>condition</font>)<br/>" +
                        "{<br/>" +
                        "&#160 statements;<br/>" +
                        "&#160 variable increment or decrement; <br/>" +
                        "}<br/><br/>" +
                        "<b>Example: Program to print first 10 natural numbers</b><br/><br/>" +
                        "#include<stdio.h><br/>" +
                        "void main( )<br/>" +
                        "{<br/>" +
                        "&#160 int x;<br/>" +
                        "&#160 x = 1;<br/>" +
                        "&#160 while(x <= 10)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(\"%d\\t\", x);<br/>" +
                        "&#160 &#160 <font color=#3E3E3E>/* below statement means, do x = x+1, increment x by 1*/</font><br/>" +
                        "&#160 &#160 x++;<br/>" +
                        "&#160 }<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "1 2 3 4 5 6 7 8 9 10<br/><br/>";
                SetData(title,R.drawable.loop);
                break;

            case 8:
                data = "In some situations it is necessary to execute body of the loop before testing the condition. Such situations can be handled with the help of <font color=#F3612E><i>do-while</i></font> loop. <font color=#F3612E>do</font> statement evaluates the body of the loop first and at the end, the condition is checked using <font color=#F3612E>while</font> statement. It means that the body of the loop will be executed at least once, even though the starting condition inside <font color=#F3612E>while</font> is initialized to be <b>false</b>. General <b>syntax</b> is,<br/><br/>" +
                        "<font color=#F139A9>do</font><br/>" +
                        "{<br/>" +
                        "&#160 &#160 .....<br/>" +
                        "&#160 &#160 .....<br/>" +
                        "}<br/>" +
                        "while(<font color=#F3612E><i>condition</i></font>);<br/><br/>" +
                        "<b>Example: Program to print first 10 multiples of 5.</b><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "void main()<br/>" +
                        "{<br/>" +
                        "    int a, i;<br/>" +
                        "    a = 5;<br/>" +
                        "    i = 1;<br/>" +
                        "    do<br/>" +
                        "    {<br/>" +
                        "        printf(\"%d\\t\", a*i);<br/>" +
                        "        i++;<br/>" +
                        "    } <br/>" +
                        "    while(i &#60&#61 10);<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "5 10 15 20 25 30 35 40 45 50<br/><br/>";
                SetData(title,0);
                break;

            case 9:
                data = "for loop is used to execute a set of statements repeatedly until a particular condition is satisfied. We can say it is an <b>open ended loop..</b> General format is,<br/><br/>" +
                        "for(<font color=#F139A9><i>initialization</i></font>;<font color=#F3612E><i> condition</i></font>; <font color=#2E9FF3><i>increment/decrement</i></font>)<br/>" +
                        "{<br/>" +
                        "&#160 <b>statement-block;</b><br/>" +
                        "}<br/><br/>" +
                        "In for loop we have exactly two semicolons, one after initialization and second after the condition. In this loop we can have more than one initialization or increment/decrement, separated using comma operator. But it can have only one <b><i>condition</i></b>.<br/>" +
                        "<br/>" +
                        "<u><b>The for loop is executed as follows :</b></u><br/>" +
                        "<br/>" +
                        "&bull It first evaluates the initialization code.<br/>" +
                        "&bull Then it checks the condition expression.<br/>" +
                        "&bull If it is <b>true,</b> it executes the for-loop body.<br/>" +
                        "&bull Then it evaluate the increment/decrement condition and again follows from step 2.<br/>" +
                        "&bull When the condition expression becomes <b>false</b>, it exits the loop.<br/><br/>" +
                        "<b>Example: Program to print first 10 natural numbers</b><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "void main( )<br/>" +
                        "{<br/>" +
                        "&#160 int x;<br/>" +
                        "&#160 for(x = 1; x &#60&#61 10; x++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(\"%d\\t\", x);<br/>" +
                        "&#160 }<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "1 2 3 4 5 6 7 8 9 10<br/><br/>";
                SetData(title,R.drawable.loop);
                break;

            case 10:
                data = "We can also have nested for loops, i.e one for loop inside another for loop. Basic syntax is,<br/><br/>" +
                        "for(<font color=#F139A9><i>initialization</i></font>;<font color=#F3612E><i> condition</i></font>; <font color=#2E9FF3><i>increment/decrement</i></font>)<br/>" +
                        "{<br/>" +
                        "&#160 &#160 for(<font color=#F139A9><i>initialization</i></font>;<font color=#F3612E><i> condition</i></font>; <font color=#2E9FF3><i>increment/decrement</i></font>)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 &#160 <b>statement-block;</b><br/>" +
                        "&#160 &#160 }<br/>" +
                        "}<br/><br/>" +
                        "<b>Example: Program to print half Pyramid of numbers</b><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "void main( )<br/>" +
                        "{<br/>" +
                        "&#160 int i, j;<br/>" +
                        "&#160 <font color=#3E3E3E>/* first for-loop */</font><br/>" +
                        "&#160 for(i = 1; i &#60 5; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 &#160 printf(\"\\n\");<br/>" +
                        "&#160 &#160 &#160 <font color=#3E3E3E>/* second for-loop inside the first */</font><br/>" +
                        "&#160 &#160 &#160 for(j = i; j &#62 0; j--)<br/>" +
                        "&#160 &#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 &#160 &#160 printf(\"%d\", j);<br/>" +
                        "&#160 &#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "}<br/><br/>" +
                        "<b>Output :</b><br/><br/>" +
                        "1<br/>" +
                        "21<br/>" +
                        "321<br/>" +
                        "4321<br/>" +
                        "54321<br/><br/>";
                SetData(title,0);
                break;

            case 11:
                data="When <font color=#F139A9><i><b>break</b></i></font> statement is encountered inside a loop, the loop is immediately exited and the program continues with the statement immediately following the loop.<br/>";
                SetData(title,R.drawable.break_syntax);
                break;

            case 12:
                data="It causes the control to go directly to the test-condition and then <font color=#F139A9><i><b>continue</b></i></font> the loop process. On encountering continue, cursor leave the current cycle of loop, and starts with the next cycle.<br/><br/>";
                SetData(title,R.drawable.continue_syntax);
                break;

            default:
                data = "Coming Soon";
                SetData(title,0);
                break;
        }

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (size<28) {
                    size += 1;
                    syntax.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
                    syntax.setText(Html.fromHtml(data));
                }
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (size>11) {
                    size -= 1;
                    syntax.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
                    syntax.setText(Html.fromHtml(data));
                }
            }
        });

    }

    private void SetData(String title, int basic){
        syntax_title.setText(title);
        img.setImageResource(basic);
        syntax.setText(Html.fromHtml(data));
    }

    private void loadAd(){
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}