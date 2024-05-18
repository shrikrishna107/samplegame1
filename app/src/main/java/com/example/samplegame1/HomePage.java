package com.example.samplegame1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity {

    Button signupbtn, loginbtn;

   FirebaseAuth fAuth = FirebaseAuth.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanc
                            eState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        signupbtn = findViewById(R.id.button);
        loginbtn = findViewById(R.id.button2);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(HomePage.this, "Redirecting to Sign Up Page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), signuppage.class));
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(HomePage.this, "Redirecting to Log In Page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), loginpage.class));
            }
        });
    }
}