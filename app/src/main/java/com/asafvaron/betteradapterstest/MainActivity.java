package com.asafvaron.betteradapterstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.asafvaron.betteradapterstest.adapter.AdapterVisitor;
import com.asafvaron.betteradapterstest.adapter.TypeFactory;
import com.asafvaron.betteradapterstest.adapter.TypeFactoryForList;
import com.asafvaron.betteradapterstest.adapter.Visitable;
import com.asafvaron.betteradapterstest.entities.BannerAdvert;
import com.asafvaron.betteradapterstest.entities.BlackCar;
import com.asafvaron.betteradapterstest.entities.BlueCar;
import com.asafvaron.betteradapterstest.entities.FullScreenAdvert;
import com.asafvaron.betteradapterstest.entities.GreenCar;
import com.asafvaron.betteradapterstest.entities.RedCar;
import com.asafvaron.betteradapterstest.entities.WhiteCar;
import com.asafvaron.betteradapterstest.entities.YellowCar;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements AdapterVisitor.AdapterVisitorListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.rv_data_list)
    RecyclerView rvDataList;
    private List<Visitable> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        TypeFactory typeFactory = new TypeFactoryForList();
        elements = Arrays.asList(
                new BlackCar(),
                new BlueCar(),
                new YellowCar(),
                new BannerAdvert(),
                new WhiteCar(),
                new GreenCar(),
                new BlackCar(),
                new FullScreenAdvert(),
                new YellowCar(),
                new BlackCar(),
                new GreenCar(),
                new RedCar(),
                new BannerAdvert(),
                new YellowCar(),
                new BannerAdvert(),
                new FullScreenAdvert(),
                new RedCar(),
                new BlackCar(),
                new BlueCar(),
                new WhiteCar(),
                new BannerAdvert()
        );

        // this will unable different sizes layouts
//        rvDataList.setHasFixedSize(true);
        rvDataList.setLayoutManager(new LinearLayoutManager(this));
        rvDataList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rvDataList.setAdapter(new AdapterVisitor(
                this,
                elements,
                typeFactory
        ));
    }

    @Override
    public void clicked(int position) {
        Log.d(TAG, "clicked: " + elements.get(position));
    }
}
