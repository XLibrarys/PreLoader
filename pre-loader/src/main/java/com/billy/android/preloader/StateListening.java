package com.billy.android.preloader;


import com.billy.android.preloader.interfaces.DataListener;

/**
 * StateListening：加载监听状态，有观察者监听预加载
 * listenData：继续添加数据观察者，还是StateListening状态
 * dataLoadFinished：通知数据观察者，更新为StateDone状态
 */
class StateListening extends StateBase {
    StateListening(Worker<?> worker) {
        super(worker);
    }

    @Override
    public boolean dataLoadFinished() {
        super.dataLoadFinished();
        return worker.doSendLoadedDataToListenerWork();
    }

    @Override
    public boolean listenData(DataListener listener) {
        super.listenData(listener);
        return worker.doAddListenerWork(listener);
    }

    @Override
    public String name() {
        return "StateListening";
    }
}
