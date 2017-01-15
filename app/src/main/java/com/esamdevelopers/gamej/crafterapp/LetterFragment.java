package com.esamdevelopers.gamej.crafterapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gamej on 14/1/2017.
 */

public class LetterFragment extends Fragment {

    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.app_bar_main_with_tabs, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        addFragmentViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof MainActivity){
            MainActivity activity = (MainActivity) getActivity();
            activity.onUpdateSubTitle(getString(R.string.title_nav_menu));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        MainActivity activity = (MainActivity) getActivity();
        activity.navigationView.setCheckedItem(R.id.nav_menu);
    }

    public void addFragmentViewPager(ViewPager viewPager){
        AdaptadorItemsLetter adapter = new AdaptadorItemsLetter(getActivity().getSupportFragmentManager());
        adapter.addFragment(ItemLetterFragment.getInstance(0), getString(R.string.title_tab_drinks));
        adapter.addFragment(ItemLetterFragment.getInstance(1), getString(R.string.title_tab_desserts));
        adapter.addFragment(ItemLetterFragment.getInstance(2), getString(R.string.title_tab_farms));
        viewPager.setAdapter(adapter);
    }

    public class AdaptadorItemsLetter extends FragmentStatePagerAdapter {

        private final List<Fragment> fragments = new ArrayList<>();
        private final List<String> titlesFragments = new ArrayList<>();

        public AdaptadorItemsLetter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            titlesFragments.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titlesFragments.get(position);
        }
    }
}