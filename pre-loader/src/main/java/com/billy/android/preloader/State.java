package com.billy.android.preloader;


import com.billy.android.preloader.interfaces.DataListener;

/**
 * 预加载状态接口
 */
interface State {

    /**
     * 开始加载数据
     */
    boolean startLoad();

    /**
     * 销毁
     */
    boolean destroy();

    /**
     * 开始监听数据
     */
    boolean listenData();

    /**
     * 使用指定监听者开始监听数据
     */
    boolean listenData(DataListener listener);

    /**
     * 移除监听者
     */
    boolean removeListener(DataListener listener);

    /**
     * 数据加载完毕
     */
    boolean dataLoadFinished();

    /**
     * 对所有的数据监听者重新加载数据
     */
    boolean refresh();

    /**
     * 状态名称
     */
    String name();
}
