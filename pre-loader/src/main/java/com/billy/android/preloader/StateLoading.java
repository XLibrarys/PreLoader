package com.billy.android.preloader;


import com.billy.android.preloader.interfaces.DataListener;

/**
 *StateLoading:加载正在执行状态
 * listenData：添加观察者，更新StateListening/或还是StateListening
 * dataLoadFinished：完成数据加载，更新StateLoadCompleted
 */
class StateLoading extends StateBase {
    StateLoading(Worker<?> worker) {
        super(worker);
    }

    /**
     * ready for get data
     *
     * @return true: {@link DataListener#onDataArrived(Object)} will be called
     * false: {@link Worker} has no {@link DataListener}
     */
    @Override
    public boolean listenData() {
        super.listenData();
        return worker.doWaitForDataLoaderWork();
    }

    @Override
    public boolean listenData(DataListener listener) {
        super.listenData(listener);
        return worker.doWaitForDataLoaderWork(listener);
    }

    /**
     * data has loaded, waiting for {@link DataListener}
     *
     * @return true
     */
    @Override
    public boolean dataLoadFinished() {
        super.dataLoadFinished();
        //如果正在加载状态，数据加载结束，则Worker更新为StateLoadCompleted
        return worker.doDataLoadFinishWork();
    }

    @Override
    public String name() {
        return "StateLoading";
    }
}
