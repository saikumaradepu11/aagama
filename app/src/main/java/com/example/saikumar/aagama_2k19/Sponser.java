package com.example.saikumar.aagama_2k19;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.util.Linkify;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Sponser extends AppCompatActivity {

    CardView card;
    ImageView image;
    TextView textView;
    Button button;
    Animation atg, atgtwo, atgthree;



    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponser);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        atgtwo = AnimationUtils.loadAnimation(this, R.anim.atgtwo);
        atgthree = AnimationUtils.loadAnimation(this, R.anim.atgthree);


        card=findViewById(R.id.card2k19);
        image=findViewById(R.id.image2k19);
        textView=findViewById(R.id.text2k19);
        button=findViewById(R.id.btn2k19);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://aagama2k19.com/sponsers.html"));
                startActivity(intent);
            }
        });

        // pass an animation
        card.startAnimation(atg);

        image.startAnimation(atgtwo);
        textView.startAnimation(atgtwo);

        button.startAnimation(atgthree);




    }

}
