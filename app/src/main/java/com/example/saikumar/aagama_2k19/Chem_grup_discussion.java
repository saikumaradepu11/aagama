package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chem_grup_discussion extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_grup_discussion);



    }

    public void group(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/y25fVrRfsOwupA4C2"));
        startActivity(intent);
    }
}
