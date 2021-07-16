package com.vkdevlops.cprogramfree.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.vkdevlops.cprogramfree.QuestionsActivity;
import com.vkdevlops.cprogramfree.R;

import java.util.List;

public class SetsAdapter extends BaseAdapter {
    private List<String> sets;
    private String category;
    InterstitialAd interstitialAd;

    public SetsAdapter(List<String> sets, String category, InterstitialAd interstitialAd) {
        this.sets = sets;
        this.category = category;
        this.interstitialAd = interstitialAd;
    }

    @Override
    public int getCount() {
        return sets.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        View view;
        TextView textView;
        if (convertView==null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.set_item,parent,false);
        }else{
            view = convertView;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdClosed() {
                        super.onAdClosed();
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                        Intent intent = new Intent(parent.getContext(), QuestionsActivity.class);
                        intent.putExtra("category",category);
                        intent.putExtra("setId",sets.get(position));
                        parent.getContext().startActivity(intent);
                    }
                });

                if (interstitialAd.isLoaded()){
                    interstitialAd.show();
                    return;
                }
                Intent intent = new Intent(parent.getContext(), QuestionsActivity.class);
                intent.putExtra("category",category);
                intent.putExtra("setId",sets.get(position));
                parent.getContext().startActivity(intent);
            }
        });

        textView = view.findViewById(R.id.set_no);
        textView.setText(String.valueOf(position+1));
        return view;
    }
}
