package com.example.mybeacon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        setTitle("제 1 전시관");
    }

    public void play1(View v){

        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack1.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }

    public void play2(View v){

        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack2.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }

    public void play3(View v){

        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack3.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }
}