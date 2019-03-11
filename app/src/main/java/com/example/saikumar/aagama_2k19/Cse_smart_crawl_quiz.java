package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cse_smart_crawl_quiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_smart_crawl_quiz);

    }

    public void csesmar(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/2XOp0xb"));
        startActivity(intent);
    }
}
