package android.example.tourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Adapter extends FragmentStateAdapter {
    private static final int TABS_NUMBER = 3;
    public Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position) {
            case 0 :
                return new destinations();
            case 1:
                return new Accommodation();
            case 2:
                return new Restaurants();
        }
        return new destinations();
    }

    @Override
    public int getItemCount() {
        return TABS_NUMBER;
    }
}
