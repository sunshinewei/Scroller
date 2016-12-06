package com.example.bitmap.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.example.bitmap.R;

/**
 * 绘制飘动的旗帜
 * Created by Administrator on 2016/11/29.
 */
public class BitMapMesh extends View {
    private int heightCount = 10, widthCount = 10;
    private Bitmap mBitmap;
    private float bitmapWidth, bitmapHeight;
    private float verts[] = new float[heightCount*widthCount];
    private float orig[] = new float[heightCount*widthCount];
    float k;
    public BitMapMesh(Context context, AttributeSet attrs) {
        super(context, attrs);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.photo);
        bitmapHeight = mBitmap.getHeight();
        bitmapWidth = mBitmap.getWidth();
        initData();
    }

    public BitMapMesh(Context context) {
        super(context);
    }

    private void flagWave(){
        for (int i=0;i<=heightCount;i++){
            for (int j=0;j<widthCount;j++){
                verts[(j*(widthCount+1)+i)*2+0]+=0;
                float offsetY= (float) Math.sin(i/widthCount*2*Math.PI*k);
                verts[(j*(widthCount+1)+i)*2+1]= orig[(j*widthCount+i)*2+1]+offsetY;
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        flagWave();
        k+=0.1f;
        canvas.drawBitmapMesh(mBitmap,widthCount,heightCount,verts,0,null,0,null);
        invalidate();
    }

    private void initData() {
        int index = 0;
        for (int y = 0; y <= heightCount; y++) {
            float fy = bitmapHeight * y / heightCount;
            for (int x = 0; x <= widthCount; x++) {
                float fx = bitmapWidth * x / widthCount;
                verts[index * 2 + 0] = fx;
                verts[index*2+1]=fy+100;
//                orig[index * 2 + 0]=verts[index * 2 + 0] = fx;
                orig[index*2+1]=verts[index*2+1];
                index+=1;
            }
        }
    }

}
