package com.gnetop.letui.sleep.util.event

import com.gnetop.letui.sleep.common.APP
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

object EventUtil {

    /**
     * 发送
     */
    @Subscribe
    fun send(event: Any) {
        EventBus.getDefault().post(event)
    }

    /**
     * 注册
     */
    @Subscribe
    fun register() {
        if (!EventBus.getDefault().isRegistered(APP.sInstance.applicationContext)) {
            EventBus.getDefault().register(APP.sInstance.applicationContext)
        }
    }


    /**
     * 反注册
     */
    @Subscribe
    fun unRegister() {
        if (EventBus.getDefault().isRegistered(APP.sInstance.applicationContext)) {
            EventBus.getDefault().unregister(APP.sInstance.applicationContext)
        }
    }
}