package com.example.gogos.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TempleOfKarnakActivity extends AppCompatActivity {

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
        dataResourcesArrayList.add(new DataResources(getString(R.string.karnak_1), R.drawable.k1));
        dataResourcesArrayList.add(new DataResources(getString(R.string.karnak_2), R.drawable.k2));
        dataResourcesArrayList.add(new DataResources(getString(R.string.karnak_3), R.drawable.k3));

    }

    private void arrayAdaptor() {
        DataResourcesAdaptor itemsDataResourcesAdaptor =
                new DataResourcesAdaptor(this, dataResourcesArrayList, R.color.temple_of_karnak_color);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsDataResourcesAdaptor);

    }
}
