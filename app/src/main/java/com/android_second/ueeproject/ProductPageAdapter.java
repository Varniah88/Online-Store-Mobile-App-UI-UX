package com.android_second.ueeproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;



public class ProductPageAdapter  extends FragmentStateAdapter {

    public ProductPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case  0:
                return  new OverviewFragment();

            case  1:
                return new RatingFragment();


            default:

                return  new ProductsDetailsFragment();
        }
    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
