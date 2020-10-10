package com.gnetop.letui.sleep.viewmodel.user

import com.gnetop.letui.sleep.model.UserModel
import com.gnetop.letui.sleep.net.retrofit.RetrofitClient


class UserRepository {

    /**
     * 更新用户信息
     */
    fun updateUserInfo(userInfo: UserModel) = UserInfoStore.setUserInfo(userInfo)

    /**
     * 是否登录
     */
    fun isLogin() = UserInfoStore.isLogin()

    /**
     * 清除用户登录状态
     */
    fun clearLoginState() {
        UserInfoStore.clearUserInfo()
        RetrofitClient.clearCookie()
    }

    /**
     * 获取用户信息
     */
    fun getUserInfo() = UserInfoStore.getUserInfo()
}