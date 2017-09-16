package com.wmpscc.intercampus10;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by wmpscc on 2017/8/30.
 */

public class TabAdaper extends FragmentPagerAdapter {
    private List<Fragment> list;

    public TabAdaper(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);

        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}