package com.linciping.baseproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import butterknife.ButterKnife;

/**
 * Created by 赐平 on 2015/11/20.
 */
public abstract class BaseActivity extends AppCompatActivity {

    /**
     * 缓存文件名称
     */
    public static final String FILENAME="androidunit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(this.getPackageName(), "创建Activity");
        initData();
        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(this.getPackageName(), "开始Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(this.getPackageName(), "销毁Activity");
        close();
    }

    /**
     * 初始化控件
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 执行一些关闭任务
     */
    protected abstract void close();

    /**
     * Activity跳转
     * @param activity
     * @param cla
     */
    protected void toOtherActivity(Activity activity,Class<?> cla)
    {
        Intent intent=new Intent(activity,cla);
        startActivity(intent);
    }

    /**
     * 生成Toast弹出层
     * @param message 消息
     */
    protected void toast(String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 生成Toast弹出层
     * @param message 消息
     * @param time 时间
     */
    protected void toast(String message,int time)
    {
        Toast.makeText(getApplicationContext(), message, time).show();
    }

    /**
     * 返回上级实现
     */
    protected void toBack()
    {
        onBackPressed();
    }
}
