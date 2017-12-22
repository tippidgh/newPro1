package com.cup.tippi.experi4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText txt00,txt01;
    Button btn00,btn01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00 = (Button)findViewById(R.id.button00);
        btn01 = (Button)findViewById(R.id.button01);
        txt00 = (EditText)findViewById(R.id.editText00);
        txt01 = (EditText)findViewById((R.id.editText01));
        btn00.setOnClickListener(new btnOnClick());
        btn01.setOnClickListener(new btnOnClick());
    }
    class btnOnClick implements View.OnClickListener{

        Intent  intent;
        @Override
        public void onClick(View v) {
            if(v == btn00){
                txt00.setText("");
                txt01.setText("");
            }
            if(v == btn01){
              if(txt00.getText().toString().equals("董高华")&& txt01.getText().toString().equals("12345")) {
                    Toast.makeText(getApplicationContext(),"登陆成功",Toast.LENGTH_SHORT).show();
                    intent = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                }
                else Toast.makeText(getApplicationContext(),"登录失败，用户名或密码错误",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
