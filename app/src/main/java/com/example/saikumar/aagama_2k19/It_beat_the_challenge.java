package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class It_beat_the_challenge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_beat_the_challenge);
    }

    public void itbeatreg(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfEcrC9mZr3QrHJt0ZcOE-pTZVaN4vxuM48Rkvg-z0l-DuBnA/viewform"));
        startActivity(intent);
    }
}
