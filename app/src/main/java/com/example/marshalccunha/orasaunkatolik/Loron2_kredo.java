package com.example.marshalccunha.orasaunkatolik;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Loron2_kredo extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loron2_kredo);
    }
    public void play(View view) {
        if (player == null)
        {
            player = MediaPlayer.create(this,R.raw.ami_aman);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
            Toast.makeText(this, "Audio Play", Toast.LENGTH_SHORT).show();
        }
        player.start();
    }

    public void pause(View view) {
        if (player != null)
        {
            player.pause();
            Toast.makeText(this, "Audio Pause", Toast.LENGTH_SHORT).show();
        }
    }

    public void stop(View view) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null)
        {
            player.release();
            player = null;
            Toast.makeText(this, "Audio Stop", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}
