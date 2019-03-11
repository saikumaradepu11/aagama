package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mba_hr_akruthi extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mba_hr_akruthi);


    }

    public void mbah(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfFhpVmYlvbxq8fVCUq9t2yi18ITmdvNDK3XrIMpabeP7nGvA/viewform"));
        startActivity(intent);
    }
}
