package com.esamdevelopers.gamej.crafterapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esamdevelopers.gamej.crafterapp.adapters.AdaptadorItems;
import com.esamdevelopers.gamej.crafterapp.modelos.Carta;

/**
 * Created by gamej on 14/1/2017.
 */

public class ItemLetterFragment extends Fragment {

    private LinearLayoutManager layoutManager;
    private static final String INDICE_SECCION = "indice_seccion";
    private AdaptadorItems adaptadorItems;

    public ItemLetterFragment() {

    }

    public static ItemLetterFragment getInstance(int indiceSeccion){
        ItemLetterFragment fragment = new ItemLetterFragment();

        Bundle args = new Bundle();
        args.putInt(INDICE_SECCION, indiceSeccion);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_items_group, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_item_group);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        int indiceSeccion = getArguments().getInt(INDICE_SECCION);

        switch (indiceSeccion){
            case 0:
                adaptadorItems = new AdaptadorItems(Carta.BEBIDAS);
                break;
            case 1:
                adaptadorItems = new AdaptadorItems(Carta.POSTRES);
                break;
            case 2:
                adaptadorItems = new AdaptadorItems(Carta.FINCAS);
                break;
        }

        recyclerView.setAdapter(adaptadorItems);

        return view;
    }
}