package com.asafvaron.betteradapterstest.entities;

import android.graphics.Color;

import com.asafvaron.betteradapterstest.adapter.TypeFactory;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class WhiteCar implements Car {
    private static final String TAG = WhiteCar.class.getSimpleName();

    @Override
    public String getManufacturer() {
        return "White Car";
    }

    @Override
    public int getHorsePower() {
        return 198;
    }

    @Override
    public int getColor() {
        return Color.WHITE;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
