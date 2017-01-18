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

import com.esamdevelopers.gamej.crafterapp.cuenta.AddressFragment;
import com.esamdevelopers.gamej.crafterapp.cuenta.CardFragment;
import com.esamdevelopers.gamej.crafterapp.cuenta.ProfileFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gamej on 18/1/2017.
 */

public class AccountFragment extends Fragment {

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
        poblarViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof MainActivity){
            MainActivity activity = (MainActivity) getActivity();
            activity.onUpdateSubTitle(getString(R.string.title_nav_account));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        MainActivity activity = (MainActivity) getActivity();
        activity.navigationView.setCheckedItem(R.id.nav_account);
    }

    public void poblarViewPager(ViewPager viewPager){
        AdaptadorSecciones adaptadorSecciones = new AdaptadorSecciones(getActivity().getSupportFragmentManager());
        adaptadorSecciones.addFragment(new ProfileFragment(), getString(R.string.title_tab_profile));
        adaptadorSecciones.addFragment(new AddressFragment(), getString(R.string.title_tab_address));
        adaptadorSecciones.addFragment(new CardFragment(), getString(R.string.title_tab_cards));
        viewPager.setAdapter(adaptadorSecciones);
    }

    public class AdaptadorSecciones extends FragmentStatePagerAdapter {

        private final List<Fragment> fragments = new ArrayList<>();
        private final List<String> titleFragments = new ArrayList<>();

        public AdaptadorSecciones(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String title){
            fragments.add(fragment);
            titleFragments.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titleFragments.get(position);
        }
    }
}