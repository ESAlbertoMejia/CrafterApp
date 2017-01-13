package com.esamdevelopers.gamej.crafterapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esamdevelopers.gamej.crafterapp.R;
import com.esamdevelopers.gamej.crafterapp.holders.ViewHolderContentMain;

/**
 * Created by gamej on 13/1/2017.
 */

public class RecyclerAdapterContentMain extends RecyclerView.Adapter<ViewHolderContentMain> {

    private Context context;
    private LayoutInflater inflater;

    private int[] images = {
            R.drawable.pic_barista,
            R.drawable.pic_proceso,
            R.drawable.pic_fincas
    };

    private String[] titles = {
            "Excelentes Baristas",
            "Extracción V60",
            "Granos de Excelencia"
    };

    private String[] descriptions = {
            "Contamos con los mejores baristas reconocidos en nuestro pais con amplia experencia en la preparacion de exquisitas tazas del mejor grano de café.",
            "Este método de extracción permite que, a través de unos espacios de aire, se filtre el café de una manera mas rápida. Obteniendo sabores dulces, delicadas notas, un cuerpo medio y elegante perfil en general en taza.",
            "Tenemos a disposicion los mejores granos de café de las fincas mas selectas de nuestro hermoso pais, en ellas degustaras los mejores sabores que hemos preparado para tu deleite a donde quiera que vayas."
    };

    public RecyclerAdapterContentMain(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolderContentMain onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_card_view_content_main, parent, false);
        ViewHolderContentMain holderContentMain = new ViewHolderContentMain(view);
        return holderContentMain;
    }

    @Override
    public void onBindViewHolder(ViewHolderContentMain holder, int position) {
        holder.img_card_content.setImageResource(images[position]);
        holder.title_card_content.setText(titles[position]);
        holder.description_card_content.setText(descriptions[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}