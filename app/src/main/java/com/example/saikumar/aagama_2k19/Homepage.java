package com.example.saikumar.aagama_2k19;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Homepage extends AppCompatActivity {

    private TextView txtTimerDay, txtTimerHour, txtTimerMinute, txtTimerSecond;
    private TextView tvEvent;
    private Handler handler;
    private Runnable runnable;

    ImageView logo;


    String currentPage = "home";
    BoomMenuButton bmb;
    ArrayList<Integer> images;
    ArrayList<String> textInfo;
    android.app.FragmentManager fm2 = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        txtTimerDay = (TextView) findViewById(R.id.txtTimerDay);
        txtTimerHour = (TextView) findViewById(R.id.txtTimerHour);
        txtTimerMinute = (TextView) findViewById(R.id.txtTimerMinute);
        txtTimerSecond = (TextView) findViewById(R.id.txtTimerSecond);
        tvEvent = (TextView) findViewById(R.id.tvhappyevent);
        logo=(ImageView)findViewById(R.id.homelogo);
        countDownStart();



        Toolbar toolbar = findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        // getSupportActionBar().setIcon(R.drawable.launch1);
        // toolbar.setLogo(R.drawable.home_icon);

        bmb = findViewById(R.id.boom);
        images = new ArrayList<>();
        textInfo = new ArrayList<>();
        setInitialData();
        bmb.setButtonEnum(ButtonEnum.TextOutsideCircle);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_6_1);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_6_1);

        Animation blinkLogo = AnimationUtils.loadAnimation(this, R.anim.logoanimation);
        logo.setAnimation(blinkLogo);


        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder();
            builder.normalImageRes(images.get(i));
            builder.normalText(textInfo.get(i));
            builder.textSize(13);
            builder.normalColor(R.color.colorPrimary);
            builder.pieceColor(Color.WHITE);
            builder.listener(new OnBMClickListener() {

                android.app.FragmentManager fm = getFragmentManager();

                @Override
                public void onBoomButtonClick(int index) {
                    if (index == 5) {
                        currentPage = "home";

                    } else if (index == 0) {
                        currentPage = "nhome";
                        startActivity(new Intent(Homepage.this,About.class));

                    }
                    else if (index == 1) {
                        currentPage = "nhome";
                        startActivity(new Intent(Homepage.this,MainactivityforDev.class));
                    } else if (index == 2) {
                        currentPage = "nhome";
                        startActivity(new Intent(Homepage.this,Sponser.class));

                    } else if (index == 3) {
                        currentPage = "nhome";
                        startActivity(new Intent(Homepage.this,Contact.class));

                    } else if (index == 4) {
                        currentPage = "nhome";

                        if (appInstalledOrNot("com.google.android.apps.maps")) {

                            String strUri = "http://maps.google.com/maps?q=Anurag Group of Institutions, Venkatapur, Telangana";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(strUri));
                            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                            startActivity(intent);

                        } else {
                            startActivity(new Intent(Homepage.this, com.example.saikumar.aagama_2k19.Location.class));

                        }


                    }

                }
            });
            bmb.addBuilder(builder);
        }



    }

    private void setInitialData() {

        images.add(R.drawable.about_icon);
        images.add(R.drawable.developer);
        images.add(R.drawable.sponsor);
        images.add(R.drawable.contact);
        images.add(R.drawable.adress);
        images.add(R.drawable.homepage);


        textInfo.add("About");
        textInfo.add("Developer Team");
        textInfo.add("Sponsor");
        textInfo.add("Contact");
        textInfo.add("Location");
        textInfo.add("Home");
    }

    private void countDownStart() {

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2019-03-22");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtTimerDay.setText("" + String.format("%02d", days));
                        txtTimerHour.setText("" + String.format("%02d", hours));
                        txtTimerMinute.setText(""
                                + String.format("%02d", minutes));
                        txtTimerSecond.setText(""
                                + String.format("%02d", seconds));
                    } else {
                        tvEvent.setVisibility(View.VISIBLE);
                        tvEvent.setText("The Event is started!");
                        textViewGone();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    private boolean appInstalledOrNot(String uri)
    {
        PackageManager pm = getPackageManager();
        boolean app_installed = false;
        try
        {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        }
        catch (PackageManager.NameNotFoundException e)
        {
            app_installed = false;
        }
        return app_installed ;
    }

    public void textViewGone() {
        findViewById(R.id.LinearLayout10).setVisibility(View.GONE);
        findViewById(R.id.LinearLayout11).setVisibility(View.GONE);
        findViewById(R.id.LinearLayout12).setVisibility(View.GONE);
        findViewById(R.id.LinearLayout13).setVisibility(View.GONE);
        findViewById(R.id.textView1).setVisibility(View.GONE);
        findViewById(R.id.countdownlefttxt).setVisibility(View.GONE);
    }


    public void clicked(View v){
        Intent i = new Intent(Homepage.this,MainActivityforZone.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        if(currentPage.equals("nhome")){

        }
        else if(currentPage.equals("home")) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

    }

}
