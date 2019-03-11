package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chem_fun_events extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_fun_events);



    }

    public void chemspell(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_spell_bee.class);
        startActivity(intent);
    }

    public void chemjam(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_jam.class);
        startActivity(intent);
    }

    public void chemjambtn(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_jam.class);
        startActivity(intent);
    }

    public void spellbtn(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_spell_bee.class);
        startActivity(intent);
    }

    public void chempaper(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_paper_presentation.class);
        startActivity(intent);
    }

    public void mechpaperbtn(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_paper_presentation.class);
        startActivity(intent);
    }

    public void chemgeneralquiz(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_general_quiz.class);
        startActivity(intent);
    }

    public void chemgeneralquizbtn(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_general_quiz.class);
        startActivity(intent);
    }

    public void chemcompound(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_compound_preperation.class);
        startActivity(intent);
    }

    public void chemcompoundbtn(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_compound_preperation.class);
        startActivity(intent);
    }

    public void chemgruopdiscussion(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_grup_discussion.class);
        startActivity(intent);
    }

    public void chemgruopdiscussionbtn(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chem_grup_discussion.class);
        startActivity(intent);
    }

    public void chemavishquiz(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chemical_projectexpo.class);
        startActivity(intent);
    }

    public void chemavishbtn(View view) {
        Intent intent=new Intent(Chem_fun_events.this,Chemical_projectexpo.class);
        startActivity(intent);
    }
}
