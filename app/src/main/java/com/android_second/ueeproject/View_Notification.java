package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class View_Notification extends AppCompatActivity {
    private LinearLayout linearnotifications;
    private ImageView remove1;
    private ImageView remove2;
    private ImageView remove3;
    private ImageView remove4;
    private ImageView remove5;
    private ImageView remove6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__notification);

        ImageView back = findViewById(R.id.img_arrow);
        linearnotifications = findViewById(R.id.notification_main_linear);
        remove1 = findViewById(R.id.delete_notification1);
        remove1.setOnClickListener((view) ->{
            deleteLayout1(view);
        });
        remove2 = findViewById(R.id.delete_notification2);
        remove2.setOnClickListener((view) ->{
            deleteLayout2(view);
        });
        remove3 = findViewById(R.id.delete_notification3);
        remove3.setOnClickListener((view) ->{
            deleteLayout3(view);
        });
        remove4 = findViewById(R.id.delete_notification4);
        remove4.setOnClickListener((view) ->{
            deleteLayout4(view);
        });
        remove5 = findViewById(R.id.delete_notification5);
        remove5.setOnClickListener((view) ->{
            deleteLayout5(view);
        });
        remove6 = findViewById(R.id.delete_notification6);
        remove6.setOnClickListener((view) ->{
            deleteLayout6(view);
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(View_Notification.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }

    public void deleteLayout1(View view) {
        final CardView temp = (CardView) linearnotifications.findViewById(R.id.card_notification1);
        temp.removeAllViews();
        linearnotifications.removeView(temp);
    }public void deleteLayout2(View view) {
        final CardView temp = (CardView) linearnotifications.findViewById(R.id.card_notification2);
        temp.removeAllViews();
        linearnotifications.removeView(temp);
    }public void deleteLayout3(View view) {
        final CardView temp = (CardView) linearnotifications.findViewById(R.id.card_notification3);
        temp.removeAllViews();
        linearnotifications.removeView(temp);
    }public void deleteLayout4(View view) {
        final CardView temp = (CardView) linearnotifications.findViewById(R.id.card_notification4);
        temp.removeAllViews();
        linearnotifications.removeView(temp);
    }public void deleteLayout5(View view) {
        final CardView temp = (CardView) linearnotifications.findViewById(R.id.card_notification5);
        temp.removeAllViews();
        linearnotifications.removeView(temp);
    }
    public void deleteLayout6(View view) {
        final CardView temp = (CardView) linearnotifications.findViewById(R.id.card_notification6);
        temp.removeAllViews();
        linearnotifications.removeView(temp);
    }
}