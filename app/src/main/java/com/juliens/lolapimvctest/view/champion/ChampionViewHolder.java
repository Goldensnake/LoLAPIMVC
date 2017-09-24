package com.juliens.lolapimvctest.view.champion;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.juliens.lolapimvctest.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by juliens on 14/09/2017.
 */

public class ChampionViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.text_champ_name) TextView textViewChampName;
    @BindView(R.id.text_difficulty) TextView textViewDifficulty;
    @BindView(R.id.text_attack)     TextView textViewChampAttack;
    @BindView(R.id.text_magic)      TextView textViewChampMagic;
    @BindView(R.id.text_defense)    TextView textViewChampDefense;
    @BindView(R.id.image_icon)      ImageView imageViewIcon;

    public ChampionViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
