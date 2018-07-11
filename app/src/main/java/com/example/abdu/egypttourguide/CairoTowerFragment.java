package com.example.abdu.egypttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CairoTowerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.itemlist, container, false);

        ArrayList<LocationItem> items = new ArrayList<>();
        items.add(new LocationItem(getString(R.string.tower), getString(R.string.towerdetails), R.drawable.tower));
        items.add(new LocationItem(getString(R.string.teles), getString(R.string.telesdetails), R.drawable.teles));
        items.add(new LocationItem(getString(R.string.rest), getString(R.string.restdetails), R.drawable.rest1));

        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), items);

        // finding the listView and setting the adapter to it
        final ListView listView = rootView.findViewById(R.id.itemlist);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
