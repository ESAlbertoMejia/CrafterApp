package com.esamdevelopers.gamej.crafterapp.cuenta;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esamdevelopers.gamej.crafterapp.R;
import com.esamdevelopers.gamej.crafterapp.adapters.AdaptadorDirecciones;

/**
 * Created by gamej on 18/1/2017.
 */

public class AddressFragment extends Fragment {

    private LinearLayoutManager manager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_items_group, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_item_group);
        manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);

        AdaptadorDirecciones adaptadorDirecciones = new AdaptadorDirecciones();
        recyclerView.setAdapter(adaptadorDirecciones);

        return view;
    }
}