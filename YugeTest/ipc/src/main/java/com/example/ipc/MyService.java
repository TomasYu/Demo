package com.example.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.Nullable;

/**
 * Created by caoxinyu on 2016/12/30.
 * <p>
 * 类的作用:
 */

public class MyService extends Service {
    Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
            Logger.i((String) msg.obj);

//            switch (msg.what){
//                case 1:
//                    Logger.i(msg.obj.toString());
//                   break;
//            }
        }
    };
    private Messenger mMessenger;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mMessenger = new Messenger(mHandler);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mMessenger.getBinder();
    }
}
