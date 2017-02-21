package com.asafvaron.betteradapterstest.entities;

import android.graphics.Color;

import com.asafvaron.betteradapterstest.adapter.TypeFactory;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class BlackCar implements Car {
    private static final String TAG = BlackCar.class.getSimpleName();

    @Override
    public String getManufacturer() {
        return "Black";
    }

    @Override
    public int getHorsePower() {
        return 150;
    }

    @Override
    public int getColor() {
        return Color.BLACK;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
