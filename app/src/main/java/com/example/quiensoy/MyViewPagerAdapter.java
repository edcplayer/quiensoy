package com.example.quiensoy;

import android.net.wifi.hotspot2.pps.HomeSp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.quiensoy.fragments.estudiofragment;
import com.example.quiensoy.fragments.quienfrangment;
import com.example.quiensoy.fragments.tegnofragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new quienfrangment();
            case 1:
                return new estudiofragment();
            case 2:
                return new tegnofragment();
            default:
                return new quienfrangment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
