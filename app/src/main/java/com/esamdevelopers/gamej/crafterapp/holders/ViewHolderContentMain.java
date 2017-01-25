package com.esamdevelopers.gamej.crafterapp.holders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.esamdevelopers.gamej.crafterapp.BaristaActivity;
import com.esamdevelopers.gamej.crafterapp.R;

/**
 * Created by gamej on 13/1/2017.
 */

public class ViewHolderContentMain extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView img_card_content;
    public TextView title_card_content, description_card_content;
    public Context context;

    public ViewHolderContentMain(View itemView) {
        super(itemView);
        img_card_content = (ImageView) itemView.findViewById(R.id.img_card_content);
        title_card_content = (TextView) itemView.findViewById(R.id.title_card_content);
        description_card_content = (TextView) itemView.findViewById(R.id.description_card_content);
        context = itemView.getContext();
        itemView.setClickable(true);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (getAdapterPosition()){
            case 0:
                Intent intent = new Intent(context, BaristaActivity.class);
                context.startActivity(intent);
                break;
        }
    }
}