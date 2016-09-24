package com.oicmap.game.multipleparalaxview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.oicmap.game.multiparalaxview.DataItem;
import com.oicmap.game.multiparalaxview.ParallaxView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ParallaxView mParallaxView;

    ArrayList<DataItem> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mParallaxView = (ParallaxView) findViewById(R.id.parallax);

        {
            DataItem item = DataItem.Builder.make("Nhất cử lưỡng tiện", DataItem.Builder.MODE_DEFAULT)
                    .setXPercent(0)
                    .setYPercent(0)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("Xôi hỏng bỏng không", DataItem.Builder.MODE_HIGH)
                    .setXPercent(10)
                    .setYPercent(10)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("\"Đói cho sạch, rách cho ...\"", DataItem.Builder.MODE_LOW)
                    .setXPercent(20)
                    .setYPercent(30)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("\"Mật ngọt chết ...\"?", DataItem.Builder.MODE_DEFAULT)
                    .setXPercent(30)
                    .setYPercent(50)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("\"Phép ... thua lệ làng\"?", DataItem.Builder.MODE_HIGH)
                    .setXPercent(40)
                    .setYPercent(65)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("\"Chim sa ... lặn\"?", DataItem.Builder.MODE_LOW)
                    .setXPercent(50)
                    .setYPercent(75)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("Nước uống nhớ nguồn", DataItem.Builder.MODE_DEFAULT)
                    .setXPercent(60)
                    .setYPercent(20)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("\"Ăn bờ ở ...\"?", DataItem.Builder.MODE_DEFAULT)
                    .setXPercent(70)
                    .setYPercent(35)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("Nem công chả phượng", DataItem.Builder.MODE_HIGH)
                    .setXPercent(80)
                    .setYPercent(55)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("\"Xa mặt cách ...\"?", DataItem.Builder.MODE_LOW)
                    .setXPercent(90)
                    .setYPercent(70)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("\"Đất rộng trời ...\"?", DataItem.Builder.MODE_DEFAULT)
                    .setXPercent(10)
                    .setYPercent(80)
                    .build();
            data.add(item);
        }

        {
            DataItem item = DataItem.Builder.make("\"Ăn nên làm ...\"?", DataItem.Builder.MODE_LOW)
                    .setXPercent(20)
                    .setYPercent(90)
                    .build();
            data.add(item);
        }

        mParallaxView.setData(data);
    }
}
