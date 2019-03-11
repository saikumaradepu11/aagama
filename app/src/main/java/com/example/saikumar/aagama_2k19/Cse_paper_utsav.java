package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cse_paper_utsav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_paper_utsav);
    }

    public void cseutsav(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://bit.ly/PaperUtsavCSE"));
        startActivity(intent);
    }
}
