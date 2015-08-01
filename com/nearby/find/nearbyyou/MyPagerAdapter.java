package com.nearby.find.nearbyyou;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Jacob on 5/13/2015.
 */
public class MyPagerAdapter extends FragmentPagerAdapter{

    private String tabtitles[] = new String[] { "Map", "Information" };

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {

            // Open MapFragment.java
            case 0:
                MapFragment mapTab = new MapFragment();
                return mapTab;

            // Open DescFragment.java
            case 1:
                DescFragment descTab = new DescFragment();
                return descTab;

        }
        return null;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}