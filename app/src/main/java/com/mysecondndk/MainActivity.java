package com.mysecondndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mysecondndk.jni.JniUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView jjjj = (TextView) findViewById(R.id.jjjj);

        jjjj.setText(new JniUtil().getString());

    }
}
