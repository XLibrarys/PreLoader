package com.billy.android.preloader;

/**
 * 初始化状态
 * startLoad：开始预加载，状态更新为StateLoading
 */
class StatusInitialed extends StateBase {

    StatusInitialed(Worker<?> worker) {
        super(worker);
    }

    @Override
    public boolean startLoad() {
        super.startLoad();
        return worker.doStartLoadWork();
    }

    @Override
    public String name() {
        return "StatusInitialed";
    }
}
