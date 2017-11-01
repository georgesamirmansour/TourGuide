package com.example.gogos.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TempleOfPhilaeActivity extends AppCompatActivity {

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
        dataResourcesArrayList.add(new DataResources(getString(R.string.philae_1), R.drawable.philae_1));
        dataResourcesArrayList.add(new DataResources(getString(R.string.philae_2), R.drawable.philae_2));
        dataResourcesArrayList.add(new DataResources(getString(R.string.philae_3), R.drawable.philae_3));

    }

    private void arrayAdaptor() {
        DataResourcesAdaptor itemsDataResourcesAdaptor =
                new DataResourcesAdaptor(this, dataResourcesArrayList, R.color.temple_of_philae_color);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsDataResourcesAdaptor);
    }
}
