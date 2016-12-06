package com.example.bitmap.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016/12/5.
 */
public class GestureDetectorView extends View implements GestureDetector.OnGestureListener {
    private GestureDetector mDetector;
    public GestureDetectorView(Context context) {
        super(context);
    }

    public GestureDetectorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mDetector=new GestureDetector(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean b = mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
