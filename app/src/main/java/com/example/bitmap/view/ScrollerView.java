package com.example.bitmap.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Scroller;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/5.
 */
public class ScrollerView extends TextView {

    private Scroller mScroller;
    public ScrollerView(Context context) {
        super(context);
    }

    public ScrollerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
