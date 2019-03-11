package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Civil_3d_challenge extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_3d_challenge);


    }

    public void challenge(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://tinyurl.com/aagama2k19civil"));
        startActivity(intent);
    }
}
