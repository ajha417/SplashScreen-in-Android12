package com.example.splashscreenactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button login;
    TextInputLayout username,password;
    TextView forgotPassword,SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (TextInputLayout) findViewById(R.id.username);
        password = (TextInputLayout) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        forgotPassword = (TextView) findViewById(R.id.forgotpassword);
        SignUp = (TextView) findViewById(R.id.signup);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Registration.class));

            }
        });




    }
}