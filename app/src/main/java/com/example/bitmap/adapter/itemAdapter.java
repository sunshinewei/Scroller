package com.example.bitmap.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.bitmap.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/5.
 */
public class itemAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private Context mContext;
    private List<Integer> mList=new ArrayList<>();
    private ViewHolder mViewHolder;
    public itemAdapter(Context mContext){
        this.mContext=mContext;
        mInflater=LayoutInflater.from(mContext);
        for (int i=0;i<100;i++){
            mList.add(i);
        }
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            mViewHolder=new ViewHolder();
            convertView = mInflater.inflate(R.layout.textview, null, false);
            mViewHolder.mTextView= (TextView) convertView.findViewById(R.id.textview);
            convertView.setTag(mViewHolder);
        }else {
            mViewHolder= (ViewHolder) convertView.getTag();
        }
        mViewHolder.mTextView.setText("测试数据"+position);
        return convertView;
    }

    class ViewHolder{
        private TextView mTextView;

    }

}
