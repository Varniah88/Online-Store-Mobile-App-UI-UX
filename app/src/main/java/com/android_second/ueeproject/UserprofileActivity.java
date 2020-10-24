package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UserprofileActivity extends AppCompatActivity {

    Dialog myDialog;
    Dialog myDialog2;
    Dialog myDialog3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile2);

        myDialog = new Dialog(this);
        myDialog2 = new Dialog(this);
        myDialog3 = new Dialog(this);

        ImageView edit = findViewById(R.id.edituserprof);
        ImageView delete = findViewById(R.id.deleteprof);
        ImageView edit_add = findViewById(R.id.editsdd);
        ImageView delete_add = findViewById(R.id.deleteadd);
        ImageView cart = findViewById(R.id.cartprof);
        ImageView back = findViewById(R.id.img_arrow1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditProfile();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteprofile();
            }
        });
        edit_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditAddress();
            }
        });
        delete_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deleteadress();
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenCartActivity();
            }
        });
    }

    public void EditProfile(){
        TextView txtclose;
        Button cancel;
        Button submit;
        myDialog.setContentView(R.layout.userprofile_edit_popup);
        txtclose = (TextView) myDialog.findViewById(R.id.closeprofileedit);
        cancel = (Button) myDialog.findViewById(R.id.profcancel);
        submit = (Button) myDialog.findViewById(R.id.profsub);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }
    public void EditAddress(){
        TextView txtclose;
        Button cancel;
        Button submit;
        myDialog2.setContentView(R.layout.editaddress_popup);
        txtclose = (TextView) myDialog2.findViewById(R.id.close2);
        cancel = (Button) myDialog2.findViewById(R.id.editaddcancel);
        submit = (Button) myDialog2.findViewById(R.id.addeditsubmit);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog2.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog2.dismiss();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog2.dismiss();
            }
        });
        myDialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog2.show();

    }
    public void deleteprofile(){
        TextView txtclose;
        Button cancel;
        Button submit;
        myDialog3.setContentView(R.layout.delete_confirm_popup);
        txtclose = (TextView) myDialog3.findViewById(R.id.close1);
        cancel = (Button) myDialog3.findViewById(R.id.delno);
        submit = (Button) myDialog3.findViewById(R.id.delyes);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog3.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog3.dismiss();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog3.dismiss();
            }
        });
        myDialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog3.show();

    }
    public void Deleteadress(){
        TextView txtclose;
        Button cancel;
        Button submit;
        myDialog3.setContentView(R.layout.delete_confirm_popup);
        txtclose = (TextView) myDialog3.findViewById(R.id.close1);
        cancel = (Button) myDialog3.findViewById(R.id.delno);
        submit = (Button) myDialog3.findViewById(R.id.delyes);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog3.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog3.dismiss();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog3.dismiss();
            }
        });
        myDialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog3.show();

    }

    public void OpenCartActivity(){
        Intent cart = new Intent(this, CartActivity.class);
        startActivity(cart);
    }
    public void back(){
        Intent back_home = new Intent(this, HomeScreen.class);
        startActivity(back_home);
    }

}