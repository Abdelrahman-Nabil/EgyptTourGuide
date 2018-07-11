package com.example.abdu.egypttourguide;

import android.app.Activity;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ItemAdapter extends ArrayAdapter<LocationItem> {

    ItemAdapter(Activity context, ArrayList<LocationItem> Items) {
        super(context, 0, Items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        LocationItem item = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.title);

        titleTextView.setText(item.getName());

        TextView detailsTextView = listItemView.findViewById(R.id.details);

        detailsTextView.setText(item.getDetails());

        //find the image view with id image
        ImageView image = listItemView.findViewById(R.id.image);

        //get the imageResource get and set it as source of the image view
        image.setImageResource(item.getImageResourceID());
        return listItemView;
    }
}
