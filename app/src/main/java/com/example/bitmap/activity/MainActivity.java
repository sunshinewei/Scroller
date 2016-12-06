package com.example.bitmap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;

import com.example.bitmap.R;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private VelocityTracker mVelocityTracker;

    private GestureDetector mGestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGestureDetector=new GestureDetector(this);
    }

    /**GestureDetector手势检测的使用
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mGestureDetector.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        System.out.println("按下了");
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

    /**VelocityTracker的应用，用于追踪手指在屏幕滑动过程中的速度。
     * @param event
     * @return
     */
   /* @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(mVelocityTracker==null){
            mVelocityTracker= VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(event);
        mVelocityTracker.computeCurrentVelocity(1000);
        float velocityX= mVelocityTracker.getXVelocity();
        float velocityY = mVelocityTracker.getYVelocity();
        System.out.println("X轴上的速度"+velocityX+"Y轴上的速度"+velocityY);
        int slop = ViewConfiguration.get(this).getScaledTouchSlop();
        System.out.println("系统规定的滑动距离为："+slop);
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mVelocityTracker.clear();
        mVelocityTracker.recycle();
    }*/
}
