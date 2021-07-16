package com.vkdevlops.cprogramfree.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.vkdevlops.cprogramfree.Other;
import com.vkdevlops.cprogramfree.Pattern;

public class PagerAdapter extends FragmentPagerAdapter {
    private int tabsnumber;
    public PagerAdapter(@NonNull FragmentManager fm, int behavior, int tabs) {
        super(fm, behavior);
        this.tabsnumber = tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Pattern();
            case 1:
                return new Other();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabsnumber;
    }
}
