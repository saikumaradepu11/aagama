package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Civil_fun_events extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_fun_events);

    }


    public void civilmockcid(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_mock_cid.class);
        startActivity(intent);
    }

    public void civilmockcidbtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_mock_cid.class);
        startActivity(intent);
    }

    public void civiltechnicaldebate(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_technical_debate.class);
        startActivity(intent);
    }

    public void civiltechnicaldebatebtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_technical_debate.class);
        startActivity(intent);
    }

    public void civil3dchallenge(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_3d_challenge.class);
        startActivity(intent);
    }

    public void civil3dchallengebtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_3d_challenge.class);
        startActivity(intent);
    }

    public void civilspotmodelling(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_spot_modelling.class);
        startActivity(intent);
    }

    public void civilspotmodellingbtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_spot_modelling.class);
        startActivity(intent);
    }


    public void civilpaper(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_paper_presentation.class);
        startActivity(intent);
    }

    public void civilpaperbtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_paper_presentation.class);
        startActivity(intent);
    }

    public void civilposter(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_poster_presentation.class);
        startActivity(intent);
    }

    public void civilposterbtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_poster_presentation.class);
        startActivity(intent);
    }

    public void civiltech(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_technical_quiz.class);
        startActivity(intent);
    }

    public void civiltechbtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_technical_quiz.class);
        startActivity(intent);
    }

    public void civilproject(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_poster_expo.class);
        startActivity(intent);
    }

    public void civilprojectbtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_poster_expo.class);
        startActivity(intent);
    }

    public void civilhot(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_hottopic.class);
        startActivity(intent);
    }

    public void civilhotbtn(View view) {
        Intent intent=new Intent(Civil_fun_events.this,Civil_hottopic.class);
        startActivity(intent);
    }
}
