package com.cup.tippi.experi4;

import android.content.Intent;
import android.graphics.Camera;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer;
    Button btn02 ,btn03,btn04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView)findViewById(R.id.listView00);
        String[] data ={
                "章节练习",
                "模拟考试",
                "知识点复习"
        };
        btn02 = (Button)findViewById(R.id.button02) ;
        btn03 = (Button)findViewById(R.id.button03) ;
        btn04 = (Button)findViewById(R.id.button04);
        btn02.setOnClickListener(new btnOnClick());
        btn03.setOnClickListener(new btnOnClick());
        btn04.setOnClickListener(new btnOnClick());
        mediaPlayer = new MediaPlayer();
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data));
        listView.setOnItemClickListener(new lsOnClick());
    }
    class btnOnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(v==btn02){
                mediaPlayer.pause();
            }
            if(v==btn03){
                Intent intent3 = new Intent();
                intent3.setClass(getApplicationContext(),Main4Activity.class);
                startActivity(intent3);
            }
            if(v==btn04){
                Intent intent4 = new Intent();
                intent4.setClass(getApplicationContext(),MyCameraActivity.class);
                startActivity(intent4);
            }

        }
    }
    class lsOnClick implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            Toast.makeText(Main2Activity.this,"您选择的项目是："+((TextView)arg1).getText(),Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent();
            intent2.setClass(getApplicationContext(), Main3Activity.class);
            startActivityForResult(intent2,0);
            mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music);
            mediaPlayer.start();

        }
    }
}
