package com.example.mybeacon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("제 2 전시관");
    }

    public void play4(View v){
        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack4.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }

    public void play5(View v){

        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack5.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }

    public void play6(View v){

        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack6.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }
}