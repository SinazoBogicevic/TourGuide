package android.example.tourguide;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomViewAdapter extends RecyclerView.Adapter<CustomViewAdapter.CustomViewHolder> {

    //List to stores all the contact details
    private ArrayList<Icons> mIcons;
    private Context mContext;

    //Constructor for the class
    public CustomViewAdapter(ArrayList<Icons> icons, Context context) {
        this.mIcons = icons;
        this.mContext = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View iconsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.accomodation_layout, parent, false);
        return new CustomViewHolder(iconsView);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        Icons icons = mIcons.get(position);
        holder.populateIcons(icons);

        //click listener on items in the viewholder
        holder.iconsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "item clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mIcons == null ? 0 : mIcons.size();
    }

    // Second ViewHolder of object type Icons
    // Reference to the views for each call items to display desired information
    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView holderImage, poolIcon, foodIcon, wifiCon, friendlyIcon, accessIcon;
        TextView holderDescription;
        LinearLayout parentLayout;
        LinearLayout iconsLayout;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            holderImage = itemView.findViewById(R.id.image);
            holderDescription = itemView.findViewById(R.id.description);
            iconsLayout = itemView.findViewById(R.id.icon_layout);
            parentLayout = itemView.findViewById(R.id.parent_layout);

            //icons
            poolIcon = itemView.findViewById(R.id.icon_pool);
            foodIcon = itemView.findViewById(R.id.icon_food);
            wifiCon = itemView.findViewById(R.id.icon_wifi);
            friendlyIcon = itemView.findViewById(R.id.icon_family_friendly);
            accessIcon = itemView.findViewById(R.id.icon_accessibility);
        }

        //set icons and description

        public void populateIcons(Icons icon) {
            //set data on icon holders
            int image = icon.getmImage();
            holderImage.setImageResource(image);

            String text = icon.getmDescription();
            holderDescription.setText(text);

            int pool = icon.getPool();
            poolIcon.setImageResource(pool);

            int restaurant = icon.getFood();
            foodIcon.setImageResource(restaurant);

            int wifi = icon.getWifi();
            wifiCon.setImageResource(wifi);

            int friendly = icon.getChild_friendly();
            friendlyIcon.setImageResource(friendly);

            int access = icon.getAccessible();
            accessIcon.setImageResource(access);
        }
    }
}
