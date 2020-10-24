package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class RegisterActivity extends AppCompatActivity {
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        Button register = findViewById(R.id.register_user);
        TextView login = findViewById(R.id.log);
        EditText username = findViewById(R.id.enterusername);
        EditText email = findViewById(R.id.editTextTextPersonName2);
        EditText password = findViewById(R.id.editTextTextPassword);
        EditText confirmpw = findViewById(R.id.editTextTextPersonName3);
        CheckBox show_pw = findViewById(R.id.checkBox2);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String Name = username.getText().toString();
                final  String Pass = password.getText().toString();
                final String Email = email.getText().toString();
                final String ConPw = confirmpw.getText().toString();
                if(Name.length()==0)
                {
                    username.requestFocus();
                    username.setError("USER NAME CANNOT BE EMPTY");
                }
                else if (!Email.matches(emailPattern)){

                    email.requestFocus();
                    email.setError("INVALID E-MAIL ADDRESS");
                }
                else if(Pass.length()==0)
                {
                    password.requestFocus();
                    password.setError("PASSWORD CANNOT BE EMPTY");
                }
                else if(!ConPw.matches(Pass)){
                    confirmpw.requestFocus();
                    confirmpw.setError("PASSWORD IS UNMATCHED");
                }
                else{
                    Toast.makeText(RegisterActivity.this,"Successfully Created Account!",Toast.LENGTH_LONG).show();
                    openHomeActivity();
                }

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });

        show_pw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    confirmpw.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else{
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    confirmpw.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

    }
    public void openHomeActivity(){
        Intent home = new Intent(this, HomeScreen.class);
        startActivity(home);
    }
    public void openLoginActivity(){
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);
    }
}