package com.gnetop.letui.sleep.service

import android.content.Intent
import androidx.lifecycle.LifecycleService

/**
 * 闹钟服务
 */
class AlarmClockService : LifecycleService() {


    override fun onCreate() {
        super.onCreate()
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }


    override fun onDestroy() {
        super.onDestroy()
    }


}