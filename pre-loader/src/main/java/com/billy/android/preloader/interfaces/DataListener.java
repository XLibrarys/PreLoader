package com.billy.android.preloader.interfaces;

/**
 * 预加载数据监听
 */
public interface DataListener<DATA> {
    /**
     * do something with loaded data
     * Note: this method runs in main-thread
     * @param data loaded data (maybe null when load failed)
     */
    void onDataArrived(DATA data);
}
