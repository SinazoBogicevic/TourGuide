package android.example.tourguide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.loader.app.LoaderManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Accommodation extends Fragment {
    private static final String TAG = "accommodation framgment";
    private RecyclerView recycler;
    private CustomViewAdapter customAdapter;
    private ArrayList<Icons> iconList = new ArrayList<>();
    private ConnectivityManager connectivityManager;

    public Accommodation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_accomdation, container, false);

        addIcons();

        Log.d(TAG, "onCreateView started.");
        recycler = (RecyclerView) view.findViewById(R.id.recycler_view_two);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(layoutManager);
        customAdapter = new CustomViewAdapter(iconList, getActivity());
        recycler.setAdapter(customAdapter);

        return view;
    }

    //load data

    private void addIcons() {
        String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        iconList.add(new Icons(R.drawable.anmol_seth_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.edvin_johansson_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.gabriel_ghnassia_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.gerson_reprezah_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.manuel_moreno_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.saad_khan_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.valeriia_bugaiova_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.shawn_lee_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.gerson_reprezah_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
        iconList.add(new Icons(R.drawable.edvin_johansson_resize,description,R.drawable.ic_pool, R.drawable.ic_restaurant, R.drawable.ic_wifi, R.drawable.ic_child_friendly, R.drawable.ic_accessible));
    }
}
