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

public class ImplementOtherPrograms extends AppCompatActivity {

    ImageButton increase,decrease,share,back;
    TextView prog_name,prog;
    int size = 14;
    SharedPreferences sharedPreferences;
    Dialog mDialog;
    String program_start,program;

    private RewardedAd mRewardedAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implement_other_programs);
        //loadAd();

        back = findViewById(R.id.other_back);
        increase = findViewById(R.id.increase_size);
        decrease = findViewById(R.id.decrease_size);
        prog = findViewById(R.id.real_other_program);
        prog_name = findViewById(R.id.other_program_name);
        share = findViewById(R.id.share);
        mDialog = new Dialog(this);


        mRewardedAd = new RewardedAd(this,getString(R.string.VideoAd_id));

        sharedPreferences = getSharedPreferences("MyPref",MODE_PRIVATE);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        int postion = getIntent().getIntExtra("position",0);
        prog_name.setText(getIntent().getStringExtra("prog_name"));

        switch (postion){
            case 1:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 <font color=#EC1A70>int</font> n;<br/>" +
                        "&#160 printf(\"Enter an Integer :\");<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "&#160 if( <font color=#F139A9>n%2 == 0</font> )<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Even\"</font>);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Odd\"</font>);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "OUTPUT :<br/><br/>" +
                        "(1st Run)<br/>" +
                        "Enter an Integer : 7<br/>" +
                        "Odd<br/><br/>" +
                        "(2nd Run)<br/>" +
                        "Enter an Integer : 10<br/>" +
                        "Even<br/><br/>" +
                        "*/</font>";
                program = "#include<stdio.h>\n" +
                        "int main()\n{\n" +
                        "\tint n;\n" +
                        "\tprintf(\"Enter an Integer\");\n" +
                        "\tscanf(\"%d\",&n);\n" +
                        "\tif( n%2 == 0)\n" +
                        "\t\tprintf(\"Even\");\n" +
                        "else<br/>\n" +
                        "\t\tprintf(\"Odd\");\n" +
                        "\treturn 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "OUTPUT :\n\n" +
                        "(1st Run)\n" +
                        "Enter an Integer : 7\n" +
                        "Odd\n\n" +
                        "(2nd Run)\n" +
                        "Enter an Integer : 10\n" +
                        "Even\n\n" +
                        "*/";
                setText();
                break;

            case 2:
                program_start = "<font color=#3E3E3E>/*<br/>" +
                        "Factorial of a number is the product of all smaller natural numbers including itself.<br/><br/>" +
                        "For Example :<br/>" +
                        "3! = 3*2*1<br/><br/>" +
                        "Note : Factorial of 0 is 1 (0!=1)<br/>" +
                        "*/<br/><br/></font>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,n,fact=1;<br/>" +
                        "&#160 printf(\"Enter an Integer :\");<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "&#160 <font color=#F139A9>for</font>(i=1;i&#60&#61n;i++)<br/>&#160 &#123 <br/>" +
                        "&#160 &#160 fact =  fact*1;<br/>" +
                        "&#160 &#125 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Factorial of %d is %d\"</font>,n,fact);<br/>" +
                        "&#125 <br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "OUTPUT :<br/><br/>"+
                        "(1st Run)<br/>" +
                        "Enter an Integer : 0<br/>" +
                        "Factorial of 0 is 1<br/><br/>" +
                        "(2nd Run)<br/>" +
                        "Enter an Integer : 7<br/>" +
                        "Factorial of 7 is 5040<br/><br/>" +
                        "*/</font>";
                program = "/*\n" +
                        "Factorial of a number is the product of all smaller natural numbers including itself.\n" +
                        "For Example :\n" +
                        "3! = 3*2*1\n\n" +
                        "Note : Factorial of 0 is 1 (0!=1)\n" +
                        "*/\n" +
                        "#include<stdio.h>\n" +
                        "void main()\n" +
                        "{\n" +
                        "\t int i,n,fact=1;\n" +
                        "\t printf(\"Enter an Integer :\");\n" +
                        "\t scanf(\"%d\",&n);\n" +
                        "\t for(i=1;i<=n;i++)\n\t{ \n" +
                        "\t\t fact =  fact*1;\n" +
                        "\t } \n" +
                        "\t printf(\"Factorial of %d is %d\",n,fact);\n" +
                        "} \n\n" +
                        "/*\n\n" +
                        "OUTPUT :\n\n"+
                        "(1st Run)\n" +
                        "Enter an Integer : 0\n" +
                        "Factorial of 0 is 1\n\n" +
                        "(2nd Run)\n" +
                        "Enter an Integer : 7\n" +
                        "Factorial of 7 is 5040\n\n" +
                        "*/";
                setText();
                break;

            case 3:
                prog.setTextSize(12);
                size = 12;
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt conio.h&gt<br/>" +
                        "<font color=#EC1A70>long int</font> factorial(int n);<br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 <font color=#EC1A70>int</font> i,n,fact=1;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an Integer :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "&#160 printf(\"<font color=#EC1A70>Factorial of %d is %ld</font>\",n,factorial(n)); <br/>" +
                        "} <br/>" +
                        "<font color=#EC1A70>long int</font> factorial(int n)<br/>" +
                        "{<br/>" +
                        "&#160 if(n&#60&#61 1)" +
                        "&#160 {<br/>" +
                        "&#160 &#160 return(01);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else<br/>{" +
                        "&#160 &#160 n=n*factorial(n-1);<br/>" +
                        "&#160 &#160 return(n);<br/>" +
                        "&#160 }<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "OUTPUT :<br/><br/>"+
                        "(1st Run)<br/>" +
                        "Enter an Integer : 0<br/>" +
                        "Factorial of 0 is 1<br/><br/>" +
                        "(2nd Run)<br/>" +
                        "Enter an Integer : 7<br/>" +
                        "Factorial of 7 is 5040<br/><br/>" +
                        "*/</font>";
                program ="#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "long int factorial(int n);" +
                        "void main()\n" +
                        "{\n" +
                        "\t int i,n,fact=1;\n" +
                        "\t printf(\"Enter an Integer :\");\n" +
                        "\t scanf(\"%d\",&n);\n" +
                        "\t printf(\"Factorial of %d is %ld\",n,factorial(n));\n" +
                        "} \n" +
                        "long int factorial(int n)\n" +
                        "{\n" +
                        "\tif(n<=1)\n" +
                        "\t{" +
                        "\t\treturn(01);\n" +
                        "\t}\n" +
                        "\telse\n\t{\n" +
                        "\t\tn=n*factorial(n-1);\n" +
                        "\t\treturn(n);\n" +
                        "\t}" +
                        "}\n\n" +
                        "/*\n\n" +
                        "OUTPUT :\n\n"+
                        "(1st Run)\n" +
                        "Enter an Integer : 0\n" +
                        "Factorial of 0 is 1\n\n" +
                        "(2nd Run)\n" +
                        "Enter an Integer : 7\n" +
                        "Factorial of 7 is 5040\n\n" +
                        "*/";

                setText();
                break;

            case 4:
                prog.setTextSize(12);
                size = 12;
                program_start = "<font color=#3E3E3E>/*>br/>" +
                        "Prime Number is a number which is divisible by 1 and itself.<br/>" +
                        "For Example :<br/>" +
                        "5 is a Prime Number as 5 is divisible by only 1 and itself.<br/>" +
                        "4 is not a Prime Number as 4 is divisible by 1,2 and 4.<br/>" +
                        "*/</font><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n, i, flag = 0;<br/>" +
                        "&#160 printf(\"Enter a positive integer: \");<br/>" +
                        "&#160 scanf(\"%d\", &n);<br/>" +
                        "<br/>" +
                        "&#160 for (i = 2; i &#60= n / 2; ++i) {<br/>" +
                        "<br/>" +
                        "&#160 &#160 // condition for non-prime<br/>" +
                        "&#160 &#160 if (n % i == 0) {<br/>" +
                        "&#160 &#160 &#160 flag = 1;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 if (n == 1) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"1 is neither prime nor composite.\"</font>);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else {<br/>" +
                        "&#160 &#160 if (flag == 0)<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d is a prime number.\"</font>, n);<br/>" +
                        "&#160 &#160 else<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d is not a prime number.\"</font>, n);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "Output :<br/>" +
                        "Enter a positive integer: 29<br/>" +
                        "29 is a prime number.<br/>" +
                        "*/</font>";
                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int n, i, flag = 0;\n" +
                        "    printf(\"Enter a positive integer: \");\n" +
                        "    scanf(\"%d\", &n);\n" +
                        "\n" +
                        "    for (i = 2; i <= n / 2; ++i) {\n" +
                        "\n" +
                        "        // condition for non-prime\n" +
                        "        if (n % i == 0) {\n" +
                        "            flag = 1;\n" +
                        "            break;\n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "    if (n == 1) {\n" +
                        "        printf(\"1 is neither prime nor composite.\");\n" +
                        "    }\n" +
                        "    else {\n" +
                        "        if (flag == 0)\n" +
                        "            printf(\"%d is a prime number.\", n);\n" +
                        "        else\n" +
                        "            printf(\"%d is not a prime number.\", n);\n" +
                        "    }\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :" +
                        "Enter a positive integer: 29\n" +
                        "29 is a prime number.\n" +
                        "*/";
                setText();
                break;

            case 5:
                prog.setTextSize(12);
                size = 12;
                program_start = "<font color=#3E3E3E>/*>br/>" +
                        "Prime Number is a number which is divisible by 1 and itself.<br/>" +
                        "For Example :<br/>" +
                        "5 is a Prime Number as 5 is divisible by only 1 and itself.<br/>" +
                        "4 is not a Prime Number as 4 is divisible by 1,2 and 4.<br/>" +
                        "*/</font><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n,j=2,ch=0;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a positive integer: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &n);<br/>" +
                        "&#160 if(n &#60= 1)<br/>" +
                        "&#160 &#160 ch=1;<br/><br/>" +
                        "&#160 while (j &#60= n / 2) {<br/>" +
                        "<br/>" +
                        "&#160 &#160 // condition for non-prime<br/>" +
                        "&#160 &#160 if (n % j == 0) {<br/>" +
                        "&#160 &#160 &#160 ch = 1;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 if (ch == 1) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"1 is neither prime nor composite.\"</font>);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else {<br/>" +
                        "&#160 &#160 if (ch == 0)<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d is a prime number.\"</font>, n);<br/>" +
                        "&#160 &#160 else<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d is not a prime number.\"</font>, n);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "Output :<br/>" +
                        "Enter a positive integer: 29<br/>" +
                        "29 is a prime number.<br/>" +
                        "*/</font>";
                program = "#include<stdio.h>\n" +
                        "int main() {\n" +
                        "    int n, j, ch = 0;\n" +
                        "    printf(\"Enter a positive integer: \");\n" +
                        "    scanf(\"%d\", &n);\n" +
                        "    if(n <= 1)\n" +
                        "        ch=1;" +
                        "\n" +
                        "    while (j <= n / 2) {\n" +
                        "\n" +
                        "        // condition for non-prime\n" +
                        "        if (n % j == 0) {\n" +
                        "            ch = 1;\n" +
                        "            break;\n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "    if (n == 1) {\n" +
                        "        printf(\"1 is neither prime nor composite.\");\n" +
                        "    }\n" +
                        "    else {\n" +
                        "        if (flag == 0)\n" +
                        "            printf(\"%d is a prime number.\", n);\n" +
                        "        else\n" +
                        "            printf(\"%d is not a prime number.\", n);\n" +
                        "    }\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :" +
                        "Enter a positive integer: 29\n" +
                        "29 is a prime number.\n" +
                        "*/";
                setText();
                break;

            case 6:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int maximum(int a[],int n);<br/>" +
                        "&#160 int max,i,n;<br/>" +
                        "&#160 int a[50];<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter n number:\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the numbers:\"</font>);<br/><br/>" +
                        "&#160 for(i=0;i&#60n;i++)<br/>" +
                        "&#160 &#160 scanf(\"%d\",&a[i]);<br/><br/>" +
                        "&#160 max = maximum(a,n);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"The largest number is %d\"</font>,max);<br/>" +
                        "}<br/>" +
                        "int maximum(int a[],int n)<br/>" +
                        "{<br/>" +
                        "&#160 int i,m=0;<br/>" +
                        "&#160 for(i=0;i<n;i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(a[i]>m)<br/>" +
                        "&#160 &#160 &#160 m=a[i];<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 return m;<br/>" +
                        "}<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "Output :<br/>" +
                        "Enter n Numbers : 7<br/>" +
                        "Enter the Numbers : 10<br/>" +
                        "2<br/>" +
                        "4<br/>" +
                        "12<br/>" +
                        "98<br/>" +
                        "56<br/>" +
                        "32<br/>" +
                        "The Largest number is 98<br/></font>";
                program = "#include<stdio.h>\n" +
                        "void main()\n" +
                        "{\n" +
                        "int maximum(int a[],int n);\n" +
                        "int max,i,n;\n" +
                        "int a[50];\n" +
                        "printf(\"Enter n number:\");\n" +
                        "scanf(\"%d\",&n);\n" +
                        "printf(\"Enter the numbers:\");\n" +
                        "for(i=0;i<n;i++)\n" +
                        "scanf(\"%d\",&a[i]);\n" +
                        "max=maximum(a,n);\n" +
                        "printf(\"The largest number is %d\",max);\n" +
                        "}\n" +
                        "int maximum(int a[],int n)\n" +
                        "{\n" +
                        "int i,m=0;\n" +
                        "for(i=0;i<n;i++)\n" +
                        "{\n" +
                        "if(a[i]>m)\n" +
                        "m=a[i];\n" +
                        "}\n" +
                        "return m;\n" +
                        "}\n\n" +
                        "/*" +
                        "Output :\n" +
                        "Enter n Numbers : 7\n" +
                        "Enter the Numbers : 10\n" +
                        "2\n" +
                        "4\n" +
                        "12\n" +
                        "98\n" +
                        "56\n" +
                        "32\n" +
                        "The Largest number is 98\n\n";
                setText();
                break;

            case 7:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 double first, second, temp;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter first number: \"</font>);<br/>" +
                        "&#160 scanf(\"%lf\", &first);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter second number: \"</font>);<br/>" +
                        "&#160 scanf(\"%lf\", &second);<br/>" +
                        "<br/>" +
                        "&#160 // Value of first is assigned to temp<br/>" +
                        "&#160 temp = first;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// Value of second is assigned to first</font><br/>" +
                        "&#160 first = second;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// Value of temp (initial value of first) is assigned to second</font><br/>" +
                        "&#160 second = temp;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nAfter swapping, firstNumber = %.2lf\\n\"</font>, first);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"After swapping, secondNumber = %.2lf\"</font>, second);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "Enter first number: 1.20<br/>" +
                        "Enter second number: 2.45<br/>" +
                        "<br/><br/>" +
                        "After swapping, firstNumber = 2.45<br/>" +
                        "After swapping, secondNumber = 1.20<br/><br/>" +
                        "*/</font>";
                program = "#include<stdio.h>\n" +
                        "int main() {\n" +
                        "      double first, second, temp;\n" +
                        "      printf(\"Enter first number: \");\n" +
                        "      scanf(\"%lf\", &first);\n" +
                        "      printf(\"Enter second number: \");\n" +
                        "      scanf(\"%lf\", &second);\n" +
                        "\n" +
                        "      // Value of first is assigned to temp\n" +
                        "      temp = first;\n" +
                        "\n" +
                        "      // Value of second is assigned to first\n" +
                        "      first = second;\n" +
                        "\n" +
                        "      // Value of temp (initial value of first) is assigned to second\n" +
                        "      second = temp;\n" +
                        "\n" +
                        "      printf(\"\\nAfter swapping, firstNumber = %.2lf\\n\", first);\n" +
                        "      printf(\"After swapping, secondNumber = %.2lf\", second);\n" +
                        "      return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Enter first number: 1.20\n" +
                        "Enter second number: 2.45\n" +
                        "\n" +
                        "After swapping, firstNumber = 2.45\n" +
                        "After swapping, secondNumber = 1.20\n" +
                        "*/\n";
                setText();
                break;

            case 8:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 double a, b;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a: \"</font>);<br/>" +
                        "&#160 scanf(\"%lf\", &a);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter b: \"</font>);<br/>" +
                        "&#160 scanf(\"%lf\", &b);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// Swapping</font><br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// a = (initial_a - initial_b)</font><br/>" +
                        "&#160 a = a - b;   <br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>// b = (initial_a - initial_b) + initial_b = initial_a</font><br/>" +
                        "&#160 b = a + b;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// a = initial_a - (initial_a - initial_b) = initial_b</font><br/>" +
                        "&#160 a = b - a;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"After swapping, a = %.2lf\\n\"</font>, a);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"After swapping, b = %.2lf\"</font>, b);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "Enter a: 10.25<br/>" +
                        "Enter b: -12.5<br/>" +
                        "After swapping, a = -12.50<br/>" +
                        "After swapping, b = 10.25<br/>" +
                        "*/</font><br/>";
                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    double a, b;\n" +
                        "    printf(\"Enter a: \");\n" +
                        "    scanf(\"%lf\", &a);\n" +
                        "    printf(\"Enter b: \");\n" +
                        "    scanf(\"%lf\", &b);\n" +
                        "\n" +
                        "    // Swapping\n" +
                        "\n" +
                        "    // a = (initial_a - initial_b)\n" +
                        "    a = a - b;   \n" +
                        " \n" +
                        "    // b = (initial_a - initial_b) + initial_b = initial_a\n" +
                        "    b = a + b;\n" +
                        "\n" +
                        "    // a = initial_a - (initial_a - initial_b) = initial_b\n" +
                        "    a = b - a;\n" +
                        "\n" +
                        "    printf(\"After swapping, a = %.2lf\\n\", a);\n" +
                        "    printf(\"After swapping, b = %.2lf\", b);\n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Enter a: 10.25\n" +
                        "Enter b: -12.5\n" +
                        "After swapping, a = -12.50\n" +
                        "After swapping, b = 10.25\n" +
                        "*/\n";
                setText();
                break;

            case 9:
                program_start="#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int i, n, t1 = 0, t2 = 1, nextTerm;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the number of terms: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &n);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Fibonacci Series: \"</font>);<br/>" +
                        "<br/>" +
                        "&#160 for (i = 1; i &#60= n; ++i) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d, \"</font>, t1);<br/>" +
                        "&#160 &#160 nextTerm = t1 + t2;<br/>" +
                        "&#160 &#160 t1 = t2;<br/>" +
                        "&#160 &#160 t2 = nextTerm;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/><br/>" +
                        "Enter the number of terms: 10<br/>" +
                        "Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,<br/> </font>";
                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int i, n, t1 = 0, t2 = 1, nextTerm;\n" +
                        "    printf(\"Enter the number of terms: \");\n" +
                        "    scanf(\"%d\", &n);\n" +
                        "    printf(\"Fibonacci Series: \");\n" +
                        "\n" +
                        "    for (i = 1; i <= n; ++i) {\n" +
                        "        printf(\"%d, \", t1);\n" +
                        "        nextTerm = t1 + t2;\n" +
                        "        t1 = t2;\n" +
                        "        t2 = nextTerm;\n" +
                        "    }\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "Output :\n\n" +
                        "Enter the number of terms: 10\n" +
                        "Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, \n";
                setText();
                break;

            case 10:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n, reversedN = 0, remainder, originalN;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an integer: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &n);<br/>" +
                        "&#160 originalN = n;<br/>" +
                        "<br/>" +
                        "&#160 // reversed integer is stored in reversedN<br/>" +
                        "&#160 while (n != 0) {<br/>" +
                        "&#160 &#160 remainder = n % 10;<br/>" +
                        "&#160 &#160 reversedN = reversedN * 10 + remainder;<br/>" +
                        "&#160 &#160 n /= 10;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 // palindrome if orignalN and reversedN are equal<br/>" +
                        "&#160 if (originalN == reversedN)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is a palindrome.\"</font>, originalN);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is not a palindrome.\"</font>, originalN);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter an integer: 1001<br/>" +
                        "1001 is a palindrome.<br/><br/></font>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int n, reversedN = 0, remainder, originalN;\n" +
                        "    printf(\"Enter an integer: \");\n" +
                        "    scanf(\"%d\", &n);\n" +
                        "    originalN = n;\n" +
                        "\n" +
                        "    // reversed integer is stored in reversedN\n" +
                        "    while (n != 0) {\n" +
                        "        remainder = n % 10;\n" +
                        "        reversedN = reversedN * 10 + remainder;\n" +
                        "        n /= 10;\n" +
                        "    }\n" +
                        "\n" +
                        "    // palindrome if orignalN and reversedN are equal\n" +
                        "    if (originalN == reversedN)\n" +
                        "        printf(\"%d is a palindrome.\", originalN);\n" +
                        "    else\n" +
                        "        printf(\"%d is not a palindrome.\", originalN);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter an integer: 1001\n" +
                        "1001 is a palindrome.\n\n" +
                        "*/";
                setText();
                break;

            case 11:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int rows, coef = 1, space, i, j;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the number of rows: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &rows);<br/>" +
                        "&#160 for (i = 0; i &#60 rows; i++) {<br/>" +
                        "&#160 for (space = 1; space &#60= rows - i; space++)<br/>" +
                        "&#160 &#160 printf(\"  \");<br/>" +
                        "&#160 for (j = 0; j &#60= i; j++) {<br/>" +
                        "&#160 &#160 if (j == 0 || i == 0)<br/>" +
                        "&#160 &#160 &#160 coef = 1;<br/>" +
                        "&#160 &#160 else<br/>" +
                        "&#160 &#160 &#160 coef = coef * (i - j + 1) / j;<br/>" +
                        "&#160 &#160 printf(\"%4d\", coef);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 printf(\"\\n\");<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/><br/>" +
                        "&#160 &#160 &#160 &#160 &#160 &#160 1<br/>" +
                        "&#160 &#160 &#160 &#160 &#160 1 &#160 1<br/>" +
                        "&#160 &#160 &#160 &#160 1 &#160 2 &#160 1<br/>" +
                        "&#160 &#160 &#160 1 &#160  3 &#160  3 &#160 1<br/>" +
                        "&#160 &#160 1 &#160 4 &#160 6 &#160 4 &#160 1<br/>" +
                        "&#160 1 &#160 5 &#160 10 &#160 10 &#160 5 &#160 1<br/>" +
                        "*/</font>";
                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "   int rows, coef = 1, space, i, j;\n" +
                        "   printf(\"Enter the number of rows: \");\n" +
                        "   scanf(\"%d\", &rows);\n" +
                        "   for (i = 0; i < rows; i++) {\n" +
                        "      for (space = 1; space <= rows - i; space++)\n" +
                        "         printf(\"  \");\n" +
                        "      for (j = 0; j <= i; j++) {\n" +
                        "         if (j == 0 || i == 0)\n" +
                        "            coef = 1;\n" +
                        "         else\n" +
                        "            coef = coef * (i - j + 1) / j;\n" +
                        "         printf(\"%4d\", coef);\n" +
                        "      }\n" +
                        "      printf(\"\\n\");\n" +
                        "   }\n" +
                        "   return 0;\n" +
                        "}\n\n" +
                        "Output :\n\n" +
                        "           1\n" +
                        "         1   1\n" +
                        "       1   2   1\n" +
                        "     1   3   3    1\n" +
                        "   1  4    6   4   1\n" +
                        " 1  5   10   10  5   1\n";
                setText();
                break;

            case 12 :
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int year;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a year: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &year);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// leap year if perfectly visible by 400</font><br/>" +
                        "&#160 if (year % 400 == 0) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is a leap year.\"</font>, year);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <font color=#3E3E3E>// not a leap year if visible by 100<br/>" +
                        "&#160 // but not divisible by 400</font><br/>" +
                        "&#160 else if (year % 100 == 0) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is not a leap year.\"</font>, year);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <font color=#3E3E3E>// leap year if not divisible by 100<br/>" +
                        "&#160 // but divisible by 4</font><br/>" +
                        "&#160 else if (year % 4 == 0) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is a leap year.\"</font>, year);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <font color=#3E3E3E>// all other years are not leap year</font><br/>" +
                        "&#160 else {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is not a leap year.\"</font>, year);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output 1 :<br/>" +
                        "Enter a year: 1900<br/>" +
                        "1900 is not a leap year.<br/><br/>" +
                        "Output 2:<br/>" +
                        "Enter a year: 2012<br/>" +
                        "2012 is a leap year.<br/>" +
                        "*/</font>";

                program ="#include <stdio.h>\n" +
                        "int main() {\n" +
                        "   int year;\n" +
                        "   printf(\"Enter a year: \");\n" +
                        "   scanf(\"%d\", &year);\n" +
                        "\n" +
                        "   // leap year if perfectly visible by 400\n" +
                        "   if (year % 400 == 0) {\n" +
                        "      printf(\"%d is a leap year.\", year);\n" +
                        "   }\n" +
                        "   // not a leap year if visible by 100\n" +
                        "   // but not divisible by 400\n" +
                        "   else if (year % 100 == 0) {\n" +
                        "      printf(\"%d is not a leap year.\", year);\n" +
                        "   }\n" +
                        "   // leap year if not divisible by 100\n" +
                        "   // but divisible by 4\n" +
                        "   else if (year % 4 == 0) {\n" +
                        "      printf(\"%d is a leap year.\", year);\n" +
                        "   }\n" +
                        "   // all other years are not leap year\n" +
                        "   else {\n" +
                        "      printf(\"%d is not a leap year.\", year);\n" +
                        "   }\n" +
                        "\n" +
                        "   return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output 1 :\n" +
                        "Enter a year: 1900\n" +
                        "1900 is not a leap year.\n\n" +
                        "Output 2:\n" +
                        "Enter a year: 2012\n" +
                        "2012 is a leap year.\n" +
                        "*/";
                setText();
                break;

            case 13:
                program_start = "<font color=#3E3E3E>/*<br/><br/>" +
                        "C Program to Check whether a given Number is Perfect Number<br/><br/>" +
                        " */</font><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int number, rem, sum = 0, i;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a Number\\n\"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &number);<br/>" +
                        "&#160 for (i = 1; i &#60= (number - 1); i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 rem = number % i;<br/>" +
                        "&#160 &#160 if (rem == 0)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 sum = sum + i;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "&#160 if (sum == number)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Entered Number is perfect number\"</font>);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Entered Number is not a perfect number\"</font>);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output 1:<br/>" +
                        "Enter a Number<br/>" +
                        "100<br/>" +
                        "Entered Number is not a perfect number<br/><br/>" +
                        "Output 2:<br/>" +
                        "Enter a Number<br/>" +
                        "6<br/>" +
                        "Entered Number is a perfect number<br/>" +
                        "*/</font>";

                program = "/*\n" +
                        " * C Program to Check whether a given Number is Perfect Number\n" +
                        " */\n" +
                        "#include <stdio.h>\n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "    int number, rem, sum = 0, i;\n" +
                        " \n" +
                        "    printf(\"Enter a Number\\n\");\n" +
                        "    scanf(\"%d\", &number);\n" +
                        "    for (i = 1; i <= (number - 1); i++)\n" +
                        "    {\n" +
                        "        rem = number % i;\n" +
                        "\tif (rem == 0)\n" +
                        "        {\n" +
                        "            sum = sum + i;\n" +
                        "        }\n" +
                        "    }\n" +
                        "    if (sum == number)\n" +
                        "        printf(\"Entered Number is perfect number\");\n" +
                        "    else\n" +
                        "        printf(\"Entered Number is not a perfect number\");\n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output 1:\n" +
                        "Enter a Number\n" +
                        "100\n" +
                        "Entered Number is not a perfect number\n\n" +
                        "Output 2:\n" +
                        "Enter a Number\n" +
                        "6\n" +
                        "Entered Number is a perfect number\n" +
                        "*/";
                setText();
                break;

            case 14:
                prog.setTextSize(12);
                size = 12;
                program_start = "#include&lt math.h&gt<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num, originalNum, remainder, n = 0;<br/>" +
                        "&#160 float result = 0.0;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an integer: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", & num);<br/>" +
                        "<br/>" +
                        "&#160 originalNum = num;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// store the number of digits of num in n</font><br/>" +
                        "&#160 for (originalNum = num; originalNum != 0; ++n) {<br/>" +
                        "&#160 &#160 originalNum /= 10;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 for (originalNum = num; originalNum != 0; originalNum /= 10) {<br/>" +
                        "&#160 &#160 remainder = originalNum % 10;<br/>" +
                        "<br/>" +
                        "&#160 &#160 <font color=#3E3E3E>// store the sum of the power of individual digits in result</font><br/>" +
                        "&#160 &#160 result += pow(remainder, n);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// if num is equal to result, the number is an Armstrong number</font><br/>" +
                        "&#160 if ((int)result == num)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is an Armstrong number.\"</font>, num);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is not an Armstrong number.\"</font>, num);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter an integer: 1634<br/>" +
                        "1634 is an Armstrong number.<br/>" +
                        "*/</font>";

                program = "#include <math.h>\n" +
                        "#include <stdio.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "   int num, originalNum, remainder, n = 0;\n" +
                        "   float result = 0.0;\n" +
                        "\n" +
                        "   printf(\"Enter an integer: \");\n" +
                        "   scanf(\"%d\", &num);\n" +
                        "\n" +
                        "   originalNum = num;\n" +
                        "\n" +
                        "   // store the number of digits of num in n\n" +
                        "   for (originalNum = num; originalNum != 0; ++n) {\n" +
                        "       originalNum /= 10;\n" +
                        "   }\n" +
                        "\n" +
                        "   for (originalNum = num; originalNum != 0; originalNum /= 10) {\n" +
                        "       remainder = originalNum % 10;\n" +
                        "\n" +
                        "      // store the sum of the power of individual digits in result\n" +
                        "      result += pow(remainder, n);\n" +
                        "   }\n" +
                        "\n" +
                        "   // if num is equal to result, the number is an Armstrong number\n" +
                        "   if ((int)result == num)\n" +
                        "    printf(\"%d is an Armstrong number.\", num);\n" +
                        "   else\n" +
                        "    printf(\"%d is not an Armstrong number.\", num);\n" +
                        "   return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter an integer: 1634\n" +
                        "1634 is an Armstrong number.\n" +
                        "*/";
                setText();
                break;

            case 15:
                program_start = "#include&lt math.h&gt<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{  <br/>" +
                        "&#160 int n;  <br/>" +
                        "&#160 int sum=0;  <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a number\"</font>);  <br/>" +
                        "&#160 scanf(\"%d\",&n);  <br/>" +
                        "&#160 int k=n;  <br/>" +
                        "&#160 int r;  <br/>" +
                        "&#160 while(k!=0)  <br/>" +
                        "&#160 {  <br/>" +
                        "&#160 &#160 r=k%10;  <br/>" +
                        "&#160 &#160 int f=fact(r);  <br/>" +
                        "&#160 &#160 k=k/10;  <br/>" +
                        "&#160 &#160 sum=sum+f;  <br/>" +
                        "&#160 }  <br/>" +
                        "&#160 if(sum==n)  <br/>" +
                        "&#160 {  <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\nNumber is a strong\"</font>);  <br/>" +
                        "&#160 }  <br/>" +
                        "&#160 else  <br/>" +
                        "&#160 {  <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\\nNumber is not a strong\"</font>);  <br/>" +
                        "&#160 }  <br/>" +
                        "&#160 return 0;  <br/>" +
                        "}  <br/>" +
                        "int fact(int r)  <br/>" +
                        "{  <br/>" +
                        "&#160 int mul=1;  <br/>" +
                        "&#160 for(int i=1;i<=r;i++)  <br/>" +
                        "&#160 {  <br/>" +
                        "&#160 &#160 mul=mul*i;  <br/>" +
                        "&#160 }  <br/>" +
                        "&#160 return mul;  <br/>" +
                        "      <br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter a number 145<br/>" +
                        "Number is Strong<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>  \n" +
                        "#include <math.h>\n" +
                        "int main()  \n" +
                        "{  \n" +
                        "    int n;  \n" +
                        "    int sum=0;  \n" +
                        "    printf(\"Enter a number\");  \n" +
                        "    scanf(\"%d\",&n);  \n" +
                        "    int k=n;  \n" +
                        "    int r;  \n" +
                        "    while(k!=0)  \n" +
                        "    {  \n" +
                        "        r=k%10;  \n" +
                        "        int f=fact(r);  \n" +
                        "        k=k/10;  \n" +
                        "        sum=sum+f;  \n" +
                        "    }  \n" +
                        "    if(sum==n)  \n" +
                        "    {  \n" +
                        "        printf(\"\\nNumber is a strong\");  \n" +
                        "    }  \n" +
                        "    else  \n" +
                        "    {  \n" +
                        "        printf(\"\\nNumber is not a strong\");  \n" +
                        "    }  \n" +
                        "    return 0;  \n" +
                        "}  \n" +
                        "int fact(int r)  \n" +
                        "{  \n" +
                        "    int mul=1;  \n" +
                        "    for(int i=1;i<=r;i++)  \n" +
                        "    {  \n" +
                        "        mul=mul*i;  \n" +
                        "    }  \n" +
                        "    return mul;  \n" +
                        "      \n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter a number 145\n" +
                        "Number is Strong\n" +
                        "*/";
                setText();
                break;

            case 16:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font> isNeon(int num)<br/>" +
                        "{<br/>" +
                        "&#160 <font color=#3E3E3E>//storing the square of x</font><br/>" +
                        "&#160 int square = 0;<br/>" +
                        "&#160 <font color=#3E3E3E>//Store sum of digits (square number)</font><br/>" +
                        "&#160 int sum_digits = 0;<br/>" +
                        "&#160 <font color=#3E3E3E>//Calculate square of given number</font><br/>" +
                        "&#160 square = (num * num);<br/>" +
                        "&#160 while (square != 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 sum_digits = (sum_digits + (square % 10));<br/>" +
                        "&#160 &#160 square = (square / 10);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return (sum_digits == num);<br/>" +
                        "}<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int data = 0;<br/>" +
                        "&#160 int isNeonNumber = 0;<br/>" +
                        "&#160 int loop = 0;<br/>" +
                        "&#160 <font color=#3E3E3E>//Ask to enter the number</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the number upto you want check neon number = \"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&data);<br/>" +
                        "&#160 for (loop = 0; loop &#60= data; loop++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 <font color=#3E3E3E>// if is isNeonNumber is 1, then neon number</font><br/>" +
                        "&#160 &#160 isNeonNumber = isNeon(loop);<br/>" +
                        "&#160 &#160 if(isNeonNumber)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\" %d is neon number\\n\"</font>,loop);<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter the number upto you want check neon number = 100000<br/>" +
                        "0 is neon number<br/>" +
                        "1 is neon number<br/>" +
                        "9 is neon number<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int isNeon(int num)\n" +
                        "{\n" +
                        "    //storing the square of x\n" +
                        "    int square = 0;\n" +
                        "    //Store sum of digits (square number)\n" +
                        "    int sum_digits = 0;\n" +
                        "    //Calculate square of given number\n" +
                        "    square = (num * num);\n" +
                        "    while (square != 0)\n" +
                        "    {\n" +
                        "        sum_digits = (sum_digits + (square % 10));\n" +
                        "        square = (square / 10);\n" +
                        "    }\n" +
                        "    return (sum_digits == num);\n" +
                        "}\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int data = 0;\n" +
                        "    int isNeonNumber = 0;\n" +
                        "    int loop = 0;\n" +
                        "    //Ask to enter the number\n" +
                        "    printf(\"Enter the number upto you want check neon number = \");\n" +
                        "    scanf(\"%d\",&data);\n" +
                        "    for (loop = 0; loop <= data; loop++)\n" +
                        "    {\n" +
                        "        // if is isNeonNumber is 1, then neon number\n" +
                        "        isNeonNumber = isNeon(loop);\n" +
                        "        if(isNeonNumber)\n" +
                        "        {\n" +
                        "            printf(\" %d is neon number\\n\",loop);\n" +
                        "        }\n" +
                        "    }\n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter the number upto you want check neon number = 100000\n" +
                        "0 is neon number\n" +
                        "1 is neon number\n" +
                        "9 is neon number\n" +
                        "*/";
                setText();
                break;

            case 17:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt stdlib.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num, sqr, temp, last;<br/>" +
                        "&#160 int n =0;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a number \\n\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&num);<br/>" +
                        " <br/>" +
                        "&#160 sqr = num*num;  //calculating square of num<br/>" +
                        "&#160 temp = num;<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//Counting number of digits</font><br/>" +
                        "&#160 while(temp &#62 0){<br/>" +
                        "&#160 &#160 n++;<br/>" +
                        "&#160 &#160 temp = temp/10;<br/>" +
                        "&#160 }<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//Extracting last n digits</font><br/>" +
                        "&#160 int den = floor(pow(10,n));<br/>" +
                        "&#160 last = sqr % den;<br/>" +
                        " <br/>" +
                        "&#160 if(last == num)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Automorphic number \\n\"</font>);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Not Automorphic \\n\"</font>);<br/>" +
                        " <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter a Number<br/>" +
                        "76<br/>" +
                        "Automorphic Number<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "#include <stdlib.h>\n" +
                        "#include <math.h>\n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "    int num, sqr, temp, last;\n" +
                        "    int n =0;\n" +
                        " \n" +
                        "    printf(\"Enter a number \\n\");\n" +
                        "    scanf(\"%d\",&num);\n" +
                        " \n" +
                        "    sqr = num*num;  //calculating square of num\n" +
                        "    temp = num;\n" +
                        " \n" +
                        "    //Counting number of digits\n" +
                        "    while(temp>0){\n" +
                        "        n++;\n" +
                        "        temp = temp/10;\n" +
                        "    }\n" +
                        " \n" +
                        "    //Extracting last n digits\n" +
                        "    int den = floor(pow(10,n));\n" +
                        "    last = sqr % den;\n" +
                        " \n" +
                        "    if(last == num)\n" +
                        "        printf(\"Automorphic number \\n\");\n" +
                        "    else\n" +
                        "        printf(\"Not Automorphic \\n\");\n" +
                        " \n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter a Number\n" +
                        "76\n" +
                        "Automorphic Number\n" +
                        "*/";
                setText();
                break;

            case 18:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num,sum=0,prod=1,remainder,temp;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the Number:\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&num);<br/>" +
                        "&#160 temp=num;<br/>" +
                        "&#160 while(temp &#62 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 remainder=temp%10;<br/>" +
                        "&#160 &#160 sum=sum+remainder;<br/>" +
                        "&#160 &#160 prod=prod*remainder;<br/>" +
                        "&#160 &#160 temp=temp/10;<br/>" +
                        "&#160 &#160 <br/>" +
                        "&#160 }<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Sum of its digits= %d\\n\"</font>,sum);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Product of its digits= %d\\n\"</font>,prod);<br/>" +
                        "&#160 if(sum==prod)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is a Spy number\"</font>,num);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is not a spy number\"</font>,num);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter the Number :<br/>" +
                        "123<br/>" +
                        "Sum of its Digits = 6<br/>" +
                        "Product of its digits= 6<br/>" +
                        "123 is a Spy Number.<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int num,sum=0,prod=1,remainder,temp;\n" +
                        "    printf(\"Enter the Number:\");\n" +
                        "    scanf(\"%d\",&num);\n" +
                        "    temp=num;\n" +
                        "    while(temp>0)\n" +
                        "    {\n" +
                        "        remainder=temp%10;\n" +
                        "        sum=sum+remainder;\n" +
                        "        prod=prod*remainder;\n" +
                        "        temp=temp/10;\n" +
                        "        \n" +
                        "    }\n" +
                        "    printf(\"Sum of its digits= %d\\n\",sum);\n" +
                        "    printf(\"Product of its digits= %d\\n\",prod);\n" +
                        "    if(sum==prod)\n" +
                        "    {\n" +
                        "        printf(\"%d is a Spy number\",num);\n" +
                        "    }\n" +
                        "    else\n" +
                        "    {\n" +
                        "        printf(\"%d is not a spy number\",num);\n" +
                        "    }\n" +
                        "    return 0;\n" +
                        "}\n\n" +
                        "Output :\n" +
                        "Enter the Number :\n" +
                        "123\n" +
                        "Sum of its Digits = 6\n" +
                        "Product of its digits= 6\n" +
                        "123 is a Spy Number.\n";
                setText();
                break;

            case 19:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "     <br/>" +
                        "<font color=#3E3E3E>//isHappyNumber() will determine whether a number is happy or not</font><br/>" +
                        "int isHappyNumber(int num){<br/>" +
                        "&#160 int rem = 0, sum = 0;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>//Calculates the sum of squares of digits</font><br/>" +
                        "&#160 while(num &#62 0){<br/>" +
                        "&#160 &#160 rem = num%10;<br/>" +
                        "&#160 &#160 sum = sum + (rem*rem);<br/>" +
                        "&#160 &#160 num = num/10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return sum;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num = 82;<br/>" +
                        "&#160 int result = num;<br/>" +
                        "<br/>" +
                        "&#160 while(result != 1 && result != 4){<br/>" +
                        "&#160 &#160 result = isHappyNumber(result);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>//Happy number always ends with 1</font><br/>" +
                        "&#160 if(result == 1)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is a happy number\"</font>, num);<br/>" +
                        "&#160 <font color=#3E3E3E>//Unhappy number ends in a cycle of repeating numbers which contains 4</font><br/>" +
                        "&#160 else if(result == 4)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is not a happy number\"</font>, num);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "82 is Happy Number<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>    \n" +
                        "     \n" +
                        "//isHappyNumber() will determine whether a number is happy or not    \n" +
                        "int isHappyNumber(int num){    \n" +
                        "    int rem = 0, sum = 0;    \n" +
                        "        \n" +
                        "    //Calculates the sum of squares of digits    \n" +
                        "    while(num > 0){    \n" +
                        "        rem = num%10;    \n" +
                        "        sum = sum + (rem*rem);    \n" +
                        "        num = num/10;    \n" +
                        "    }    \n" +
                        "    return sum;    \n" +
                        "}    \n" +
                        "\n" +
                        "int main()    \n" +
                        "{    \n" +
                        "    int num = 82;    \n" +
                        "    int result = num;    \n" +
                        "        \n" +
                        "    while(result != 1 && result != 4){    \n" +
                        "        result = isHappyNumber(result);    \n" +
                        "    }    \n" +
                        "        \n" +
                        "    //Happy number always ends with 1    \n" +
                        "    if(result == 1)    \n" +
                        "        printf(\"%d is a happy number\", num);    \n" +
                        "    //Unhappy number ends in a cycle of repeating numbers which contains 4    \n" +
                        "    else if(result == 4)    \n" +
                        "        printf(\"%d is not a happy number\", num);     \n" +
                        "     \n" +
                        "    return 0;    \n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "82 is Happy Number\n" +
                        "*/";
                setText();
                break;

            case 20:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt stdbool.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a number \\n\"</font>);<br/>" +
                        "&#160 int num, mulBy2, mulBy3, digit, concatNum = 0, i;<br/>" +
                        "&#160 <br/>" +
                        "&#160 scanf(\"%d\",& num);<br/>" +
                        " <br/>" +
                        "&#160 int count[10] = {0};   <font color=#3E3E3E>//Array to store count of each digit</font><br/>" +
                        "&#160 bool flag = true;<br/>" +
                        " <br/>" +
                        "&#160 mulBy2 = num*2;<br/>" +
                        "&#160 mulBy3 = num*3;<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//concatenate original number</font><br/>" +
                        "&#160 concatNum += num;<br/>" +
                        "&#160 <font color=#3E3E3E>//concatenate multiple of 2</font><br/>" +
                        "&#160 concatNum = concatNum*pow(10,countDigits(mulBy2)) + mulBy2;<br/>" +
                        "&#160 <font color=#3E3E3E>//concatenate multiple of 3</font><br/>" +
                        "&#160 concatNum = concatNum*pow(10,countDigits(mulBy3)) + mulBy3;<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//Looping through the digit of cancatenated number</font><br/>" +
                        "&#160 <font color=#3E3E3E>//To store count of each digit</font><br/>" +
                        "&#160 while(concatNum &#62 0){<br/>" +
                        "&#160 &#160 digit = concatNum%10;<br/>" +
                        "&#160 &#160 if(++count[digit] > 1){<br/>" +
                        "&#160 &#160 &#160 <font color=#3E3E3E>//If any digit appears more than once in the concatenated number then it is not a Fascinating number</font><br/>" +
                        "&#160 &#160 &#160 flag = false;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 concatNum = concatNum/10;<br/>" +
                        "&#160 }<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//Check if any digit (1-9) is absent in the concatenated number</font><br/>" +
                        "&#160 for(i=1; i &#60 10; i++){<br/>" +
                        "&#160 &#160 if(count[i] == 0){<br/>" +
                        "&#160 &#160 &#160 flag = false;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        " <br/>" +
                        "&#160 if(flag)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Fascinating Number\"</font>);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Non Fascinating Number\"</font>);<br/>" +
                        " <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        " <br/>" +
                        "<font color=#3E3E3E>//Function to return number of digits in 'n'</font><br/>" +
                        "int countDigits(int n){<br/>" +
                        " <br/>" +
                        "&#160 int count =0;<br/>" +
                        "&#160 while(n &#62 0){<br/>" +
                        "&#160 &#160 count++;<br/>" +
                        "&#160 &#160 n = n/10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return count;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output 1 :<br/>" +
                        "Enter a number<br/>" +
                        "192<br/>" +
                        "Fascinating Number<br/><br/>" +
                        "Output 2 :<br/>" +
                        "Enter a number<br/>" +
                        "101<br/>" +
                        "Non Fascinating Number<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "#include <stdbool.h>\n" +
                        " \n" +
                        "int main() {\n" +
                        "  printf(\"Enter a number \\n\");\n" +
                        "  int num, mulBy2, mulBy3, digit, concatNum = 0, i;\n" +
                        "  \n" +
                        "  scanf(\"%d\",&num);\n" +
                        " \n" +
                        "  int count[10] = {0};   //Array to store count of each digit\n" +
                        "  bool flag = true;      \n" +
                        " \n" +
                        "  mulBy2 = num*2;\n" +
                        "  mulBy3 = num*3;\n" +
                        " \n" +
                        "  //concatenate original number\n" +
                        "  concatNum += num;\n" +
                        "  //concatenate multiple of 2\n" +
                        "  concatNum = concatNum*pow(10,countDigits(mulBy2)) + mulBy2;\n" +
                        "  //concatenate multiple of 3\n" +
                        "  concatNum = concatNum*pow(10,countDigits(mulBy3)) + mulBy3;\n" +
                        " \n" +
                        "  //Looping through the digit of cancatenated number\n" +
                        "  //To store count of each digit\n" +
                        "  while(concatNum>0){\n" +
                        "    digit = concatNum%10;\n" +
                        "    if(++count[digit] > 1){\n" +
                        "      //If any digit appears more than once in the concatenated number then it is not a Fascinating number\n" +
                        "      flag = false;\n" +
                        "      break;\n" +
                        "    }\n" +
                        "    concatNum = concatNum/10;\n" +
                        "  }\n" +
                        " \n" +
                        "  //Check if any digit (1-9) is absent in the concatenated number\n" +
                        "  for(i=1; i<10; i++){\n" +
                        "    if(count[i] == 0){\n" +
                        "      flag = false;\n" +
                        "      break;\n" +
                        "    }\n" +
                        "  }\n" +
                        " \n" +
                        "  if(flag)\n" +
                        "    printf(\"Fascinating Number\");\n" +
                        "  else\n" +
                        "    printf(\"Non Fascinating Number\");\n" +
                        " \n" +
                        "  return 0;\n" +
                        "}\n" +
                        " \n" +
                        "//Function to return number of digits in 'n'\n" +
                        "int countDigits(int n){\n" +
                        " \n" +
                        "  int count =0;\n" +
                        "  while(n>0){\n" +
                        "    count++;\n" +
                        "    n = n/10;\n" +
                        "  }\n" +
                        "  return count;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output 1 :\n" +
                        "Enter a number\n" +
                        "192\n" +
                        "Fascinating Number\n\n" +
                        "Output 2 :\n" +
                        "Enter a number\n" +
                        "101\n" +
                        "Non Fascinating Number\n" +
                        "*/";
                setText();
                break;

            case 21:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt stdbool.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> countDigits</font>(int n){<br/>" +
                        "&#160 int count =0;<br/>" +
                        "&#160 while(n>0){<br/>" +
                        "&#160 &#160 count++;<br/>" +
                        "&#160 &#160 n = n/10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return count;<br/>" +
                        "}<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num;<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//1. Input a numberint num;</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a number \\n\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&num);<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//2. Calculate its multiple of 2 and 3 </font><br/>" +
                        "&#160 int mulOf2 = num*2;<br/>" +
                        "&#160 int mulOf3 = num*3;<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//3. Concatenate num, mulOf2 and mulOf3</font><br/>" +
                        "&#160 int concatNum = 0;<br/>" +
                        "&#160 concatNum += num;<br/>" +
                        "&#160 concatNum = concatNum*pow(10, countDigits(mulOf2)) + mulOf2;<br/>" +
                        "&#160 concatNum = concatNum*pow(10, countDigits(mulOf3)) + mulOf3;<br/>" +
                        "    <br/>" +
                        "&#160 <font color=#3E3E3E>//4. Count the occurence of each digits.</font><br/>" +
                        "&#160 int count[10] = {0}; <br/>" +
                        "&#160 while(concatNum>0){<br/>" +
                        "&#160 &#160 count[concatNum%10]++;<br/>" +
                        "&#160 &#160 concatNum = concatNum/10;<br/>" +
                        "&#160 }<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//5 Check if any digit count is different than 1</font><br/>" +
                        "&#160 bool isFasctinating = true;<br/>" +
                        "&#160 for(int i=1; i &#60 10; i++){<br/>" +
                        "&#160 &#160 if(count[i] != 1){<br/>" +
                        "&#160 &#160 &#160 isFasctinating = false;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//Print the result</font><br/>" +
                        "&#160 if(isFasctinating)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Fascinating Number\"</font>);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Non Fascinating Number\"</font>);<br/>" +
                        " <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/><br/>" +
                        "Enter a number<br/>" +
                        "192<br/>" +
                        "Fascinating Number<br/><br/>" +
                        "*/</font><br/>";

                program = "#include <stdio.h>\n" +
                        "#include <stdbool.h>\n" +
                        "#include <math.h>\n" +
                        " \n" +
                        "int countDigits(int n){\n" +
                        "  int count =0;\n" +
                        "  while(n>0){\n" +
                        "    count++;\n" +
                        "    n = n/10;\n" +
                        "  }\n" +
                        "  return count;\n" +
                        "}\n" +
                        " \n" +
                        "int main(void) {\n" +
                        "  int num;\n" +
                        " \n" +
                        "  //1. Input a numberint num;\n" +
                        "  printf(\"Enter a number \\n\");\n" +
                        "  scanf(\"%d\",&num);\n" +
                        " \n" +
                        "  //2. Calculate its multiple of 2 and 3 \n" +
                        "  int mulOf2 = num*2;\n" +
                        "  int mulOf3 = num*3;\n" +
                        " \n" +
                        "  //3. Concatenate num, mulOf2 and mulOf3\n" +
                        "  int concatNum = 0;\n" +
                        "  concatNum += num;\n" +
                        "  concatNum = concatNum*pow(10, countDigits(mulOf2)) + mulOf2;\n" +
                        "  concatNum = concatNum*pow(10, countDigits(mulOf3)) + mulOf3;\n" +
                        "    \n" +
                        "  //4. Count the occurence of each digits.\n" +
                        "  int count[10] = {0}; \n" +
                        "  while(concatNum>0){\n" +
                        "    count[concatNum%10]++;\n" +
                        "    concatNum = concatNum/10;\n" +
                        "  }\n" +
                        " \n" +
                        "  //5 Check if any digit count is different than 1\n" +
                        "  bool isFasctinating = true;\n" +
                        "  for(int i=1; i<10; i++){\n" +
                        "    if(count[i] != 1){\n" +
                        "      isFasctinating = false;\n" +
                        "      break;\n" +
                        "    }\n" +
                        "  }\n" +
                        " \n" +
                        "  //Print the result\n" +
                        "  if(isFasctinating)\n" +
                        "    printf(\"Fascinating Number\");\n" +
                        "  else\n" +
                        "    printf(\"Non Fascinating Number\");\n" +
                        " \n" +
                        "  return 0;\n" +
                        "}\n\n" +
                        "/*\n\n" +
                        "Output :\n\n" +
                        "Enter a number\n" +
                        "192\n" +
                        "Fascinating Number\n\n" +
                        "*/";
                setText();
                break;

            case 22:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#3E3E3E>//calculateLength() will count the digits present in a number</font><br/><br/>" +
                        "<font color=#EC1A70>int</font> <font color=#36D574>calculateLength</font>(int n){<br/>" +
                        "&#160 int length = 0;<br/>" +
                        "&#160 while(n != 0){<br/>" +
                        "&#160 &#160 length = length + 1;<br/>" +
                        "&#160 &#160 n = n/10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return length;<br/>" +
                        "}<br/>" +
                        "     <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num = 175, sum = 0, rem = 0, n;<br/>" +
                        "&#160 int len = calculateLength(num);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>//Makes a copy of the original number num</font><br/>" +
                        "&#160 n = num;<br/>" +
                        "        <br/>" +
                        "&#160 <font color=#3E3E3E>//Calculates the sum of digits powered with their respective position</font><br/>" +
                        "&#160 while(num &#62 0){<br/>" +
                        "&#160 &#160 rem = num%10;<br/>" +
                        "&#160 &#160 sum = sum + (int)pow(rem,len);<br/>" +
                        "&#160 &#160 num = num/10;<br/>" +
                        "&#160 &#160 len--;<br/>" +
                        "&#160 }<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>//Checks whether the sum is equal to the number itself</font><br/>" +
                        "&#160 if(sum == n)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is a disarium number\"</font>, n);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is not a disarium number\"</font>, n);<br/>" +
                        "&#160 <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "175 is a disarium number<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>    \n" +
                        "//calculateLength() will count the digits present in a number    \n" +
                        "int calculateLength(int n){    \n" +
                        "    int length = 0;    \n" +
                        "    while(n != 0){    \n" +
                        "        length = length + 1;    \n" +
                        "        n = n/10;    \n" +
                        "    }    \n" +
                        "    return length;    \n" +
                        "}    \n" +
                        "     \n" +
                        "int main()    \n" +
                        "{    \n" +
                        "    int num = 175, sum = 0, rem = 0, n;    \n" +
                        "    int len = calculateLength(num);    \n" +
                        "        \n" +
                        "    //Makes a copy of the original number num    \n" +
                        "    n = num;    \n" +
                        "        \n" +
                        "    //Calculates the sum of digits powered with their respective position    \n" +
                        "    while(num > 0){    \n" +
                        "        rem = num%10;    \n" +
                        "        sum = sum + (int)pow(rem,len);    \n" +
                        "        num = num/10;    \n" +
                        "        len--;    \n" +
                        "    }    \n" +
                        "        \n" +
                        "    //Checks whether the sum is equal to the number itself    \n" +
                        "    if(sum == n)    \n" +
                        "        printf(\"%d is a disarium number\", n);    \n" +
                        "    else    \n" +
                        "        printf(\"%d is not a disarium number\", n);    \n" +
                        "     \n" +
                        "    return 0;    \n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "175 is a disarium number\n" +
                        "*/";
                setText();
                break;

            case 23:
                program_start =
                        "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the number:\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&num);<br/>" +
                        "&#160 int flag=0,i;<br/>" +
                        "&#160 for(i=0;i &#60= num;i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(i*(i+1)==num)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 flag=1;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 if(flag==1)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"It is a Pronic Number.\"</font>);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"It is not a Pronic Number.\"</font>);<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter the number:90<br/>" +
                        "It is a Pronic Number.<br/>" +
                        "*/</font>";

                program = "//Pronic Number Or Not\n" +
                        "#include<stdio.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int num;\n" +
                        "    printf(\"Enter the number:\");\n" +
                        "    scanf(\"%d\",&num);\n" +
                        "   int flag=0,i;\n" +
                        "   for(i=0;i<=num;i++)\n" +
                        "   {\n" +
                        "       if(i*(i+1)==num)\n" +
                        "       {\n" +
                        "           flag=1;\n" +
                        "           break;\n" +
                        "       }\n" +
                        "   }\n" +
                        "\n" +
                        "   if(flag==1)\n" +
                        "    printf(\"It is a Pronic Number.\");\n" +
                        "   else\n" +
                        "    printf(\"It is not a Pronic Number.\");\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter the number:90\n" +
                        "It is a Pronic Number.\n" +
                        "*/";
                setText();
                break;

            case 24 :
                program_start = "<font color=#3E3E3E>//Trimorphic Number Or Not</font><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num,cube_power,flag=0;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the number:\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&num);<br/>" +
                        "&#160 cube_power=num*num*num;<br/>" +
                        "&#160 while(num!=0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(num%10!=cube_power%10)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 flag=1;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 num/=10;<br/>" +
                        "&#160 &#160 cube_power/=10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 if(flag==0)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"It is a Trimorphic Number.\"</font>);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"It is not a Trimorphic Number.\"</font>);<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter the number:5<br/>" +
                        "It is a Trimorphic Number." +
                        "*/</font>";

                program = "//Trimorphic Number Or Not\n" +
                        "#include<stdio.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int num,cube_power,flag=0;\n" +
                        "    printf(\"Enter the number:\");\n" +
                        "    scanf(\"%d\",&num);\n" +
                        "    cube_power=num*num*num;\n" +
                        "   while(num!=0)\n" +
                        "   {\n" +
                        "       if(num%10!=cube_power%10)\n" +
                        "       {\n" +
                        "           flag=1;\n" +
                        "           break;\n" +
                        "       }\n" +
                        "       num/=10;\n" +
                        "       cube_power/=10;\n" +
                        "   }\n" +
                        "   if(flag==0)\n" +
                        "    printf(\"It is a Trimorphic Number.\");\n" +
                        "   else\n" +
                        "    printf(\"It is not a Trimorphic Number.\");\n" +
                        "}\n\n" +
                        "Output :\n" +
                        "Enter the number:5\n" +
                        "It is a Trimorphic Number.";
                setText();
                break;

            case 25:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int rangenumber,num = 1,c = 0,latest = 0;<br/>" +
                        "&#160 printf (<font color=#EC1A70>\"Enter the Nth value:\"</font>);<br/>" +
                        "&#160 scanf (\"%d\", &rangenumber);<br/>" +
                        "&#160 while (c != rangenumber)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 int num1=num;<br/>" +
                        "&#160 &#160 int one_c=0;<br/>" +
                        "&#160 &#160 while(num1!=0)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 if(num1%2==1)<br/>" +
                        "&#160 &#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 &#160 one_c++;<br/>" +
                        "&#160 &#160 &#160 }<br/>" +
                        "&#160 &#160 &#160 num1/=2;<br/>" +
                        "<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 if(one_c%2==0)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 c++;<br/>" +
                        "&#160 &#160 &#160 latest=num;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 num = num + 1;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 printf (<font color=#EC1A70>\"%dth Evil number is %d\"</font>, rangenumber, latest);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter the Nth value:5<br/>" +
                        "5th Evil number is 10<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int main ()\n" +
                        "{\n" +
                        "  int rangenumber, num = 1, c = 0, latest = 0;\n" +
                        "  printf (\"Enter the Nth value:\");\n" +
                        "  scanf (\"%d\", &rangenumber);\n" +
                        "  while (c != rangenumber)\n" +
                        "  {\n" +
                        "    int num1=num;\n" +
                        "    int one_c=0;\n" +
                        "    while(num1!=0)\n" +
                        "    {\n" +
                        "       if(num1%2==1)\n" +
                        "       {\n" +
                        "           one_c++;\n" +
                        "       }\n" +
                        "           num1/=2;\n" +
                        "\n" +
                        "   }\n" +
                        "   if(one_c%2==0)\n" +
                        "   {\n" +
                        "          c++;\n" +
                        "          latest=num;\n" +
                        "    }\n" +
                        "      num = num + 1;\n" +
                        "    }\n" +
                        "  printf (\"%dth Evil number is %d\", rangenumber, latest);\n" +
                        "  return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter the Nth value:5\n" +
                        "5th Evil number is 10\n" +
                        "*/";
                setText();
                break;

            case 26:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int i, n, fakt = 1;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a number:\\n\"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &n);<br/>" +
                        "&#160 for (i=1;i &#60= n;i++) <font color=#3E3E3E>//use braces to write more than one statement inside the loop</font><br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 fakt=fakt*i;<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Factorial of %d is %d\\n\"</font>, i, fakt);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 getch();<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter a number:<br/>" +
                        "5<br/>" +
                        "Factorial of 1 is 1<br/>" +
                        "Factorial of 2 is 2<br/>" +
                        "Factorial of 3 is 6<br/>" +
                        "Factorial of 4 is 24<br/>" +
                        "Factorial of 5 is 120<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int i, n, fakt = 1;\n" +
                        "    printf(\"Enter a number:\\n\");\n" +
                        "    scanf(\"%d\", &n);\n" +
                        "    for (i=1;i<= n;i++) //use braces to write more than one statement inside the loop\n" +
                        "    {\n" +
                        "         fakt=fakt*i;\n" +
                        "         printf(\"Factorial of %d is %d\\n\", i, fakt);\n" +
                        "    }\n" +
                        "    getch();\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter a number:\n" +
                        "5\n" +
                        "Factorial of 1 is 1\n" +
                        "Factorial of 2 is 2\n" +
                        "Factorial of 3 is 6\n" +
                        "Factorial of 4 is 24\n" +
                        "Factorial of 5 is 120\n" +
                        "*/";
                setText();
                break;

            case 27:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "<br/>" +
                        "&#160 int num,i,count,n;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter max range: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "<br/>" +
                        "&#160 for(num = 1;num &#60= n;num++){<br/>" +
                        "<br/>" +
                        "&#160 &#160 count = 0;<br/>" +
                        "<br/>" +
                        "&#160 &#160 for(i=2;i &#60= num/2;i++){<br/>" +
                        "&#160 &#160 &#160 if(num%i==0){<br/>" +
                        "&#160 &#160 &#160 &#160 count++;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 }<br/>" +
                        "&#160 &#160 }<br/>" +
                        "<br/>" +
                        "&#160 &#160 if(count==0 && num!= 1)<br/>" +
                        "&#160 &#160 &#160 printf(\"%d \",num);<br/>" +
                        "&#160 }<br/>" +
                        "  <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter max range: 50<br/>" +
                        "2 3 5 7 11 13<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "\n" +
                        "int main(){\n" +
                        "\n" +
                        "    int num,i,count,n;\n" +
                        "    printf(\"Enter max range: \");\n" +
                        "    scanf(\"%d\",&n);\n" +
                        "\n" +
                        "    for(num = 1;num<=n;num++){\n" +
                        "\n" +
                        "         count = 0;\n" +
                        "\n" +
                        "         for(i=2;i<=num/2;i++){\n" +
                        "             if(num%i==0){\n" +
                        "                 count++;\n" +
                        "                 break;\n" +
                        "             }\n" +
                        "        }\n" +
                        "        \n" +
                        "         if(count==0 && num!= 1)\n" +
                        "             printf(\"%d \",num);\n" +
                        "    }\n" +
                        "  \n" +
                        "   return 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter max range: 50\n" +
                        "2 3 5 7 11 13\n" +
                        "*/";
                setText();
                break;

            case 28 :
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int range,j,i;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a number:\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",& range);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Automorphic numbers between 1 and %d are: \"</font>,range);<br/>" +
                        "&#160 for( i=1;i &#60= range;i++)<br/>" +
                        "&#160 {" +
                        "&#160 &#160 int num=i;<br/>" +
                        "&#160 &#160 int sqr=num*num;<br/>" +
                        "&#160 &#160 int flag=0;<br/>" +
                        "&#160 &#160 while(num &#62 0)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 if(num%10 != sqr%10)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 flag=-1;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 num=num/10;<br/>" +
                        "&#160 &#160 sqr=sqr/10;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 if(flag==0)<br/>" +
                        "&#160 &#160 &#160 printf(\"%d \",i);<br/>" +
                        "&#160 }<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter a number:<br/>" +
                        "100<br/>" +
                        "Automorphic numbers between 1 and 100 are: 5 6 25 76<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "      int range,j,i;\n" +
                        "    printf(\"Enter a number:\");\n" +
                        "    scanf(\"%d\",&range);\n" +
                        "    printf(\"Automorphic numbers between 1 and %d are: \",range2);\n" +
                        "    for( i=1;i<=range;i++)\n" +
                        "    {   int num=i;\n" +
                        "        int sqr=num*num;\n" +
                        "        int flag=0;\n" +
                        "    while(num>0)\n" +
                        "    {\n" +
                        "       if(num%10 != sqr%10)\n" +
                        "         {flag=-1;\n" +
                        "           break;\n" +
                        "         }\n" +
                        "       num=num/10;\n" +
                        "       sqr=sqr/10;\n" +
                        "   }\n" +
                        "   if(flag==0)\n" +
                        "    printf(\"%d \",i);\n" +
                        "}\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter a number:\n" +
                        "100\n" +
                        "Automorphic numbers between 1 and 100 are: 5 6 25 76\n" +
                        "*/";
                setText();
                break;

            case 29:
                program_start = "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "A Spy Number is a number where the sum of its digit equals to the product of its digit.<br/>" +
                        "<br/>" +
                        "For Example :<br/>" +
                        "<br/>" +
                        "1124 is a Spy Number, because the sum of its digit is 1+1+2+4=8 and the product of its digit 1*1*2*4=8 is equal.<br/>" +
                        "<br/>" +
                        "In this program we will print the list of all spy number within a range given by user.<br/>" +
                        "<br/>" +
                        "*/</font><br/>" +
                        "<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int up; <font color=#3E3E3E>//upper limit<br/></font>" +
                        "&#160 int lw; <font color=#3E3E3E>//lower limit</font><br/>" +
                        "&#160 int n; <font color=#3E3E3E>//current no</font><br/>" +
                        "&#160 int i; <font color=#3E3E3E>//loop control var</font><br/>" +
                        "&#160 int sum=0,prod=1;<br/>" +
                        "&#160 int d; <font color=#3E3E3E>//lase digit</font><br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the Starting Number (lower limit) :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&lw);<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nEnter the Starting Number (upper limit) :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&up);<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nList of Spy Numbers between %d - %d :\\n\"</font>,lw,up);<br/>" +
                        "&#160 <br/>" +
                        "&#160 for(i=lw; i &#60= up; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 sum=0;<br/>" +
                        "&#160 &#160 prod=1;<br/>" +
                        "&#160 &#160 n=1;<br/><br/>" +
                        "&#160 &#160 while( n > 0)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 d=n%10;<br/>" +
                        "&#160 &#160 &#160 sum=sum+d;<br/>" +
                        "&#160 &#160 &#160 prod=prod*d;<br/>" +
                        "&#160 &#160 &#160 n=n/10;<br/>" +
                        "&#160 &#160 }<br/><br/>" +
                        "&#160 &#160 if( sum==prod )<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\\n\"</font>,i);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the Starting Number (lower limit) :10<br/>" +
                        "Enter the Starting Number (upper limit) :300<br/>" +
                        "<br/>" +
                        "List of Spy Numbers between 10 - 300 :<br/>" +
                        "22<br/>" +
                        "123<br/>" +
                        "132<br/>" +
                        "213<br/>" +
                        "231<br/>" +
                        "<br/>" +
                        "*/</font><br/>";

                program = "/*\n" +
                        "\n" +
                        "A Spy Number is a number where the sum of its digit equals to the product of its digit.\n" +
                        "\n" +
                        "For Example :\n" +
                        "\n" +
                        "1124 is a Spy Number, because the sum of its digit is 1+1+2+4=8 and the product of its digit 1*1*2*4=8 is equal.\n" +
                        "\n" +
                        "In this program we will print the list of all spy number within a range given by user.\n" +
                        "\n" +
                        "*/\n" +
                        "\n" +
                        "#include<stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tint up; //upper limit\n" +
                        "\tint lw; //lower limit\n" +
                        "\tint n; //current no\n" +
                        "\tint i; //loop control var\n" +
                        "\tint sum=0,prod=1;\n" +
                        "\tint d; //lase digit\n" +
                        "\t\n" +
                        "\tprintf(\"Enter the Starting Number (lower limit) :\");\n" +
                        "\tscanf(\"%d\",&lw);\n" +
                        "\t\n" +
                        "\tprintf(\"\\nEnter the Starting Number (upper limit) :\");\n" +
                        "\tscanf(\"%d\",&up);\n" +
                        "\t\n" +
                        "\tprintf(\"\\nList of Spy Numbers between %d - %d :\\n\",lw,up);\n" +
                        "\t\n" +
                        "\tfor(i=lw; i <= up; i++)\n" +
                        "\t{\n" +
                        "\t\tsum=0;\n" +
                        "\t\tprod=1;\n" +
                        "\t\tn=1;\n" +
                        "\t\t\n" +
                        "\t\twhile( n > 0)\n" +
                        "\t\t{\n" +
                        "\t\t\td=n%10;\n" +
                        "\t\t\tsum=sum+d;\n" +
                        "\t\t\tprod=prod*d;\n" +
                        "\t\t\tn=n/10;\n" +
                        "\t\t}\n" +
                        "\t\t\n" +
                        "\t\tif( sum==prod )\n" +
                        "\t\t\tprintf(\"%d\\n\",i);\n" +
                        "\t}\n" +
                        "\t\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the Starting Number (lower limit) :10\n" +
                        "Enter the Starting Number (upper limit) :300\n" +
                        "\n" +
                        "List of Spy Numbers between 10 - 300 :\n" +
                        "22\n" +
                        "123\n" +
                        "132\n" +
                        "213\n" +
                        "231\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 30:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "   <br/>" +
                        "<font color=#3E3E3E>//isHappyNumber() will determine whether a number is happy or not</font><br/>" +
                        "int isHappyNumber(int num){  <br/>" +
                        "&#160 int rem = 0, sum = 0;  <br/>" +
                        "      <br/>" +
                        "&#160 <font color=#3E3E3E>//Calculates the sum of squares of digits</font><br/>" +
                        "&#160 while(num &#62 0){  <br/>" +
                        "&#160 &#160 rem = num%10;  <br/>" +
                        "&#160 &#160 sum = sum + (rem*rem);  <br/>" +
                        "&#160 &#160 num = num/10;  <br/>" +
                        "&#160 }  <br/>" +
                        "&#160 return sum;  <br/>" +
                        "}  <br/>" +
                        "      <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{  <br/>" +
                        "&#160 int range;<br/>" +
                        "&#160 <font color=#3E3E3E>//Displays all happy numbers between 1 and 100  </font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a limit : \\n\"</font>);  <br/>" +
                        "&#160 scanf(\"%d\",& range);<br/>" +
                        "&#160 for(int i = 1; i &#60= range; i++){  <br/>" +
                        "&#160 &#160 int result = i;  <br/>" +
                        "          <br/>" +
                        "&#160 &#160 <font color=#3E3E3E>//Happy number always ends with 1 and<br/>" +
                        "&#160 &#160 //unhappy number ends in a cycle of repeating numbers which contains 4</font><br/>" +
                        "&#160 &#160 while(result != 1 && result != 4){  <br/>" +
                        "&#160 &#160 &#160 result = isHappyNumber(result);  <br/>" +
                        "&#160 &#160 }  <br/>" +
                        "<br/>" +
                        "&#160 &#160 if(result == 1)<br/>" +
                        "&#160 &#160 &#160 printf(\"%d \", i);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter a limit : 100<br/>" +
                        "1 7 10 13 19 23 28 31 32 44 49 68 70 79 82 86 91 94 97 100 <br/>" +
                        "*/";

                program = "#include <stdio.h>  \n" +
                        "   \n" +
                        "//isHappyNumber() will determine whether a number is happy or not  \n" +
                        "int isHappyNumber(int num){  \n" +
                        "    int rem = 0, sum = 0;  \n" +
                        "      \n" +
                        "    //Calculates the sum of squares of digits  \n" +
                        "    while(num > 0){  \n" +
                        "        rem = num%10;  \n" +
                        "        sum = sum + (rem*rem);  \n" +
                        "        num = num/10;  \n" +
                        "    }  \n" +
                        "    return sum;  \n" +
                        "}  \n" +
                        "      \n" +
                        "int main()  \n" +
                        "{  \n" +
                        "   int range;\n" +
                        "    //Displays all happy numbers between 1 and 100  \n" +
                        "    printf(\"Enter a limit : \\n\");  \n" +
                        "    scanf(\"%d\",&range);\n" +
                        "    for(int i = 1; i <= range; i++){  \n" +
                        "        int result = i;  \n" +
                        "          \n" +
                        "        //Happy number always ends with 1 and   \n" +
                        "        //unhappy number ends in a cycle of repeating numbers which contains 4  \n" +
                        "        while(result != 1 && result != 4){  \n" +
                        "            result = isHappyNumber(result);  \n" +
                        "        }  \n" +
                        "          \n" +
                        "        if(result == 1)  \n" +
                        "            printf(\"%d \", i);  \n" +
                        "    }  \n" +
                        "   \n" +
                        "    return 0;  \n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter a limit : 100\n" +
                        "1 7 10 13 19 23 28 31 32 44 49 68 70 79 82 86 91 94 97 100 \n" +
                        "*/";
                setText();
                break;

            case 31:
                program_start = "<font color=#3E3E3E>/*<br/>" +
                        "Sunny Number : A number is a Sunny Number, If 1 is added to that number and the square root of it becomes a whole number.<br/><br/>" +
                        "For example :<br/><br/>" +
                        "9 is Sunny Number<br/><br/>" +
                        "( 8 + 1 ) = 9 and sqrt(9) = 3, a whole number.<br/>" +
                        "*/</font><br/><br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int limit,i;<br/>" +
                        "&#160 double x; //sqrt(num + 1)<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a Number (upper limit) :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&limit);<br/><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Sunny Numbers between 1 to %d\"</font>,limit);<br/><br/>" +
                        "&#160 for(i=1; i &#60= limit; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 x = sqrt(i+1);<br/>" +
                        "&#160 &#160 if((int)x == x)<br/>" +
                        "&#160 &#160 &#160 printf(\"%d\n\",i);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "Enter a Number (upper limit) : 50<br/><br/>" +
                        "Sunny Numbers between 1 to 50<br/>" +
                        "3<br/>" +
                        "8<br/>" +
                        "15<br/>" +
                        "24<br/>" +
                        "35<br/>" +
                        "48<br/><br/>" +
                        "*/</font><br/>";

                program = "/*" +
                        "Sunny Number : A number is a Sunny Number, If 1 is added to that number and the square root of it becomes a whole number.\n\n" +
                        "For example :\n\n" +
                        "9 is Sunny Number\n\n" +
                        "( 8 + 1 ) = 9 and sqrt(9) = 3, a whole number.\n" +
                        "*/\n\n" +
                        "#include<stdio.h>\n" +
                        "#include<math.h>\n" +
                        "int main() {\n" +
                        "\tint limit,i;\n" +
                        "\tdouble x; //sqrt(num + 1)\n" +
                        "\tprintf(\"Enter a Number (upper limit) :\");\n" +
                        "\tscanf(\"%d\",&limit);\n\n" +
                        "\tprintf(\"Sunny Numbers between 1 to %d\",limit);\n\n" +
                        "\tfor(i=1; i <= limit; i++)\n" +
                        "\t{\n" +
                        "\t\tx = sqrt(i+1);\n" +
                        "\t\tif((int)x == x)\n" +
                        "\t\t\tprintf(\"%d\n\",i);\n" +
                        "\t}\n" +
                        "\treturn 0;\n" +
                        "}\n\n" +
                        "/*\n" +
                        "Output :\n" +
                        "Enter a Number (upper limit) : 50\n\n" +
                        "Sunny Numbers between 1 to 50\n" +
                        "3\n" +
                        "8\n" +
                        "15\n" +
                        "24\n" +
                        "35\n" +
                        "48\n\n" +
                        "*/\n";
                setText();
                break;

            case 32:
                program_start = "<font color=#3E3E3E>/*<br/>" +
                        "Fascinating Number : When a 3 digit number (n) is concatenated with the number multiplied by 2 (n*2) and the number multipled by 3 (n*3), and we get a number which contains all the digits from 1 to 9 exactly once, Such a 3 digit number is know as a fasciniting number.<br/>" +
                        "<br/>" +
                        "Note : There could be any number of zeroes, but they are ignored. But all the other digits from 1 to 9 must occured only once.<br/>" +
                        "<br/>" +
                        "For Example :<br/>" +
                        "<br/>" +
                        "273 is a Fascinating Number.<br/>" +
                        "<br/>" +
                        "273*1 = 273<br/>" +
                        "273*2 = 546<br/>" +
                        "273*3 = 819<br/>" +
                        "<br/>" +
                        "After, Concatenation all the numbers, we get the final number 273546819.<br/>" +
                        "273546819 , in this number all the digits from 1 to 9 comes exactly once.<br/>" +
                        "*/</font><br/>" +
                        "<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> isFascinating</font>(int)<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int i;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Generating all 3 digit Fascinating Numbers\\n\"</font>);<br/>" +
                        "&#160 for(i=100; i &#60= 999; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(isFascinating(i) == 1)<br/>" +
                        "&#160 &#160 &#160 printf(\"%d\\n\",i);<br/>" +
                        "&#160 }<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> isFascinating</font>(int n)<br/>" +
                        "{<br/>" +
                        "&#160 int n2,n3,i;<br/>" +
                        "&#160 int freq[11]={0}; <font color=#3E3E3E>// array to count freq. of digits</font><br/>" +
                        "&#160 n2 = n*2; <font color=#3E3E3E>// Calculate n*2</font><br/>" +
                        "&#160 n3 = n*3 <font color=#3E3E3E>// Calculate n*3</font><br/>" +
                        "&#160 <font color=#3E3E3E>/*<br/>" +
                        "&#160 increment the freq index acc to the digit.<br/>" +
                        "&#160 */</font><br/>" +
                        "&#160 <br/>" +
                        "&#160 while(n2 != 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 freq[n2%10]++;<br/>" +
                        "&#160 &#160 n2 = n2/10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <br/>" +
                        "&#160 while(n3 != 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 freq[n3%10]++;<br/>" +
                        "&#160 &#160 n3 = n3/10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <br/>" +
                        "&#160 <font color=#3E3E3E>/*<br/>" +
                        "&#160 If the number is Fascinating then the freq arr must have exactly 1 in all the indexes from 1 to 9<br/>" +
                        "&#160 */</font><br/>" +
                        "&#160 <br/>" +
                        "&#160 for(i=1; i <= 9; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(freq[i]!=1)<br/>" +
                        "&#160 &#160 &#160 return 0; <font color=#3E3E3E>// Not Fascinating No.</font><br/>" +
                        "&#160 &#160 else<br/>" +
                        "&#160 &#160 &#160 return 1; <font color=#3E3E3E>// Fascinating No.</font><br/>" +
                        "&#160 }<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Generating all 3 digit Fascinating Numbers<br/>" +
                        "192<br/>" +
                        "219<br/>" +
                        "273<br/>" +
                        "327<br/>" +
                        "<br/>" +
                        "*/";

                program = "/*\n" +
                        "Fascinating Number : When a 3 digit number (n) is concatenated with the number multiplied by 2 (n*2) and the number multipled by 3 (n*3), and we get a number which contains all the digits from 1 to 9 exactly once, Such a 3 digit number is know as a fasciniting number.\n" +
                        "\n" +
                        "Note : There could be any number of zeroes, but they are ignored. But all the other digits from 1 to 9 must occured only once.\n" +
                        "\n" +
                        "For Example :\n" +
                        "\n" +
                        "273 is a Fascinating Number.\n" +
                        "\n" +
                        "273*1 = 273\n" +
                        "273*2 = 546\n" +
                        "273*3 = 819\n" +
                        "\n" +
                        "After, Concatenation all the numbers, we get the final number 273546819.\n" +
                        "273546819 , in this number all the digits from 1 to 9 comes exactly once.\n" +
                        "*/\n" +
                        "\n" +
                        "#include<stdio.h>\n" +
                        "\n" +
                        "int isFascinating(int);\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tint i;\n" +
                        "\tprintf(\"Generating all 3 digit Fascinating Numbers\\n\");\n" +
                        "\tfor(i=100; i <= 999; i++)\n" +
                        "\t{\n" +
                        "\t\tif(isFascinating(i) == 1)\n" +
                        "\t\t\tprintf(\"%d\\n\",i);\n" +
                        "\t}\n" +
                        "}\n" +
                        "\n" +
                        "int isFascinating(int n)\n" +
                        "{\n" +
                        "\tint n2,n3,i;\n" +
                        "\tint freq[11]={0}; // array to count freq. of digits\n" +
                        "\tn2 = n*2; // Calculate n*2\n" +
                        "\tn3 = n*3 // Calculate n*3\n" +
                        "\t/*\n" +
                        "\tincrement the freq index acc to the digit.\n" +
                        "\t*/\n" +
                        "\t\n" +
                        "\twhile(n2 != 0)\n" +
                        "\t{\n" +
                        "\t\tfreq[n2%10]++;\n" +
                        "\t\tn2 = n2/10;\n" +
                        "\t}\n" +
                        "\t\n" +
                        "\twhile(n3 != 0)\n" +
                        "\t{\n" +
                        "\t\tfreq[n3%10]++;\n" +
                        "\t\tn3 = n3/10;\n" +
                        "\t}\n" +
                        "\t\n" +
                        "\t/*\n" +
                        "\tIf the number is Fascinating then the freq arr must have exactly 1 in all the indexes from 1 to 9\n" +
                        "\t*/\n" +
                        "\t\n" +
                        "\tfor(i=1; i <= 9; i++)\n" +
                        "\t{\n" +
                        "\t\tif(freq[i]!=1)\n" +
                        "\t\t\treturn 0; // Not Fascinating No.\n" +
                        "\t\telse\n" +
                        "\t\t\treturn 1; // Fascinating No.\n" +
                        "\t}\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Generating all 3 digit Fascinating Numbers\n" +
                        "192\n" +
                        "219\n" +
                        "273\n" +
                        "327\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 33:
                program_start = "<font color=#3E3E3E>/*<br/>" +
                        "Disarium Number : A Number is a Disarium Number if the sum of the digits powered with their respective positions is equal to the number itself.<br/>" +
                        "<br/>" +
                        "For Example :<br/>" +
                        "<br/>" +
                        "89 is a Disarium Number.<br/>" +
                        "89 :> 8^1 + 9^2 = 89<br/>" +
                        "<br/>" +
                        "45 is not a Disarium Number.<br/>" +
                        "45 :> 4^1 + 5^2 = 29<br/>" +
                        "*/</font><br/>" +
                        "<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<br/>" +
                        "int isDisarium(int);<br/>" +
                        "int digit_count(int);<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int i,limit,pd;<br/>" +
                        "&#160 int sum=0,digit_count=0;<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a number (upper limit) :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&limit);<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Disarium Numbers between 1 to %d \\n\"</font>,limit);<br/>" +
                        "&#160 <br/>" +
                        "&#160 for(i=1; i &#60= limit; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(isDisarium(i)==1)<br/>" +
                        "&#160 &#160 &#160 printf(\"%d\\n\",i);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "Check the number for Disarium Number.<br/>" +
                        "*/</font><br/>" +
                        "int isDisarium(int n)<br/>" +
                        "{<br/>" +
                        "&#160 int dc=digit_count(n);<br/>" +
                        "&#160 int pd; <font color=#3E3E3E>// digit for power calculation</font><br/>" +
                        "&#160 int sum=0;<br/>" +
                        "&#160 int t=n; <font color=#3E3E3E>// temp</font><br/>" +
                        "&#160 <br/>" +
                        "&#160 while(t!=0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 pd = t%10; <font color=#3E3E3E>// extract single digit (last)</font><br/>" +
                        "&#160 &#160 sum = sum + pow(pd,dc--);<br/>" +
                        "&#160 &#160 t=t/10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <font color=#3E3E3E>/*<br/>" +
                        "&#160 return 1 if the no. is Disarium else return 0<br/>" +
                        "&#160 */</font><br/>" +
                        "&#160 <br/>" +
                        "&#160 if(sum==n)<br/>" +
                        "&#160 &#160 return 1;<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "First, we count the digit of the number so that we can get the power for each digit.<br/>" +
                        "*/</font><br/>" +
                        "<br/>" +
                        "int digit_count(int n)<br/>" +
                        "{<br/>" +
                        "&#160 int count=0;<br/>" +
                        "&#160 <br/>" +
                        "&#160 while(n!=0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 n=n/10;<br/>" +
                        "&#160 &#160 count++;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <br/>" +
                        "&#160 return count;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter a number (upper limit) : 200<br/>" +
                        "<br/>" +
                        "Disarium Numbers between 1 to 200<br/>" +
                        "1<br/>" +
                        "2<br/>" +
                        "3<br/>" +
                        "4<br/>" +
                        "5<br/>" +
                        "6<br/>" +
                        "7<br/>" +
                        "8<br/>" +
                        "9<br/>" +
                        "89<br/>" +
                        "135<br/>" +
                        "175<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "/*\n" +
                        "Disarium Number : A Number is a Disarium Number if the sum of the digits powered with their respective positions is equal to the number itself.\n" +
                        "\n" +
                        "For Example :\n" +
                        "\n" +
                        "89 is a Disarium Number.\n" +
                        "89 :> 8^1 + 9^2 = 89\n" +
                        "\n" +
                        "45 is not a Disarium Number.\n" +
                        "45 :> 4^1 + 5^2 = 29\n" +
                        "*/\n" +
                        "\n" +
                        "#include<stdio.h>\n" +
                        "#include<math.h>\n" +
                        "\n" +
                        "int isDisarium(int);\n" +
                        "int digit_count(int);\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tint i,limit,pd;\n" +
                        "\tint sum=0,digit_count=0;\n" +
                        "\t\n" +
                        "\tprintf(\"Enter a number (upper limit) :\");\n" +
                        "\tscanf(\"%d\",&limit);\n" +
                        "\t\n" +
                        "\tprintf(\"Disarium Numbers between 1 to %d \\n\",limit);\n" +
                        "\t\n" +
                        "\tfor(i=1; i <= limit; i++)\n" +
                        "\t{\n" +
                        "\t\tif(isDisarium(i)==1)\n" +
                        "\t\t\tprintf(\"%d\\n\",i);\n" +
                        "\t}\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Check the number for Disarium Number.\n" +
                        "*/\n" +
                        "int isDisarium(int n)\n" +
                        "{\n" +
                        "\tint dc=digit_count(n);\n" +
                        "\tint pd; // digit for power calculation\n" +
                        "\tint sum=0;\n" +
                        "\tint t=n; // temp\n" +
                        "\t\n" +
                        "\twhile(t!=0)\n" +
                        "\t{\n" +
                        "\t\tpd = t%10; // extract single digit (last)\n" +
                        "\t\tsum = sum + pow(pd,dc--);\n" +
                        "\t\tt=t/10;\n" +
                        "\t}\n" +
                        "\t/*\n" +
                        "\treturn 1 if the no. is Disarium else return 0\n" +
                        "\t*/\n" +
                        "\t\n" +
                        "\tif(sum==n)\n" +
                        "\t\treturn 1;\n" +
                        "\telse\n" +
                        "\t\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "First, we count the digit of the number so that we can get the power for each digit.\n" +
                        "*/\n" +
                        "\n" +
                        "int digit_count(int n)\n" +
                        "{\n" +
                        "\tint count=0;\n" +
                        "\t\n" +
                        "\twhile(n!=0)\n" +
                        "\t{\n" +
                        "\t\tn=n/10;\n" +
                        "\t\tcount++;\n" +
                        "\t}\n" +
                        "\t\n" +
                        "\treturn count;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter a number (upper limit) : 200\n" +
                        "\n" +
                        "Disarium Numbers between 1 to 200\n" +
                        "1\n" +
                        "2\n" +
                        "3\n" +
                        "4\n" +
                        "5\n" +
                        "6\n" +
                        "7\n" +
                        "8\n" +
                        "9\n" +
                        "89\n" +
                        "135\n" +
                        "175\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 34:
                program_start = "<font color=#3E3E3E>/*<br/><br/>" +
                        "Pronic or Heteromecic Number : A Pronic Number is a number which is the product of two consecutive integers, that is, a number of the form n(n+10).<br/>" +
                        "<br/>" +
                        "For Example :<br/>" +
                        "<br/>" +
                        "6 is a Pronic Number as it is the product of two consecutive numbers 2 and 3. i.e. 6=2*3.<br/>" +
                        "<br/>" +
                        "*/</font><br/>" +
                        "<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "#include&lt stdbool.h&gt<br/>" +
                        "   <br/>" +
                        "<font color=#3E3E3E>//isPronicNumber() will determine whether a given number is pronic number or not</font><br/>" +
                        "bool isPronicNumber(int num){  <br/>" +
                        "&#160 bool flag = false;  <br/>" +
                        "      <br/>" +
                        "&#160 for(int j = 1; j &#60= num; j++){  <br/>" +
                        "&#160 <font color=#3E3E3E>//Checks for pronic number by multiplying consecutive numbers</font><br/>" +
                        "&#160 &#160 if((j*(j+1)) == num){  <br/>" +
                        "&#160 &#160 &#160 flag = true;  <br/>" +
                        "&#160 &#160 &#160 break;  <br/>" +
                        "&#160 &#160 }  <br/>" +
                        "&#160 }  <br/>" +
                        "&#160 return flag;  <br/>" +
                        "}  <br/>" +
                        "   <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{  <br/>" +
                        "&#160 int limit;<br/>" +
                        "&#160 <font color=#3E3E3E>//Displays pronic numbers between 1 and 100</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a Number (upper limit): \\n\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&limit);<br/>" +
                        "&#160 <br/>" +
                        "&#160 for(int i = 1; i &#60= limit; i++){  <br/>" +
                        "&#160 if(isPronicNumber(i))  <br/>" +
                        "&#160 &#160 printf(\"%d \", i);<br/>" +
                        "&#160 }  <br/>" +
                        "   <br/>" +
                        "&#160 return 0;  <br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter a number (upper limit) : 100<br/>" +
                        "2 6 12 20 30 42 56 72 90<br/>" +
                        "*/</font></br>";

                program = "/*\n" +
                        "Pronic or Heteromecic Number : A Pronic Number is a number which is the product of two consecutive integers, that is, a number of the form n(n+10).\n" +
                        "\n" +
                        "For Example :\n" +
                        "\n" +
                        "6 is a Pronic Number as it is the product of two consecutive numbers 2 and 3. i.e. 6=2*3.\n" +
                        "\n" +
                        "*/\n" +
                        "\n" +
                        "#include<stdio.h>  \n" +
                        "#include<stdbool.h>  \n" +
                        "   \n" +
                        "//isPronicNumber() will determine whether a given number is pronic number or not  \n" +
                        "bool isPronicNumber(int num){  \n" +
                        "    bool flag = false;  \n" +
                        "      \n" +
                        "    for(int j = 1; j <= num; j++){  \n" +
                        "        //Checks for pronic number by multiplying consecutive numbers  \n" +
                        "        if((j*(j+1)) == num){  \n" +
                        "            flag = true;  \n" +
                        "            break;  \n" +
                        "        }  \n" +
                        "    }  \n" +
                        "    return flag;  \n" +
                        "}  \n" +
                        "   \n" +
                        "int main()  \n" +
                        "{  \n" +
                        "\tint limit;\n" +
                        "    //Displays pronic numbers between 1 and 100  \n" +
                        "    printf(\"Enter a Number (upper limit): \\n\");\n" +
                        "\tscanf(\"%d\",&limit);\n" +
                        "\t\n" +
                        "    for(int i = 1; i <= limit; i++){  \n" +
                        "        if(isPronicNumber(i))  \n" +
                        "            printf(\"%d \", i);  \n" +
                        "    }  \n" +
                        "   \n" +
                        "    return 0;  \n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter a number (upper limit) : 100\n" +
                        "2 6 12 20 30 42 56 72 90\n" +
                        "*/";
                setText();
                break;

            case 35:
                program_start = "<font color=#3E3E3E>/*<br/><br/>" +
                        "Trimorphic Number : A Number is a Trimorphic number if the cube of the number ends in the number itself.<br/>" +
                        "<br/>" +
                        "For Example :<br/>" +
                        "<br/>" +
                        "25 is Trimorphic Number as its cube 15625 contains 25 at its end.<br/>" +
                        "<br/>" +
                        "*/</font><br/>" +
                        "<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "int isTrimorphic(int);<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int limit,i;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the number (upper limit):\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&limit);<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Trimorphic Numbers from 1 to %d \\n\"</font>,limit);<br/>" +
                        "&#160 for(i=1; i &#60= limit; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(isTrimorphic(i)==0)<br/>" +
                        "&#160 &#160 &#160 printf(\"%d \\n\",i);<br/>" +
                        "&#160 }<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "int isTrimorphic(int num)<br/>" +
                        "{<br/>" +
                        "&#160 int flag=0;<br/>" +
                        "&#160 int cube_power=num*num*num;<br/>" +
                        "&#160 while(num!=0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(num%10!=cube_power%10)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 flag=1;<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 num/=10;<br/>" +
                        "&#160 &#160 cube_power/=10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return flag;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter a number (upper limit) : 100<br/>" +
                        "<br/>" +
                        "Trimorphic Numbers from 1 to 100<br/>" +
                        "1<br/>" +
                        "4<br/>" +
                        "5<br/>" +
                        "6<br/>" +
                        "9<br/>" +
                        "24<br/>" +
                        "25<br/>" +
                        "49<br/>" +
                        "51<br/>" +
                        "75<br/>" +
                        "76<br/>" +
                        "99<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "/*\n" +
                        "Trimorphic Number : A Number is a Trimorphic number if the cube of the number ends in the number itself.\n" +
                        "\n" +
                        "For Example :\n" +
                        "\n" +
                        "25 is Trimorphic Number as its cube 15625 contains 25 at its end.\n" +
                        "\n" +
                        "*/\n" +
                        "\n" +
                        "#include<stdio.h>\n" +
                        "\n" +
                        "int isTrimorphic(int);\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int limit,i;\n" +
                        "    printf(\"Enter the number (upper limit):\");\n" +
                        "    scanf(\"%d\",&limit);\n" +
                        "\t\n" +
                        "\tprintf(\"Trimorphic Numbers from 1 to %d \\n\",limit);\n" +
                        "\tfor(i=1; i<= limit; i++)\n" +
                        "\t{\n" +
                        "\t\tif(isTrimorphic(i)==0)\n" +
                        "\t\t\tprintf(\"%d \\n\",i);\n" +
                        "\t}\n" +
                        "}\n" +
                        "\n" +
                        "int isTrimorphic(int num)\n" +
                        "{\n" +
                        "\tint flag=0;\n" +
                        "\tint cube_power=num*num*num;\n" +
                        "    while(num!=0)\n" +
                        "    {\n" +
                        "\t\tif(num%10!=cube_power%10)\n" +
                        "\t\t{\n" +
                        "\t\t\tflag=1;\n" +
                        "\t\t\tbreak;\n" +
                        "\t\t}\n" +
                        "\t\tnum/=10;\n" +
                        "\t\tcube_power/=10;\n" +
                        "\t}\n" +
                        "\treturn flag;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter a number (upper limit) : 100\n" +
                        "\n" +
                        "Trimorphic Numbers from 1 to 100\n" +
                        "1\n" +
                        "4\n" +
                        "5\n" +
                        "6\n" +
                        "9\n" +
                        "24\n" +
                        "25\n" +
                        "49\n" +
                        "51\n" +
                        "75\n" +
                        "76\n" +
                        "99\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 36:
                program_start = "<font color=#3E3E3E>/*<br/><br/>" +
                        "Evil Numbers : An evil number is a non-negative number that has an even number of 1s in its binary expansion ( i.e. in base-2 numeral system, 0s and 1s).<br/>" +
                        "<br/>" +
                        "Odious Numbers : Numbers that are not Evil are called Odious Numbers.<br/>" +
                        "<br/>" +
                        "For Example :<br/>" +
                        "<br/>" +
                        "3 is an Evil Number as its binary representation contains exen(2) number of 1s.<br/>" +
                        "<br/>" +
                        "Binary Representation :<br/>" +
                        "3 - 011 >> 2 One's<br/>" +
                        "<br/>" +
                        "*/</font><br/>" +
                        "<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int i,limit,num;<br/>" +
                        "&#160 int count=0; // to check the no<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a Number (upper limit) : \"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&limit);<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Evil Numbers between 1 to %d \\n\"</font>,limit);<br/>" +
                        "&#160 <br/>" +
                        "&#160 for(i=1; i &#60= limit; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 num=i; // assign no to check<br/>" +
                        "&#160 &#160 count=0; // reset counter<br/>" +
                        "&#160 &#160 <br/>" +
                        "&#160 &#160 <font color=#3E3E3E>/*<br/>" +
                        "&#160 &#160 Count the no of 1s in the binary representation of the number.<br/>" +
                        "&#160 &#160 */</font><br/>" +
                        "&#160 &#160 <br/>" +
                        "&#160 &#160 while(num!=0)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 if(num%2==1)<br/>" +
                        "&#160 &#160 &#160 &#160 count++;<br/>" +
                        "&#160 &#160 &#160 <br/>" +
                        "&#160 &#160 &#160 num=num/2;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 <br/>" +
                        "&#160 &#160 <font color=#3E3E3E>/*<br/>" +
                        "&#160 &#160 If the number of 1s is even then Evil Else Odious<br/>" +
                        "&#160 &#160 */</font><br/>" +
                        "&#160 &#160 <br/>" +
                        "&#160 &#160 <font color=#3E3E3E>// use count%2!=0 to check Odious.</font><br/>" +
                        "&#160 &#160 <br/>" +
                        "&#160 &#160 if(count%2==0)<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%d\\n\"</font>,i);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter a Number (upper limit) : 50<br/>" +
                        "<br/>" +
                        "Evil Numbers between 1 to 50<br/>" +
                        "<br/>" +
                        "3<br/>" +
                        "5<br/>" +
                        "6<br/>" +
                        "9<br/>" +
                        "10<br/>" +
                        "12<br/>" +
                        "15<br/>" +
                        "17<br/>" +
                        "18<br/>" +
                        "20<br/>" +
                        "23<br/>" +
                        "24<br/>" +
                        "27<br/>" +
                        "29<br/>" +
                        "30<br/>" +
                        "33<br/>" +
                        "34<br/>" +
                        "36<br/>" +
                        "39<br/>" +
                        "40<br/>" +
                        "43<br/>" +
                        "45<br/>" +
                        "46<br/>" +
                        "48<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "/*\n" +
                        "Evil Numbers : An evil number is a non-negative number that has an even number of 1s in its binary expansion ( i.e. in base-2 numeral system, 0s and 1s).\n" +
                        "\n" +
                        "Odious Numbers : Numbers that are not Evil are called Odious Numbers.\n" +
                        "\n" +
                        "For Example :\n" +
                        "\n" +
                        "3 is an Evil Number as its binary representation contains exen(2) number of 1s.\n" +
                        "\n" +
                        "Binary Representation :\n" +
                        "3 - 011 >> 2 One's\n" +
                        "\n" +
                        "*/\n" +
                        "\n" +
                        "#include<stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tint i,limit,num;\n" +
                        "\tint count=0; // to check the no\n" +
                        "\t\n" +
                        "\tprintf(\"Enter a Number (upper limit) : \");\n" +
                        "\tscanf(\"%d\",&limit);\n" +
                        "\t\n" +
                        "\tprintf(\"Evil Numbers between 1 to %d \\n\",limit);\n" +
                        "\t\n" +
                        "\tfor(i=1; i<= limit; i++)\n" +
                        "\t{\n" +
                        "\t\tnum=i; // assign no to check\n" +
                        "\t\tcount=0; // reset counter\n" +
                        "\t\t\n" +
                        "\t\t/*\n" +
                        "\t\tCount the no of 1s in the binary representation of the number.\n" +
                        "\t\t*/\n" +
                        "\t\t\n" +
                        "\t\twhile(num!=0)\n" +
                        "\t\t{\n" +
                        "\t\t\tif(num%2==1)\n" +
                        "\t\t\t\tcount++;\n" +
                        "\t\t\t\n" +
                        "\t\t\tnum=num/2;\n" +
                        "\t\t}\n" +
                        "\t\t\n" +
                        "\t\t/*\n" +
                        "\t\tIf the number of 1s is even then Evil Else Odious\n" +
                        "\t\t*/\n" +
                        "\t\t\n" +
                        "\t\t// use count%2!=0 to check Odious.\n" +
                        "\t\t\n" +
                        "\t\tif(count%2==0)\n" +
                        "\t\t\tprintf(\"%d\\n\",i);\n" +
                        "\t}\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter a Number (upper limit) : 50\n" +
                        "\n" +
                        "Evil Numbers between 1 to 50 \n" +
                        "\n" +
                        "3\n" +
                        "5\n" +
                        "6\n" +
                        "9\n" +
                        "10\n" +
                        "12\n" +
                        "15\n" +
                        "17\n" +
                        "18\n" +
                        "20\n" +
                        "23\n" +
                        "24\n" +
                        "27\n" +
                        "29\n" +
                        "30\n" +
                        "33\n" +
                        "34\n" +
                        "36\n" +
                        "39\n" +
                        "40\n" +
                        "43\n" +
                        "45\n" +
                        "46\n" +
                        "48\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 37:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n,i,j,k = 1;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter Number of rows of FLoyd triangle :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "<br/>" +
                        "&#160 for(i = 1; i &#60= n; i++) {<br/>" +
                        "&#160 &#160 for(j = 1;j &#60= i; j++)<br/>" +
                        "&#160 &#160 &#160 printf(\"%3d\", k++);<br/>" +
                        "<br/>" +
                        "&#160 &#160 printf(\"\\n\");<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter Number of rows of FLoyd triangle : 4<br/>" +
                        "<br/>" +
                        "1<br/>" +
                        "2  3<br/>" +
                        "4  5  6<br/>" +
                        "7  8  9 10<br/>" +
                        "*/</font></br>";

                program = "#include<stdio.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "   int n,i,j,k = 1;\n" +
                        "\n" +
                        "   printf(\"Enter Number of rows of FLoyd triangle :\");\n" +
                        "   scanf(\"%d\",&n);\n" +
                        "\n" +
                        "   for(i = 1; i <= n; i++) {\n" +
                        "      for(j = 1;j <= i; j++)\n" +
                        "         printf(\"%3d\", k++);\n" +
                        "\n" +
                        "      printf(\"\\n\");\n" +
                        "   }\n" +
                        "\n" +
                        "   return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter Number of rows of FLoyd triangle : 4\n" +
                        "\n" +
                        "1\n" +
                        "2  3\n" +
                        "4  5  6\n" +
                        "7  8  9 10\n" +
                        "*/";
                setText();
                break;

            case 38:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n, rev = 0, remainder;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an integer: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &n);<br/>" +
                        "&#160 while (n != 0) {<br/>" +
                        "&#160 &#160 remainder = n % 10;<br/>" +
                        "&#160 &#160 rev = rev * 10 + remainder;<br/>" +
                        "&#160 &#160 n /= 10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Reversed number = %d\"</font>, rev);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter an integer: 2345<br/>" +
                        "Reversed number = 5432<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int n, rev = 0, remainder;\n" +
                        "    printf(\"Enter an integer: \");\n" +
                        "    scanf(\"%d\", &n);\n" +
                        "    while (n != 0) {\n" +
                        "        remainder = n % 10;\n" +
                        "        rev = rev * 10 + remainder;\n" +
                        "        n /= 10;\n" +
                        "    }\n" +
                        "    printf(\"Reversed number = %d\", rev);\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter an integer: 2345\n" +
                        "Reversed number = 5432\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 39:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{    <br/>" +
                        "&#160 int n,sum=0,m;    <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a number:\"</font>);    <br/>" +
                        "&#160 scanf(\"%d\",&n);    <br/>" +
                        "&#160 while(n &#62 0)    <br/>" +
                        "&#160 {    <br/>" +
                        "&#160 &#160 m=n%10;    <br/>" +
                        "&#160 &#160 sum=sum+m;    <br/>" +
                        "&#160 &#160 n=n/10;    <br/>" +
                        "&#160 }    <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Sum is=%d\"</font>,sum);    <br/>" +
                        "&#160 return 0;  <br/>" +
                        "}   <br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output 1:<br/>" +
                        "<br/>" +
                        "Enter a number:654<br/>" +
                        "Sum is=15<br/>" +
                        "<br/>" +
                        "Output 2:<br/>" +
                        "<br/>" +
                        "Enter a number:123<br/>" +
                        "Sum is=6<br/>" +
                        "<br/>" +
                        "*/</font><br/>";

                program = "#include<stdio.h>  \n" +
                        "int main()    \n" +
                        "{    \n" +
                        "\tint n,sum=0,m;    \n" +
                        "\tprintf(\"Enter a number:\");    \n" +
                        "\tscanf(\"%d\",&n);    \n" +
                        "\twhile(n>0)    \n" +
                        "\t{    \n" +
                        "\t\tm=n%10;    \n" +
                        "\t\tsum=sum+m;    \n" +
                        "\t\tn=n/10;    \n" +
                        "\t}    \n" +
                        "\tprintf(\"Sum is=%d\",sum);    \n" +
                        "\treturn 0;  \n" +
                        "}   \n" +
                        "\n" +
                        "/*\n" +
                        "Output 1:\n" +
                        "\n" +
                        "Enter a number:654\n" +
                        "Sum is=15\n" +
                        "\n" +
                        "Output 2:\n" +
                        "\n" +
                        "Enter a number:123\n" +
                        "Sum is=6\n" +
                        "\n" +
                        "*/\n";
                setText();
                break;

            case 40:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int base, exp;<br/>" +
                        "&#160 long long result = 1;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a base number: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &base);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an exponent: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &exp);<br/>" +
                        "<br/>" +
                        "&#160 while (exp != 0) {<br/>" +
                        "&#160 &#160 result *= base;<br/>" +
                        "&#160 &#160 --exp;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Answer = %lld\"</font>, result);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter a base number: 3<br/>" +
                        "Enter an exponent: 4<br/>" +
                        "Answer = 81<br/>" +
                        "<br/>" +
                        "*/</font><br/>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int base, exp;\n" +
                        "    long long result = 1;\n" +
                        "    printf(\"Enter a base number: \");\n" +
                        "    scanf(\"%d\", &base);\n" +
                        "    printf(\"Enter an exponent: \");\n" +
                        "    scanf(\"%d\", &exp);\n" +
                        "\n" +
                        "    while (exp != 0) {\n" +
                        "        result *= base;\n" +
                        "        --exp;\n" +
                        "    }\n" +
                        "    printf(\"Answer = %lld\", result);\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter a base number: 3\n" +
                        "Enter an exponent: 4\n" +
                        "Answer = 81\n" +
                        "\n" +
                        "*/\n";
                setText();
                break;

            case 41:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 long long n;<br/>" +
                        "&#160 int count = 0;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an integer: \"</font>);<br/>" +
                        "&#160 scanf(\"%lld\", &n);<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>// iterate until n becomes 0<br/>" +
                        "&#160 // remove last digit from n in each iteration<br/>" +
                        "&#160 // increase count by 1 in each iteration<br/></font>" +
                        "&#160 while (n != 0) {<br/>" +
                        "&#160 &#160 n /= 10;     // n = n/10<br/>" +
                        "&#160 &#160 ++count;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Number of digits: %d\"</font>, count);<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter an integer: 3452<br/>" +
                        "Number of digits: 4<br/>" +
                        "<br/>" +
                        "*/</font><br/>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    long long n;\n" +
                        "    int count = 0;\n" +
                        "    printf(\"Enter an integer: \");\n" +
                        "    scanf(\"%lld\", &n);\n" +
                        " \n" +
                        "    // iterate until n becomes 0\n" +
                        "    // remove last digit from n in each iteration\n" +
                        "    // increase count by 1 in each iteration\n" +
                        "    while (n != 0) {\n" +
                        "        n /= 10;     // n = n/10\n" +
                        "        ++count;\n" +
                        "    }\n" +
                        "\n" +
                        "    printf(\"Number of digits: %d\", count);\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter an integer: 3452\n" +
                        "Number of digits: 4\n" +
                        "\n" +
                        "*/\n";
                setText();
                break;

            case 42:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt stdlib.h&gt<br/>" +
                        "#include&lt time.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>// Generates and prints 'count' random <br/>" +
                        "// numbers in range [lower, upper]. </font><br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> printRandoms</font>(int lower, int upper, int count) <br/>" +
                        "{ <br/>" +
                        "&#160 int i; <br/>" +
                        "&#160 for (i = 0; i &#60 count; i++) { <br/>" +
                        "&#160 &#160 int num = (rand() % (upper - lower + 1)) + lower; <br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d \"</font>, num); <br/>" +
                        "&#160 } <br/>" +
                        "} <br/>" +
                        "<br/>" +
                        "// Driver code <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{ <br/>" +
                        "&#160 int lower = 5, upper = 7, count = 1; <br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// Use current time as <br/>" +
                        "&#160 // seed for random generator <br/></font>" +
                        "&#160 srand(time(0)); <br/>" +
                        "<br/>" +
                        "&#160 printRandoms(lower, upper, count); <br/>" +
                        "<br/>" +
                        "&#160 return 0; <br/>" +
                        "} <br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "7<br/>" +
                        "<br/>" +
                        "*/</font><br/>";

                program = "#include <stdio.h> \n" +
                        "#include <stdlib.h> \n" +
                        "#include <time.h> \n" +
                        "\n" +
                        "// Generates and prints 'count' random \n" +
                        "// numbers in range [lower, upper]. \n" +
                        "void printRandoms(int lower, int upper, \n" +
                        "\t\t\t\t\t\t\tint count) \n" +
                        "{ \n" +
                        "\tint i; \n" +
                        "\tfor (i = 0; i < count; i++) { \n" +
                        "\t\tint num = (rand() % \n" +
                        "\t\t(upper - lower + 1)) + lower; \n" +
                        "\t\tprintf(\"%d \", num); \n" +
                        "\t} \n" +
                        "} \n" +
                        "\n" +
                        "// Driver code \n" +
                        "int main() \n" +
                        "{ \n" +
                        "\tint lower = 5, upper = 7, count = 1; \n" +
                        "\n" +
                        "\t// Use current time as \n" +
                        "\t// seed for random generator \n" +
                        "\tsrand(time(0)); \n" +
                        "\n" +
                        "\tprintRandoms(lower, upper, count); \n" +
                        "\n" +
                        "\treturn 0; \n" +
                        "} \n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "7\n" +
                        "\n" +
                        "*/\n";
                setText();
                break;

            case 43:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "  <br/>" +
                        "enum year{Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec}; <br/>" +
                        "  <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{ <br/>" +
                        "&#160 int i; <br/>" +
                        "&#160 for (i=Jan; i &#60= Dec; i++)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d \"</font>, i); <br/>" +
                        "        <br/>" +
                        "&#160 return 0; <br/>" +
                        "}  <br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "0 1 2 3 4 5 6 7 8 9 10 11<br/>" +
                        "<br/>" +
                        "*/</font>";
                program = "#include<stdio.h> \n" +
                        "  \n" +
                        "enum year{Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec}; \n" +
                        "  \n" +
                        "int main() \n" +
                        "{ \n" +
                        "\tint i; \n" +
                        "\tfor (i=Jan; i<=Dec; i++)       \n" +
                        "\t\tprintf(\"%d \", i); \n" +
                        "        \n" +
                        "\treturn 0; \n" +
                        "}  \n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "0 1 2 3 4 5 6 7 8 9 10 11\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 44:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float celsius, fahrenheit;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Input temperature in celsius */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter temperature in Celsius: \"</font>);<br/>" +
                        "&#160 scanf(\"%f\", &celsius);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* celsius to fahrenheit conversion formula */</font><br/>" +
                        "&#160 fahrenheit = (celsius * 9 / 5) + 32;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"%.2f Celsius = %.2f Fahrenheit\"</font>, celsius, fahrenheit);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Enter temperature in Celsius = 100<br/>" +
                        "<br/>" +
                        "Temperature in Fahrenheit = 212 F<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    float celsius, fahrenheit;\n" +
                        "\n" +
                        "    /* Input temperature in celsius */\n" +
                        "    printf(\"Enter temperature in Celsius: \");\n" +
                        "    scanf(\"%f\", &celsius);\n" +
                        "\n" +
                        "    /* celsius to fahrenheit conversion formula */\n" +
                        "    fahrenheit = (celsius * 9 / 5) + 32;\n" +
                        "\n" +
                        "    printf(\"%.2f Celsius = %.2f Fahrenheit\", celsius, fahrenheit);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Enter temperature in Celsius = 100\n" +
                        "\n" +
                        "Temperature in Fahrenheit = 212 F\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 45:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float celsius, fahrenheit;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Input temperature in fahrenheit */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter temperature in Fahrenheit: \"</font>);<br/>" +
                        "&#160 scanf(\"%f\", &fahrenheit);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Fahrenheit to celsius conversion formula */</font><br/>" +
                        "&#160 celsius = (fahrenheit - 32) * 5 / 9;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Print the value of celsius */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"%.2f Fahrenheit = %.2f Celsius\"</font>, fahrenheit, celsius);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Temperature in fahrenheit = 205<br/>" +
                        "<br/>" +
                        "Temperature in celsius = 96.11 C<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    float celsius, fahrenheit;\n" +
                        "\n" +
                        "    /* Input temperature in fahrenheit */\n" +
                        "    printf(\"Enter temperature in Fahrenheit: \");\n" +
                        "    scanf(\"%f\", &fahrenheit);\n" +
                        "\n" +
                        "    /* Fahrenheit to celsius conversion formula */\n" +
                        "    celsius = (fahrenheit - 32) * 5 / 9;\n" +
                        "\n" +
                        "    /* Print the value of celsius */\n" +
                        "    printf(\"%.2f Fahrenheit = %.2f Celsius\", fahrenheit, celsius);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Temperature in fahrenheit = 205\n" +
                        "\n" +
                        "Temperature in celsius = 96.11 C\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 46:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int arr1[100];<br/>" +
                        "&#160 int i, mx, mn, n;<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\n\\nFind maximum and minimum element in an array :\\n\"</font>);<br/>" +
                        "&#160 printf(\"--------------------------------------------------\\n\");\t<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Input the number of elements to be stored in the array :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "   <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Input %d elements in the array :\\n\"</font>,n);\n" +
                        "&#160 for(i=0;i<n;i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"element - %d : \"</font>,i+1);<br/>" +
                        "&#160 &#160 scanf(\"%d\",&arr1[i]);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 mx = arr1[0];<br/>" +
                        "&#160 mn = arr1[0];<br/>" +
                        "<br/>" +
                        "&#160 for(i=1; i &#60 n; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(arr1[i] &#62 mx)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 mx = arr1[i];<br/>" +
                        "&#160 &#160 }<br/>" +
                        "<br/>" +
                        "<br/>" +
                        "&#160 &#160 if(arr1[i] &#60 mn)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 mn = arr1[i];<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Maximum element is : %d\\n\"</font>, mx);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Minimum element is : %d\\n\\n\"</font>, mn);<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Input the number of elements to be stored in the array :3<br/>                                                     \n" +
                        "Input 3 elements in the array :<br/>                                                                               \n" +
                        "element - 1 : 45<br/>                                                                                              \n" +
                        "element - 2 : 25<br/>                                                                                              \n" +
                        "element - 3 : 21<br/>                                                                                              \n" +
                        "Maximum element is : 45<br/>                                                                                       \n" +
                        "Minimum element is : 21<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "void main()\n" +
                        "{\n" +
                        "    int arr1[100];\n" +
                        "    int i, mx, mn, n;\n" +
                        "\t\n" +
                        "       printf(\"\\n\\nFind maximum and minimum element in an array :\\n\");\n" +
                        "       printf(\"--------------------------------------------------\\n\");\t\n" +
                        "\n" +
                        "       printf(\"Input the number of elements to be stored in the array :\");\n" +
                        "       scanf(\"%d\",&n);\n" +
                        "   \n" +
                        "       printf(\"Input %d elements in the array :\\n\",n);\n" +
                        "       for(i=0;i<n;i++)\n" +
                        "            {\n" +
                        "\t      printf(\"element - %d : \",i+1);\n" +
                        "\t      scanf(\"%d\",&arr1[i]);\n" +
                        "\t    }\n" +
                        "\n" +
                        "    mx = arr1[0];\n" +
                        "    mn = arr1[0];\n" +
                        "\n" +
                        "    for(i=1; i<n; i++)\n" +
                        "    {\n" +
                        "        if(arr1[i]>mx)\n" +
                        "        {\n" +
                        "            mx = arr1[i];\n" +
                        "        }\n" +
                        "\n" +
                        "\n" +
                        "        if(arr1[i]<mn)\n" +
                        "        {\n" +
                        "            mn = arr1[i];\n" +
                        "        }\n" +
                        "    }\n" +
                        "    printf(\"Maximum element is : %d\\n\", mx);\n" +
                        "    printf(\"Minimum element is : %d\\n\\n\", mn);\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Input the number of elements to be stored in the array :3\n                                                     \n" +
                        "Input 3 elements in the array :\n                                                                               \n" +
                        "element - 1 : 45\n                                                                                              \n" +
                        "element - 2 : 25\n                                                                                              \n" +
                        "element - 3 : 21\n                                                                                              \n" +
                        "Maximum element is : 45\n                                                                                       \n" +
                        "Minimum element is : 21\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 47:
                program_start = "<font color=#3E3E3E>/*<br/>" +
                        "Anagram String Check.<br/>" +
                        "<br/>" +
                        ">> Two Strings are said to be anagrams, if the letters from one string can be rearranged to form the other string.<br/>" +
                        "<br/>" +
                        "*/</font><br/>" +
                        "<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        " <br/>" +
                        "int find_anagram(char [], char []);<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 char array1[100], array2[100];<br/>" +
                        "&#160 int flag;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the string\\n\"</font>);<br/>" +
                        "&#160 gets(array1);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter another string\\n\"</font>);<br/>" +
                        "&#160 gets(array2);<br/>" +
                        "&#160 flag = find_anagram(array1, array2);<br/>" +
                        "&#160 if (flag == 1)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\"%s\" and \"%s\" are anagrams.\\n\"</font>, array1, array2);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"\"%s\" and \"%s\" are not anagrams.\\n\"</font>, array1, array2);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> find_anagram</font>(char array1[], char array2[])<br/>" +
                        "{<br/>" +
                        "&#160 int num1[26] = {0}, num2[26] = {0}, i = 0;<br/>" +
                        " <br/>" +
                        "&#160 while (array1[i] != '\\0')<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 num1[array1[i] - 'a']++;<br/>" +
                        "&#160 &#160 i++;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 i = 0;<br/>" +
                        "&#160 while (array2[i] != '\\0')<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 num2[array2[i] -'a']++;<br/>" +
                        "&#160 &#160 i++;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 for (i = 0; i &#60 26; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if (num1[i] != num2[i])<br/>" +
                        "&#160 &#160 &#160 return 0;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 1;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the string<br/>" +
                        "abll<br/>" +
                        "Enter another string<br/>" +
                        "ball<br/>" +
                        "\"abll\" and \"ball\" are anagrams.<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "/*\n" +
                        "Anagram String Check.\n" +
                        "\n" +
                        ">> Two Strings are said to be anagrams, if the letters from one string can be rearranged to form the other string.\n" +
                        "\n" +
                        "*/\n" +
                        "\n" +
                        "#include <stdio.h>\n" +
                        " \n" +
                        "int find_anagram(char [], char []);\n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "    char array1[100], array2[100];\n" +
                        "    int flag;\n" +
                        " \n" +
                        "    printf(\"Enter the string\\n\");\n" +
                        "    gets(array1);\n" +
                        "    printf(\"Enter another string\\n\");\n" +
                        "    gets(array2);\n" +
                        "    flag = find_anagram(array1, array2);\n" +
                        "    if (flag == 1)\n" +
                        "        printf(\"\"%s\" and \"%s\" are anagrams.\\n\", array1, array2);\n" +
                        "    else\n" +
                        "        printf(\"\"%s\" and \"%s\" are not anagrams.\\n\", array1, array2);\n" +
                        "    return 0;\n" +
                        "}\n" +
                        " \n" +
                        "int find_anagram(char array1[], char array2[])\n" +
                        "{\n" +
                        "    int num1[26] = {0}, num2[26] = {0}, i = 0;\n" +
                        " \n" +
                        "    while (array1[i] != '\\0')\n" +
                        "    {\n" +
                        "        num1[array1[i] - 'a']++;\n" +
                        "        i++;\n" +
                        "    }\n" +
                        "    i = 0;\n" +
                        "    while (array2[i] != '\\0')\n" +
                        "    {\n" +
                        "        num2[array2[i] -'a']++;\n" +
                        "        i++;\n" +
                        "    }\n" +
                        "    for (i = 0; i < 26; i++)\n" +
                        "    {\n" +
                        "        if (num1[i] != num2[i])\n" +
                        "            return 0;\n" +
                        "    }\n" +
                        "    return 1;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the string\n" +
                        "abll\n" +
                        "Enter another string\n" +
                        "ball\n" +
                        "\"abll\" and \"ball\" are anagrams.\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 48:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "int calculateDigits(int num)<br/>" +
                        "{<br/>" +
                        "&#160 int sum=0;<br/>" +
                        "&#160 while(num!=0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 sum+=(num%10);<br/>" +
                        "&#160 &#160 num/=10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 if(sum &#62= 10)<br/>" +
                        "&#160 &#160 calculateDigits(sum);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 return sum;<br/>" +
                        "}<br/><br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n,sum;<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter any positive integer number: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "&#160 if(n<0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Invalid input!!!\\n\"</font>);<br/>" +
                        "&#160 &#160 return -1;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 sum=calculateDigits(n);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Sum of digits is: %d\\n\"</font>,sum);<br/>" +
                        "&#160 <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter any positive integer number: 8999 <br/>" +
                        "Sum of digits is: 8 <br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int calculateDigits(int num)\n" +
                        "{\n" +
                        "\tint sum=0;\n" +
                        "\twhile(num!=0)\n" +
                        "\t{\n" +
                        "\t\tsum+=(num%10);\n" +
                        "\t\tnum/=10;\n" +
                        "\t}\n" +
                        "\tif(sum>=10)\n" +
                        "\t\tcalculateDigits(sum);\n" +
                        "\telse\n" +
                        "\t\treturn sum;\n" +
                        "}\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tint n,sum;\n" +
                        "\t\n" +
                        "\tprintf(\"Enter any positive integer number: \");\n" +
                        "\tscanf(\"%d\",&n);\n" +
                        "\tif(n<0)\n" +
                        "\t{\n" +
                        "\t\tprintf(\"Invalid input!!!\\n\");\n" +
                        "\t\treturn -1;\n" +
                        "\t}\n" +
                        "\tsum=calculateDigits(n);\n" +
                        "\tprintf(\"Sum of digits is: %d\\n\",sum);\n" +
                        "\t\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter any positive integer number: 8999 \n" +
                        "Sum of digits is: 8 \n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 49:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n1, n2, max;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter two positive integers: \"</font>);<br/>" +
                        "&#160 scanf(\"%d %d\", &n1, &n2);<br/>" +
                        "<br/>" +
                        "&#160 // maximum number between n1 and n2 is stored in min<br/>" +
                        "&#160 max = (n1 &#62 n2) ? n1 : n2;<br/>" +
                        "<br/>" +
                        "&#160 while (1) {<br/>" +
                        "&#160 &#160 if (max % n1 == 0 && max % n2 == 0) {<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"The LCM of %d and %d is %d.\"</font>, n1, n2, max);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 ++max;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter two positive integers: 72<br/>" +
                        "120<br/>" +
                        "The LCM of 72 and 120 is 360.<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int n1, n2, max;\n" +
                        "    printf(\"Enter two positive integers: \");\n" +
                        "    scanf(\"%d %d\", &n1, &n2);\n" +
                        "\n" +
                        "    // maximum number between n1 and n2 is stored in min\n" +
                        "    max = (n1 > n2) ? n1 : n2;\n" +
                        "\n" +
                        "    while (1) {\n" +
                        "        if (max % n1 == 0 && max % n2 == 0) {\n" +
                        "            printf(\"The LCM of %d and %d is %d.\", n1, n2, max);\n" +
                        "            break;\n" +
                        "        }\n" +
                        "        ++max;\n" +
                        "    }\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter two positive integers: 72\n" +
                        "120\n" +
                        "The LCM of 72 and 120 is 360.\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 50:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n1, n2, i, gcd;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter two integers: \"</font>);<br/>" +
                        "&#160 scanf(\"%d %d\", &n1, &n2);<br/>" +
                        "<br/>" +
                        "&#160 for(i=1; i &#60= n1 && i &#60= n2; ++i)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 <font color=#3E3E3E>// Checks if i is factor of both integers</font><br/>" +
                        "&#160 &#160 if(n1%i==0 && n2%i==0)<br/>" +
                        "&#160 &#160 &#160 gcd = i;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"G.C.D of %d and %d is %d\"</font>, n1, n2, gcd);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter two positive integers: 81<br/>" +
                        "153<br/>" +
                        "GCD = 9<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int n1, n2, i, gcd;\n" +
                        "\n" +
                        "    printf(\"Enter two integers: \");\n" +
                        "    scanf(\"%d %d\", &n1, &n2);\n" +
                        "\n" +
                        "    for(i=1; i <= n1 && i <= n2; ++i)\n" +
                        "    {\n" +
                        "        // Checks if i is factor of both integers\n" +
                        "        if(n1%i==0 && n2%i==0)\n" +
                        "            gcd = i;\n" +
                        "    }\n" +
                        "\n" +
                        "    printf(\"G.C.D of %d and %d is %d\", n1, n2, gcd);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter two positive integers: 81\n" +
                        "153\n" +
                        "GCD = 9\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 51:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int a, b, i, hcf;<br/>" +
                        "<br/>" +
                        "&#160 a = 12;<br/>" +
                        "&#160 b = 16;<br/>" +
                        "<br/>" +
                        "&#160 for(i = 1; i &#60= a || i &#60= b; i++) {<br/>" +
                        "&#160 if( a%i == 0 && b%i == 0 )<br/>" +
                        "&#160 &#160 hcf = i;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"HCF = %d\"</font>, hcf);<br/>" +
                        "   <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "HCF = 4<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "\tint a, b, i, hcf;\n" +
                        "\n" +
                        "\ta = 12;\n" +
                        "\tb = 16;\n" +
                        "\n" +
                        "\tfor(i = 1; i <= a || i <= b; i++) {\n" +
                        "\tif( a%i == 0 && b%i == 0 )\n" +
                        "\t\thcf = i;\n" +
                        "\t}\n" +
                        "\n" +
                        "\tprintf(\"HCF = %d\", hcf);\n" +
                        "   \n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "HCF = 4\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 52:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 double d,t,speed;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the Distance in Kms:\"</font>);<br/>" +
                        "&#160 scanf(\"%lf\",&d);<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the Time in Hrs:\"</font>);<br/>" +
                        "&#160 scanf(\"%lf\",&t);<br/>" +
                        "<br/>" +
                        "&#160 speed=d/t;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Speed is %0.2lf(Km/Hr)\\n\"</font>,speed);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the Distance in Kms:100<br/>" +
                        "Enter the Time in Hrs:2<br/>" +
                        "Speed is 50.00(Km/Hr)1<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<math.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tdouble d,t,speed;\n" +
                        "\t\n" +
                        "    printf(\"Enter the Distance in Kms:\");\n" +
                        "    scanf(\"%lf\",&d);\n" +
                        "\t\n" +
                        "    printf(\"Enter the Time in Hrs:\");\n" +
                        "    scanf(\"%lf\",&t);\n" +
                        "\t\n" +
                        "    speed=d/t;\n" +
                        "    printf(\"Speed is %0.2lf(Km/Hr)\\n\",speed);\n" +
                        "\t\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the Distance in Kms:100\n" +
                        "Enter the Time in Hrs:2\n" +
                        "Speed is 50.00(Km/Hr)1\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 53:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float principle, time, rate, SI;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Input principle, rate and time */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter principle (amount): \"</font>);<br/>" +
                        "&#160 scanf(\"%f\", &principle);<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter time: \"</font>);<br/>" +
                        "&#160 scanf(\"%f\", &time);<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter rate: \"</font>);<br/>" +
                        "&#160 scanf(\"%f\", &rate);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Calculate simple interest */</font><br/>" +
                        "&#160 SI = (principle * time * rate) / 100;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Print the resultant value of SI */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Simple Interest = %f\"</font>, SI);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter principle: 1200<br/>" +
                        "Enter time: 2<br/>" +
                        "Enter rate: 5.4<br/>" +
                        "Simple Interest = 129.600006<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    float principle, time, rate, SI;\n" +
                        "\n" +
                        "    /* Input principle, rate and time */\n" +
                        "    printf(\"Enter principle (amount): \");\n" +
                        "    scanf(\"%f\", &principle);\n" +
                        "\n" +
                        "    printf(\"Enter time: \");\n" +
                        "    scanf(\"%f\", &time);\n" +
                        "\n" +
                        "    printf(\"Enter rate: \");\n" +
                        "    scanf(\"%f\", &rate);\n" +
                        "\n" +
                        "    /* Calculate simple interest */\n" +
                        "    SI = (principle * time * rate) / 100;\n" +
                        "\n" +
                        "    /* Print the resultant value of SI */\n" +
                        "    printf(\"Simple Interest = %f\", SI);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter principle: 1200\n" +
                        "Enter time: 2\n" +
                        "Enter rate: 5.4\n" +
                        "Simple Interest = 129.600006\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 54:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{ <br/>" +
                        "&#160 float I,R,V;<br/>" +
                        "  <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter Voltage (V) :\\n\"</font>);<br/>" +
                        " <br/>" +
                        "&#160 scanf(\"%f\",&V);<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter Resistance (R) :\\n\"</font>);<br/>" +
                        "    <br/>" +
                        "&#160 scanf(\"%f\",&R);<br/>" +
                        "    <br/>" +
                        "&#160 I=V/R;<br/>" +
                        "    <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Current(I) = %f amp\"</font>,I);<br/>" +
                        " <br/>" +
                        "&#160 return 0;   <br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter Voltage (V) : 120<br/>" +
                        "Enter Resistance (R) : 45<br/>" +
                        "Current (I) : 2.666667 amp<br/>" +
                        "<br/>" +
                        "*/</font><br/>";

                program = "#include<stdio.h>\n" +
                        "int main()\n" +
                        "{ \n" +
                        "\tfloat I,R,V;\n" +
                        "  \n" +
                        "\tprintf(\"Enter Voltage (V) :\\n\");\n" +
                        " \n" +
                        "\tscanf(\"%f\",&V);\n" +
                        " \n" +
                        "\tprintf(\"Enter Resistance (R) :\\n\");\n" +
                        "    \n" +
                        "\tscanf(\"%f\",&R);\n" +
                        "    \n" +
                        "\tI=V/R;\n" +
                        "    \n" +
                        "\tprintf(\"Current(I) = %f amp\",I);\n" +
                        " \n" +
                        "    return 0;   \n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter Voltage (V) : 120\n" +
                        "Enter Resistance (R) : 45\n" +
                        "Current (I) : 2.666667 amp\n" +
                        "\n" +
                        "*/\n";
                setText();
                break;

            case 55:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt conio.h&gt<br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int month[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};<br/>" +
                        "&#160 int date, mon, year, i, r, s = 0;<br/>" +
                        "&#160 char week[7][10];<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 strcpy(week[0],<font color=#EC1A70> \"Sunday\"</font>);<br/>" +
                        "&#160 strcpy(week[1], <font color=#EC1A70>\"Monday\"</font>);<br/>" +
                        "&#160 strcpy(week[2], <font color=#EC1A70>\"Tuesday\"</font>);<br/>" +
                        "&#160 strcpy(week[3], <font color=#EC1A70>\"Wednesday\"</font>);<br/>" +
                        "&#160 strcpy(week[4], <font color=#EC1A70>\"Thursday\"</font>);<br/>" +
                        "&#160 strcpy(week[5], <font color=#EC1A70>\"Friday\"</font>);<br/>" +
                        "&#160 strcpy(week[6], <font color=#EC1A70>\"Saturday\"</font>);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a valid date (dd/mm/yyyy) : \"</font>);<br/>" +
                        "&#160 scanf(\"%d / %d / %d\", &date, &mon, &year);<br/>" +
                        "&#160 if( (year / 4 == 0) && (year % 400 == 0) && (year % 100 != 0))<br/>" +
                        "&#160 month[1] = 29;<br/>" +
                        "&#160 for(i = 0 ; i &#60 mon - 1 ; i++)<br/>" +
                        "&#160 s = s + month[i];<br/>" +
                        "&#160 s = s + (date + year + (year / 4) - 2);<br/>" +
                        "&#160 s = s % 7;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nThe day is : %s\"</font>, week[s]);<br/>" +
                        "&#160 getch();<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter a valid date (dd/mm/yyyy) : 02/11/1977<br/>" +
                        "The day is : Wednesday<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "void main()\n" +
                        "{\n" +
                        "\tint month[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};\n" +
                        "    int date, mon, year, i, r, s = 0;\n" +
                        "    char week[7][10];\n" +
                        "    clrscr();\n" +
                        "    strcpy(week[0], \"Sunday\");\n" +
                        "    strcpy(week[1], \"Monday\");\n" +
                        "    strcpy(week[2], \"Tuesday\");\n" +
                        "    strcpy(week[3], \"Wednesday\");\n" +
                        "    strcpy(week[4], \"Thursday\");\n" +
                        "    strcpy(week[5], \"Friday\");\n" +
                        "    strcpy(week[6], \"Saturday\");\n" +
                        "    printf(\"Enter a valid date (dd/mm/yyyy) : \");\n" +
                        "    scanf(\"%d / %d / %d\", &date, &mon, &year);\n" +
                        "    if( (year / 4 == 0) && (year % 400 == 0) && (year % 100 != 0))\n" +
                        "    month[1] = 29;\n" +
                        "    for(i = 0 ; i < mon - 1 ; i++)\n" +
                        "    s = s + month[i];\n" +
                        "    s = s + (date + year + (year / 4) - 2);\n" +
                        "    s = s % 7;\n" +
                        "    printf(\"\\nThe day is : %s\", week[s]);\n" +
                        "    getch();\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter a valid date (dd/mm/yyyy) : 02/11/1977\n" +
                        "The day is : Wednesday\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 56:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float radius, area;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the radius of a circle\\n\"</font>);<br/>" +
                        "<br/>" +
                        "&#160 scanf(\"%f\", &radius);<br/>" +
                        "<br/>" +
                        "&#160 area = 3.14159*radius*radius;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of the circle = %.2f\\n\"</font>, area);  // printing upto two decimal places<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the radius of a circle<br/>" +
                        "10<br/>" +
                        "Area of the circle = 314.16<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "#include <math.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tfloat radius, area;\n" +
                        "\n" +
                        "\tprintf(\"Enter the radius of a circle\\n\");\n" +
                        "\n" +
                        "\tscanf(\"%f\", &radius);\n" +
                        "\n" +
                        "\tarea = 3.14159*radius*radius;\n" +
                        "\n" +
                        "\tprintf(\"Area of the circle = %.2f\\n\", area);  // printing upto two decimal places\n" +
                        "\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the radius of a circle\n" +
                        "10\n" +
                        "Area of the circle = 314.16\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 57:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float radius, area;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the radius of a circle\\n\"</font>);<br/>" +
                        "<br/>" +
                        "&#160 scanf(\"%f\", &radius);<br/>" +
                        "<br/>" +
                        "&#160 area = 3.14159*radius*radius;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of the circle = %.2f\\n\"</font>, area);  <font color=#3E3E3E>// printing upto two decimal places</font><br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the radius of a circle<br/>" +
                        "10<br/>" +
                        "Area of the circle = 314.16<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "#include <math.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "  float radius, area;\n" +
                        "\n" +
                        "  printf(\"Enter the radius of a circle\\n\");\n" +
                        "\n" +
                        "  scanf(\"%f\", &radius);\n" +
                        "\n" +
                        "  area = 3.14159*radius*radius;\n" +
                        "\n" +
                        "  printf(\"Area of the circle = %.2f\\n\", area);  // printing upto two decimal places\n" +
                        "\n" +
                        "  return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the radius of a circle\n" +
                        "10\n" +
                        "Area of the circle = 314.16\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 58:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 double a, b, c, s, area;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter sides of a triangle\\n\"</font>);<br/>" +
                        "&#160 scanf(\"%lf%lf%lf\", &a, &b, &c);<br/>" +
                        "<br/>" +
                        "&#160 s = (a+b+c)/2; <font color=#3E3E3E>// Semiperimeter</font><br/>" +
                        "<br/>" +
                        "&#160 area = sqrt(s*(s-a)*(s-b)*(s-c));<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of the triangle = %.2lf\\n\"</font>, area);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter sides of a triangle<br/>" +
                        "10 10 10<br/>" +
                        "Area of the triangle = 43.30<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "#include <math.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tdouble a, b, c, s, area;\n" +
                        "\n" +
                        "\tprintf(\"Enter sides of a triangle\\n\");\n" +
                        "\tscanf(\"%lf%lf%lf\", &a, &b, &c);\n" +
                        "\n" +
                        "\ts = (a+b+c)/2; // Semiperimeter\n" +
                        "\n" +
                        "\tarea = sqrt(s*(s-a)*(s-b)*(s-c));\n" +
                        "\n" +
                        "\tprintf(\"Area of the triangle = %.2lf\\n\", area);\n" +
                        "\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter sides of a triangle\n" +
                        "10 10 10\n" +
                        "Area of the triangle = 43.30\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 59:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/> // Used for sqrt() function<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float side, area;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Input side of equilateral triangle */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter side of an equilateral triangle: \"</font>);<br/>" +
                        "&#160 scanf(\"%f\", &side);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Calculate area of equilateral triangle */</font><br/>" +
                        "&#160 area = (sqrt(3) / 4) * (side * side);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Print resultant area */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of equilateral triangle = %.2f sq. units\"</font>, area);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter side of the equilateral triangle: 10<br/>" +
                        "Area of equilateral triangle = 43.3 sq. units<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "#include <math.h> // Used for sqrt() function\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    float side, area;\n" +
                        "\n" +
                        "    /* Input side of equilateral triangle */\n" +
                        "    printf(\"Enter side of an equilateral triangle: \");\n" +
                        "    scanf(\"%f\", &side);\n" +
                        "\n" +
                        "    /* Calculate area of equilateral triangle */\n" +
                        "    area = (sqrt(3) / 4) * (side * side);\n" +
                        "\n" +
                        "    /* Print resultant area */\n" +
                        "    printf(\"Area of equilateral triangle = %.2f sq. units\", area);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter side of the equilateral triangle: 10\n" +
                        "Area of equilateral triangle = 43.3 sq. units\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 60:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt conio.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int length, breadth, area;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nEnter the Length of Rectangle : \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &length);<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nEnter the Breadth of Rectangle : \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &breadth);<br/>" +
                        " <br/>" +
                        "&#160 area = length * breadth;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nArea of Rectangle : %d\"</font>, area);<br/>" +
                        " <br/>" +
                        "&#160 return (0);<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the Length of Rectangle  : 5<br/>" +
                        "Enter the Breadth of Rectangle : 4<br/>" +
                        "Area of Rectangle : 20<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        " \n" +
                        "int main() {\n" +
                        "   int length, breadth, area;\n" +
                        " \n" +
                        "   printf(\"\\nEnter the Length of Rectangle : \");\n" +
                        "   scanf(\"%d\", &length);\n" +
                        " \n" +
                        "   printf(\"\\nEnter the Breadth of Rectangle : \");\n" +
                        "   scanf(\"%d\", &breadth);\n" +
                        " \n" +
                        "   area = length * breadth;\n" +
                        "   printf(\"\\nArea of Rectangle : %d\", area);\n" +
                        " \n" +
                        "   return (0);\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the Length of Rectangle  : 5\n" +
                        "Enter the Breadth of Rectangle : 4\n" +
                        "Area of Rectangle : 20\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 61:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int side, area;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nEnter the Length of Side : \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &side);<br/>" +
                        " <br/>" +
                        "&#160 area = side * side;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nArea of Square : %d\"</font>, area);<br/>" +
                        " <br/>" +
                        "&#160 return (0);<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the Length of Side : 5<br/>" +
                        "Area of Square : 25<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        " \n" +
                        "int main() {\n" +
                        "   int side, area;\n" +
                        " \n" +
                        "   printf(\"\\nEnter the Length of Side : \");\n" +
                        "   scanf(\"%d\", &side);\n" +
                        " \n" +
                        "   area = side * side;\n" +
                        "   printf(\"\\nArea of Square : %d\", area);\n" +
                        " \n" +
                        "   return (0);\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the Length of Side : 5\n" +
                        "Area of Square : 25\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 62:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float diagonal1, diagonal2;<br/>" +
                        "&#160 float area;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter diagonals of the given rhombus: \\n \"</font>);<br/>" +
                        "&#160 scanf(\"%f%f\", &diagonal1, &diagonal2);<br/>" +
                        "&#160 area = 0.5 * diagonal1 * diagonal2;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of rhombus is: %.3f \\n\"</font>, area);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter diagonals of the given rhombus:<br/>" +
                        "30 40<br/>" +
                        "Area of rhombus is: 600.000<br/>" +
                        "<br/>" +
                        "*/</font></br>";

                program = "#include <stdio.h>\n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "    float diagonal1, diagonal2;\n" +
                        "    float area;\n" +
                        " \n" +
                        "    printf(\"Enter diagonals of the given rhombus: \\n \");\n" +
                        "    scanf(\"%f%f\", &diagonal1, &diagonal2);\n" +
                        "    area = 0.5 * diagonal1 * diagonal2;\n" +
                        "    printf(\"Area of rhombus is: %.3f \\n\", area);\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter diagonals of the given rhombus:\n" +
                        "30 40\n" +
                        "Area of rhombus is: 600.000\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 63:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{  <br/>" +
                        "&#160 int s=13;  <br/>" +
                        "&#160 int a=5;  <br/>" +
                        "&#160 float area_pentagon=(5.0/2.0)*s*a;  <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of the pentagon=%0.1f\"</font>,area_pentagon);  <br/>" +
                        "&#160 <br/>" +
                        "&#160 return 0;<br/>" +
                        "} <br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Area of the pentagon=162.5  <br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>  \n" +
                        "int main()  \n" +
                        "{  \n" +
                        "\tint s=13;  \n" +
                        "\tint a=5;  \n" +
                        "\tfloat area_pentagon=(5.0/2.0)*s*a;  \n" +
                        "\tprintf(\"Area of the pentagon=%0.1f\",area_pentagon);  \n" +
                        "\t\n" +
                        "\treturn 0;\n" +
                        "} \n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Area of the pentagon=162.5  \n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 64:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float d = 10;<br/>" +
                        "&#160 float area = (3 * sqrt(3) * pow(d, 2)) / 8;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of hexagon = %f\"</font>,area);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Area of hexagon = 64.951904<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<math.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "\tfloat d = 10;\n" +
                        "\tfloat area = (3 * sqrt(3) * pow(d, 2)) / 8;\n" +
                        "\tprintf(\"Area of hexagon = %f\",area);\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Area of hexagon = 64.951904\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 65:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int a,perimeter;<br/>" +
                        "&#160 double area;" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the length of the side:\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&a);<br/>" +
                        "&#160 area=3.634*pow(a,2);<br/>" +
                        "&#160 perimeter=(7*a);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of the Heptagon = %0.2lf\\n\"</font>,area);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Perimeter of the Heptagon = %d\"</font>,perimeter);<br/>" +
                        "&#160 <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the length of the side:5<br/>" +
                        "Area of the Heptagon = 90.85<br/>" +
                        "Perimeter of the Heptagon = 35<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<math.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tprintf(\"Enter the length of the side:\");\n" +
                        "    int a,perimeter;\n" +
                        "    double area;\n" +
                        "    scanf(\"%d\",&a);\n" +
                        "    area=3.634*pow(a,2);\n" +
                        "    perimeter=(7*a);\n" +
                        "    printf(\"Area of the Heptagon = %0.2lf\\n\",area);\n" +
                        "    printf(\"Perimeter of the Heptagon = %d\",perimeter);\n" +
                        "\t\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the length of the side:5\n" +
                        "Area of the Heptagon = 90.85\n" +
                        "Perimeter of the Heptagon = 35\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 66:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int a = 7;<br/>" +
                        "&#160 float area;<br/>" +
                        "&#160 float multiplier = 6.18;<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"The side of the octagon is %d \\n\"</font>, a);<br/>" +
                        "&#160 <br/>" +
                        "&#160 area = ((2*a*a)*(1 + sqrt(2)));<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"The area of Enneagon is %f \\n\"</font>, area);<br/>" +
                        "&#160 <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "The side of the octagon is 7<br/>" +
                        "The area of Enneagon is 236.592926<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<math.h>\n" +
                        "int main(){\n" +
                        "\tint a = 7;\n" +
                        "\tfloat area;\n" +
                        "\tfloat multiplier = 6.18;\n" +
                        "\t\n" +
                        "\tprintf(\"The side of the octagon is %d \\n\", a);\n" +
                        "\t\n" +
                        "\tarea = ((2*a*a)*(1 + sqrt(2)));\n" +
                        "\tprintf(\"The area of Enneagon is %f \\n\", area);\n" +
                        "\t\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "The side of the octagon is 7\n" +
                        "The area of Enneagon is 236.592926\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 67:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float a, b, h;<br/>" +
                        "&#160 float area;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the value for two bases & height of the trapezium: \\n\"</font>);<br/>" +
                        "&#160 scanf(\"%f%f%f\", &a, &b, &h);<br/>" +
                        "&#160 area = 0.5 * (a + b) * h ;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Area of the trapezium is: %.3f\"</font>, area);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the value for two bases and height of the trapezium :<br/>" +
                        "10 15 20<br/>" +
                        "Area of the trapezium is: 250.000<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "    float a, b, h;\n" +
                        "    float area;\n" +
                        " \n" +
                        "    printf(\"Enter the value for two bases & height of the trapezium: \\n\");\n" +
                        "    scanf(\"%f%f%f\", &a, &b, &h);\n" +
                        "    area = 0.5 * (a + b) * h ;\n" +
                        "    printf(\"Area of the trapezium is: %.3f\", area);\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the value for two bases and height of the trapezium :\n" +
                        "10 15 20\n" +
                        "Area of the trapezium is: 250.000\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 68:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int r;<br/>" +
                        "&#160 float volume_sphere;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter Radius : \"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&r);<br/>" +
                        "&#160 volume_sphere = (4/3.0)*3.14*r*r*r;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nVolume of Sphere = %f\"</font>,volume_sphere);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter Radius : 2<br/>" +
                        "Volume of Sphere = 33.493332<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int r;\n" +
                        "    float volume_sphere;\n" +
                        "    printf(\"Enter Radius : \");\n" +
                        "    scanf(\"%d\",&r);\n" +
                        "    volume_sphere = (4/3.0)*3.14*r*r*r;\n" +
                        "    printf(\"\\nVolume of Sphere = %f\",volume_sphere);\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter Radius : 2\n" +
                        "Volume of Sphere = 33.493332\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 69:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt conio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        " <br/>" +
                        "float volume(float);<br/>" +
                        "float curved_Surface_area(float);<br/>" +
                        "float total_Surface_area(float);<br/>" +
                        "float base_area(float);<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 float radius;<br/>" +
                        "&#160 clrscr();<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter radius of hemisphere : \"</font>);<br/>" +
                        "&#160 scanf(\"%f\",&radius);<br/>" +
                        "     <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Volume of hemisphere : %f\\n\"</font>,volume(radius));<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Curved Surface area of hemisphere : %f\\n\"</font>,curved_Surface_area(radius));<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Total Surface area of hemisphere : %f\\n\"</font>,total_Surface_area(radius));<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Base area of hemisphere : %f\"</font>,base_area(radius));<br/>" +
                        "     <br/>" +
                        "&#160 getch();<br/>" +
                        "}<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>float</font><font color=#36D574> volume</font>(float radius)<br/>" +
                        "{<br/>" +
                        "&#160 return 2*3.14*radius*radius*radius/3;<br/>" +
                        "}<br/>" +
                        "  <br/>" +
                        "<font color=#EC1A70>float</font><font color=#36D574> curved_Surface_area</font>(float radius)<br/>" +
                        "{<br/>" +
                        "&#160 return 2*3.14*radius*radius; <br/>" +
                        "}<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>float</font><font color=#36D574> total_Surface_area</font>(float radius)<br/>" +
                        "{<br/>" +
                        "&#160 return 3*3.14*radius*radius;<br/>" +
                        "}<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>float</font><font color=#36D574> base_area</font>(float radius)<br/>" +
                        "{<br/>" +
                        "&#160 return 3.14*radius*radius;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter radius of hemisphere :8<br/>" +
                        "Volume of hemisphere : 1071.786621<br/>" +
                        "Curved Surface area of hemisphere : 401.920013<br/>" +
                        "Total Surface area of hemisphere : 602.880005<br/>" +
                        "Base area of hemisphere : 200.960007<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "#include<math.h>\n" +
                        " \n" +
                        "float volume(float);\n" +
                        "float curved_Surface_area(float);\n" +
                        "float total_Surface_area(float);\n" +
                        "float base_area(float);\n" +
                        " \n" +
                        "void main()\n" +
                        "{\n" +
                        "    float radius;\n" +
                        "    clrscr();\n" +
                        " \n" +
                        "    printf(\"Enter radius of hemisphere : \");\n" +
                        "    scanf(\"%f\",&radius);\n" +
                        "     \n" +
                        "    printf(\"Volume of hemisphere : %f\\n\",volume(radius));\n" +
                        "    printf(\"Curved Surface area of hemisphere : %f\\n\",curved_Surface_area(radius));\n" +
                        "    printf(\"Total Surface area of hemisphere : %f\\n\",total_Surface_area(radius));\n" +
                        "    printf(\"Base area of hemisphere : %f\",base_area(radius));\n" +
                        "     \n" +
                        "    getch();\n" +
                        "}\n" +
                        " \n" +
                        "float volume(float radius)\n" +
                        "{\n" +
                        "    return 2*3.14*radius*radius*radius/3;\n" +
                        "}\n" +
                        "  \n" +
                        "float curved_Surface_area(float radius)\n" +
                        "{\n" +
                        "    return 2*3.14*radius*radius; \n" +
                        "}\n" +
                        " \n" +
                        "float total_Surface_area(float radius)\n" +
                        "{\n" +
                        "    return 3*3.14*radius*radius;\n" +
                        "}\n" +
                        " \n" +
                        "float base_area(float radius)\n" +
                        "{\n" +
                        "    return 3.14*radius*radius;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter radius of hemisphere :8\n" +
                        "Volume of hemisphere : 1071.786621\n" +
                        "Curved Surface area of hemisphere : 401.920013\n" +
                        "Total Surface area of hemisphere : 602.880005\n" +
                        "Base area of hemisphere : 200.960007\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 70:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 <br/>" +
                        "&#160 float radius,height,volume;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"enter radius : \"</font>);<br/>" +
                        "&#160 scanf(\"%f\",&radius);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"enter height : \"</font>);<br/>" +
                        "&#160 scanf(\"%f\",&height);<br/>" +
                        "   <br/>" +
                        "&#160 volume=(22*radius*radius*height)/(3*7);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Volume Of Cone : %f\\n\"</font>,volume);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "/<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "enter radius : 7<br/>" +
                        "enter height : 3<br/>" +
                        "Volume Of Cone : 154.000000<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\t\n" +
                        "\tfloat radius,height,volume;\n" +
                        "\tprintf(\"enter radius : \");\n" +
                        "\tscanf(\"%f\",&radius);\n" +
                        "\tprintf(\"enter height : \");\n" +
                        "\tscanf(\"%f\",&height);\n" +
                        "   \n" +
                        "\tvolume=(22*radius*radius*height)/(3*7);\n" +
                        "\tprintf(\"Volume Of Cone : %f\\n\",volume);\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "enter radius : 7\n" +
                        "enter height : 3\n" +
                        "Volume Of Cone : 154.000000\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 71:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 <br/>" +
                        "&#160 float length,breadth,height,volume;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"enter length : \"</font>);<br/>" +
                        "&#160 scanf(\"%f\",&length);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"enter breadth : \"</font>);<br/>" +
                        "&#160 scanf(\"%f\",&breadth);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"enter height : \"</font>);<br/>" +
                        "&#160 scanf(\"%f\",&height);<br/>" +
                        "   <br/>" +
                        "&#160 volume=length*breadth*height;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Volume Of Cuboid : %f\\n\"</font>,volume);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/><br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "enter length : 10<br/>" +
                        "enter breadth : 20<br/>" +
                        "enter height : 30<br/>" +
                        "Volume Of Cuboid : 6000.000000<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "\t\n" +
                        "\tfloat length,breadth,height,volume;\n" +
                        "\tprintf(\"enter length : \");\n" +
                        "\tscanf(\"%f\",&length);\n" +
                        "\tprintf(\"enter breadth : \");\n" +
                        "\tscanf(\"%f\",&breadth);\n" +
                        "\tprintf(\"enter height : \");\n" +
                        "\tscanf(\"%f\",&height);\n" +
                        "   \n" +
                        "\tvolume=length*breadth*height;\n" +
                        "\tprintf(\"Volume Of Cuboid : %f\\n\",volume);\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "Output :\n" +
                        "\n" +
                        "enter length : 10\n" +
                        "enter breadth : 20\n" +
                        "enter height : 30\n" +
                        "Volume Of Cuboid : 6000.000000\n" +
                        "\n" +
                        "*/";
                setText();
                break;


            case 72:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 <font color=#3E3E3E>// printf() displays the string inside quotation</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Hello, World!\"</font>);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Hello, World!<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "   // printf() displays the string inside quotation\n" +
                        "   printf(\"Hello, World!\");\n" +
                        "   return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Hello, World!\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 73:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int number;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an integer: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &number);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// true if number is less than 0</font><br/>" +
                        "&#160 if (number &#60 0) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"You entered %d.\\n\"</font>, number);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"The if statement is easy.\"</font>);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter an integer: -2<br/>" +
                        "You entered -2.<br/>" +
                        "The if statement is easy.<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int number;\n" +
                        "\n" +
                        "    printf(\"Enter an integer: \");\n" +
                        "    scanf(\"%d\", &number);\n" +
                        "\n" +
                        "    // true if number is less than 0\n" +
                        "    if (number < 0) {\n" +
                        "        printf(\"You entered %d.\\n\", number);\n" +
                        "    }\n" +
                        "\n" +
                        "    printf(\"The if statement is easy.\");\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter an integer: -2\n" +
                        "You entered -2.\n" +
                        "The if statement is easy.\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 74:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int number;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an integer: \"<?font>);<br/>" +
                        "&#160 scanf(\"%d\", &number);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// True if the remainder is 0</font><br/>" +
                        "&#160 if  (number%2 == 0) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is an even integer.\"</font>,number);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d is an odd integer.\"</font>,number);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter an integer: 7<br/>" +
                        "7 is an odd integer.<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int number;\n" +
                        "    printf(\"Enter an integer: \");\n" +
                        "    scanf(\"%d\", &number);\n" +
                        "\n" +
                        "    // True if the remainder is 0\n" +
                        "    if  (number%2 == 0) {\n" +
                        "        printf(\"%d is an even integer.\",number);\n" +
                        "    }\n" +
                        "    else {\n" +
                        "        printf(\"%d is an odd integer.\",number);\n" +
                        "    }\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter an integer: 7\n" +
                        "7 is an odd integer.\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 75:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int number1, number2;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter two integers: \"</font>);<br/>" +
                        "&#160 scanf(\"%d %d\", &number1, &number2);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>//checks if number1 is greater than number2.</font><br/>" +
                        "&#160 if (number1 &#62 number2) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Result: %d > %d\"</font>, number1, number2);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 else {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Result: %d < %d\"</font>,number1, number2);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter two integers: 12<br/>" +
                        "23<br/>" +
                        "Result: 12 < 23<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "    int number1, number2;\n" +
                        "    printf(\"Enter two integers: \");\n" +
                        "    scanf(\"%d %d\", &number1, &number2);\n" +
                        "\n" +
                        "    //checks if the two integers are equal.\n" +
                        "    if(number1 == number2) {\n" +
                        "        printf(\"Result: %d = %d\",number1,number2);\n" +
                        "    }\n" +
                        "\n" +
                        "    //checks if number1 is greater than number2.\n" +
                        "    else if (number1 > number2) {\n" +
                        "        printf(\"Result: %d > %d\", number1, number2);\n" +
                        "    }\n" +
                        "\n" +
                        "    //checks if both test expressions are false\n" +
                        "    else {\n" +
                        "        printf(\"Result: %d < %d\",number1, number2);\n" +
                        "    }\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter two integers: 12\n" +
                        "23\n" +
                        "Result: 12 < 23\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 76:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt conio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 char gen;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Are you Male (y/n) :\"</font>);<br/>" +
                        "&#160 scanf(\"%c\",&gen);<br/>" +
                        "&#160 <br/>" +
                        "&#160 if(gen=='y' || gen=='Y')<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Gender : Male\"</font>);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Gender : Female\"</font>);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 getch();<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "(1st Run)<br/>" +
                        "Are you Male (y/n) :y<br/>" +
                        "Gender : Male<br/>" +
                        "<br/>" +
                        "(2nd Run)<br/>" +
                        "Are you Male (y/n) :n<br/>" +
                        "Gender : Female<br/>" +
                        "<br/>" +
                        "(3rd Run)<br/>" +
                        "Are you Male (y/n) :Y<br/>" +
                        "Gender : Male<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "\n" +
                        "void main()\n" +
                        "{\n" +
                        "\tchar gen;\n" +
                        "\tclrscr();\n" +
                        "\tprintf(\"Are you Male (y/n) :\");\n" +
                        "\tscanf(\"%c\",&gen);\n" +
                        "\t\n" +
                        "\tif(gen=='y' || gen=='Y')\n" +
                        "\t{\n" +
                        "\t\tprintf(\"Gender : Male\");\n" +
                        "\t}\n" +
                        "\telse\n" +
                        "\t{\n" +
                        "\t\tprintf(\"Gender : Female\");\n" +
                        "\t}\n" +
                        "\tgetch();\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "(1st Run)\n" +
                        "Are you Male (y/n) :y\n" +
                        "Gender : Male\n" +
                        "\n" +
                        "(2nd Run)\n" +
                        "Are you Male (y/n) :n\n" +
                        "Gender : Female\n" +
                        "\n" +
                        "(3rd Run)\n" +
                        "Are you Male (y/n) :Y\n" +
                        "Gender : Male\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 77:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt conio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int age;<br/>" +
                        "&#160 clrscr();<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter your age :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&age);<br/>" +
                        "&#160 <br/>" +
                        "&#160 <font color=#3E3E3E>/*<br/>" +
                        "&#160 Double check the age with upper and lower limits with the help of logical AND (&&) operator.<br/>" +
                        "&#160 Minimum age for voting is 18 years and we consider upper limit (max Human age) is 110 years/<br/>" +
                        "&#160 */</font><br/>" +
                        "&#160 <br/>" +
                        "&#160 if(age >= 18 && age <= 110)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"You are Eligible for Voting\"</font>);<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"You are Not Eligible for Voting\"</font>);<br/>" +
                        "<br/>" +
                        "&#160 getch();<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "(1st Run)<br/>" +
                        "Enter your age :10<br/>" +
                        "You are Not Eligible for Voting<br/>" +
                        "<br/>" +
                        "(2st Run)<br/>" +
                        "Enter your age :18<br/>" +
                        "You are Eligible for Voting<br/>" +
                        "<br/>" +
                        "(3st Run)<br/>" +
                        "Enter your age :80<br/>" +
                        "You are Eligible for Voting<br/>" +
                        "<br/>" +
                        "*/</font>";

                program = "#include<stdio.h>\n" +
                        "#include<conio.h>\n" +
                        "\n" +
                        "void main()\n" +
                        "{\n" +
                        "\tint age;\n" +
                        "\tclrscr();\n" +
                        "\t\n" +
                        "\tprintf(\"Enter your age :\");\n" +
                        "\tscanf(\"%d\",&age);\n" +
                        "\t\n" +
                        "\t/*\n" +
                        "\tDouble check the age with upper and lower limits with the help of logical AND (&&) operator.\n" +
                        "\tMinimum age for voting is 18 years and we consider upper limit (max Human age) is 110 years/\n" +
                        "\t*/\n" +
                        "\t\n" +
                        "\tif(age >= 18 && age <= 110)\n" +
                        "\t\tprintf(\"You are Eligible for Voting\");\n" +
                        "\telse\n" +
                        "\t\tprintf(\"You are Not Eligible for Voting\");\n" +
                        "\n" +
                        "\tgetch();\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "(1st Run)\n" +
                        "Enter your age :10\n" +
                        "You are Not Eligible for Voting\n" +
                        "\n" +
                        "(2st Run)\n" +
                        "Enter your age :18\n" +
                        "You are Eligible for Voting\n" +
                        "\n" +
                        "(3st Run)\n" +
                        "Enter your age :80\n" +
                        "You are Eligible for Voting\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 78:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int number1, number2;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter two integers: \"</font>);<br/>" +
                        "&#160 scanf(\"%d %d\", &number1, &number2);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>//checks if the two integers are equal.</font><br/>" +
                        "&#160 if(number1 == number2) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Result: %d = %d\"</font>,number1,number2);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>//checks if number1 is greater than number2.</font><br/>" +
                        "&#160 else if (number1 > number2) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Result: %d > %d\"</font>, number1, number2);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>//checks if both test expressions are false</font><br/>" +
                        "&#160 else {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Result: %d < %d\"</font>,number1, number2);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter two integers: 12<br/>" +
                        "23<br/>" +
                        "Result: 12 < 23<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int number1, number2;\n" +
                        "    printf(\"Enter two integers: \");\n" +
                        "    scanf(\"%d %d\", &number1, &number2);\n" +
                        "\n" +
                        "    //checks if the two integers are equal.\n" +
                        "    if(number1 == number2) {\n" +
                        "        printf(\"Result: %d = %d\",number1,number2);\n" +
                        "    }\n" +
                        "\n" +
                        "    //checks if number1 is greater than number2.\n" +
                        "    else if (number1 > number2) {\n" +
                        "        printf(\"Result: %d > %d\", number1, number2);\n" +
                        "    }\n" +
                        "\n" +
                        "    //checks if both test expressions are false\n" +
                        "    else {\n" +
                        "        printf(\"Result: %d < %d\",number1, number2);\n" +
                        "    }\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter two integers: 12\n" +
                        "23\n" +
                        "Result: 12 < 23\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 79:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int bill_amt;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter Bill Amount : \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &bill_amt);<br/>" +
                        "<br/>" +
                        "&#160 if(bill_amt >= 5000) {<br/>" +
                        "&#160 &#160 bill_amt = bill_amt-500;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 else if (bill_amt >= 4000 && bill_amt <= 4999) {<br/>" +
                        "&#160 &#160 bill_amt = bill_amt-400;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 else if (bill_amt >= 3000 && bill_amt <= 3999){<br/>" +
                        "&#160 &#160 bill_amt = bill_amt-300;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else{<br/>" +
                        "&#160 &#160 bill_amt = bill_amt-100;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Final Bill Amount after Discount is %d\\n\"</font>,bill_amt);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "(1st Run)<br/>" +
                        "Enter Bill Amount : 500<br/>" +
                        "Final Bill Amount after Discount is 400<br/>" +
                        "<br/>" +
                        "(2st Run)<br/>" +
                        "Enter Bill Amount : 4000<br/>" +
                        "Final Bill Amount after Discount is 3600<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int bill_amt;\n" +
                        "    printf(\"Enter Bill Amount : \");\n" +
                        "    scanf(\"%d\", &bill_amt);\n" +
                        "\n" +
                        "    if(bill_amt >= 5000) {\n" +
                        "        bill_amt = bill_amt-500;\n" +
                        "    }\n" +
                        "\n" +
                        "    else if (bill_amt >= 4000 && bill_amt <= 4999) {\n" +
                        "        bill_amt = bill_amt-400;\n" +
                        "    }\n" +
                        "\n" +
                        "    else if (bill_amt >= 3000 && bill_amt <= 3999){\n" +
                        "        bill_amt = bill_amt-300;\n" +
                        "    }\n" +
                        "\telse{\n" +
                        "\t\tbill_amt = bill_amt-100;\n" +
                        "\t}\n" +
                        "\t\n" +
                        "\tprintf(\"Final Bill Amount after Discount is %d\\n\",bill_amt);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "(1st Run)\n" +
                        "Enter Bill Amount : 500\n" +
                        "Final Bill Amount after Discount is 400\n" +
                        "\n" +
                        "(2st Run)\n" +
                        "Enter Bill Amount : 4000\n" +
                        "Final Bill Amount after Discount is 3600\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 80:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 char operator;<br/>" +
                        "&#160 double n1, n2;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an operator (+, -, *, /): \"</font>);<br/>" +
                        "&#160 scanf(\"%c\", &operator);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter two operands: \"</font>);<br/>" +
                        "&#160 scanf(\"%lf %lf\",&n1, &n2);<br/>" +
                        "<br/>" +
                        "&#160 switch(operator)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 case '+':<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%.1lf + %.1lf = %.1lf\"</font>,n1, n2, n1+n2);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "<br/>" +
                        "&#160 &#160 case '-':<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%.1lf - %.1lf = %.1lf\"</font>,n1, n2, n1-n2);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "<br/>" +
                        "&#160 &#160 case '*':<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%.1lf * %.1lf = %.1lf\"</font>,n1, n2, n1*n2);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "<br/>" +
                        "&#160 &#160 case '/':<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"%.1lf / %.1lf = %.1lf\"</font>,n1, n2, n1/n2);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "<br/>" +
                        "&#160 // operator doesn't match any case constant +, -, *, /<br/>" +
                        "&#160 &#160 default:<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"Error! operator is not correct\"</font>);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter an operator (+, -, *,): -<br/>" +
                        "Enter two operands: 32.5<br/>" +
                        "12.4<br/>" +
                        "32.5 - 12.4 = 20.1<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "    char operator;\n" +
                        "    double n1, n2;\n" +
                        "\n" +
                        "    printf(\"Enter an operator (+, -, *, /): \");\n" +
                        "    scanf(\"%c\", &operator);\n" +
                        "    printf(\"Enter two operands: \");\n" +
                        "    scanf(\"%lf %lf\",&n1, &n2);\n" +
                        "\n" +
                        "    switch(operator)\n" +
                        "    {\n" +
                        "        case '+':\n" +
                        "            printf(\"%.1lf + %.1lf = %.1lf\",n1, n2, n1+n2);\n" +
                        "            break;\n" +
                        "\n" +
                        "        case '-':\n" +
                        "            printf(\"%.1lf - %.1lf = %.1lf\",n1, n2, n1-n2);\n" +
                        "            break;\n" +
                        "\n" +
                        "        case '*':\n" +
                        "            printf(\"%.1lf * %.1lf = %.1lf\",n1, n2, n1*n2);\n" +
                        "            break;\n" +
                        "\n" +
                        "        case '/':\n" +
                        "            printf(\"%.1lf / %.1lf = %.1lf\",n1, n2, n1/n2);\n" +
                        "            break;\n" +
                        "\n" +
                        "        // operator doesn't match any case constant +, -, *, /\n" +
                        "        default:\n" +
                        "            printf(\"Error! operator is not correct\");\n" +
                        "    }\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter an operator (+, -, *,): -\n" +
                        "Enter two operands: 32.5\n" +
                        "12.4\n" +
                        "32.5 - 12.4 = 20.1\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 81:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num = 8;<br/>" +
                        "&#160 switch (num) {<br/>" +
                        "&#160 &#160 case 7:<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"Value is 7\"</font>);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 case 8:<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"Value is 8\"</font>);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 case 9:<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"Value is 9\"</font>);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 default:<br/>" +
                        "&#160 &#160 &#160 printf(<font color=#EC1A70>\"Out of range\"</font>);<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Value is 8<br/>" +
                        "<br/>" +
                        "*/<br/>";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int num = 8;\n" +
                        "    switch (num) {\n" +
                        "        case 7:\n" +
                        "            printf(\"Value is 7\");\n" +
                        "            break;\n" +
                        "        case 8:\n" +
                        "            printf(\"Value is 8\");\n" +
                        "            break;\n" +
                        "        case 9:\n" +
                        "            printf(\"Value is 9\");\n" +
                        "            break;\n" +
                        "        default:\n" +
                        "            printf(\"Out of range\");\n" +
                        "            break;\n" +
                        "    }\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Value is 8\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 82:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "<br/>" +
                        "&#160 const int maxInput = 100;<br/>" +
                        "&#160 int i;<br/>" +
                        "&#160 double number, average, sum = 0.0;<br/>" +
                        "<br/>" +
                        "&#160 for (i = 1; i <= maxInput; ++i) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d. Enter a number: \"</font>, i);<br/>" +
                        "&#160 scanf(\"%lf\", &number);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// go to jump if the user enters a negative number</font><br/>" +
                        "&#160 if (number < 0.0) {<br/>" +
                        "&#160 &#160 goto jump;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 sum += number;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "jump:<br/>" +
                        "&#160 average = sum / (i - 1);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Sum = %.2f\\n\"</font>, sum);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Average = %.2f\"</font>, average);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "1. Enter a number: 3<br/>" +
                        "2. Enter a number: 4.3<br/>" +
                        "3. Enter a number: 9.3<br/>" +
                        "4. Enter a number: -2.9<br/>" +
                        "Sum = 16.60<br/>" +
                        "Average = 5.53<br/>" +
                        "<br/>" +
                        "*/<br/>";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "\n" +
                        "   const int maxInput = 100;\n" +
                        "   int i;\n" +
                        "   double number, average, sum = 0.0;\n" +
                        "\n" +
                        "   for (i = 1; i <= maxInput; ++i) {\n" +
                        "      printf(\"%d. Enter a number: \", i);\n" +
                        "      scanf(\"%lf\", &number);\n" +
                        "      \n" +
                        "      // go to jump if the user enters a negative number\n" +
                        "      if (number < 0.0) {\n" +
                        "         goto jump;\n" +
                        "      }\n" +
                        "      sum += number;\n" +
                        "   }\n" +
                        "\n" +
                        "jump:\n" +
                        "   average = sum / (i - 1);\n" +
                        "   printf(\"Sum = %.2f\\n\", sum);\n" +
                        "   printf(\"Average = %.2f\", average);\n" +
                        "\n" +
                        "   return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "1. Enter a number: 3\n" +
                        "2. Enter a number: 4.3\n" +
                        "3. Enter a number: 9.3\n" +
                        "4. Enter a number: -2.9\n" +
                        "Sum = 16.60\n" +
                        "Average = 5.53\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 83:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* local variable definition */</font><br/>" +
                        "&#160 int a = 10;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* do loop execution */</font><br/>" +
                        "&#160 LOOP:do {<br/>" +
                        "<br/>" +
                        "&#160 &#160 if( a == 15) {<br/>" +
                        "&#160 &#160 &#160 <font color=#3E3E3E>/* skip the iteration */</font><br/>" +
                        "&#160 &#160 &#160 a = a + 1;<br/>" +
                        "&#160 &#160 &#160 goto LOOP;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"value of a: %d\\n\"</font>, a);<br/>" +
                        "&#160 &#160 a++;<br/>" +
                        "<br/>" +
                        "&#160 }while( a < 20 );<br/>" +
                        " <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "value of a: 10<br/>" +
                        "value of a: 11<br/>" +
                        "value of a: 12<br/>" +
                        "value of a: 13<br/>" +
                        "value of a: 14<br/>" +
                        "value of a: 16<br/>" +
                        "value of a: 17<br/>" +
                        "value of a: 18<br/>" +
                        "value of a: 19<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        " \n" +
                        "int main () {\n" +
                        "\n" +
                        "   /* local variable definition */\n" +
                        "   int a = 10;\n" +
                        "\n" +
                        "   /* do loop execution */\n" +
                        "   LOOP:do {\n" +
                        "   \n" +
                        "      if( a == 15) {\n" +
                        "         /* skip the iteration */\n" +
                        "         a = a + 1;\n" +
                        "         goto LOOP;\n" +
                        "      }\n" +
                        "\t\t\n" +
                        "      printf(\"value of a: %d\\n\", a);\n" +
                        "      a++;\n" +
                        "\n" +
                        "   }while( a < 20 );\n" +
                        " \n" +
                        "   return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "value of a: 10\n" +
                        "value of a: 11\n" +
                        "value of a: 12\n" +
                        "value of a: 13\n" +
                        "value of a: 14\n" +
                        "value of a: 16\n" +
                        "value of a: 17\n" +
                        "value of a: 18\n" +
                        "value of a: 19\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 84:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>void</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int age;<br/>" +
                        "<br/>" +
                        "&#160 g: <font color=#3E3E3E>//label name</font><br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"you are Eligible\\n\"</font>);<br/>" +
                        "&#160 s: <font color=#3E3E3E>//label name</font><br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"you are not Eligible\"</font>);<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter you age:\"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &age);<br/>" +
                        "&#160 if(age>=18)<br/>" +
                        "&#160 &#160 goto g; //goto label g<br/>" +
                        "&#160 else<br/>" +
                        "&#160 &#160 goto s; //goto label s<br/>" +
                        "&#160 getch();<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter you age:18<br/>" +
                        "you are Eligible<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include<stdio.h>\n" +
                        "\n" +
                        "void main()\n" +
                        "{\n" +
                        "\tint age;\n" +
                        "\n" +
                        "\tg: //label name\n" +
                        "\t\tprintf(\"you are Eligible\\n\");\n" +
                        "\ts: //label name\n" +
                        "\t\tprintf(\"you are not Eligible\");\n" +
                        "\n" +
                        "\tprintf(\"Enter you age:\");\n" +
                        "\tscanf(\"%d\", &age);\n" +
                        "\tif(age>=18)\n" +
                        "        goto g; //goto label g\n" +
                        "\telse\n" +
                        "        goto s; //goto label s\n" +
                        "\tgetch();\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter you age:18\n" +
                        "you are Eligible\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 85:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int num,i=1;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the number whose table you want to print?\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&num);<br/>" +
                        "<br/>" +
                        "&#160 table:<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"%d x %d = %d\\n\"</font>,num,i,num*i);<br/>" +
                        "&#160 i++;<br/>" +
                        "<br/>" +
                        "&#160 if(i<=10)<br/>" +
                        "&#160 goto table; <br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the number whose table you want to print?10<br/>" +
                        "10 x 1 = 10<br/>" +
                        "10 x 2 = 20<br/>" +
                        "10 x 3 = 30<br/>" +
                        "10 x 4 = 40<br/>" +
                        "10 x 5 = 50<br/>" +
                        "10 x 6 = 60<br/>" +
                        "10 x 7 = 70<br/>" +
                        "10 x 8 = 80<br/>" +
                        "10 x 9 = 90<br/>" +
                        "10 x 10 = 100<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "int main()\n" +
                        "{\n" +
                        "\tint num,i=1;\n" +
                        "\tprintf(\"Enter the number whose table you want to print?\");\n" +
                        "\tscanf(\"%d\",&num);\n" +
                        "\n" +
                        "\ttable:\n" +
                        "\tprintf(\"%d x %d = %d\\n\",num,i,num*i); \n" +
                        "\ti++;\n" +
                        "\n" +
                        "\tif(i<=10)\n" +
                        "\tgoto table; \n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the number whose table you want to print?10\n" +
                        "10 x 1 = 10\n" +
                        "10 x 2 = 20\n" +
                        "10 x 3 = 30\n" +
                        "10 x 4 = 40\n" +
                        "10 x 5 = 50\n" +
                        "10 x 6 = 60\n" +
                        "10 x 7 = 70\n" +
                        "10 x 8 = 80\n" +
                        "10 x 9 = 90\n" +
                        "10 x 10 = 100\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 86:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int i;<br/>" +
                        "<br/>" +
                        "&#160 for (i = 1; i &#60 11; ++i)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d \"</font>, i);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "1 2 3 4 5 6 7 8 9 10<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "\tint i;\n" +
                        "\n" +
                        "\tfor (i = 1; i < 11; ++i)\n" +
                        "\t{\n" +
                        "\t\tprintf(\"%d \", i);\n" +
                        "\t}\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "1 2 3 4 5 6 7 8 9 10\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 87:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int i,n;<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter Number (upper limit) :\"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "<br/>" +
                        "&#160 for (i = 1; i &#60= n; ++i)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 if(i%n == 0)<br/>" +
                        "&#160 &#160 &#160 printf(\"%d \", i);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter Number (upper limit) :10<br/>" +
                        "2 4 6 8 10<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main() {\n" +
                        "\tint i,n;\n" +
                        "\t\n" +
                        "\tprintf(\"Enter Number (upper limit) :\");\n" +
                        "\tscanf(\"%d\",&n);\n" +
                        "\n" +
                        "\tfor (i = 1; i <= n; ++i)\n" +
                        "\t{\n" +
                        "\t\tif(i%n == 0)\n" +
                        "\t\t\tprintf(\"%d \", i);\n" +
                        "\t}\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter Number (upper limit) :10\n" +
                        "2 4 6 8 10\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 88:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int n, i;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an integer: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &n);<br/>" +
                        "&#160 for (i = 1; i &#60= 10; ++i) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d * %d = %d \\n\"</font>, n, i, n * i);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter an integer: 9<br/>" +
                        "9 * 1 = 9<br/>" +
                        "9 * 2 = 18<br/>" +
                        "9 * 3 = 27<br/>" +
                        "9 * 4 = 36<br/>" +
                        "9 * 5 = 45<br/>" +
                        "9 * 6 = 54<br/>" +
                        "9 * 7 = 63<br/>" +
                        "9 * 8 = 72<br/>" +
                        "9 * 9 = 81<br/>" +
                        "9 * 10 = 90<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int n, i;\n" +
                        "    printf(\"Enter an integer: \");\n" +
                        "    scanf(\"%d\", &n);\n" +
                        "    for (i = 1; i <= 10; ++i) {\n" +
                        "        printf(\"%d * %d = %d \\n\", n, i, n * i);\n" +
                        "    }\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter an integer: 9\n" +
                        "9 * 1 = 9\n" +
                        "9 * 2 = 18\n" +
                        "9 * 3 = 27\n" +
                        "9 * 4 = 36\n" +
                        "9 * 5 = 45\n" +
                        "9 * 6 = 54\n" +
                        "9 * 7 = 63\n" +
                        "9 * 8 = 72\n" +
                        "9 * 9 = 81\n" +
                        "9 * 10 = 90\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 89:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/><br/>" +
                        "&#160 <font color=#3E3E3E>/* local variable definition */</font><br/>" +
                        "&#160 int a = 10;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* while loop execution */</font><br/>" +
                        "&#160 while( a &#60 20 ) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"value of a: %d\\n\"</font>, a);<br/>" +
                        "&#160 a++;<br/>" +
                        "&#160 }<br/>" +
                        " <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "value of a: 10<br/>" +
                        "value of a: 11<br/>" +
                        "value of a: 12<br/>" +
                        "value of a: 13<br/>" +
                        "value of a: 14<br/>" +
                        "value of a: 15<br/>" +
                        "value of a: 16<br/>" +
                        "value of a: 17<br/>" +
                        "value of a: 18<br/>" +
                        "value of a: 19<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        " \n" +
                        "int main () {\n" +
                        "\n" +
                        "   /* local variable definition */\n" +
                        "   int a = 10;\n" +
                        "\n" +
                        "   /* while loop execution */\n" +
                        "   while( a < 20 ) {\n" +
                        "      printf(\"value of a: %d\\n\", a);\n" +
                        "      a++;\n" +
                        "   }\n" +
                        " \n" +
                        "   return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "value of a: 10\n" +
                        "value of a: 11\n" +
                        "value of a: 12\n" +
                        "value of a: 13\n" +
                        "value of a: 14\n" +
                        "value of a: 15\n" +
                        "value of a: 16\n" +
                        "value of a: 17\n" +
                        "value of a: 18\n" +
                        "value of a: 19\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 90:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{ <br/>" +
                        "&#160 int number=1;<br/>" +
                        "&#160 int n;<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the value of N: \")</font>;<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "&#160 <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Numbers from 1 to %d: \\n\"</font>,n);<br/>" +
                        "&#160 <br/>" +
                        "&#160 while(number <= n)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d \"</font>,number);<br/>" +
                        "&#160 &#160 number++;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 <br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the value of N: 5<br/>" +
                        "Numbers from 1 to 5:<br/>" +
                        "1 2 3 4 5<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{ \n" +
                        "\tint number=1;\n" +
                        "\tint n;\n" +
                        "\t\n" +
                        "\tprintf(\"Enter the value of N: \");\n" +
                        "\tscanf(\"%d\",&n);\n" +
                        "\t\n" +
                        "\tprintf(\"Numbers from 1 to %d: \\n\",n);\n" +
                        "\t\n" +
                        "\twhile(number <= n)\n" +
                        "\t{\n" +
                        "\t\tprintf(\"%d \",number);\n" +
                        "\t\tnumber++;\n" +
                        "\t}\n" +
                        "\t\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the value of N: 5\n" +
                        "Numbers from 1 to 5:\n" +
                        "1 2 3 4 5\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 91:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{  <br/>" +
                        "&#160 int N, count = 1, sum = 0;<br/><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the limit\\n\"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &N);  <br/><br/>" +
                        "&#160 while(count <= N)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 sum = sum + (count * count);<br/>" +
                        "&#160 &#160 count++;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Sum of squares of numbers from 1 to %d is %d.\\n\"</font>, N, sum);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the limit<br/>" +
                        "5<br/>" +
                        "Sum of squares of numbers from 1 to 5 is 55<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h >\n" +
                        "\n" +
                        "int main()\n" +
                        "{  \n" +
                        "    int N, count = 1, sum = 0;\n" +
                        "\t\n" +
                        "    printf(\"Enter the limit\\n\");\n" +
                        "    scanf(\"%d\", &N);  \n" +
                        "\n" +
                        "    while(count <= N)\n" +
                        "    {\n" +
                        "\t\tsum = sum + (count * count);\n" +
                        "\t\tcount++;\n" +
                        "    }\n" +
                        "    printf(\"Sum of squares of numbers from 1 to %d is %d.\\n\", N, sum);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the limit\n" +
                        "5\n" +
                        "Sum of squares of numbers from 1 to 5 is 55\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 92:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "<br/>" +
                        "&#160 int a = 10;<br/>" +
                        "<br/>" +
                        "&#160 do {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"value of a: %d\\n\"</font>, a);<br/>" +
                        "&#160 &#160 a = a + 1;<br/>" +
                        "&#160 }while( a < 20 );<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "value of a: 10<br/>" +
                        "value of a: 11<br/>" +
                        "value of a: 12<br/>" +
                        "value of a: 13<br/>" +
                        "value of a: 14<br/>" +
                        "value of a: 15<br/>" +
                        "value of a: 16<br/>" +
                        "value of a: 17<br/>" +
                        "value of a: 18<br/>" +
                        "value of a: 19<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main () {\n" +
                        "\n" +
                        "\tint a = 10;\n" +
                        "\n" +
                        "\tdo {\n" +
                        "\t\tprintf(\"value of a: %d\\n\", a);\n" +
                        "\t\ta = a + 1;\n" +
                        "\t}while( a < 20 );\n" +
                        "\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "value of a: 10\n" +
                        "value of a: 11\n" +
                        "value of a: 12\n" +
                        "value of a: 13\n" +
                        "value of a: 14\n" +
                        "value of a: 15\n" +
                        "value of a: 16\n" +
                        "value of a: 17\n" +
                        "value of a: 18\n" +
                        "value of a: 19\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 93:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int I;<br/>" +
                        "&#160 do<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Enter Number (0 to exit) :\"</font>);<br/>" +
                        "&#160 &#160 scanf(\"%d\",&I);<br/>" +
                        "&#160 &#160 switch(I)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 case 1:<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"67\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 2:<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"45\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 default:<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"default\"</font>);<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 }while(I>0);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter Number (0 to exit) :2<br/>" +
                        "45<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include<stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int I;\n" +
                        "    do\n" +
                        "    {\n" +
                        "\t\tprintf(\"Enter Number (0 to exit) :\");\n" +
                        "\t\tscanf(\"%d\",&I);\n" +
                        "\t\tswitch(I)\n" +
                        "\t\t{\n" +
                        "\t\t\tcase 1:\n" +
                        "\t\t\t\tprintf(\"67\");\n" +
                        "\t\t\t\tbreak;\n" +
                        "\t\t\tcase 2:\n" +
                        "\t\t\t\tprintf(\"45\");\n" +
                        "\t\t\t\tbreak;\n" +
                        "\t\t\tdefault:\n" +
                        "\t\t\t\tprintf(\"default\");\n" +
                        "      }\n" +
                        "    }\n" +
                        "    while(I>0);\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter Number (0 to exit) :2\n" +
                        "45\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 94:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int a,sum = 0;<br/>" +
                        "&#160 for (a = 0; a &#60 10; a++)<br/>" +
                        "&#160 {<br/>" +
                        "<br/>" +
                        "&#160 &#160 if ( a % 2 == 0 )<br/>" +
                        "&#160 &#160 &#160 continue;<br/>" +
                        "&#160 &#160 if ( a == 5 )<br/>" +
                        "&#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 sum = sum + a;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"sum = %d\"</font>,sum);<br/>" +
                        "&#160 return 0;<br/>" +
                        " <br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "sum = 4<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "int main ()\n" +
                        "{\n" +
                        "\tint a,sum = 0;\n" +
                        "\tfor (a = 0; a < 10; a++)\n" +
                        "\t{\n" +
                        "\n" +
                        "\t\tif ( a % 2 == 0 )\n" +
                        "\t\t\tcontinue;\n" +
                        "\t\tif ( a == 5 )\n" +
                        "\t\t\tbreak;\n" +
                        "\t\tsum = sum + a;\n" +
                        "\t}\n" +
                        "\n" +
                        "\tprintf(\"sum = %d\",sum);\n" +
                        "\treturn 0;\n" +
                        " \n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "sum = 4\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 95:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main( int argc, char *argv[] )</font><br/>" +
                        "{<br/>" +
                        "&#160 if( argc == 2 ) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"The argument supplied is %s\\n\"</font>, argv[1]);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else if( argc > 2 ) {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"Too many arguments supplied.\\n\"</font>);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 else {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"One argument expected.\\n\"</font>);<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "$./a.out testing<br/>" +
                        "The argument supplied is testing<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main( int argc, char *argv[] )\n" +
                        "{\n" +
                        "   if( argc == 2 ) {\n" +
                        "      printf(\"The argument supplied is %s\\n\", argv[1]);\n" +
                        "   }\n" +
                        "   else if( argc > 2 ) {\n" +
                        "      printf(\"Too many arguments supplied.\\n\");\n" +
                        "   }\n" +
                        "   else {\n" +
                        "      printf(\"One argument expected.\\n\");\n" +
                        "   }\n" +
                        "  \n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "$./a.out testing\n" +
                        "The argument supplied is testing\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 96:
                program_start = "#include&lt math.h&gt<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "int convert(long long n);<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 long long n;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a binary number: \"</font>);<br/>" +
                        "&#160 scanf(\"%lld\", &n);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"%lld in binary = %d in decimal\"</font>, n, convert(n));<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "int convert(long long n) {<br/>" +
                        "&#160 int dec = 0, i = 0, rem;<br/>" +
                        "&#160 while (n != 0) {<br/>" +
                        "&#160 &#160 rem = n % 10;<br/>" +
                        "&#160 &#160 n /= 10;<br/>" +
                        "&#160 &#160 dec += rem * pow(2, i);<br/>" +
                        "&#160 &#160 ++i;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return dec;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter a binary number: 110110111<br/>" +
                        "110110111 in binary = 439<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <math.h>\n" +
                        "#include <stdio.h>\n" +
                        "\n" +
                        "int convert(long long n);\n" +
                        "\n" +
                        "int main() {\n" +
                        "    long long n;\n" +
                        "    printf(\"Enter a binary number: \");\n" +
                        "    scanf(\"%lld\", &n);\n" +
                        "    printf(\"%lld in binary = %d in decimal\", n, convert(n));\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "int convert(long long n) {\n" +
                        "    int dec = 0, i = 0, rem;\n" +
                        "    while (n != 0) {\n" +
                        "        rem = n % 10;\n" +
                        "        n /= 10;\n" +
                        "        dec += rem * pow(2, i);\n" +
                        "        ++i;\n" +
                        "    }\n" +
                        "    return dec;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter a binary number: 110110111\n" +
                        "110110111 in binary = 439\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 97:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 long int binaryval, hexadecimalval = 0, i = 1, remainder;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the binary number: \"</font>);<br/>" +
                        "&#160 scanf(\"%ld\", &binaryval);<br/>" +
                        "&#160 while (binaryval != 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 remainder = binaryval % 10;<br/>" +
                        "&#160 &#160 hexadecimalval = hexadecimalval + remainder * i;<br/>" +
                        "&#160 &#160 i = i * 2;<br/>" +
                        "&#160 &#160 binaryval = binaryval / 10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Equivalent hexadecimal value: %lX\"</font>, hexadecimalval);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the binary number: 10000<br/>" +
                        "Equivalent hexadecimal value: 10<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "    long int binaryval, hexadecimalval = 0, i = 1, remainder;\n" +
                        " \n" +
                        "    printf(\"Enter the binary number: \");\n" +
                        "    scanf(\"%ld\", &binaryval);\n" +
                        "    while (binaryval != 0)\n" +
                        "    {\n" +
                        "        remainder = binaryval % 10;\n" +
                        "        hexadecimalval = hexadecimalval + remainder * i;\n" +
                        "        i = i * 2;\n" +
                        "        binaryval = binaryval / 10;\n" +
                        "    }\n" +
                        "    printf(\"Equivalent hexadecimal value: %lX\", hexadecimalval);\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the binary number: 10000\n" +
                        "Equivalent hexadecimal value: 10\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 98:
                program_start = "#include&lt math.h&gt<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "int convert(long long bin);<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 long long bin;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a binary number: \"</font>);<br/>" +
                        "&#160 scanf(\"%lld\", &bin);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"%lld in binary = %d in octal\"</font>, bin, convert(bin));<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "int convert(long long bin) {<br/>" +
                        "&#160 int oct=0, dec=0, i=0;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// converting binary to decimal</font><br/>" +
                        "&#160 while (bin != 0) {<br/>" +
                        "&#160 &#160 dec += (bin % 10) * pow(2, i);<br/>" +
                        "&#160 &#160 ++i;<br/>" +
                        "&#160 &#160 bin /= 10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 i = 1;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// converting to decimal to octal</font><br/>" +
                        "&#160 while (dec != 0) {<br/>" +
                        "&#160 &#160 oct += (dec % 8) * i;<br/>" +
                        "&#160 &#160 dec /= 8;<br/>" +
                        "&#160 &#160 i *= 10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return oct;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter a binary number: 101001<br/>" +
                        "101001 in binary = 51 in octal<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <math.h>\n" +
                        "#include <stdio.h>\n" +
                        "\n" +
                        "int convert(long long bin);\n" +
                        "\n" +
                        "int main() {\n" +
                        "    long long bin;\n" +
                        "    printf(\"Enter a binary number: \");\n" +
                        "    scanf(\"%lld\", &bin);\n" +
                        "    printf(\"%lld in binary = %d in octal\", bin, convert(bin));\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "int convert(long long bin) {\n" +
                        "    int oct = 0, dec = 0, i = 0;\n" +
                        "\n" +
                        "    // converting binary to decimal\n" +
                        "    while (bin != 0) {\n" +
                        "        dec += (bin % 10) * pow(2, i);\n" +
                        "        ++i;\n" +
                        "        bin /= 10;\n" +
                        "    }\n" +
                        "    i = 1;\n" +
                        "\n" +
                        "    // converting to decimal to octal\n" +
                        "    while (dec != 0) {\n" +
                        "        oct += (dec % 8) * i;\n" +
                        "        dec /= 8;\n" +
                        "        i *= 10;\n" +
                        "    }\n" +
                        "    return oct;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter a binary number: 101001\n" +
                        "101001 in binary = 51 in octal\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 99:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt stdlib.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int a[10],n,i;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the number to convert: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\",&n);<br/>" +
                        "<br/>" +
                        "&#160 for(i=0;n>0;i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 a[i]=n%2; <br/>" +
                        "&#160 &#160 n=n/2;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\nBinary of Given Number is=\"</font>);<br/>" +
                        "<br/>" +
                        "&#160 for(i=i-1; i &#62= 0; i--)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%d\"</font>,a[i]);<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the number to convert: 5<br/>" +
                        "Binary of Given Number is=101<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include<stdio.h>    \n" +
                        "#include<stdlib.h> \n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "\tint a[10],n,i;\n" +
                        "\tprintf(\"Enter the number to convert: \");   \n" +
                        "\tscanf(\"%d\",&n);\n" +
                        "\n" +
                        "\tfor(i=0;n>0;i++)\n" +
                        "\t{\n" +
                        "\t\ta[i]=n%2; \n" +
                        "\t\tn=n/2;\n" +
                        "\t}\n" +
                        "\n" +
                        "\tprintf(\"\\nBinary of Given Number is=\");\n" +
                        "\n" +
                        "\tfor(i=i-1;i>=0;i--)\n" +
                        "\t{\n" +
                        "\t\tprintf(\"%d\",a[i]);  \n" +
                        "\t}\n" +
                        "\treturn 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the number to convert: 5\n" +
                        "Binary of Given Number is=101\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 100:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 long decimalnum, quotient, remainder;<br/>" +
                        "&#160 int i, j = 0;<br/>" +
                        "&#160 char hexadecimalnum[100];<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter decimal number: \"</font>);<br/>" +
                        "&#160 scanf(\"%ld\", &decimalnum);<br/>" +
                        " <br/>" +
                        "&#160 quotient = decimalnum;<br/>" +
                        " <br/>" +
                        "&#160 while (quotient != 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 remainder = quotient % 16;<br/>" +
                        "&#160 &#160 if (remainder &#60 10)<br/>" +
                        "&#160 &#160 &#160 hexadecimalnum[j++] = 48 + remainder;<br/>" +
                        "&#160 &#160 else<br/>" +
                        "&#160 &#160 &#160 hexadecimalnum[j++] = 55 + remainder;<br/>" +
                        "&#160 &#160 quotient = quotient / 16;<br/>" +
                        "&#160 }<br/>" +
                        " <br/>" +
                        "&#160 <font color=#3E3E3E>// display integer into character</font><br/>" +
                        "&#160 for (i = j; i &#62= 0; i--)<br/>" +
                        "&#160 &#160 printf(<font color=#EC1A70>\"%c\"</font>, hexadecimalnum[i]);<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter decimal number: 12<br/>" +
                        "Equivalent hexadecimal value of 12 : C<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "    long decimalnum, quotient, remainder;\n" +
                        "    int i, j = 0;\n" +
                        "    char hexadecimalnum[100];\n" +
                        " \n" +
                        "    printf(\"Enter decimal number: \");\n" +
                        "    scanf(\"%ld\", &decimalnum);\n" +
                        " \n" +
                        "    quotient = decimalnum;\n" +
                        " \n" +
                        "    while (quotient != 0)\n" +
                        "    {\n" +
                        "        remainder = quotient % 16;\n" +
                        "        if (remainder < 10)\n" +
                        "            hexadecimalnum[j++] = 48 + remainder;\n" +
                        "        else\n" +
                        "            hexadecimalnum[j++] = 55 + remainder;\n" +
                        "        quotient = quotient / 16;\n" +
                        "    }\n" +
                        " \n" +
                        "    // display integer into character\n" +
                        "    for (i = j; i >= 0; i--)\n" +
                        "            printf(\"%c\", hexadecimalnum[i]);\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter decimal number: 12\n" +
                        "Equivalent hexadecimal value of 12 : C\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 101:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> decimalToOctal</font>(int decimalnum)<br/>" +
                        "{<br/>" +
                        "&#160 int octalnum = 0, temp = 1;<br/>" +
                        "<br/>" +
                        "&#160 while (decimalnum != 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 octalnum = octalnum + (decimalnum % 8) * temp;<br/>" +
                        "&#160 &#160 decimalnum = decimalnum / 8;<br/>" +
                        "&#160 &#160 temp = temp * 10;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 return octalnum;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int decimalnum;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter a Decimal Number: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &decimalnum);<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Equivalent Octal Number: %d\"</font>, decimalToOctal(decimalnum));<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Enter a Decimal Number: 436<br/>" +
                        "Equivalent Octal Number: 664<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "#include <math.h>\n" +
                        "\n" +
                        "int decimalToOctal(int decimalnum)\n" +
                        "{\n" +
                        "    int octalnum = 0, temp = 1;\n" +
                        "\n" +
                        "    while (decimalnum != 0)\n" +
                        "    {\n" +
                        "    \toctalnum = octalnum + (decimalnum % 8) * temp;\n" +
                        "    \tdecimalnum = decimalnum / 8;\n" +
                        "        temp = temp * 10;\n" +
                        "    }\n" +
                        "\n" +
                        "    return octalnum;\n" +
                        "}\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int decimalnum;\n" +
                        "\n" +
                        "    printf(\"Enter a Decimal Number: \");\n" +
                        "    scanf(\"%d\", &decimalnum);\n" +
                        "\n" +
                        "    printf(\"Equivalent Octal Number: %d\", decimalToOctal(decimalnum));\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Enter a Decimal Number: 436\n" +
                        "Equivalent Octal Number: 664\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 102:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#define MAX 1000<br/>" +
                        " <br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 char binarynum[MAX], hexa[MAX];<br/>" +
                        "&#160 long int i = 0;<br/>" +
                        " <br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter the value for hexadecimal \"</font>);<br/>" +
                        "&#160 scanf(\"%s\", hexa);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"\\n Equivalent binary value: \"</font>);<br/>" +
                        "&#160 while (hexa[i])<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 switch (hexa[i])<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 case '0':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"0000\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '1':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"0001\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '2':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"0010\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '3':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"0011\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '4':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"0100\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '5':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"0101\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '6':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"0110\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '7':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"0111\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '8':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1000\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case '9':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1001\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'A':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1010\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'B':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1011\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'C':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1100\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'D':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1101\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'E':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1110\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'F':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1111\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'a':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1010\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'b':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1011\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'c':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1100\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'd':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1101\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'e':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1110\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 case 'f':<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"1111\"</font>); break;<br/>" +
                        "&#160 &#160 &#160 default:<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"\\n Invalid hexa digit %c \"</font>, hexa[i]);<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 i++;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter the value for hexadecimal ab<br/>" +
                        "Equivalent binary value: 10101011<br/>" +
                        "<br/>" +
                        "*/";
                program = "#include <stdio.h>\n" +
                        "#define MAX 1000\n" +
                        " \n" +
                        "int main()\n" +
                        "{\n" +
                        "    char binarynum[MAX], hexa[MAX];\n" +
                        "    long int i = 0;\n" +
                        " \n" +
                        "    printf(\"Enter the value for hexadecimal \");\n" +
                        "    scanf(\"%s\", hexa);\n" +
                        "    printf(\"\\n Equivalent binary value: \");\n" +
                        "    while (hexa[i])\n" +
                        "    {\n" +
                        "        switch (hexa[i])\n" +
                        "        {\n" +
                        "        case '0':\n" +
                        "            printf(\"0000\"); break;\n" +
                        "        case '1':\n" +
                        "            printf(\"0001\"); break;\n" +
                        "        case '2':\n" +
                        "            printf(\"0010\"); break;\n" +
                        "        case '3':\n" +
                        "            printf(\"0011\"); break;\n" +
                        "        case '4':\n" +
                        "            printf(\"0100\"); break;\n" +
                        "        case '5':\n" +
                        "            printf(\"0101\"); break;\n" +
                        "        case '6':\n" +
                        "            printf(\"0110\"); break;\n" +
                        "        case '7':\n" +
                        "            printf(\"0111\"); break;\n" +
                        "        case '8':\n" +
                        "            printf(\"1000\"); break;\n" +
                        "        case '9':\n" +
                        "            printf(\"1001\"); break;\n" +
                        "        case 'A':\n" +
                        "            printf(\"1010\"); break;\n" +
                        "        case 'B':\n" +
                        "            printf(\"1011\"); break;\n" +
                        "        case 'C':\n" +
                        "            printf(\"1100\"); break;\n" +
                        "        case 'D':\n" +
                        "            printf(\"1101\"); break;\n" +
                        "        case 'E':\n" +
                        "            printf(\"1110\"); break;\n" +
                        "        case 'F':\n" +
                        "            printf(\"1111\"); break;\n" +
                        "        case 'a':\n" +
                        "            printf(\"1010\"); break;\n" +
                        "        case 'b':\n" +
                        "            printf(\"1011\"); break;\n" +
                        "        case 'c':\n" +
                        "            printf(\"1100\"); break;\n" +
                        "        case 'd':\n" +
                        "            printf(\"1101\"); break;\n" +
                        "        case 'e':\n" +
                        "            printf(\"1110\"); break;\n" +
                        "        case 'f':\n" +
                        "            printf(\"1111\"); break;\n" +
                        "        default:\n" +
                        "            printf(\"\\n Invalid hexa digit %c \", hexa[i]);\n" +
                        "            return 0;\n" +
                        "        }\n" +
                        "        i++;\n" +
                        "    }\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter the value for hexadecimal ab\n" +
                        "Equivalent binary value: 10101011\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 103:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "#include&lt string.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 char hex[17];<br/>" +
                        "&#160 long long decimal, place;<br/>" +
                        "&#160 int i = 0, val, len;<br/>" +
                        "<br/>" +
                        "&#160 decimal = 0;<br/>" +
                        "&#160 place = 1;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Input hexadecimal number from user */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter any hexadecimal number: \"</font>);<br/>" +
                        "&#160 gets(hex);<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Find the length of total number of hex digit */</font><br/>" +
                        "&#160 len = strlen(hex);<br/>" +
                        "&#160 len--;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/*<br/>" +
                        "&#160 Iterate over each hex digit<br/>" +
                        "&#160 */</font><br/>" +
                        "&#160 for(i=0; hex[i]!='\\0'; i++)<br/>" +
                        "&#160 {<br/>" +
                        " <br/>" +
                        "&#160 &#160 if(hex[i]>='0' && hex[i]<='9')<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 val = hex[i] - 48;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 else if(hex[i]>='a' && hex[i]<='f')<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 val = hex[i] - 97 + 10;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "&#160 &#160 else if(hex[i]>='A' && hex[i]<='F')<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 val = hex[i] - 65 + 10;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "<br/>" +
                        "&#160 &#160 decimal += val * pow(16, len);<br/>" +
                        "&#160 &#160 len--;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Hexadecimal number = %s\\n\"</font>, hex);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Decimal number = %lld\"</font>, decimal);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter any hexadecimal number: 1a<br/>" +
                        "Hexadecimal number = 1a<br/>" +
                        "Decimal number = 26<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "#include <math.h>\n" +
                        "#include <string.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    char hex[17];\n" +
                        "    long long decimal, place;\n" +
                        "    int i = 0, val, len;\n" +
                        "\n" +
                        "    decimal = 0;\n" +
                        "    place = 1;\n" +
                        "\n" +
                        "    /* Input hexadecimal number from user */\n" +
                        "    printf(\"Enter any hexadecimal number: \");\n" +
                        "    gets(hex);\n" +
                        "\n" +
                        "    /* Find the length of total number of hex digit */\n" +
                        "    len = strlen(hex);\n" +
                        "    len--;\n" +
                        "\n" +
                        "    /*\n" +
                        "     * Iterate over each hex digit\n" +
                        "     */\n" +
                        "    for(i=0; hex[i]!='\\0'; i++)\n" +
                        "    {\n" +
                        " \n" +
                        "        if(hex[i]>='0' && hex[i]<='9')\n" +
                        "        {\n" +
                        "            val = hex[i] - 48;\n" +
                        "        }\n" +
                        "        else if(hex[i]>='a' && hex[i]<='f')\n" +
                        "        {\n" +
                        "            val = hex[i] - 97 + 10;\n" +
                        "        }\n" +
                        "        else if(hex[i]>='A' && hex[i]<='F')\n" +
                        "        {\n" +
                        "            val = hex[i] - 65 + 10;\n" +
                        "        }\n" +
                        "\n" +
                        "        decimal += val * pow(16, len);\n" +
                        "        len--;\n" +
                        "    }\n" +
                        "\n" +
                        "    printf(\"Hexadecimal number = %s\\n\", hex);\n" +
                        "    printf(\"Decimal number = %lld\", decimal);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter any hexadecimal number: 1a\n" +
                        "Hexadecimal number = 1a\n" +
                        "Decimal number = 26\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 104:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 char hex[17];<br/>" +
                        "&#160 long long octal, bin, place;<br/>" +
                        "&#160 int i = 0, rem, val;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Input hexadecimal number from user */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter any hexadecimal number: \"</font>);<br/>" +
                        "&#160 gets(hex);<br/>" +
                        "<br/>" +
                        "&#160 octal = 0ll;<br/>" +
                        "&#160 bin = 0ll;<br/>" +
                        "&#160 place = 0ll;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Hexadecimal to binary conversion */</font><br/>" +
                        "&#160 for(i=0; hex[i]!='\\0'; i++)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 bin = bin * place;<br/>" +
                        "<br/>" +
                        "&#160 &#160 switch(hex[i])<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 case '0':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 0;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '1':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '2':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 10;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '3':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 11;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '4':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 100;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '5':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 101;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '6':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 110;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '7':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 111;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '8':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1000;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case '9':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1001;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 'a':<br/>" +
                        "&#160 &#160 &#160 case 'A':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1010;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 'b':<br/>" +
                        "&#160 &#160 &#160 case 'B':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1011;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 'c':<br/>" +
                        "&#160 &#160 &#160 case 'C':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1100;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 'd':<br/>" +
                        "&#160 &#160 &#160 case 'D':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1101;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 'e':<br/>" +
                        "&#160 &#160 &#160 case 'E':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1110;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 'f':<br/>" +
                        "&#160 &#160 &#160 case 'F':<br/>" +
                        "&#160 &#160 &#160 &#160 bin += 1111;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 default:<br/>" +
                        "&#160 &#160 &#160 &#160 printf(<font color=#EC1A70>\"Invalid hexadecimal input.\"</font>);<br/>" +
                        "&#160 &#160 }<br/>" +
                        "<br/>" +
                        "&#160 &#160 place = 10000;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 place = 1;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Binary to octal conversion */</font><br/>" +
                        "&#160 while(bin > 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 rem = bin % 1000;<br/>" +
                        "<br/>" +
                        "&#160 &#160 switch(rem)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 case 0:<br/>" +
                        "&#160 &#160 &#160 &#160 val = 0;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1:<br/>" +
                        "&#160 &#160 &#160 &#160 val = 1;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 10:<br/>" +
                        "&#160 &#160 &#160 &#160 val = 2;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 11:<br/>" +
                        "&#160 &#160 &#160 &#160 val = 3;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 100:<br/>" +
                        "&#160 &#160 &#160 &#160 val = 4;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 101:<br/>" +
                        "&#160 &#160 &#160 &#160 val = 5;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 110:<br/>" +
                        "&#160 &#160 &#160 &#160 val = 6;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 111:<br/>" +
                        "&#160 &#160 &#160 &#160 val = 7;<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "<br/>" +
                        "&#160 &#160 octal = (val * place) + octal;<br/>" +
                        "&#160 &#160 bin = bin / 1000;<br/>" +
                        "<br/>" +
                        "&#160 &#160 place *= 10;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Hexadecimal number = %s\\n\"</font>, hex);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Octal number = %lld\"</font>, octal);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter any hexadecimal number: fff<br/>" +
                        "Hexadecimal number = fff<br/>" +
                        "Octal number = 7777<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    char hex[17];\n" +
                        "    long long octal, bin, place;\n" +
                        "    int i = 0, rem, val;\n" +
                        "\n" +
                        "    /* Input hexadecimal number from user */\n" +
                        "    printf(\"Enter any hexadecimal number: \");\n" +
                        "    gets(hex);\n" +
                        "\n" +
                        "    octal = 0ll;\n" +
                        "    bin = 0ll;\n" +
                        "    place = 0ll;\n" +
                        "\n" +
                        "    /* Hexadecimal to binary conversion */\n" +
                        "    for(i=0; hex[i]!='\\0'; i++)\n" +
                        "    {\n" +
                        "        bin = bin * place;\n" +
                        "\n" +
                        "        switch(hex[i])\n" +
                        "        {\n" +
                        "            case '0':\n" +
                        "                bin += 0;\n" +
                        "                break;\n" +
                        "            case '1':\n" +
                        "                bin += 1;\n" +
                        "                break;\n" +
                        "            case '2':\n" +
                        "                bin += 10;\n" +
                        "                break;\n" +
                        "            case '3':\n" +
                        "                bin += 11;\n" +
                        "                break;\n" +
                        "            case '4':\n" +
                        "                bin += 100;\n" +
                        "                break;\n" +
                        "            case '5':\n" +
                        "                bin += 101;\n" +
                        "                break;\n" +
                        "            case '6':\n" +
                        "                bin += 110;\n" +
                        "                break;\n" +
                        "            case '7':\n" +
                        "                bin += 111;\n" +
                        "                break;\n" +
                        "            case '8':\n" +
                        "                bin += 1000;\n" +
                        "                break;\n" +
                        "            case '9':\n" +
                        "                bin += 1001;\n" +
                        "                break;\n" +
                        "            case 'a':\n" +
                        "            case 'A':\n" +
                        "                bin += 1010;\n" +
                        "                break;\n" +
                        "            case 'b':\n" +
                        "            case 'B':\n" +
                        "                bin += 1011;\n" +
                        "                break;\n" +
                        "            case 'c':\n" +
                        "            case 'C':\n" +
                        "                bin += 1100;\n" +
                        "                break;\n" +
                        "            case 'd':\n" +
                        "            case 'D':\n" +
                        "                bin += 1101;\n" +
                        "                break;\n" +
                        "            case 'e':\n" +
                        "            case 'E':\n" +
                        "                bin += 1110;\n" +
                        "                break;\n" +
                        "            case 'f':\n" +
                        "            case 'F':\n" +
                        "                bin += 1111;\n" +
                        "                break;\n" +
                        "            default:\n" +
                        "                printf(\"Invalid hexadecimal input.\");\n" +
                        "        }\n" +
                        "\n" +
                        "        place = 10000;\n" +
                        "    }\n" +
                        "\n" +
                        "    place = 1;\n" +
                        "\n" +
                        "    /* Binary to octal conversion */\n" +
                        "    while(bin > 0)\n" +
                        "    {\n" +
                        "        rem = bin % 1000;\n" +
                        "\n" +
                        "        switch(rem)\n" +
                        "        {\n" +
                        "            case 0:\n" +
                        "                val = 0;\n" +
                        "                break;\n" +
                        "            case 1:\n" +
                        "                val = 1;\n" +
                        "                break;\n" +
                        "            case 10:\n" +
                        "                val = 2;\n" +
                        "                break;\n" +
                        "            case 11:\n" +
                        "                val = 3;\n" +
                        "                break;\n" +
                        "            case 100:\n" +
                        "                val = 4;\n" +
                        "                break;\n" +
                        "            case 101:\n" +
                        "                val = 5;\n" +
                        "                break;\n" +
                        "            case 110:\n" +
                        "                val = 6;\n" +
                        "                break;\n" +
                        "            case 111:\n" +
                        "                val = 7;\n" +
                        "                break;\n" +
                        "        }\n" +
                        "\n" +
                        "        octal = (val * place) + octal;\n" +
                        "        bin /= 1000;\n" +
                        "\n" +
                        "        place *= 10;\n" +
                        "    }\n" +
                        "\n" +
                        "    printf(\"Hexadecimal number = %s\\n\", hex);\n" +
                        "    printf(\"Octal number = %lld\", octal);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter any hexadecimal number: fff\n" +
                        "Hexadecimal number = fff\n" +
                        "Octal number = 7777\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 105:
                program_start = "#include&lt math.h&gt<br/>" +
                        "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "long long convert(int oct);<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int oct;<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an octal number: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &oct);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"%d in octal = %lld in binary\"</font>, oct, convert(oct));<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "long long convert(int oct) {<br/>" +
                        "&#160 int dec = 0, i = 0;<br/>" +
                        "&#160 long long bin = 0;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// converting octal to decimal</font><br/>" +
                        "&#160 while (oct != 0) {<br/>" +
                        "&#160 &#160 dec += (oct % 10) * pow(8, i);<br/>" +
                        "&#160 &#160 ++i;<br/>" +
                        "&#160 &#160 oct /= 10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 i = 1;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>// converting decimal to binary</font><br/>" +
                        "&#160 while (dec != 0) {<br/>" +
                        "&#160 &#160 bin += (dec % 2) * i;<br/>" +
                        "&#160 &#160 dec /= 2;<br/>" +
                        "&#160 &#160 i *= 10;<br/>" +
                        "&#160 }<br/>" +
                        "&#160 return bin;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter an octal number: 67<br/>" +
                        "67 in octal = 110111 in binary<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <math.h>\n" +
                        "#include <stdio.h>\n" +
                        "\n" +
                        "long long convert(int oct);\n" +
                        "\n" +
                        "int main() {\n" +
                        "    int oct;\n" +
                        "    printf(\"Enter an octal number: \");\n" +
                        "    scanf(\"%d\", &oct);\n" +
                        "    printf(\"%d in octal = %lld in binary\", oct, convert(oct));\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "long long convert(int oct) {\n" +
                        "    int dec = 0, i = 0;\n" +
                        "    long long bin = 0;\n" +
                        "\n" +
                        "    // converting octal to decimal\n" +
                        "    while (oct != 0) {\n" +
                        "        dec += (oct % 10) * pow(8, i);\n" +
                        "        ++i;\n" +
                        "        oct /= 10;\n" +
                        "    }\n" +
                        "    i = 1;\n" +
                        "\n" +
                        "   // converting decimal to binary\n" +
                        "    while (dec != 0) {\n" +
                        "        bin += (dec % 2) * i;\n" +
                        "        dec /= 2;\n" +
                        "        i *= 10;\n" +
                        "    }\n" +
                        "    return bin;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter an octal number: 67\n" +
                        "67 in octal = 110111 in binary\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 106:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "#include&lt math.h&gt<br/>" +
                        "<br/>" +
                        "long long convertOctalToDecimal(int octalNumber);<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int octalNumber;<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter an octal number: \"</font>);<br/>" +
                        "&#160 scanf(\"%d\", &octalNumber);<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"%d in octal = %lld in decimal\"</font>, octalNumber, convertOctalToDecimal(octalNumber));<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "long long convertOctalToDecimal(int octalNumber)<br/>" +
                        "{<br/>" +
                        "&#160 int decimalNumber = 0, i = 0;<br/>" +
                        "<br/>" +
                        "&#160 while(octalNumber != 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 decimalNumber += (octalNumber%10) * pow(8,i);<br/>" +
                        "&#160 &#160 ++i;<br/>" +
                        "&#160 &#160 octalNumber/=10;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 i = 1;<br/>" +
                        "<br/>" +
                        "&#160 return decimalNumber;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter an octal number: 116<br/>" +
                        "116 in octal = 78 in decimal<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "#include <math.h>\n" +
                        "\n" +
                        "long long convertOctalToDecimal(int octalNumber);\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int octalNumber;\n" +
                        "\n" +
                        "    printf(\"Enter an octal number: \");\n" +
                        "    scanf(\"%d\", &octalNumber);\n" +
                        "\n" +
                        "    printf(\"%d in octal = %lld in decimal\", octalNumber, convertOctalToDecimal(octalNumber));\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "long long convertOctalToDecimal(int octalNumber)\n" +
                        "{\n" +
                        "    int decimalNumber = 0, i = 0;\n" +
                        "\n" +
                        "    while(octalNumber != 0)\n" +
                        "    {\n" +
                        "        decimalNumber += (octalNumber%10) * pow(8,i);\n" +
                        "        ++i;\n" +
                        "        octalNumber/=10;\n" +
                        "    }\n" +
                        "\n" +
                        "    i = 1;\n" +
                        "\n" +
                        "    return decimalNumber;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter an octal number: 116\n" +
                        "116 in octal = 78 in decimal\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            case 107:
                program_start = "#include&lt stdio.h&gt<br/>" +
                        "<br/>" +
                        "<font color=#EC1A70>int</font><font color=#36D574> main()</font><br/>" +
                        "{<br/>" +
                        "&#160 int OCTALVALUES[] = {0, 1, 10, 11, 100, 101, 110, 111};<br/>" +
                        "<br/>" +
                        "&#160 long long octal, tempOctal, binary, place;<br/>" +
                        "&#160 char hex[65] = \"\";<br/>" +
                        "&#160 int rem;<br/>" +
                        "<br/>" +
                        "&#160 place = 1;<br/>" +
                        "&#160 binary = 0;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/* Input octal number from user */</font><br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Enter any octal number: \"</font>);<br/>" +
                        "&#160 scanf(\"%lld\", &octal);<br/>" +
                        "&#160 tempOctal = octal;<br/>" +
                        "<br/>" +
                        "&#160 <font color=#3E3E3E>/*<br/>" +
                        "&#160 Octal to binary conversion<br/>" +
                        "&#160 */</font><br/>" +
                        "&#160 while(tempOctal > 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 rem = tempOctal % 10;<br/>" +
                        "&#160 &#160 binary = (OCTALVALUES[rem] * place) + binary;<br/>" +
                        "&#160 &#160 tempOctal /= 10;<br/>" +
                        "<br/>" +
                        "&#160 &#160 place *= 1000;<br/>" +
                        "&#160 }<br/>"+
                        "<br/>" +
                        " &#160 <font color=#3E3E3E>/* <br/>" +
                        "&#160 Binary to hexadecimal conversion<br/>" +
                        "&#160 */</font><br/>" +
                        "&#160 while(binary > 0)<br/>" +
                        "&#160 {<br/>" +
                        "&#160 &#160 rem = binary % 10000;<br/>" +
                        "&#160 &#160 switch(rem)<br/>" +
                        "&#160 &#160 {<br/>" +
                        "&#160 &#160 &#160 case 0:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"0\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"1\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 10:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"2\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 11:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"3\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 100:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"4\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 101:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"5\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 110:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex,<font color=#EC1A70> \"6\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 111:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"7\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1000:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"8\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1001:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"9\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1010:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"A\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1011:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"B\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1100:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"C\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1101:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"D\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1110:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"E\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 &#160 case 1111:<br/>" +
                        "&#160 &#160 &#160 &#160 strcat(hex, <font color=#EC1A70>\"F\"</font>);<br/>" +
                        "&#160 &#160 &#160 &#160 break;<br/>" +
                        "&#160 &#160 }<br/>" +
                        "<br/>" +
                        "&#160 &#160 binary /= 10000;<br/>" +
                        "&#160 }<br/>" +
                        "<br/>" +
                        "&#160 strrev(hex);<br/>" +
                        "<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Octal number: %lld\\n\"</font>, octal);<br/>" +
                        "&#160 printf(<font color=#EC1A70>\"Hexadecimal number: %s\"</font>, hex);<br/>" +
                        "<br/>" +
                        "&#160 return 0;<br/>" +
                        "}<br/>" +
                        "<br/>" +
                        "<font color=#3E3E3E>/*<br/>" +
                        "<br/>" +
                        "Output :<br/>" +
                        "<br/>" +
                        "Enter any octal number: 125715<br/>" +
                        "Octal number: 125715<br/>" +
                        "Hexadecimal number: ABCD<br/>" +
                        "<br/>" +
                        "*/";

                program = "#include <stdio.h>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "    int OCTALVALUES[] = {0, 1, 10, 11, 100, 101, 110, 111};\n" +
                        "\n" +
                        "    long long octal, tempOctal, binary, place;\n" +
                        "    char hex[65] = \"\";\n" +
                        "    int rem;\n" +
                        "\n" +
                        "    place = 1;\n" +
                        "    binary = 0;\n" +
                        "    \n" +
                        "    /* Input octal number from user */\n" +
                        "    printf(\"Enter any octal number: \");\n" +
                        "    scanf(\"%lld\", &octal);\n" +
                        "    tempOctal = octal;\n" +
                        "\n" +
                        "    /*\n" +
                        "     * Octal to binary conversion\n" +
                        "     */\n" +
                        "    while(tempOctal > 0)\n" +
                        "    {\n" +
                        "        rem = tempOctal % 10;\n" +
                        "        binary = (OCTALVALUES[rem] * place) + binary;\n" +
                        "        tempOctal /= 10;\n" +
                        "\n" +
                        "        place *= 1000;\n" +
                        "    }\n" +
                        "    \n" +
                        "    /* \n" +
                        "     * Binary to hexadecimal conversion\n" +
                        "     */\n" +
                        "    while(binary > 0)\n" +
                        "    {\n" +
                        "        rem = binary % 10000;\n" +
                        "        switch(rem)\n" +
                        "        {\n" +
                        "            case 0:\n" +
                        "                strcat(hex, \"0\");\n" +
                        "                break;\n" +
                        "            case 1:\n" +
                        "                strcat(hex, \"1\");\n" +
                        "                break;\n" +
                        "            case 10:\n" +
                        "                strcat(hex, \"2\");\n" +
                        "                break;\n" +
                        "            case 11:\n" +
                        "                strcat(hex, \"3\");\n" +
                        "                break;\n" +
                        "            case 100:\n" +
                        "                strcat(hex, \"4\");\n" +
                        "                break;\n" +
                        "            case 101:\n" +
                        "                strcat(hex, \"5\");\n" +
                        "                break;\n" +
                        "            case 110:\n" +
                        "                strcat(hex, \"6\");\n" +
                        "                break;\n" +
                        "            case 111:\n" +
                        "                strcat(hex, \"7\");\n" +
                        "                break;\n" +
                        "            case 1000:\n" +
                        "                strcat(hex, \"8\");\n" +
                        "                break;\n" +
                        "            case 1001:\n" +
                        "                strcat(hex, \"9\");\n" +
                        "                break;\n" +
                        "            case 1010:\n" +
                        "                strcat(hex, \"A\");\n" +
                        "                break;\n" +
                        "            case 1011:\n" +
                        "                strcat(hex, \"B\");\n" +
                        "                break;\n" +
                        "            case 1100:\n" +
                        "                strcat(hex, \"C\");\n" +
                        "                break;\n" +
                        "            case 1101:\n" +
                        "                strcat(hex, \"D\");\n" +
                        "                break;\n" +
                        "            case 1110:\n" +
                        "                strcat(hex, \"E\");\n" +
                        "                break;\n" +
                        "            case 1111:\n" +
                        "                strcat(hex, \"F\");\n" +
                        "            break;\n" +
                        "        }\n" +
                        "\n" +
                        "        binary /= 10000;\n" +
                        "    }\n" +
                        "\n" +
                        "    strrev(hex);\n" +
                        "\n" +
                        "    printf(\"Octal number: %lld\\n\", octal);\n" +
                        "    printf(\"Hexadecimal number: %s\", hex);\n" +
                        "\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "\n" +
                        "/*\n" +
                        "\n" +
                        "Output :\n" +
                        "\n" +
                        "Enter any octal number: 125715\n" +
                        "Octal number: 125715\n" +
                        "Hexadecimal number: ABCD\n" +
                        "\n" +
                        "*/";
                setText();
                break;

            default:
                program_start = "Coming Soon";
                program = "Coming Soon";
                break;
        }
        setText();


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


    }

    public void setText(){
        prog.setText(Html.fromHtml(program_start));
    }

    public void setCountText(TextView text){
        String share = getResources().getString(R.string.share_text);
        share = share.concat(String.valueOf(sharedPreferences.getInt("share_count",0)));
        text.setText(share);
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
                Toast.makeText(ImplementOtherPrograms.this, "Rewarded Ad Loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRewardedAdFailedToLoad(LoadAdError adError) {
                // Ad failed to load.
                Toast.makeText(ImplementOtherPrograms.this, "Failed to Load Ad!! Check your connection.", Toast.LENGTH_SHORT).show();
            }
        };

        mRewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);

        if (mRewardedAd.isLoaded()) {
            Activity activityContext = ImplementOtherPrograms.this;
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
                    Toast.makeText(ImplementOtherPrograms.this, "Credits Added Successfully", Toast.LENGTH_SHORT).show();
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