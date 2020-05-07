package android.example.tourguide;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    //List to stores all the contact details
    private ArrayList<Tour> mTour;
    private Context mContext;

    //Constructor for the class
    public RecylerViewAdapter(ArrayList<Tour> tour, Context context) {
        this.mTour = tour;
        this.mContext = context;
    }

    //This method creates views for the RecyclerView by inflating the layout
    //into the viewHolders which helps display the items in the recyclerView
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //and return the ViewHolder Accordingly
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;

    }

    //this method is called when binding the data to the views created by the RecyclerView
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

                Tour tour = mTour.get(position);
                holder.populateHolder(tour);

        //click listener on items in the viewholder
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "item clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mTour == null ? 0 : mTour.size();
    }

    // Second ViewHolder of object type Tour
    // Reference to the views for each call items to display desired information
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView holderImage;
        TextView holderDescription;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            holderImage = itemView.findViewById(R.id.image);
            holderDescription = itemView.findViewById(R.id.description);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }

        public void populateHolder(Tour tour) {
            int img = tour.getmImage();
            holderImage.setImageResource(img);

            String text = tour.getmDescription();
            holderDescription.setText(text);
        }
    }


}
