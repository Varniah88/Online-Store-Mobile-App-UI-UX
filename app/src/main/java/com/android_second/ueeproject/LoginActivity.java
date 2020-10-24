package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        myDialog = new Dialog(this);

        Button login = findViewById(R.id.login);
        Button skip_login = findViewById(R.id.skiplogin);
        TextView create_account = findViewById(R.id.create_account);
        TextView forget_password = findViewById(R.id.forgetpassword);
        EditText username = findViewById(R.id.enteruser);
        EditText password = findViewById(R.id.enter_password);
        CheckBox show_pw = findViewById(R.id.checkBox);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String Name = username.getText().toString();
                final  String Pass = password.getText().toString();
                if(Name.length()==0)
                {
                    username.requestFocus();
                    username.setError("USER NAME CANNOT BE EMPTY");
                }
                else if(Pass.length()==0)
                {
                    password.requestFocus();
                    password.setError("PASSWORD CANNOT BE EMPTY");
                }
                else{
                    Toast.makeText(LoginActivity.this,"Successfully Logged In!",Toast.LENGTH_LONG).show();
                    openHomeActivity();
                }


            }
        });

        show_pw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else{
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        skip_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterActivity();
            }
        });

        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup();
            }
        });




    }

    public void openHomeActivity(){
        Intent home = new Intent(this, HomeScreen.class);
        startActivity(home);
    }
    public void openRegisterActivity(){
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
    }
    public void ShowPopup(){
        TextView txtclose;
        Button cancel;
        Button submit;
        myDialog.setContentView(R.layout.forgotpw_popup);
        txtclose = (TextView) myDialog.findViewById(R.id.close);
        cancel = (Button) myDialog.findViewById(R.id.forgetcancel);
        submit = (Button) myDialog.findViewById(R.id.forgetsubmit);

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
}