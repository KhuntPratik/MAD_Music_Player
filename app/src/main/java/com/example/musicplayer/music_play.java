package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.IOException;

public class music_play extends AppCompatActivity {

    Button btnPlay,min_sec,ten_sec,back_button;

    ImageView image;
    MediaPlayer mp;

    boolean wasPlaying = false;
    FloatingActionButton fab;

    TextView song_text;

    SeekBar seekBar;
    int curruntTime = 0;

    private final Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_play);

        Intent intent = getIntent();
        String songName = intent.getStringExtra("songName");
        int bgResource = intent.getIntExtra("image", R.drawable.logo);

        btnPlay = findViewById(R.id.button_play);
        ten_sec=findViewById(R.id.ten_sec);
        min_sec=findViewById(R.id.min_sec);
        back_button=findViewById(R.id.back_button);
        image = findViewById(R.id.khodal_maa_photo);
        seekBar=findViewById(R.id.seekbar_1);
        song_text=findViewById(R.id.song_text);
        song_text.setText(songName);
        image.setBackgroundResource(bgResource);
        mp = new MediaPlayer();
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);


        String apath = "android.resource://" + getPackageName() + "/raw/" + songName;
        Uri audioUri = Uri.parse(apath);
        try {
            mp.setDataSource(this, audioUri);
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

        seekBar.setMax(mp.getDuration());
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (mp != null) {
                    seekBar.setProgress(mp.getCurrentPosition());
                }
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean formuser) {
                mp.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        btnPlay.setBackgroundResource(R.drawable.play_icon);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mp.isPlaying()) {
                    btnPlay.setBackgroundResource(R.drawable.stop_icon);
                    mp.start();
//                    Toast.makeText(gujarati_song.this, "Song is Playing", Toast.LENGTH_SHORT).show();

                } else if (mp.isPlaying()) {
                    btnPlay.setBackgroundResource(R.drawable.play_icon);

                    mp.pause();
//                    Toast.makeText(gujarati_song.this, "Song is Pause", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ten_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()) {
                    curruntTime = mp.getCurrentPosition() + 10000;
                    mp.seekTo(curruntTime);
//                    Toast.makeText(gujarati_song.this, ">>>10sec", Toast.LENGTH_SHORT).show();
                }
            }
        });

        min_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    curruntTime = mp.getCurrentPosition() - 10000;
                    mp.seekTo(curruntTime);
//                    Toast.makeText(gujarati_song.this, "<<<10sec", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mp != null) {
            mp.release();
        }
        // Cancel the TimerTask
        handler.removeCallbacksAndMessages(null);

    }}
