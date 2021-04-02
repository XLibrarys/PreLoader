package com.billy.android.preloader;


import com.billy.android.preloader.interfaces.DataListener;

/**
 * StateLoadCompleted：数据加载完毕，但此时并没有观察者，所有没有通知
 * listenData：添加观察者，通知现有的观察者
 */
class StateLoadCompleted extends StateBase {
    StateLoadCompleted(Worker<?> worker) {
        super(worker);
    }

    @Override
    public boolean refresh() {
        super.refresh();
        return worker.doStartLoadWork();
    }

    @Override
    public boolean listenData() {
        super.listenData();
        return worker.doSendLoadedDataToListenerWork();
    }

    @Override
    public boolean listenData(DataListener listener) {
        super.listenData(listener);
        return worker.doSendLoadedDataToListenerWork(listener);
    }
    @Override
    public String name() {
        return "StateLoadCompleted";
    }
}
