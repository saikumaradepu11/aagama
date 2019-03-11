package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cse_androcasino extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_androcasino);


    }

    public void cseanddro(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/2UvxCH6"));
        startActivity(intent);
    }
}
