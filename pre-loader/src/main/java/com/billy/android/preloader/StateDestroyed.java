package com.billy.android.preloader;

/**
 * 任务销毁状态
 */
class StateDestroyed extends StateBase {
    StateDestroyed(Worker<?> worker) {
        super(worker);
    }

    @Override
    public boolean destroy() {
        return false;
    }

    @Override
    public String name() {
        return "StateDestroyed";
    }
}
