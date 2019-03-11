package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class It_fun_events extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_fun_events);


    }

    public void itguess(View view) {
        Intent intent=new Intent(It_fun_events.this,It_guess_what.class);
        startActivity(intent);
    }

    public void itguessbtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_guess_what.class);
        startActivity(intent);
    }

    public void itfaster(View view) {
        Intent intent=new Intent(It_fun_events.this,It_fast_finger_first.class);
        startActivity(intent);
    }

    public void itfasterbtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_fast_finger_first.class);
        startActivity(intent);
    }

    public void itsherlock(View view) {
        Intent intent=new Intent(It_fun_events.this,It_sher_locked.class);
        startActivity(intent);
    }

    public void itsherlockbtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_sher_locked.class);
        startActivity(intent);
    }

    public void itcelebrity(View view) {
        Intent intent=new Intent(It_fun_events.this,It_celebrity_quiz.class);
        startActivity(intent);
    }

    public void itcelebritybtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_celebrity_quiz.class);
        startActivity(intent);
    }

    public void itwhite(View view) {
        Intent intent=new Intent(It_fun_events.this,it_white_board_coding.class);
        startActivity(intent);
    }

    public void itwhitebtn(View view) {
        Intent intent=new Intent(It_fun_events.this,it_white_board_coding.class);
        startActivity(intent);
    }

    public void ittechbuzz(View view) {
        Intent intent=new Intent(It_fun_events.this,It_techbuzz.class);
        startActivity(intent);
    }

    public void ittechbuzzbtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_techbuzz.class);
        startActivity(intent);
    }

    public void itdazzle(View view) {
        Intent intent=new Intent(It_fun_events.this,It_dazzling_coding.class);
        startActivity(intent);
    }

    public void itduzzlebtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_dazzling_coding.class);
        startActivity(intent);
    }

    public void itcodehunt(View view) {
        Intent intent=new Intent(It_fun_events.this,It_codehunt.class);
        startActivity(intent);
    }

    public void itcodehuntbtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_codehunt.class);
        startActivity(intent);
    }

    public void itpaper(View view) {
        Intent intent=new Intent(It_fun_events.this,IT_paper_presentation.class);
        startActivity(intent);
    }

    public void itpaperbtn(View view) {
        Intent intent=new Intent(It_fun_events.this,IT_paper_presentation.class);
        startActivity(intent);
    }

    public void itposter(View view) {
        Intent intent=new Intent(It_fun_events.this,IT_poster_presentation.class);
        startActivity(intent);
    }

    public void itposterbtn(View view) {
        Intent intent=new Intent(It_fun_events.this,IT_poster_presentation.class);
        startActivity(intent);
    }

    public void itvirtual(View view) {
        Intent intent=new Intent(It_fun_events.this,It_virtual_job_fair.class);
        startActivity(intent);
    }

    public void itvirtualbtn(View view) {
        Intent intent = new Intent(It_fun_events.this, It_virtual_job_fair.class);
        startActivity(intent);
    }

    public void ittressurebtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_tressure_hunt.class);
        startActivity(intent);
    }

    public void ittressure(View view) {
        Intent intent=new Intent(It_fun_events.this,It_tressure_hunt.class);
        startActivity(intent);
    }

    public void itbeat(View view) {
        Intent intent=new Intent(It_fun_events.this,It_beat_the_challenge.class);
        startActivity(intent);
    }

    public void itbeatbtn(View view) {
        Intent intent=new Intent(It_fun_events.this,It_beat_the_challenge.class);
        startActivity(intent);
    }
}
