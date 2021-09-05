package com.example.antentalcare;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SignupAdapter extends FragmentPagerAdapter {

    private Context context;
    int tabsNo;

    public SignupAdapter(FragmentManager fm, Context context, int totalTabs){
        super(fm);

        this.context = context;
        this.tabsNo = totalTabs;

    }

    public Fragment getItem(int position){
        switch (position){

            case 0:
                Doc_fragment doc_fragment = new Doc_fragment();
                return doc_fragment;

            case 1:
                ExpectingMother expectingMother = new ExpectingMother();
                return expectingMother;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabsNo;
    }
}
