package com.example.signin_signup_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    EditText txt_UserName_SU, txt_Password_SU, txt_Email;
    Button bn_Signin_SU, bn_Signup_SU;
    String UserName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        txt_UserName_SU = findViewById(R.id.editText_userName_SI);
        txt_Password_SU = findViewById(R.id.editText_password_SI);
        txt_Email = findViewById(R.id.editTextT_Email);
        bn_Signin_SU = findViewById(R.id.button_signin_SU);
        bn_Signup_SU = findViewById(R.id.button_signup_SU);


        bn_Signin_SU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}