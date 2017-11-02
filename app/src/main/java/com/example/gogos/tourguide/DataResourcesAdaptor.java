package com.example.gogos.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gogos on 2017-10-31.
 */

public class DataResourcesAdaptor extends ArrayAdapter<DataResources> {

    private int colorResourcesId;

    public DataResourcesAdaptor(Activity context, ArrayList<DataResources> dataResourcesArrayList, int colorResourcesId) {
        super(context, 0, dataResourcesArrayList);
        this.colorResourcesId = colorResourcesId;
    }

    @Override
    public View getView(int position, View viewConvert, ViewGroup parent) {
        View listItemView = viewConvert;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_all, parent, false);
        }
        DataResources currentDataResources = getItem(position);
        TextView informationTextView = listItemView.findViewById(R.id.tour_guide_text_view);
        informationTextView.setText(currentDataResources.getInformation());
        ImageView imageView = listItemView.findViewById(R.id.tour_guide_image_view);
        imageView.setImageResource(currentDataResources.getImageResource());
        View textContainer = listItemView.findViewById(R.id.text_container);
        int backgroundColor = ContextCompat.getColor(getContext(), colorResourcesId);
        textContainer.setBackgroundColor(backgroundColor);
        return listItemView;
    }

}
