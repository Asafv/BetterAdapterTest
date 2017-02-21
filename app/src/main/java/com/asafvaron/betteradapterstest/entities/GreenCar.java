package com.asafvaron.betteradapterstest.entities;

import android.graphics.Color;

import com.asafvaron.betteradapterstest.adapter.TypeFactory;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class GreenCar implements Car {
    private static final String TAG = GreenCar.class.getSimpleName();

    @Override
    public String getManufacturer() {
        return "Green Car";
    }

    @Override
    public int getHorsePower() {
        return 110;
    }

    @Override
    public int getColor() {
        return Color.GREEN;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
