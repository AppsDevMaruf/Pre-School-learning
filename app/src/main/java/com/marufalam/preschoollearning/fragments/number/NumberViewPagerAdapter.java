/*
 * Created by Maruf Alam Porosh on 3/28/21 11:14 PM
 *  Copyright (c) 2021 . All rights reserved.
 *  Last modified 3/4/21 6:35 PM
 */

package com.marufalam.preschoollearning.fragments.number;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class NumberViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();


    public NumberViewPagerAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);

    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {


        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment) {
      //  fragmentList.clear();
        mFragmentList.add(fragment);


    }

}
