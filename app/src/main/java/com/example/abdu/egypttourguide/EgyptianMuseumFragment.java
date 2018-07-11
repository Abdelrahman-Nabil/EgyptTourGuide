package com.example.abdu.egypttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EgyptianMuseumFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.itemlist, container, false);

        ArrayList<LocationItem> items = new ArrayList<>();
        items.add(new LocationItem(getString(R.string.pyramids), getString(R.string.pyramidsdetails), R.drawable.pyramids));
        items.add(new LocationItem(getString(R.string.camels), getString(R.string.camelsdetails), R.drawable.camels));
        items.add(new LocationItem(getString(R.string.sphinx), getString(R.string.sphinxdetails), R.drawable.sphinx));

        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), items);

        // finding the listView and setting the adapter to it
        final ListView listView = rootView.findViewById(R.id.itemlist);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
