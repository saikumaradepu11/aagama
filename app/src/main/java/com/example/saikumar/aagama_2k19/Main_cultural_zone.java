package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main_cultural_zone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cultural_zone);
    }

    public void culnar(View view) {
        Intent intent=new Intent(Main_cultural_zone.this,Nartanashala.class);
        startActivity(intent);
    }

    public void culnarbtn(View view) {
        Intent intent=new Intent(Main_cultural_zone.this,Nartanashala.class);
        startActivity(intent);
    }

    public void culchaya(View view) {
        Intent intent=new Intent(Main_cultural_zone.this,Chayachitra.class);
        startActivity(intent);
    }

    public void culchayabtn(View view) {
        Intent intent=new Intent(Main_cultural_zone.this,Chayachitra.class);
        startActivity(intent);
    }

    public void cullekhan(View view) {
        Intent intent=new Intent(Main_cultural_zone.this,Lekhan_cul.class);
        startActivity(intent);
    }

    public void cullekahnbtn(View view) {
        Intent intent=new Intent(Main_cultural_zone.this,Lekhan_cul.class);
        startActivity(intent);
    }

    public void culsing(View view) {
        Intent intent=new Intent(Main_cultural_zone.this,Singing_cul.class);
        startActivity(intent);
    }

    public void culsingbtn(View view) {
        Intent intent=new Intent(Main_cultural_zone.this,Singing_cul.class);
        startActivity(intent);
    }
}
