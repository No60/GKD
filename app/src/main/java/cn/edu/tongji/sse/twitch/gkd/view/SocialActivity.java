package cn.edu.tongji.sse.twitch.gkd.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import cn.edu.tongji.sse.twitch.gkd.R;

public class SocialActivity extends AppCompatActivity {
    private ImageButton personal,running,social;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social_ui);

        personal=findViewById(R.id.personnal);
        running=findViewById(R.id.running);
        social=findViewById(R.id.social);

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialActivity.this, PersonalActivity.class);
                startActivity(intent);
            }
        });

        running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialActivity.this, RunningActivity.class);
                startActivity(intent);
            }
        });

        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialActivity.this, SocialActivity.class);
                startActivity(intent);
            }
        });
    }
}
