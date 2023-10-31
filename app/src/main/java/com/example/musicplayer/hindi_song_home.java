package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class hindi_song_home extends AppCompatActivity {

    Button guli_mata,leke_prabhu_ka_naam,mann_jogiya_official,zihaal_miskin,gal_karke_asees_kaur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_song_home);


        guli_mata=findViewById(R.id.guli_mata);
        leke_prabhu_ka_naam=findViewById(R.id.leke_prabhu_ka_naam);
        mann_jogiya_official=findViewById(R.id.mann_jogiya_official);
        zihaal_miskin=findViewById(R.id.zihaal_miskin);
        gal_karke_asees_kaur=findViewById(R.id.gal_karke_asees_kaur);


        guli_mata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hindi_song_home.this, music_play.class);
                Toast.makeText(hindi_song_home.this, "guli_mata", Toast.LENGTH_SHORT).show();
                intent.putExtra("songName","guli_mata");
                intent.putExtra("name", "guli_mata");
                intent.putExtra("image", R.drawable.guli_mata);
                startActivity(intent);
            }
        });

        leke_prabhu_ka_naam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hindi_song_home.this, music_play.class);
                Toast.makeText(hindi_song_home.this, "leke_prabhu_ka_naam", Toast.LENGTH_SHORT).show();
                intent.putExtra("songName","leke_prabhu_ka_naam");
                intent.putExtra("Name","leke_prabhu_ka_naam");
                intent.putExtra("image", R.drawable.leke_prabhu_ka_naam);
                startActivity(intent);
            }
        });

        mann_jogiya_official.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hindi_song_home.this, music_play.class);
                Toast.makeText(hindi_song_home.this, "mann_jogiya_official", Toast.LENGTH_SHORT).show();
                intent.putExtra("songName", "mann_jogiya_official");
                intent.putExtra("Name", "mann_jogiya_official");
                intent.putExtra("image", R.drawable. mann_jogiya_official);
                startActivity(intent);
            }
        });

        zihaal_miskin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hindi_song_home.this, music_play.class);
                Toast.makeText(hindi_song_home.this, "zihaal_miskin", Toast.LENGTH_SHORT).show();
                intent.putExtra("songName","zihaal_miskin");
                intent.putExtra("Name","zihaal_miskin");
                intent.putExtra("image", R.drawable.zihaal_miskin);
                startActivity(intent);
            }
        });

        gal_karke_asees_kaur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hindi_song_home.this, music_play.class);
                Toast.makeText(hindi_song_home.this, "gal_karke_asees_kaur", Toast.LENGTH_SHORT).show();
                intent.putExtra("songName","gal_karke_asees_kaur");
                intent.putExtra("Name","gal_karke_asees_kaur");
                intent.putExtra("image", R.drawable.gal_karke_asees_kaur);
                startActivity(intent);
            }
        });
    }
}