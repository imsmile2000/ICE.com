package org.techtown.icecom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyItemView extends LinearLayout {
    TextView textView1;
    ImageView imageView;

    public MyItemView(Context context){
        super(context);
        init(context);
    }
    public MyItemView(Context context, @Nullable AttributeSet attrs){
        super(context,attrs);
        init(context);
    }
    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_my_item, this, true);

        textView1 = (TextView) findViewById(R.id.textView1);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setName(String name) {
        textView1.setText(name);
    }

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
}