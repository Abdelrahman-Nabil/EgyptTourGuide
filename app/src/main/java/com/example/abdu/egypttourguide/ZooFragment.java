package com.example.abdu.egypttourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ZooFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.itemlist, container, false);

        ArrayList<LocationItem> items = new ArrayList<>();
        items.add(new LocationItem(getString(R.string.Zoo), getString(R.string.zoodetails), R.drawable.zoo));
        items.add(new LocationItem(getString(R.string.herbivores), getString(R.string.herb), R.drawable.herb));
        items.add(new LocationItem(getString(R.string.predators), getString(R.string.pred), R.drawable.pred));
        items.add(new LocationItem(getString(R.string.photograph), getString(R.string.photog), R.drawable.photog));
        items.add(new LocationItem(getString(R.string.cafe), getString(R.string.cafeshops), R.drawable.cafe));

        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), items);

        // finding the listView and setting the adapter to it
        final ListView listView = rootView.findViewById(R.id.itemlist);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
