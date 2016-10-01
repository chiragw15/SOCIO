package com.example.cc15.soco;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ArinjayaKhare1 on 02-10-2016.
 */

public class ProfileFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.user_profile, container, false);
        //ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        //SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getActivity(),getChildFragmentManager());

        // Set the adapter onto the view pager
        //viewPager.setAdapter(adapter);
        //TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        //tabLayout.setupWithViewPager(viewPager);
        return view;
    }


}
