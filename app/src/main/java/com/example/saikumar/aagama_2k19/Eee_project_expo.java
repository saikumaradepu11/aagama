package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Eee_project_expo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_project_expo);

    }

    public void eeepro(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://tinyurl.com/avishkarprojectexpo"));
        startActivity(intent);
    }
}