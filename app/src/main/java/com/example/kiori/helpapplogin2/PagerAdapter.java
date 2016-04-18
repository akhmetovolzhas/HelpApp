package com.example.kiori.helpapplogin2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                com.example.kiori.helpapplogin2.Fragment1 tab1 = new com.example.kiori.helpapplogin2.Fragment1();
                return tab1;
            case 1:
                com.example.kiori.helpapplogin2.Fragment2 tab2 = new com.example.kiori.helpapplogin2.Fragment2();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}