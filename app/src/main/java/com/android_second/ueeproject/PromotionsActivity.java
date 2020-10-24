package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class PromotionsActivity extends AppCompatActivity {

    ViewFlipper View_Flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);

        ImageView back = findViewById(R.id.backhomearrow);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back_home();
            }
        });

        int images[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3, R.drawable.slide4,R.drawable.slide5};

        View_Flipper = findViewById(R.id.View_Flipper);

        for (int image: images) {
            flipperImages(image);
        }
    }

    public void flipperImages(int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        View_Flipper.addView(imageView);
        View_Flipper.setFlipInterval(3000); //3 seconds
        View_Flipper.setAutoStart(true);

        //animation
        View_Flipper.setInAnimation(this, android.R.anim.slide_in_left);
        View_Flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }

    public void back_home(){
        Intent back_home = new Intent(this, HomeScreen.class);
        startActivity(back_home);
    }
}