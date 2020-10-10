package com.gnetop.letui.sleep.common

import android.app.Application
import androidx.multidex.MultiDex
import com.gnetop.letui.sleep.util.ProcessHelper


class APP : Application() {
    companion object {
        lateinit var sInstance: APP
    }

    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this);
        sInstance = this
        if (ProcessHelper.isMainProcess(this)) {
            init()
        }
    }

    /**
     * 初始化
     */
    private fun init() {
        registerActivityCallbacks()
    }


    /**
     * 监听activity回调
     */
    private fun registerActivityCallbacks() {
        registerActivityLifecycleCallbacks(ActivityLifecycleCallbacksAdapter(
            onActivityCreated = { activity, _ ->
                ActivityManager.activities.add(activity)
            },
            onActivityDestroyed = { activity ->
                ActivityManager.activities.remove(activity)
            }

        ))
    }


}