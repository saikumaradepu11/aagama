package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ece_pin_pointing extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece_pin_pointing);

    }

    public void ecepinpoint1(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdVdhbVsMk4_d1B-ewzPk0viWxunN--NDbNICk7FCziJ3AJKA/viewform"));
        startActivity(intent);
    }
}
