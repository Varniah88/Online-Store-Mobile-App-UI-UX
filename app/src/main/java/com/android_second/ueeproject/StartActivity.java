package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start2);

        Button login = findViewById(R.id.loginstart);
        Button register = findViewById(R.id.registerstart);
        Button skip_login = findViewById(R.id.skiploginstart);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });

        register.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterActivity();
            }
        }));

        skip_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenHomeActivity();
            }
        });
    }
    public void openLoginActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void openRegisterActivity(){
        Intent intent1 = new Intent(this, RegisterActivity.class);
        startActivity(intent1);
    }
    public void OpenHomeActivity(){
        Intent skip_login = new Intent(this, HomeScreen.class);
        startActivity(skip_login);
    }
}