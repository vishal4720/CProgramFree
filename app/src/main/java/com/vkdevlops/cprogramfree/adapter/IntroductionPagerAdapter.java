package com.vkdevlops.cprogramfree.adapter;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.vkdevlops.cprogramfree.R;
import com.vkdevlops.cprogramfree.ScreenItem;

import java.util.List;

public class IntroductionPagerAdapter extends PagerAdapter {

    Context context;
    List<ScreenItem> mListScreen;

    public IntroductionPagerAdapter(Context context, List<ScreenItem> mListScreen) {
        this.context = context;
        this.mListScreen = mListScreen;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View Layoutscreen = inflater.inflate(R.layout.layout_screen,null);

        ImageView imgSlide = Layoutscreen.findViewById(R.id.intro_img);
        TextView title = Layoutscreen.findViewById(R.id.intro_title);
        TextView description = Layoutscreen.findViewById(R.id.intro_description);

        title.setText(mListScreen.get(position).getTitle());
        description.setText(mListScreen.get(position).getDescription());
        imgSlide.setImageResource(mListScreen.get(position).getScreenImage());
        switch (position){
            case 0:
                Layoutscreen.setBackgroundColor(Color.rgb(233,30,99));
                title.setTextColor(Color.WHITE);
                description.setTextColor(Color.WHITE);
                break;
            case 1:
                Layoutscreen.setBackgroundColor(Color.rgb(33,150,243));
                title.setTextColor(Color.WHITE);
                description.setTextColor(Color.WHITE);
                break;
            case 2:
                Layoutscreen.setBackgroundColor(Color.rgb(255,193,7));
                title.setTextColor(Color.WHITE);
                description.setTextColor(Color.WHITE);
                break;
            case 3:
                Layoutscreen.setBackgroundColor(Color.rgb(14,247,255));
                title.setTextColor(Color.WHITE);
                description.setTextColor(Color.WHITE);
                break;
        }
        container.addView(Layoutscreen);

        return Layoutscreen;
    }

    @Override
    public int getCount() {
        return mListScreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
