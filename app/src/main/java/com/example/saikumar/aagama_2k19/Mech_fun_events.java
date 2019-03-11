package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mech_fun_events extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech_fun_events);

    }

    public void mechfun(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_fun_from_junk.class);
        startActivity(intent);
    }

    public void mechfunbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_fun_from_junk.class);
        startActivity(intent);
    }

    public void slowmech(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_slow_bike_challenge.class);
        startActivity(intent);
    }

    public void slowbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_slow_bike_challenge.class);
        startActivity(intent);
    }

    public void grapology(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_graphology.class);
        startActivity(intent);
    }

    public void grapologybtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_graphology.class);
        startActivity(intent);
    }

    public void mech_exceptbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_except_the_wicket.class);
        startActivity(intent);
    }

    public void except_mech(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_except_the_wicket.class);
        startActivity(intent);
    }
    public void vaici(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_vaicitriya.class);
        startActivity(intent);
    }

    public void vaicibtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_vaicitriya.class);
        startActivity(intent);
    }

    public void hunt(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_mek_hunt.class);
        startActivity(intent);
    }

    public void huntbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_mek_hunt.class);
        startActivity(intent);
    }

    public void shape(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_shape_o_vision.class);
        startActivity(intent);
    }

    public void shapebtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_shape_o_vision.class);
        startActivity(intent);
    }

    public void techwizz(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_techwizz.class);
        startActivity(intent);
    }

    public void techwizzbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_techwizz.class);
        startActivity(intent);
    }

    public void mindspark(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_mindspark.class);
        startActivity(intent);
    }

    public void minspartbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_mindspark.class);
        startActivity(intent);
    }

    public void mechth(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_mechthirst.class);
        startActivity(intent);
    }

    public void mechthbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_mechthirst.class);
        startActivity(intent);
    }
    public void mech_poster(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_poster_presentation.class);
        startActivity(intent);
    }

    public void mech_posterbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_poster_presentation.class);
        startActivity(intent);
    }

    public void Mech_paper(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_paper_presentaion.class);
        startActivity(intent);
    }

    public void mech_paperbtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_paper_presentaion.class);
        startActivity(intent);
    }

    public void maatamech(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_maata_mana_basha.class);
        startActivity(intent);
    }

    public void mech_matabtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_maata_mana_basha.class);
        startActivity(intent);
    }

    public void mechpro(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_projectexpo.class);
        startActivity(intent);
    }

    public void mechprobtn(View view) {
        Intent intent=new Intent(Mech_fun_events.this,Mech_projectexpo.class);
        startActivity(intent);
    }
}
