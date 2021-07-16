package com.vkdevlops.cprogramfree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class StudyStuffPdf extends AppCompatActivity {

    PDFView pdfView;
    ImageButton back;
    Button ok;
    CardView pop;
    TextView title,pop_title,pop_desc;
    ImageButton info;
    Dialog dialog;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_stuff_pdf);
        dialog = new Dialog(this);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.pdf_pop);
        //loadAd();

        pop_title = dialog.findViewById(R.id.pdf_pop_title);
        pop_desc = dialog.findViewById(R.id.pdf_pop_desc);
        ok = dialog.findViewById(R.id.pdf_ok);
        title = findViewById(R.id.pdf_title);
        info = findViewById(R.id.pdf_info);
        pop = findViewById(R.id.pop_info);
        back = findViewById(R.id.pdf_back);
        pdfView = findViewById(R.id.pdf_viewer);
        pos = getIntent().getIntExtra("c_stuff",0);

        switch (pos){
            case 1:
                pop.setVisibility(View.VISIBLE);
                pdfView.fromAsset("Operator_precedence.pdf").load();
                pdfView.zoomTo((float) 2.6);
                pop_title.setText("Operator Precedence");
                pop_desc.setText("Operator Precedence describes the way in which the operations are evaluated. When we have several operations in an expression, each part is evaluated and resolved in a predetermined order described by the operator precedence.\nOperators having higher precedence are solved forst as compared to the lower precedence operators.\n\n" +
                        "For Example :\n\n7+2*4 //it gives 15\n\nThis is so because the multiplication operator (\"*\") has higher precedence over the addition operator (\"+\"), thus the expression 2 * 4 wil be solved first and the result of it (i.e. 8) becomes the right operand for addition and then the addition is performed as 7 + 8 which returns 15.\n\n" +
                        "10*4/2 // it gives 20\n\n(\"*\") and (\"/\") have some percedence and \"left to right\" associativity therefore 10*4 evaluated first, then its result (40) becomes second operand for (\"/\") and after that 40/2 is evaluated which gives 20\n");

                title.setText("Operator Precedence in C");
                break;

            case 2:
                pop.setVisibility(View.VISIBLE);
                pdfView.fromAsset("ascii.pdf").load();
                pdfView.zoomTo((float) 2.6);
                pop_title.setText("ASCII Code");
                pop_desc.setText("ASCII stands for American Standard Code for Information Interchange.\nAs we know, Computers can only understand numbers, an ASCII code is the numerical representation of a character or a symbol such as 'a' or '#'.\n" +
                        "There are 128 ASCII codes, with values from 0 to 127.\n7 bits are sufficient to represent a character in ASCII.\n\n" +
                        "Remember :\n\nASCII code of 'A' is 65, 'B' is 66 and so on.\nASCII code of 'a' is 97, 'b' is 98 and so on.\nASCII code of '0' is 48, '1' is 49 and so on.\n\n" +
                        "Difference between the ASCII value of 'A' and 'a' is 32.\n\n" +
                        "Try to Remember at least 3 to 4 values in mind so that you may deduce more of them.\n\n'A'-65\n'a'-67\n'0'-48\ngap between A and a is 32\n\n" +
                        "Note :\n\nThe '0' is not 0. Both are different.\n0 is an integer, whereas '0' is a character symbol whose numeral value is 48.\n\n");
                title.setText("ASCII Table");
                break;

            case 3:
                pop.setVisibility(View.VISIBLE);
                pdfView.fromAsset("Keyword.pdf").load();
                pdfView.zoomTo((float) 2.6);
                pop_title.setText("Keyword");
                pop_desc.setText("Keywords are the reserved words whose meaning are already known to the compiler. The Keywords are also called 'Reserved Words' and they cannot be used as an Identifier.\n");
                title.setText("List of C Keywords");
                break;

            case 4:
                pop.setVisibility(View.INVISIBLE);
                pdfView.fromAsset("CvsC++.pdf").load();
                //pdfView.zoomTo((float) 2.6);
                title.setText("Comparision of C with C++");
                break;

            case 5:
                pop.setVisibility(View.INVISIBLE);
                pdfView.fromAsset("CvsJava.pdf").load();
                //pdfView.zoomTo((float) 2.6);
                title.setText("Comparision of C with Java");
                break;

            case 6:
                pop.setVisibility(View.INVISIBLE);
                pdfView.fromAsset("CvsC#.pdf").load();
                title.setText("Comparision of C with C++");
                break;

            case 7:
                pop.setVisibility(View.INVISIBLE);
                pdfView.fromAsset("CvsPython.pdf").load();
                //pdfView.zoomTo((float) 2.6);
                title.setText("Comparision of C with Python");
                break;


        }

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
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