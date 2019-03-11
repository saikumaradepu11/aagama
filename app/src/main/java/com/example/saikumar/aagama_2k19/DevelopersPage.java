package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DevelopersPage extends AppCompatActivity {

    ImageView saical,saimsg;
    TextView saicalt,saimsgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers_page);

        saical=findViewById(R.id.saicalimg);
        saimsg=findViewById(R.id.saiemailimg);
        saicalt=findViewById(R.id.sainum);
        saimsgt=findViewById(R.id.saiemail);

        saical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:9951126452"));
                startActivity(intent);
            }
        });

        saimsgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email=new Intent(Intent.ACTION_SEND);
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_SUBJECT,"email subject");
                email.putExtra(Intent.EXTRA_TEXT,"Body of Email");
                startActivity(email);

            }
        });

        saimsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email=new Intent(Intent.ACTION_SEND);
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_SUBJECT,"email subject");
                email.putExtra(Intent.EXTRA_TEXT,"Body of Email");
                startActivity(email);

            }
        });

        saicalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:9951126452"));
                startActivity(intent);
            }
        });
    }
}
