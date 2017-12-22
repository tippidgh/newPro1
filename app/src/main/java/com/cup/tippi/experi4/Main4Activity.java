package com.cup.tippi.experi4;

import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import java.io.IOException;



public class Main4Activity extends AppCompatActivity {

    MediaPlayer mediaPlayer00;
    Button button00;
    SurfaceView surfaceView00;
    String path;
    SurfaceHolder surfaceHolder00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        surfaceView00 = (SurfaceView)findViewById(R.id.surfaceView00);
        button00 = (Button)findViewById(R.id.button00);
        mediaPlayer00 = new MediaPlayer();
        button00.setOnClickListener(new btnOnClick());
        //path = "/sdcard/video.mp4";
         path = Environment.getExternalStorageDirectory().getPath()+"/video.mp4";
    }
    class btnOnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            try {
                mediaPlayer00.reset();
                mediaPlayer00.setDataSource(path);
               // mediaPlayer00 = MediaPlayer.create(getApplicationContext(),R.raw.video);
                surfaceHolder00 = surfaceView00.getHolder();
                mediaPlayer00.setDisplay(surfaceHolder00);
                mediaPlayer00.prepare();
                mediaPlayer00.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
