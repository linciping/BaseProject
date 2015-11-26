package com.linciping.baseproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by 赐平 on 2015/11/20.
 */
public abstract class BaseService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(this.getPackageName(), "绑定Service");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(this.getPackageName(), "开始Service");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initData();
        Log.i(this.getPackageName(), "创建Service");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(this.getPackageName(), "销毁Service");
        close();
    }

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 执行一些关闭任务
     */
    protected abstract void close();
}
