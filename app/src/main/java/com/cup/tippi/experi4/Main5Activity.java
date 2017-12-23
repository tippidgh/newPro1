package com.cup.tippi.experi4;

import android.graphics.Camera;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.text.SimpleDateFormat;
import java.util.Date;

//让这个页面实现拍照显示功能
public class Main5Activity extends AppCompatActivity implements SurfaceHolder.Callback{

    Camera camera00=null;
    //SurfaceView surfaceView00;
    //SurfaceHolder holder00;
    ImageView imageView00;
    Button cameraBtn,exitBtn;
    SimpleDateFormat timesdf = new SimpleDateFormat("yyyyMMddHH_mm _ss");//定义时间格式
    Date curDate = new Date(System.currentTimeMillis());
    String fileTime =timesdf.format(new Date()).toString();//获取系统时间
    String path = Environment.getExternalStorageDirectory().getPath()+"/photo_text/"+fileTime+".jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        imageView00 = (ImageView)findViewById(R.id.imageView00);
        cameraBtn = (Button)findViewById(R.id.button00);
        exitBtn = (Button)findViewById(R.id.button01);
        cameraBtn.setOnClickListener(new btnOnClick());
        exitBtn.setOnClickListener(new btnOnClick());

    }
    class btnOnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if(v==cameraBtn){
                //camera00.takePicture(null,null,new jpegCallback());
            }
            else if(v==exitBtn){
                exit();
            }
        }
        void exit(){
          //  camera00.release();
            camera00  = null;
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
