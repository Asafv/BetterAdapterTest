package com.asafvaron.betteradapterstest.adapter;

import android.util.Log;
import android.view.View;

import com.asafvaron.betteradapterstest.adapter.viewholders.AbstractViewHolder;
import com.asafvaron.betteradapterstest.adapter.viewholders.BannerAdvertViewHolder;
import com.asafvaron.betteradapterstest.adapter.viewholders.CarViewHolder;
import com.asafvaron.betteradapterstest.adapter.viewholders.FullScreenAdvertViewHolder;
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
public class TypeFactoryForList implements TypeFactory {
    private static final String TAG = TypeFactoryForList.class.getSimpleName();

    @Override
    public int type(BannerAdvert bannerAdvert) {
        return BannerAdvertViewHolder.LAYOUT;
    }

    @Override
    public int type(FullScreenAdvert fullScreenAdvert) {
        return FullScreenAdvertViewHolder.LAYOUT;
    }

    @Override
    public int type(BlackCar blackCar) {
        return CarViewHolder.LAYOUT;
    }

    @Override
    public int type(GreenCar greenCar) {
        return CarViewHolder.LAYOUT;
    }

    @Override
    public int type(RedCar redCar) {
        return CarViewHolder.LAYOUT;
    }

    @Override
    public int type(WhiteCar whiteCar) {
        return CarViewHolder.LAYOUT;
    }

    @Override
    public int type(YellowCar yellowCar) {
        return CarViewHolder.LAYOUT;
    }

    @Override
    public int type(BlueCar blueCar) {
        return CarViewHolder.LAYOUT;
    }

    @Override
    public AbstractViewHolder createViewHolder(View parent, int type) {
        AbstractViewHolder createdViewHolder;
        switch (type) {
            case CarViewHolder.LAYOUT:
                createdViewHolder = new CarViewHolder(parent);
                break;
            case BannerAdvertViewHolder.LAYOUT:
                createdViewHolder = new BannerAdvertViewHolder(parent);
                break;
            case FullScreenAdvertViewHolder.LAYOUT:
                createdViewHolder = new FullScreenAdvertViewHolder(parent);
                break;

            default:
                Log.e(TAG, "createViewHolder: ERR: Not Supported Type ! ! !");
                return null;
        }
        return createdViewHolder;
    }
}
