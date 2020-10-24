package com.android_second.ueeproject;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class faq extends Fragment {
    private Dialog myDialog;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_faq, container, false);
        myDialog=new Dialog(getContext());
        button=root.findViewById(R.id.send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPopUp();
            }
        });
        return root;

    }

    private void  viewPopUp(){
        TextView close;
        Button send;
        myDialog.setContentView(R.layout.send_message);
        close=(TextView) myDialog.findViewById(R.id.close_dialog);
        send=myDialog.findViewById(R.id.send_message);
        myDialog.show();

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });


    }
}