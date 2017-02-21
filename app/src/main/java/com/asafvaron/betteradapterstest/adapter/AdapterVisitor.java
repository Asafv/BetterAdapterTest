package com.asafvaron.betteradapterstest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asafvaron.betteradapterstest.MainActivity;
import com.asafvaron.betteradapterstest.adapter.viewholders.AbstractViewHolder;

import java.util.List;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class AdapterVisitor extends RecyclerView.Adapter<AbstractViewHolder> {
    private static final String TAG = AdapterVisitor.class.getSimpleName();
    private final List<Visitable> mElements;
    private final TypeFactory mTypeFactory;
    private AdapterVisitorListener mListener;

    public interface AdapterVisitorListener {
        void clicked(int position);
    }

    public AdapterVisitor(MainActivity mainActivity, List<Visitable> elements, TypeFactory typeFactory) {
        this.mListener = mainActivity;
        this.mElements = elements;
        this.mTypeFactory = typeFactory;
    }

    @Override
    public AbstractViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(viewType, parent, false);
        return mTypeFactory.createViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(AbstractViewHolder holder, int position) {
        final int pos = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mListener.clicked(pos);
            }
        });

        // unchecked
        holder.bind(mElements.get(pos));
    }

    @Override
    public int getItemViewType(int position) {
        return mElements.get(position).type(mTypeFactory);
    }

    @Override
    public int getItemCount() {
        return mElements.size();
    }
}
