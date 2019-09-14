package com.example.mybeacon;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoPlayBack9 extends AppCompatActivity {

    // MediaPlayer 객체생성
    MediaPlayer mediaPlayer;
    // 시작버튼
    Button startButton;
    //종료버튼
    Button stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_playback9);
        setTitle("제 3 전시관 콘텐츠 화면");

        startButton = findViewById(R.id.start);
        stopButton = findViewById(R.id.stop);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(VideoPlayBack9.this, R.raw.straykids_audio);
                mediaPlayer.start();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 정지버튼
                mediaPlayer.stop();
                // 초기화
                mediaPlayer.reset();
            }
        });

        Intent it = getIntent();
        String tag = it.getStringExtra("it_tag");

        TextView title = (TextView)findViewById(R.id.title);
        TextView place = (TextView)findViewById(R.id.place);
        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        TextView text = (TextView)findViewById(R.id.text);

        int stringId;
        String myKey;

        Resources res = getResources();

        stringId = res.getIdentifier("title"+tag, "string", getPackageName());
        myKey = res.getString(stringId);
        title.setText(myKey);

        stringId = res.getIdentifier("place"+tag, "string", getPackageName());
        myKey = res.getString(stringId);
        place.setText(myKey);

        stringId = res.getIdentifier("video"+tag, "string", getPackageName());
        myKey = res.getString(stringId);

        String uri = "https://mybeacon.s3.ap-northeast-2.amazonaws.com/"+myKey+".mp4";
        Uri clip = Uri.parse(uri);
        videoView.setVideoURI(clip);
        videoView.requestFocus();
        videoView.start();

        stringId = res.getIdentifier("text"+tag, "string", getPackageName());
        myKey = res.getString(stringId);
        myKey = myKey.replace(" ", "\u00A0");
        text.setText(myKey);

        MediaController mcontroller = new MediaController(this);
        videoView.setMediaController(mcontroller);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // MediaPlayer 해지
        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}

