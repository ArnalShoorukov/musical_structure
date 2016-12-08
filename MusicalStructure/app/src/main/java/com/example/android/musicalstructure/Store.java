package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open
                Intent backIntent = new Intent(Store.this, MainActivity.class);

                //Start the new activity
                startActivity(backIntent);
            }
        });
        ImageView playNow = (ImageView) findViewById(R.id.store_image);
        playNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open toast message
                Toast.makeText(getApplicationContext(), "You proceeded payment", Toast.LENGTH_LONG).show();
            }
        });
    }
}
