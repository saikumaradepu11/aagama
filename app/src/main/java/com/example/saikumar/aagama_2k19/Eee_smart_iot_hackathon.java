package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Eee_smart_iot_hackathon extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_smart_iot_hackathon);


    }

    public void smart(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://tinyurl.com/smart-internet-of-things"));
        startActivity(intent);
    }
}
