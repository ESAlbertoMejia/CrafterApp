package com.esamdevelopers.gamej.crafterapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esamdevelopers.gamej.crafterapp.adapters.RecyclerAdapterContentMain;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.app_bar_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content_main_recycler);
        RecyclerAdapterContentMain adapterContentMain = new RecyclerAdapterContentMain(getActivity());

        if (recyclerView != null){
            recyclerView.setAdapter(adapterContentMain);
            recyclerView.setHasFixedSize(true);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof MainActivity){
            MainActivity activity = (MainActivity) getActivity();
            activity.onUpdateSubTitle(getString(R.string.title_nav_home));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        MainActivity activity = (MainActivity) getActivity();
        activity.navigationView.setCheckedItem(R.id.nav_home);
    }
}