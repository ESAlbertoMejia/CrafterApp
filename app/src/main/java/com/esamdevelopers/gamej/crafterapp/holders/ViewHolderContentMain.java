package com.esamdevelopers.gamej.crafterapp.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.esamdevelopers.gamej.crafterapp.R;

/**
 * Created by gamej on 13/1/2017.
 */

public class ViewHolderContentMain extends RecyclerView.ViewHolder {

    public ImageView img_card_content;
    public TextView title_card_content, description_card_content;

    public ViewHolderContentMain(View itemView) {
        super(itemView);

        img_card_content = (ImageView) itemView.findViewById(R.id.img_card_content);
        title_card_content = (TextView) itemView.findViewById(R.id.title_card_content);
        description_card_content = (TextView) itemView.findViewById(R.id.description_card_content);
    }
}