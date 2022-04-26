package com.example.audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void playsound(View view) {
        MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.halo);
        sound.start();
    }

    public void playsound2(View view) {
        MediaPlayer sound2 = MediaPlayer.create(MainActivity.this, R.raw.nia);
        sound2.start();
    }

    public void playsound3(View view) {
        MediaPlayer sound3 = MediaPlayer.create(MainActivity.this, R.raw.hai);
        sound3.start();
    }

    public void playsound4(View view) {
        MediaPlayer sound4 = MediaPlayer.create(MainActivity.this, R.raw.aku);
        sound4.start();
    }

    public void playsoun5(View view) {
        MediaPlayer sound5 = MediaPlayer.create(MainActivity.this, R.raw.exo);
        sound5.start();
    }

    public void playsound6(View view) {
        MediaPlayer sound6 = MediaPlayer.create(MainActivity.this, R.raw.your);
        sound6.start();
    }
}