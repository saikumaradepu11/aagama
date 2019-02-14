package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.ref.PhantomReference;

public class MainActivityDept extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dept);
    }

    public void cse(View view) {
        Intent intent=new Intent(MainActivityDept.this,CsedepartmentEvents.class);
        startActivity(intent);
    }

    public void ece(View view) {
        Intent intent=new Intent(MainActivityDept.this,Ecedepartmentevents.class);
        startActivity(intent);
    }

    public void eee(View view) {
        Intent intent=new Intent(MainActivityDept.this,Eeedepartmentevents.class);
        startActivity(intent);
    }

    public void civil(View view) {
        Intent intent=new Intent(MainActivityDept.this,Civildepartmentevents.class);
        startActivity(intent);
    }


    public void chem(View view) {
        Intent intent=new Intent(MainActivityDept.this,Chemicaldeptevenets.class);
        startActivity(intent);
    }

    public void it(View view) {
        Intent intent=new Intent(MainActivityDept.this,Itdepertmentevents.class);
        startActivity(intent);
    }

    public void pharm(View view) {
        Intent intent=new Intent(MainActivityDept.this,pharmaevents.class);
        startActivity(intent);
    }

    public void chemicalClick(View view) {
        Intent intent=new Intent(MainActivityDept.this,Chemicaldeptevenets.class);
        startActivity(intent);
    }
}
