package com.esamdevelopers.gamej.crafterapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.esamdevelopers.gamej.crafterapp.R;
import com.esamdevelopers.gamej.crafterapp.modelos.Carta;

import java.util.List;

/**
 * Created by gamej on 14/1/2017.
 */

public class AdaptadorItems extends RecyclerView.Adapter<AdaptadorItems.ViewHolder> {

    private final List<Carta> list;

    public AdaptadorItems(List<Carta> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_letter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Carta item = list.get(position);
        holder.item_image.setImageResource(item.getIdImagenRef());
        holder.item_title.setText(item.getNombre());
        holder.item_description.setText(item.getDescripcion());
        holder.item_price.setText("$ " + item.getPrecio());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView item_image;
        public TextView item_title, item_description, item_price;

        public ViewHolder(View itemView) {
            super(itemView);
            item_image = (ImageView) itemView.findViewById(R.id.item_img_ref);
            item_title = (TextView) itemView.findViewById(R.id.item_title);
            item_description = (TextView) itemView.findViewById(R.id.item_description);
            item_price = (TextView) itemView.findViewById(R.id.item_price);
        }
    }
}