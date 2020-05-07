package android.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class destinations extends Fragment {

    private static final String TAG = "destinations fragment";
    private RecylerViewAdapter adapter;
    private ArrayList<Tour> tourList = new ArrayList<>();
    private RecyclerView recycler;

    public destinations() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_destinations, container, false);

        addData();

        Log.d(TAG, "onCreateView started.");
        recycler = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(layoutManager);
        adapter = new RecylerViewAdapter(tourList, getActivity());
        recycler.setAdapter(adapter);

        return view;
    }

    //load data
    private void addData(){
        tourList.add(new Tour(R.drawable.activity_one, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.activity_two, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.activity_three, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.activity_four, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.activity_five, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.activity_six, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.activity_seven, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.activity_eight, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        tourList.add(new Tour(R.drawable.activity_nine, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
    }
}
