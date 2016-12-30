package com.example.zy1.yugetest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by caoxinyu on 2016/11/9.
 * <p>
 * 类的作用:
 */

public class MysecondImageView extends LinearLayout {

    public MysecondImageView(Context context) {
        super(context);
    }

    public MysecondImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MysecondImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Logger.i("aaaaa");

        return super.onInterceptTouchEvent(ev);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Logger.i("aaaaa");

        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Logger.i("aaaaa");

        return super.dispatchTouchEvent(ev);
    }
}
