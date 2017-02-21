package com.asafvaron.betteradapterstest.entities;

import android.graphics.Color;

import com.asafvaron.betteradapterstest.adapter.TypeFactory;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class YellowCar implements Car {
    private static final String TAG = YellowCar.class.getSimpleName();

    @Override
    public String getManufacturer() {
        return "Yellow";
    }

    @Override
    public int getHorsePower() {
        return 450;
    }

    @Override
    public int getColor() {
        return Color.YELLOW;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
