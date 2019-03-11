package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mba_tressurehunt extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mba_tressurehunt);

    }

    public void mbatre(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdAFckDW3DK0h4NnJUg0f3gtZK0e4ps08XUeywd5IaegM_iNA/viewform"));
        startActivity(intent);
    }
}
