package com.asafvaron.betteradapterstest.entities;

import android.graphics.Color;

import com.asafvaron.betteradapterstest.adapter.TypeFactory;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class RedCar implements Car {
    private static final String TAG = RedCar.class.getSimpleName();

    @Override
    public String getManufacturer() {
        return "Red";
    }

    @Override
    public int getHorsePower() {
        return 344;
    }

    @Override
    public int getColor() {
        return Color.RED;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
