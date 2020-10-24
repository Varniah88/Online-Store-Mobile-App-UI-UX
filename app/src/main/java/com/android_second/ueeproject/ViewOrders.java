package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ViewOrders extends AppCompatActivity {

    LinearLayout layout1 ;
    private LinearLayout ll;

    private Button remove1;
    private Button remove2;
    private Button remove3;
    private Button remove4;
    private Button remove5;
    private Button remove6;

    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;
    private CheckBox c4;
    private CheckBox c5;
    private CheckBox c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);

        layout1 = findViewById(R.id.layout1);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ViewOrders.this,ViewOrder.class);
                startActivity(intent);
            }
        });
        remove1 = findViewById(R.id.remove1);
        remove1.setOnClickListener((view) ->{
            deleteLayout1(view);
        });
        remove2 = findViewById(R.id.remove2);
        remove2.setOnClickListener((view) ->{
            deleteLayout2(view);
        });
        remove3 = findViewById(R.id.remove3);
        remove3.setOnClickListener((view) ->{
            deleteLayout3(view);
        });
        remove4 = findViewById(R.id.remove4);
        remove4.setOnClickListener((view) ->{
            deleteLayout4(view);
        });
        remove5 = findViewById(R.id.remove5);
        remove5.setOnClickListener((view) ->{
            deleteLayout5(view);
        });
        remove6 = findViewById(R.id.remove6);
        remove6.setOnClickListener((view) ->{
            deleteLayout6(view);
        });

        c1 = findViewById(R.id.checkBox1);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);
        c6 = findViewById(R.id.checkBox6);

        ImageView delete_Selected =  findViewById(R.id.admin_cart_icons);
        delete_Selected.setOnClickListener((view) ->{
            if(c3.isChecked() || c4.isChecked() || c5.isChecked()){
                deleteSelected(view);
            }
        });
        ImageView back = findViewById(R.id.img_arrow);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ViewOrders.this, HomeScreen.class);
                startActivity(intent);
            }
        });

        ll =  findViewById(R.id.main_linear_layout);
    }
    public void deleteLayout1(View view) {
        final CardView temp = (CardView) ll.findViewById(R.id.card_order1);
        temp.removeAllViews();
        ll.removeView(temp);
    }public void deleteLayout2(View view) {
        final CardView temp = (CardView) ll.findViewById(R.id.card_order2);
        temp.removeAllViews();
        ll.removeView(temp);
    }public void deleteLayout3(View view) {
        final CardView temp = (CardView) ll.findViewById(R.id.card_order3);
        temp.removeAllViews();
        ll.removeView(temp);
    }public void deleteLayout4(View view) {
        final CardView temp = (CardView) ll.findViewById(R.id.card_order4);
        temp.removeAllViews();
        ll.removeView(temp);
    }public void deleteLayout5(View view) {
        final CardView temp = (CardView) ll.findViewById(R.id.card_order5);
        temp.removeAllViews();
        ll.removeView(temp);
    }
    public void deleteLayout6(View view) {
            final CardView temp = (CardView) ll.findViewById(R.id.card_order6);
            temp.removeAllViews();
            ll.removeView(temp);
    }

    public void deleteSelected(View view){
        final CardView temp3 = (CardView) ll.findViewById(R.id.card_order3);
        temp3.removeAllViews();
        ll.removeView(temp3);

        final CardView temp4 = (CardView) ll.findViewById(R.id.card_order4);
        temp4.removeAllViews();
        ll.removeView(temp4);

        final CardView temp5 = (CardView) ll.findViewById(R.id.card_order5);
        temp5.removeAllViews();
        ll.removeView(temp5);
    }
}