package com.asafvaron.betteradapterstest.adapter;

import android.view.View;

import com.asafvaron.betteradapterstest.adapter.viewholders.AbstractViewHolder;
import com.asafvaron.betteradapterstest.entities.BannerAdvert;
import com.asafvaron.betteradapterstest.entities.BlackCar;
import com.asafvaron.betteradapterstest.entities.BlueCar;
import com.asafvaron.betteradapterstest.entities.FullScreenAdvert;
import com.asafvaron.betteradapterstest.entities.GreenCar;
import com.asafvaron.betteradapterstest.entities.RedCar;
import com.asafvaron.betteradapterstest.entities.WhiteCar;
import com.asafvaron.betteradapterstest.entities.YellowCar;

/**
 * Created by asafvaron on 21/02/2017.
 */
public interface TypeFactory {
    int type(BannerAdvert bannerAdvert);
    int type(FullScreenAdvert fullScreenAdvert);
    int type(BlackCar blackCar);
    int type(GreenCar greenCar);
    int type(RedCar redCar);
    int type(WhiteCar whiteCar);
    int type(YellowCar yellowCar);
    int type(BlueCar blueCar);

    AbstractViewHolder createViewHolder(View parent, int type);
}
