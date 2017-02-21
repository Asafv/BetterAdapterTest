package com.asafvaron.betteradapterstest.entities;

import android.graphics.Color;

import com.asafvaron.betteradapterstest.adapter.TypeFactory;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class BlueCar implements Car {
    @Override
    public String getManufacturer() {
        return "Blue";
    }

    @Override
    public int getHorsePower() {
        return 211;
    }

    @Override
    public int getColor() {
        return Color.BLUE;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
