package com.example.bitmap.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.bitmap.R;
import com.example.bitmap.view.ImageScrollerView;

public class ScrollerActivity extends AppCompatActivity {
    private Button mButton;
    private ImageScrollerView mImagescrollview;
    private ImageView mImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroller);
        initView();
        initData();
    }
    private void initView() {
        mButton = (Button) findViewById(R.id.button);
        mImagescrollview = (ImageScrollerView) findViewById(R.id.imagescrollview);
        mImage = (ImageView) findViewById(R.id.image);
    }
    private void initData(){
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImagescrollview.beginScroll();
            }
        });
    }
}
