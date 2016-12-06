package com.example.bitmap.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Scroller;

/**
 * 实现图片滑动的效果
 * Created by Administrator on 2016/12/6.
 */
public class ImageScrollerView extends LinearLayout {
    private Scroller mScroller;
    private int startX;
    private int duration;
    private boolean flag=true;
    public ImageScrollerView(Context context) {
        super(context);
    }

    public ImageScrollerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mScroller=new Scroller(context);
        duration=3000;
    }

    @Override
    public void computeScroll() {
        if (mScroller.computeScrollOffset()){
            scrollTo(mScroller.getCurrX(),0);
            invalidate();
        }
    }
    public void beginScroll(){
        if(flag){
            mScroller.startScroll(mScroller.getCurrX(),0,-250,0,duration);
            startX=mScroller.getCurrX();
            flag=false;
        }else {
            mScroller.startScroll(-startX,0,80,0,duration);
            flag=true;
        }
        invalidate();
    }
}
