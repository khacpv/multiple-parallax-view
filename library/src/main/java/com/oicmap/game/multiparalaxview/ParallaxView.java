package com.oicmap.game.multiparalaxview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FRAMGIA\pham.van.khac on 9/23/16.
 */
public class ParallaxView extends FrameLayout {

    private List<DataItem> mStringList = new ArrayList<>();

    Paint paintText;

    String log = "";

    Rect bound = new Rect();

    Handler mHandler = new Handler();

    boolean debug = true;

    Runnable update = new Runnable() {
        @Override
        public void run() {
            for (DataItem item : mStringList) {
                item.xPercent += item.velocity;
                if (item.xPercent > 100) {
                    item.xPercent = 0;
                }
            }
            invalidate();
            mHandler.postDelayed(update, 10);
        }
    };

    public ParallaxView(Context context) {
        super(context);
        init(null);
    }

    public ParallaxView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ParallaxView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        paintText = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);
        paintText.setColor(Color.GRAY);
        paintText.setTextSize(40);
        paintText.setStyle(Paint.Style.FILL);
        paintText.setTextAlign(Paint.Align.LEFT);

        setWillNotDraw(false);

        debug = BuildConfig.DEBUG;
    }

    public void setData(List<DataItem> data) {
        this.mStringList = data;
        invalidate();
        mHandler.removeCallbacks(update);
        mHandler.post(update);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (debug) {
            drawDebug(canvas);
        }

        for (DataItem item : mStringList) {
            paintText.setTextSize(item.size);
            paintText.setColor(item.color);
            paintText.getTextBounds(item.text, 0, item.text.length(), bound);
            float alpha;
            if (item.xPercent <= 20) {
                alpha = item.xPercent / 20;
            } else if (item.xPercent >= 80) {
                alpha = (100f - item.xPercent) / 20;
            } else {
                alpha = 1;
            }
            paintText.setAlpha((int) (alpha * 255 * item.alpha));
            canvas.drawText(item.text, //
                    item.xPercent * getWidth() / 100, //
                    item.yPercent * getHeight() / 100 + bound.height(), //
                    paintText);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mHandler.removeCallbacks(update);
    }

    private void drawDebug(Canvas canvas) {
        log = getWidth() + "-" + getHeight();
        Log.e("TAG", "log:" + log);
        paintText.getTextBounds(log, 0, log.length(), bound);
        canvas.drawText(log, 0, bound.height(), paintText);
    }
}

