package com.example.saikumar.aagama_2k19;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class sliderAdapter  extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public sliderAdapter(Context context) {
        this.context = context;
    }

    public String[] sliding_hedings = {
            "About this app?",
            "About Aagama"
    };

    public String[] sliding_descs = {
            "This application will guide you through the events that are conducted in the Aagama 2K19 fest. All the Events are listed department wise. The details of each event such as description, rules, coordinators and registration fee are mentioned. Interested Students can also register through this application. We hope this application will help you to gain the knowledge about the events that are conducted in Aagama-2K19. Have a nice day. ",
            "To be abreast of recent developments and to provide a common platform to the budding technocrafts from all over the country, to have knowledge shared and to explore new horizons in the concerned Engineering, Pharmaceutical and Management streams, Anurag Group of institutions is going to conduct Aagama 2K19 on 22nd and 23rd March, 2019. "
    };

    @Override
    public int getCount() {
        return sliding_hedings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (ConstraintLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view=layoutInflater.inflate(R.layout.slide_layout,container,false);

        TextView slide_heading=(TextView)view.findViewById(R.id.slide_heading);
        TextView slide_desc=(TextView)view.findViewById(R.id.slide_desc);
        Button finishbutton=(Button)view.findViewById(R.id.finishbtn);

        slide_heading.setText(sliding_hedings[position]);
        slide_desc.setText(sliding_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
