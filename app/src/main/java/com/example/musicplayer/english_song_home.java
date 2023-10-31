package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class english_song_home extends AppCompatActivity {

    Button shape_of_view,Alec_Benjamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_song_home);

        shape_of_view = findViewById(R.id.shape_of_view);
        Alec_Benjamin=findViewById(R.id.Alec_Benjamin);

        shape_of_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(english_song_home.this, music_play.class);
                intent.putExtra("songName", "shape_of_view");
                intent.putExtra("Name", "shape of view");
                intent.putExtra("image", R.drawable.shape_of_view);
                startActivity(intent);
            }
        });

        Alec_Benjamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(english_song_home.this, music_play.class);
                intent.putExtra("songName", "alec_benjamin");
                intent.putExtra("Name", "Alec Benjamin");
                intent.putExtra("image", R.drawable.alec_benjamin);
                startActivity(intent);

            }
        });
    }
}