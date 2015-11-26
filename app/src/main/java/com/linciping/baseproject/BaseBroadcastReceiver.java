package com.linciping.baseproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 赐平 on 2015/11/20.
 */
public abstract class BaseBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(context.getPackageName(),"接收广播，来自"+context.getClass().getName());
    }

    /**
     * 初始化数据
     */
    protected abstract void initData();

}
