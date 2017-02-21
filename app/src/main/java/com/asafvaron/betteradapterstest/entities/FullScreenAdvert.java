package com.asafvaron.betteradapterstest.entities;

import com.asafvaron.betteradapterstest.adapter.TypeFactory;

/**
 * Created by asafvaron on 21/02/2017.
 */
public class FullScreenAdvert implements Advert {

    @Override
    public String getName() {
        return "Full Screen Advert";
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
