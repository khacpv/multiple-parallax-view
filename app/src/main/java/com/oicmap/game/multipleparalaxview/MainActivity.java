package com.oicmap.game.multipleparalaxview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.oicmap.game.multiparalaxview.DataItem;
import com.oicmap.game.multiparalaxview.ParallaxView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int sizeLarge = 70;

    int sizeDefault = 50;

    int sizeSmall = 40;

    int alpha1 = 255;

    int alpha2 = 200;

    int alpha3 = 150;

    int color1 = Color.BLACK;

    int color2 = Color.GRAY;

    float vFast = 0.15f;

    float vMedium = 0.1f;

    float vSlow = 0.05f;

    ParallaxView mParallaxView;

    ArrayList<DataItem> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mParallaxView = (ParallaxView) findViewById(R.id.parallax);

        {
            DataItem item = DataItem.Builder.make("Samsung", DataItem.Builder.MODE_DEFAULT)
                    .setXPercent(30)
                    .setYPercent(30)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("Google", DataItem.Builder.MODE_HIGH)
                    .setXPercent(15)
                    .setYPercent(50)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("Microsoft", DataItem.Builder.MODE_LOW)
                    .setXPercent(5)
                    .setYPercent(60)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("IBM Software company", DataItem.Builder.MODE_LOW)
                    .setXPercent(50)
                    .setYPercent(75)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("FPT coporation", DataItem.Builder.MODE_DEFAULT)
                    .setXPercent(25)
                    .setYPercent(35)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("Inteligent company", DataItem.Builder.MODE_HIGH)
                    .setXPercent(45)
                    .setYPercent(60)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("Inteligent company", DataItem.Builder.MODE_HIGH)
                    .setXPercent(15)
                    .setYPercent(80)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("Inteligent company", DataItem.Builder.MODE_HIGH)
                    .setXPercent(65)
                    .setYPercent(90)
                    .build();
            data.add(item);
        }

        mParallaxView.setData(data);
    }
}
