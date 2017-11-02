package com.example.gogos.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EgyptianMuseumActivity extends AppCompatActivity {
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
        dataResourcesArrayList.add(new DataResources(getString(R.string.egyptian_museum_1), R.drawable.em1));
        dataResourcesArrayList.add(new DataResources(getString(R.string.egyptian_museum_3), R.drawable.em2));
        dataResourcesArrayList.add(new DataResources(getString(R.string.egyptian_museum_3), R.drawable.em3));
    }

    private void arrayAdaptor() {
        DataResourcesAdaptor itemsDataResourcesAdaptor =
                new DataResourcesAdaptor(this, dataResourcesArrayList, R.color.egyptian_museum_color);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsDataResourcesAdaptor);
    }
}
