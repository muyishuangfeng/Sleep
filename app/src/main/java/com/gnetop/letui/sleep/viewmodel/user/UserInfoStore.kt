package com.gnetop.letui.sleep.viewmodel.user

import com.gnetop.letui.sleep.common.APP
import com.gnetop.letui.sleep.ext.SpHelper
import com.gnetop.letui.sleep.model.UserModel
import com.google.gson.Gson

/**
 * 处理用户数据
 */
object UserInfoStore {

    private const val SP_USER_INFO = "sp_user_info"
    private const val KEY_USER_INFO = "userInfo"
    private val mGson by lazy { Gson() }

    /**
     * 用户是否登录
     */
    fun isLogin(): Boolean {
        val userInfo = SpHelper.getSpValue(
            SP_USER_INFO, APP.sInstance,
            KEY_USER_INFO, "")
        return userInfo.isNotEmpty()
    }

    /**
     * 获取用户信息
     */
    fun getUserInfo(): UserModel? {
        val userInfo = SpHelper.getSpValue(
            SP_USER_INFO, APP.sInstance,
            KEY_USER_INFO, "")
        return if (userInfo.isNotEmpty()) {
            mGson.fromJson(userInfo, UserModel::class.java)
        } else {
            null
        }
    }

    /**
     * 设置用户信息
     */
    fun setUserInfo(userModel: UserModel) {
        SpHelper.putSpValue(
            SP_USER_INFO, APP.sInstance,
            KEY_USER_INFO, mGson.toJson(userModel))
    }

    /**
     * 清除用户信息
     */
    fun clearUserInfo() {
        SpHelper.clearSpValue(SP_USER_INFO, APP.sInstance)
    }
}