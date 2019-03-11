package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main_dept_for_fun_events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dept_for_fun_events);
    }

    public void funmech(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,Mech_fun_events.class);
        startActivity(intent);
    }

    public void eeefun(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,Eee_fun_events.class);
        startActivity(intent);
    }

    public void itfun(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,It_fun_events.class);
        startActivity(intent);
    }

    public void chemicalfun(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,Chem_fun_events.class);
        startActivity(intent);
    }

    public void ecefun(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,Ece_fun_events.class);
        startActivity(intent);
    }

    public void civilfun(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,Civil_fun_events.class);
        startActivity(intent);
    }

    public void cse(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,Cse_fun_events.class);
        startActivity(intent);
    }

    public void pharmafun(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,Pharma_fun_events.class);
        startActivity(intent);
    }

    public void mbafun(View view) {
        Intent intent=new Intent(Main_dept_for_fun_events.this,Mba_fun_events.class);
        startActivity(intent);
    }
}
