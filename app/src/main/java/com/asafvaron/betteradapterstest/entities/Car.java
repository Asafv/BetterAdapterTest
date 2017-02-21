package com.asafvaron.betteradapterstest.entities;

import com.asafvaron.betteradapterstest.adapter.Visitable;

/**
 * Created by asafvaron on 21/02/2017.
 */
public interface Car extends Visitable {

    // car manufacturer
    String getManufacturer();

    // car hp
    int getHorsePower();

    // car color
    int getColor();
}
