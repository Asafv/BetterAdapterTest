package com.asafvaron.betteradapterstest.adapter.viewholders;

import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.TextView;

import com.asafvaron.betteradapterstest.R;
import com.asafvaron.betteradapterstest.entities.Car;

import butterknife.BindView;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class CarViewHolder extends AbstractViewHolder<Car> {
    private static final String TAG = CarViewHolder.class.getSimpleName();

    @LayoutRes
    public static final int LAYOUT = R.layout.viewholder_car;

    private final View mView;

    @BindView(R.id.viewholder_car_manufacturer)
    TextView tvManufacturer;

    @BindView(R.id.viewholder_car_hp)
    TextView tvHp;

    public CarViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
    }

    @Override
    public void bind(Car element) {
        if (element.getColor() == Color.BLACK) {
            tvManufacturer.setTextColor(Color.WHITE);
            tvHp.setTextColor(Color.WHITE);
        } else {
            tvManufacturer.setTextColor(Color.BLACK);
            tvHp.setTextColor(Color.BLACK);
        }
        tvManufacturer.setText(element.getManufacturer());
        tvHp.setText(String.valueOf(element.getHorsePower()));
        mView.setBackgroundColor(element.getColor());
    }
}
