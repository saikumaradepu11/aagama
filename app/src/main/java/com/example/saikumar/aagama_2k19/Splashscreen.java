package com.example.saikumar.aagama_2k19;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.io.File;

public class Splashscreen extends AppCompatActivity {

    Animation animation;
    ImageView anurag,aagama;
    private Boolean firstTime = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        deleteCache(this);
        // clearApplicationData();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

        anurag=(ImageView)findViewById(R.id.anuragsplogo);
        aagama=(ImageView)findViewById(R.id.aagamasplogo);

        animation=AnimationUtils.loadAnimation(Splashscreen.this,R.anim.push_fromleft);
        anurag.setAnimation(animation);

        animation=AnimationUtils.loadAnimation(Splashscreen.this,R.anim.push_fromright);
        aagama.setAnimation(animation);

        Thread thread=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    if(isFirstTime()) {
                        startActivity(new Intent(Splashscreen.this, sliding_screen.class));
                        finish();
                    }else{
                        startActivity(new Intent(Splashscreen.this, Homepage.class));
                        finish();
                    }
                }
            }
        };
        thread.start();

    }

    private boolean isFirstTime() {
        if (firstTime == null) {
            SharedPreferences mPreferences = this.getSharedPreferences("first_time", Context.MODE_PRIVATE);
            firstTime = mPreferences.getBoolean("firstTime", true);
            if (firstTime) {
                SharedPreferences.Editor editor = mPreferences.edit();
                editor.putBoolean("firstTime", false);
                editor.commit();
            }
        }
        return firstTime;
    }

    public static void deleteCache(Context context){
        try {
            File dir = context.getCacheDir();
            if (dir != null && dir.isDirectory()) {
                deleteDir(dir);
            }
        } catch (Exception e) {}
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }
}
