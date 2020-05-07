package android.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Restaurants extends Fragment {
    private static final String TAG = "restaurant fragment";
    private RecylerViewAdapter adapter;
    private ArrayList<Tour> tourList = new ArrayList<>();
    private RecyclerView recycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);
        addData();
        recycler = (RecyclerView) view.findViewById(R.id.recycler_view_three);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(linearLayoutManager);
        adapter = new RecylerViewAdapter(tourList, getActivity());
        recycler.setAdapter(adapter);

        return view;
    }

    //load data
    private void addData(){
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.jay_wennington, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
    }
}
