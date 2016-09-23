package com.oicmap.game.multiparalaxview;

import android.graphics.Color;
import java.util.Random;

public class DataItem {
    public String text;

    public int color;

    public float alpha = 1;

    public float size;

    public float xPercent;

    public float yPercent;

    public float velocity = 0;

    public static final class Builder {

        public static final int MODE_DEFAULT = 0;

        public static final int MODE_LOW = 1;

        public static final int MODE_HIGH = 2;

        DataItem item = new DataItem();

        public Builder(String text) {
            item.text = text;
        }

        public Builder setColor(int color) {
            item.color = color;
            return this;
        }

        public Builder setAlpha(float alpha) {
            item.alpha = alpha;
            return this;
        }

        public Builder setSize(float size) {
            item.size = size;
            return this;
        }

        public Builder setXPercent(float xPercent) {
            item.xPercent = xPercent;
            return this;
        }

        public Builder setYPercent(float yPercent) {
            item.yPercent = yPercent;
            return this;
        }

        public Builder setVelocity(float velocity) {
            item.velocity = velocity;
            return this;
        }

        public DataItem build(){
            return item;
        }

        public static Builder make(String text, int mode){
            Builder builder = new Builder(text);
            switch (mode){
                case MODE_LOW:
                    builder.setColor(Color.DKGRAY)
                            .setAlpha(0.25f)
                            .setSize(20)
                            .setVelocity(random(0.15f,0.3f));
                    break;
                case MODE_HIGH:
                    builder.setColor(Color.BLACK)
                            .setAlpha(1f)
                            .setSize(50)
                            .setVelocity(random(1.4f,1.6f));
                    break;
                case MODE_DEFAULT:
                    builder.setColor(Color.GRAY)
                            .setAlpha(0.8f)
                            .setSize(35)
                            .setVelocity(random(0.1f,0.5f));
                    break;
            }
            return builder;
        }

        public static float random(float min, float max){
            Random ran = new Random();
            float x = ran.nextInt((int)(max*100 - min*100)) + min;
            return x/100;
        }
    }
}