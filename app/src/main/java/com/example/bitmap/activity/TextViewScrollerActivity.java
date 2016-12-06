package com.example.bitmap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bitmap.R;

public class TextViewScrollerActivity extends AppCompatActivity {
    private TextView mTextview;
    private Button mButtonTo;
    private Button mButtonBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewscroller);
        initView();
        initData();
    }

    private void initData() {
        System.out.println("x:"+mTextview.getScrollX()+"y:"+mTextview.getScrollY());
        mButtonTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextview.scrollTo(30,40);
            }
        });
        mButtonBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextview.scrollBy(100,20);
            }
        });
    }

    private void initView() {
        mTextview = (TextView) findViewById(R.id.textview);
        mButtonTo = (Button) findViewById(R.id.button_to);
        mButtonBy = (Button) findViewById(R.id.button_by);
    }

}
