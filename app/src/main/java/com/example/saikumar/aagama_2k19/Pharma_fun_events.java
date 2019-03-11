package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Pharma_fun_events extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharma_fun_events);

    }

    public void pharmbody(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_body_twister.class);
        startActivity(intent);
    }

    public void pharmdartbtn(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_body_twister.class);
        startActivity(intent);
    }

    public void pharmquiz(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_crack_the_world.class);
        startActivity(intent);
    }

    public void pharmquizbtn(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_crack_the_world.class);
        startActivity(intent);
    }

    public void gamedartquiz(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_game_of_darts.class);
        startActivity(intent);
    }

    public void gamedartbtn(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_game_of_darts.class);
        startActivity(intent);
    }

    public void pharmaquiz(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharmacy_technical_quiz.class);
        startActivity(intent);
    }

    public void techquizbtn(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharmacy_technical_quiz.class);
        startActivity(intent);
    }

    public void pharmoral(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharmacy_oral_presentation.class);
        startActivity(intent);
    }

    public void oralbtn(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharmacy_oral_presentation.class);
        startActivity(intent);
    }

    public void pharmposter(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharmacy_poster_presentation.class);
        startActivity(intent);
    }

    public void pharmposterbtn(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharmacy_poster_presentation.class);
        startActivity(intent);
    }

    public void pharmhunt(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_hunt.class);
        startActivity(intent);
    }

    public void pharmahuntbtn(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_hunt.class);
        startActivity(intent);
    }

    public void pharmaexpo(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_project_expo.class);
        startActivity(intent);
    }

    public void phramaexpobtn(View view) {
        Intent intent=new Intent(Pharma_fun_events.this,Pharma_project_expo.class);
        startActivity(intent);
    }
}
