package com.asafvaron.betteradapterstest.adapter.viewholders;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.TextView;

import com.asafvaron.betteradapterstest.R;
import com.asafvaron.betteradapterstest.entities.Advert;

import butterknife.BindView;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class BannerAdvertViewHolder extends AbstractViewHolder<Advert> {
    private static final String TAG = BannerAdvertViewHolder.class.getSimpleName();

    @LayoutRes
    public static final int LAYOUT = R.layout.viewholder_banner_advert;

    @BindView(R.id.viewholder_banner_advert_name)
    TextView tv_banner_name;

    public BannerAdvertViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Advert element) {
        tv_banner_name.setText(element.getName());
    }

}
