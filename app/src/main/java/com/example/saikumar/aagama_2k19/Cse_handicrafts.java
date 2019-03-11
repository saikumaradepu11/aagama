package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cse_handicrafts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_handicrafts);
    }

    public void csehandi(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfAjtOTmmmfluR9k7wn0dQ-9v-lPTGpzJ9KWDYCji_mUZFO5g/viewform?vc=0&&c=0&&w=1"));
        startActivity(intent);
    }
}
