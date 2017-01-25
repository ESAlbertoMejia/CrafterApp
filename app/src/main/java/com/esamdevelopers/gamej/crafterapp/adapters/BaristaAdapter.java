package com.esamdevelopers.gamej.crafterapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.esamdevelopers.gamej.crafterapp.R;

/**
 * Created by gamej on 24/1/2017.
 */

public class BaristaAdapter extends RecyclerView.Adapter<BaristaAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_descripcion, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.descripcion1.setText("Un barista es el profesional especializado en el café de alta calidad, que trabaja creando nuevas y diferentes bebidas basadas en él, usando varios tipos de leches, esencias y licores, entre otros. También es el responsable de la presentación de las bebidas y puede complementar su trabajo con arte del latte.");
        holder.descripcion2.setText("La palabra «barista», cuyo origen se puede encontrar en el idioma italiano, nos dice que es una persona especializada en café. Para ser un buen barista se necesita mucha experiencia teórica y práctica. Debe ser una persona capaz de distinguir los distintos tipos de café para poder llegar a una mezcla o saber resaltar las características de un origen único, para lo que debe conocer sobre el proceso de tostado y los diferentes grados existentes. Además, debe conocer la calidad del agua, dureza, pH, etc., así como los distintos tipos de preparación del café: en cafeteras de filtro, al estilo turco, en cafetera italiana, en máquinas espresso, en prensas francesas y otros.");
        holder.descripcion3.setText("La palabra «barista», cuyo origen se puede encontrar en el idioma italiano, nos dice que es una persona especializada en café. Para ser un buen barista se necesita mucha experiencia teórica y práctica. Debe ser una persona capaz de distinguir los distintos tipos de café para poder llegar a una mezcla o saber resaltar las características de un origen único, para lo que debe conocer sobre el proceso de tostado y los diferentes grados existentes. Además, debe conocer la calidad del agua, dureza, pH, etc., así como los distintos tipos de preparación del café: en cafeteras de filtro, al estilo turco, en cafetera italiana, en máquinas espresso, en prensas francesas y otros.");
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView descripcion1, descripcion2, descripcion3;

        public ViewHolder(View itemView) {
            super(itemView);
            descripcion1 = (TextView) itemView.findViewById(R.id.description1);
            descripcion2 = (TextView) itemView.findViewById(R.id.description2);
            descripcion3 = (TextView) itemView.findViewById(R.id.description3);
        }
    }
}