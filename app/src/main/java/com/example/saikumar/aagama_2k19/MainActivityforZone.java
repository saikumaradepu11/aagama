package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityforZone extends AppCompatActivity {


    ImageView logo;
    TextView desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityfor_zone);

        logo=(ImageView)findViewById(R.id.maindeptlogo);
        desc=(TextView)findViewById(R.id.maindepttext);


        Animation blinkLogo = AnimationUtils.loadAnimation(this, R.anim.logoanimation);
        logo.setAnimation(blinkLogo);

        Animation blinktext = AnimationUtils.loadAnimation(this, R.anim.logoanimation);
        desc.setAnimation(blinkLogo);

    }

    public void techzone(View view){
        startActivity(new Intent(MainActivityforZone.this, Techzone_events.class));

    }
    public void openzone(View view){
        startActivity(new Intent(MainActivityforZone.this, Manoranjan_zone.class));
    }
    public void skillzone(View view){
        startActivity(new Intent(MainActivityforZone.this, Skill_zone.class));

    }

    public void foodzone(View view) {
        startActivity(new Intent(MainActivityforZone.this, Food_zone.class));
    }

    public void culturalzone(View view) {
        startActivity(new Intent(MainActivityforZone.this, Main_cultural_zone.class));
    }

    public void departments(View view) {
        startActivity(new Intent(MainActivityforZone.this, Main_dept_for_fun_events.class));
    }
}
