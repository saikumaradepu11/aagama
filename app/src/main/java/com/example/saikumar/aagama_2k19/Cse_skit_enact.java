package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cse_skit_enact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_skit_enact);

    }


    public void cseskite(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSceQl6HLztCodQLjQJ0jL-jHy1S5LViCm6dyd9sNZlijLImzg/viewform?vc=0&&c=0&&w=1"));
        startActivity(intent);
    }
}
