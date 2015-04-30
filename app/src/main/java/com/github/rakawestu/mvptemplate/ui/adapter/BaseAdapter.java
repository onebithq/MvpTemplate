package com.github.rakawestu.mvptemplate.ui.adapter;

import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Base recycler adapter.
 *
 * @author rakawm
 */
public abstract class BaseAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    public abstract void setData(List<T> objects);

    public abstract void add(T object);

    public abstract void add(List<T> objects);

}
