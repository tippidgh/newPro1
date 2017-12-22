package com.cup.tippi.experi4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView = (ListView)findViewById(R.id.listView00);
        String [] data = {"A.subject1","B.subject2","C.subject3","D.subject4"};
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice,data));
        listView.setOnItemClickListener(new lsOnClick());
    }
    class lsOnClick implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(Main3Activity.this,"您选择的项目为"+((TextView)view).getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
