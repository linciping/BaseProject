package com.linciping.baseproject;

/**
 * Created by 赐平 on 2015/11/20.
 */
public interface BaseConfig {

    /**
     * 初始化数据
     */
    void initData();

    /**
     * 执行一些关闭任务
     */
     void close();
}
