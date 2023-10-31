package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class gujarati_song_home extends AppCompatActivity {

    Button first,second,three,khodal_maa_aarti,kinjal_dave_killol,manda_lidha_mohi_raj,mandavadi_nonstop_garba,sapna_vinani_raat,shiva_tandava,vaagyo_re_dhol,moj_ma_revu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarati_song_home);


        second=findViewById(R.id.second_song);
        three=findViewById(R.id.threed_song);
        khodal_maa_aarti=findViewById(R.id.khodal_maa_aarti);

        manda_lidha_mohi_raj=findViewById(R.id.manda_lidha_mohi_raj);

        moj_ma_revu=findViewById(R.id.moj_ma_revu);
        sapna_vinani_raat=findViewById(R.id.sapna_vinani_raat);
        shiva_tandava=findViewById(R.id.shiva_tandava);
        vaagyo_re_dhol=findViewById(R.id.vaagyo_re_dhol);



        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gujarati_song_home.this, music_play.class);
                intent.putExtra("songName","har_har_shambhu");
                intent.putExtra("Name","har_har_shambhu");
//                Toast.makeText(gujarati_song_home.this, "har_har_shambhu", Toast.LENGTH_SHORT).show();
                intent.putExtra("image", R.drawable.har_har_shambhu);
                startActivity(intent);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gujarati_song_home.this, music_play.class);
                intent.putExtra("songName","gori_radha_ne_kado_kaan");
                intent.putExtra("Name","gori_radha");
//                Toast.makeText(gujarati_song_home.this, "gori_radha", Toast.LENGTH_SHORT).show();
                intent.putExtra("image", R.drawable.gori_radha);
                startActivity(intent);
            }
        });

        khodal_maa_aarti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gujarati_song_home.this, music_play.class);
                intent.putExtra("songName","khodal_maa_aarti");
//                Toast.makeText(gujarati_song_home.this, "khodal_maa_aarti", Toast.LENGTH_SHORT).show();
                intent.putExtra("Name","khodal_maa_aarti");
                startActivity(intent);
            }
        });



        manda_lidha_mohi_raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gujarati_song_home.this, music_play.class);
                intent.putExtra("songName","manda_lidha_mohi_raj");
//                Toast.makeText(gujarati_song_home.this, "manda_lidha_mohi_raj", Toast.LENGTH_SHORT).show();
                intent.putExtra("Name","manda_lidha_mohi_raj");
                intent.putExtra("image", R.drawable.manda_lidha_mohi_raj);
                startActivity(intent);
            }
        });


        moj_ma_revu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gujarati_song_home.this, music_play.class);
                intent.putExtra("songName","moj_ma_revu");
//                Toast.makeText(gujarati_song_home.this, "moj_ma_revu", Toast.LENGTH_SHORT).show();
                intent.putExtra("Name","moj_ma_revu");
                intent.putExtra("image", R.drawable.moj_ma_revu);
                startActivity(intent);
            }
        });


        sapna_vinani_raat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gujarati_song_home.this, music_play.class);
                intent.putExtra("songName","sapna_vinani_raat");
                Toast.makeText(gujarati_song_home.this, "sapna_vinani_raat", Toast.LENGTH_SHORT).show();
                intent.putExtra("Name","sapna_vinani_raat");
                intent.putExtra("image", R.drawable.sapna_vinani_raat);
                startActivity(intent);
            }
        });

        shiva_tandava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gujarati_song_home.this, music_play.class);
                intent.putExtra("songName","shiva_tandava");
//                Toast.makeText(gujarati_song_home.this, "shiva_tandava", Toast.LENGTH_SHORT).show();
                intent.putExtra("Name","shiva_tandava");
                intent.putExtra("image", R.drawable.shiva_tandava);
                startActivity(intent);
            }
        });

        vaagyo_re_dhol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gujarati_song_home.this, music_play.class);
                intent.putExtra("songName","vaagyo_re_dhol");
//                Toast.makeText(gujarati_song_home.this, "vaagyo_re_dhol", Toast.LENGTH_SHORT).show();
                intent.putExtra("Name","vaagyo_re_dhol");
                intent.putExtra("image", R.drawable.vaagyo_re_dhol);
                startActivity(intent);
            }
        });


    }
}