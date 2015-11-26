package com.linciping.baseproject;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 赐平 on 2015/11/20.
 */
public abstract class BaseFragment extends Fragment {

    private int layoutId;
    private Context mContext;
    private View targetView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(mContext.getPackageName(), "创建Fragment");
        initData();
    }

    public BaseFragment(Context context, int layoutId)
    {
        this.layoutId=layoutId;
        this.mContext=context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(mContext.getPackageName(),"创建视图");
        targetView=inflater.inflate(layoutId,container,false);
        initView();
        return targetView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(mContext.getPackageName(), "销毁视图");
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
}
