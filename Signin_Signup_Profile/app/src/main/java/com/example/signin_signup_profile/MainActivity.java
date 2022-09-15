package com.example.signin_signup_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_UserName_SI, txt_Password_SI;
    Button bn_Signin_SI, bn_Signup_SI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_UserName_SI = findViewById(R.id.editText_userName_SI);
        txt_Password_SI = findViewById(R.id.editText_userName_SI);
        bn_Signin_SI = findViewById(R.id.button_Signin_SI);
        bn_Signup_SI = findViewById(R.id.button_Signup_SI);


        //Button DANG KI
        bn_Signup_SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Signup.class);
                startActivity(intent);
            }
        });

        //Button DANG NHAP
        bn_Signin_SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_UserName_SI.getText().toString().equals("admin") && txt_Password_SI.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, profile.class);
                    startActivity(intent);
                } else Toast.makeText(MainActivity.this, "UserName và password sai!", Toast.LENGTH_LONG).show();

            }
        });


    }
}