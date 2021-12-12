package org.techtown.icecom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RamenDetail extends Activity {
    private int img;
    private int img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* xml과 연결 */
        setContentView(R.layout.activity_ramen_detail);
        Intent intent = getIntent();

        ImageView profile = (ImageView) findViewById(R.id.img_1);
        ImageView profile2 = (ImageView) findViewById(R.id.img_2);
        TextView name=(TextView) findViewById(R.id.detail_name);
        TextView explain=(TextView) findViewById(R.id.detail_explain);
        TextView explain2=(TextView) findViewById(R.id.detail_explain2);

        img=Integer.parseInt(intent.getStringExtra("resId"));
        profile.setImageResource(img);
        img2=Integer.parseInt(intent.getStringExtra("resId2"));
        profile2.setImageResource(img2);
        name.setText(intent.getStringExtra("name"));
        explain.setText(intent.getStringExtra("explain"));
        explain2.setText(intent.getStringExtra("explain2"));
    }
}