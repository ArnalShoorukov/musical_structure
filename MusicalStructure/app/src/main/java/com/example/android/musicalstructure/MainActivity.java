package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView play = (TextView)findViewById(R.id.playing);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the
                Intent playIntent = new Intent(MainActivity.this,Now_playing.class);

                //Start the new activity
                startActivity(playIntent);
            }
        });
        TextView album = (TextView)findViewById(R.id.album);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the
                Intent albumIntent = new Intent(MainActivity.this,ListAlbums.class);

                //Start the new activity
                startActivity(albumIntent);
            }
        });
        TextView artist = (TextView)findViewById(R.id.artist);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the
                Intent artistIntent = new Intent(MainActivity.this,ListArtists.class);

                //Start the new activity
                startActivity(artistIntent);
            }
        });
        TextView store = (TextView)findViewById(R.id.store);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the
                Intent storeIntent = new Intent(MainActivity.this,Store.class);

                //Start the new activity
                startActivity(storeIntent);
            }
        });
        TextView search = (TextView)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the
                Intent searchIntent = new Intent(MainActivity.this,Search.class);

                //Start the new activity
                startActivity(searchIntent);
            }
        });
    }
}
