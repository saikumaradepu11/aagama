package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cse_2d_crypt_it extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_2d_crypt_it);

    }

    public void cse2d(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://bit.ly/D-cryptIt"));
        startActivity(intent);
    }
}
