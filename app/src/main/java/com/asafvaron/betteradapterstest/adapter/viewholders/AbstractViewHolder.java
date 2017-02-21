package com.asafvaron.betteradapterstest.adapter.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by asafvaron on 21/02/2017.
 */
public abstract class AbstractViewHolder<T> extends RecyclerView.ViewHolder {
    private static final String TAG = AbstractViewHolder.class.getSimpleName();

    public AbstractViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public abstract void bind(T element);
}
