package com.example.android.myapplication;


import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Sumeet Jain on 25-02-2018.
 */

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public SlideAdapter(Context context){
        this.context=context;
    }

    //Array
    public int[] list_images={

            R.drawable.b1,
            R.drawable.b4,
           R.drawable.b2
           //   R.drawable.b3

            // R.drawable.blood1,
            // R.drawable.blood2,
            // R.drawable.blood3,
    };

    public String[] list_title={

            "",
            "",
            "",
           // "Train"
    };

    public String[] list_description={

            "",
            "",
            "",
           // "10% cashback on first train booking"
    };
    public int[] list_color={

            Color.rgb(193, 172, 44),
            Color.rgb(193, 66, 44),
            Color.rgb(193, 41, 249),
           // Color.rgb(193, 172, 44)
           // Color.rgb(68, 83, 242)

    };

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view==(LinearLayout)obj;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);

        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.slidelinearlayout);
        ImageView img = (ImageView)view.findViewById(R.id.slideimg);
        TextView txt1 = (TextView) view.findViewById(R.id.slidetitle);
        TextView txt2 = (TextView) view.findViewById(R.id.slidedescription);


        img.setImageResource(list_images[position]);
        txt1.setText(list_title[position]);
        txt2.setText(list_description[position]);
        linearLayout.setBackgroundColor(list_color[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}