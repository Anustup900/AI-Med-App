package com.abc.mankibaat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class signupactivity extends AppCompatActivity {
    private Button btnLogin,btnSignup,btncreate_acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);
        btnLogin=(Button)findViewById(R.id.Login);
        btnSignup=(Button)findViewById(R.id.Signup);
        btncreate_acc=(Button)findViewById(R.id.create_acc);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signupactivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btncreate_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signupactivity.this,feedscreen.class);
                startActivity(intent);
            }
        });


    }
    }