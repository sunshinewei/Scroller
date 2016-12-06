package com.example.bitmap.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/5.
 */
public class VelocityTrackerDemo extends TextView {
    private VelocityTracker mVelocityTracker;
    public VelocityTrackerDemo(Context context) {
        super(context);
    }

    public VelocityTrackerDemo(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

}
