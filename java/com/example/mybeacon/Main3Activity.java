package com.example.mybeacon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("제 3 전시관");
    }

    public void play7(View v){
        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack7.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }

    public void play8(View v){

        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack8.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }

    public void play9(View v){

        int id = v.getId();
        LinearLayout layout = (LinearLayout)findViewById(id);

        String tag = (String)layout.getTag();
        Intent it = new Intent(this, VideoPlayBack9.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }
}