package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mba_fun_events extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mba_fun_events);


    }

    public void mbabest(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_best_out_of_waste.class);
        startActivity(intent);
    }

    public void mbabestbtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_best_out_of_waste.class);
        startActivity(intent);
    }

    public void mbabrand(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_brand_rangoi.class);
        startActivity(intent);
    }

    public void mbabrandbtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_brand_rangoi.class);
        startActivity(intent);
    }

    public void mbaselfie(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_adselfie.class);
        startActivity(intent);
    }

    public void mbaselfiebtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_adselfie.class);
        startActivity(intent);
    }

    public void mbatressure(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_tressurehunt.class);
        startActivity(intent);
    }

    public void mbatressurebtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_tressurehunt.class);
        startActivity(intent);
    }
    public void mbaposter(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_poster_presentation.class);
        startActivity(intent);
    }

    public void mbaposterbtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_poster_presentation.class);
        startActivity(intent);
    }

    public void mbahr(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_hr_akruthi.class);
        startActivity(intent);
    }

    public void mbahrbtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_hr_akruthi.class);
        startActivity(intent);
    }

    public void mbafinance(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_finance_event.class);
        startActivity(intent);
    }

    public void mbafinancebtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_finance_event.class);
        startActivity(intent);
    }

    public void mbamarketing(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_marketing.class);
        startActivity(intent);
    }

    public void mbamarketingbtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_marketing.class);
        startActivity(intent);

    }
    public void mbayoung(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_youngmanager.class);
        startActivity(intent);
    }

    public void mbayoungbtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_youngmanager.class);
        startActivity(intent);
    }

    public void mbabusiness(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_businessquiz.class);
        startActivity(intent);
    }

    public void mbabusinessbtn(View view) {
        Intent intent=new Intent(Mba_fun_events.this,Mba_businessquiz.class);
        startActivity(intent);
    }
}
