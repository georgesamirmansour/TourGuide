package com.example.gogos.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PyramidsActivity extends AppCompatActivity {
    private ArrayList<DataResources> dataResourcesArrayList =
            new ArrayList<DataResources>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);
        arrayList();
        arrayAdaptor();
    }

    private void arrayList() {
        dataResourcesArrayList.add(new DataResources(getString(R.string.pyramids_1), R.drawable.p1));
        dataResourcesArrayList.add(new DataResources(getString(R.string.pyramids_2), R.drawable.p2));
        dataResourcesArrayList.add(new DataResources(getString(R.string.pyramids_3), R.drawable.p3));
        dataResourcesArrayList.add(new DataResources(getString(R.string.pyramids_4), R.drawable.p4));
        dataResourcesArrayList.add(new DataResources(getString(R.string.pyramids_5), R.drawable.p5));
    }

    private void arrayAdaptor() {
        DataResourcesAdaptor itemsDataResourcesAdaptor =
                new DataResourcesAdaptor(this, dataResourcesArrayList, R.color.pyramid_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsDataResourcesAdaptor);

    }
}
