package com.billy.android.preloader;

import com.billy.android.preloader.interfaces.DataListener;

/**
 * StateDone：预加载完成，并且已经向数据观察者发送数据
 *
 */
class StateDone extends StateBase {
    StateDone(Worker<?> worker) {
        super(worker);
    }

    @Override
    public boolean refresh() {
        super.refresh();
        return worker.doStartLoadWork() && worker.listenData();
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
        return "StateDone";
    }
}
