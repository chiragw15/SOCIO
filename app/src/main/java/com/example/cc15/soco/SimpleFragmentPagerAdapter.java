package com.example.cc15.soco;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ArinjayaKhare1 on 01-10-2016.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mcontext;

    public SimpleFragmentPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mcontext=context;
    }

    @Override
    public Fragment getItem(int position) {
     if(position==0)
     {
         return new postsFragment();
     }
        else
     {
         return new eventsFragment();
     }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return mcontext.getString(R.string.post);
        }
        else
        {
            return mcontext.getString(R.string.past_events);
        }
    }
}
