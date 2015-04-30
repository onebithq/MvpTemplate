package com.github.rakawestu.mvptemplate.ui.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Base recycler view holder.
 *
 * @author rakawm
 */
public abstract class BaseHolder extends RecyclerView.ViewHolder{

    public BaseHolder(View itemView) {
        super(itemView);
        ButterKnife.inject(this, itemView);
    }
}
