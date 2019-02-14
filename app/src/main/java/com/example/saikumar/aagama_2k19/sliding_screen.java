package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class sliding_screen extends AppCompatActivity {

    ViewPager mslideviewpager;
    LinearLayout mDotlayout;

    sliderAdapter sliderdapter1;

    TextView prevtext,nexttext;

    TextView Dots[];

    int mcurrentpage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_screen);

        mslideviewpager=(ViewPager)findViewById(R.id.sliderviewpager);
        mDotlayout=(LinearLayout) findViewById(R.id.dot_linearLayout);

        prevtext=findViewById(R.id.previoustext);
        nexttext=findViewById(R.id.nexttext);

        sliderdapter1=new sliderAdapter(this);
        mslideviewpager.setAdapter(sliderdapter1);

        addDotindicator(0);

        mslideviewpager.addOnPageChangeListener(viewlistener);

        nexttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mcurrentpage==1)
                {
                    Intent intent=new Intent(sliding_screen.this,Homepage.class);
                    startActivity(intent);
                }
                else
                {
                    mslideviewpager.setCurrentItem(mcurrentpage+1);

                }
            }
        });

        prevtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mslideviewpager.setCurrentItem(mcurrentpage-1);
            }
        });




    }

    public void addDotindicator(int position) {
        Dots = new TextView[2];
        mDotlayout.removeAllViews();

        for (int i = 0; i < Dots.length; i++) {
            Dots[i] = new TextView(this);
            Dots[i].setText(Html.fromHtml("&#8226"));
            Dots[i].setTextSize(35);
            Dots[i].setTextColor(getResources().getColor(R.color.colorAccent));

            mDotlayout.addView(Dots[i]);

        }

        if(Dots.length>0)
        {
            Dots[position].setTextColor(getResources().getColor(R.color.red));
        }
    }

    ViewPager.OnPageChangeListener viewlistener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotindicator(position);
            mcurrentpage=position;

            if(position==0)
            {
                nexttext.setEnabled(true);
                prevtext.setEnabled(false);
                prevtext.setVisibility(View.INVISIBLE);
                prevtext.setText("");
                nexttext.setText("Next");
                nexttext.setGravity(Gravity.CENTER_VERTICAL);
                prevtext.setGravity(Gravity.CENTER_VERTICAL);

            }
            else
            {
                nexttext.setEnabled(true);
                prevtext.setEnabled(true);
                prevtext.setVisibility(View.VISIBLE);
                prevtext.setText("Previous");
                nexttext.setText("Finish");
                nexttext.setGravity(Gravity.CENTER_VERTICAL);
                prevtext.setGravity(Gravity.CENTER_VERTICAL);

            }



        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}
