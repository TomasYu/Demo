package com.example.scroller;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Scroller;

/**
 * Created by caoxinyu on 2017/1/5.
 * <p>
 * 类的作用:
 */

public class CustomeView extends LinearLayout {
    private Scroller mScroller;
    public CustomeView(Context context) {
        super(context);
        init(context);
    }

    public CustomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mScroller = new Scroller(context);
    }
    //调用此方法滚动到目标位置
    public void smoothScrollTo(int x,int y){
        int dx = x- mScroller.getFinalX();
        int dy = x- mScroller.getFinalY();
        smoothScrollBy(dx,dy);
    }
    //调用此方法设置滚动的相对偏移
    private void smoothScrollBy(int dx, int dy) {
        //设置mScroller的滚动偏移量
        mScroller.startScroll(mScroller.getFinalX(),mScroller.getFinalY(),dx,dy);
        invalidate();//这里必须调用invalidate()才能保证computeScroll()会被调用，否则不一定会刷新界面，看不到滚动效果
    }

    @Override
    public void computeScroll() {
        //先判断mScroller滚动是否完成
        if (mScroller.computeScrollOffset()) {

            //这里调用View的scrollTo()完成实际的滚动     果然，不调用，就不会滚动
            scrollTo(mScroller.getCurrX(), mScroller.getCurrY());

            //必须调用该方法，否则不一定能看到滚动效果
            postInvalidate();
        }
        super.computeScroll();
    }
}
