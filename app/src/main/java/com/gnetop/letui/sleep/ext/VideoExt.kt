package com.gnetop.letui.sleep.ext

import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.common.APP
import com.gnetop.letui.sleep.util.AppUtil


fun videoPath(): String {
    return "android.resource://" + AppUtil.getPackageName(APP.sInstance.applicationContext) + "/"+ R.raw.guide3
}