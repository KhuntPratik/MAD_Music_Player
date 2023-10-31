package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button gujarati,hindi,english;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gujarati=findViewById(R.id.gujarati_song);
        hindi=findViewById(R.id.hindi_song);
        english=findViewById(R.id.english_song);

        gujarati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, gujarati_song_home.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Gujarati Song", Toast.LENGTH_SHORT).show();
            }
        });

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, hindi_song_home.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Hindi Song", Toast.LENGTH_SHORT).show();
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, english_song_home.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "English Song", Toast.LENGTH_SHORT).show();
            }
        });
    }
}