package com.android_second.ueeproject.ui.home;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android_second.ueeproject.R;
import com.android_second.ueeproject.ViewProduct;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ViewFlipper imgBanner;
    private CardView cart_click;
    private TextView txt_offerprice,txt_offerprice2,txt_offerprice3;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        txt_offerprice=root.findViewById(R.id.txt_offerprice);
        txt_offerprice2=root.findViewById(R.id.txt_offerprice2);
        txt_offerprice3=root.findViewById(R.id.txt_offerprice3);

        txt_offerprice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        txt_offerprice2.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        txt_offerprice3.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        imgBanner=root.findViewById(R.id.select_product_image);
        cart_click=root.findViewById(R.id.cart_click);

        cart_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), ViewProduct.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });
        int sliders[]={R.drawable.ban5,R.drawable.ban9,R.drawable.ban10,R.drawable.slider4};
        for(int slide:sliders){
            bannerFlipper(slide);
        }
        return root;
    }
    private void bannerFlipper(int image){
        ImageView imgView=new ImageView(getContext());
        imgView.setImageResource(image);
        imgBanner.addView(imgView);
        imgBanner.setFlipInterval(6000);
        imgBanner.setAutoStart(true);
        imgBanner.setInAnimation(getContext(),android.R.anim.fade_in);
        imgBanner.setOutAnimation(getContext(),android.R.anim.fade_out);
    }

}