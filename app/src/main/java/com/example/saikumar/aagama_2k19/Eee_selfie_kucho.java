package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Eee_selfie_kucho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_selfie_kucho);

    }

    public void selfie(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://tinyurl.com/selfie-kiecho"));
        startActivity(intent);
    }
}
