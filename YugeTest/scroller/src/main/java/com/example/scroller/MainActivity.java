package com.example.scroller;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CustomeView view = (CustomeView) findViewById(R.id.activity_main);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // x , y 如果是正值，则向左，向上 滚动 ，负的才是 往右 往下 滚动
                view.smoothScrollTo(-50,-60);
            }
        },2000);
    }
}
