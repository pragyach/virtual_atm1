package com.example.user.virtual_atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1= (CircleImageView) findViewById(R.id.profile_image1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,KNOW_YOUR_ATM_CARD.class);
                startActivity(i);
            }
        });
        img2= (CircleImageView) findViewById(R.id.profile_image2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,HOW_TO_USE_ATM.class);
                startActivity(i);
            }
        });
        img3= (CircleImageView) findViewById(R.id.profile_image3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SAFETY_CONCERNS.class);
                startActivity(i);
            }
        });
    }
}
