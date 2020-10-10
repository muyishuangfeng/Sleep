package com.gnetop.letui.sleep.viewmodel.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/gnetop/letui/sleep/viewmodel/user/UserRepository;", "", "()V", "clearLoginState", "", "getUserInfo", "Lcom/gnetop/letui/sleep/model/UserModel;", "isLogin", "", "updateUserInfo", "userInfo", "app_debug"})
public final class UserRepository {
    
    /**
     * 更新用户信息
     */
    public final void updateUserInfo(@org.jetbrains.annotations.NotNull()
    com.gnetop.letui.sleep.model.UserModel userInfo) {
    }
    
    /**
     * 是否登录
     */
    public final boolean isLogin() {
        return false;
    }
    
    /**
     * 清除用户登录状态
     */
    public final void clearLoginState() {
    }
    
    /**
     * 获取用户信息
     */
    @org.jetbrains.annotations.Nullable()
    public final com.gnetop.letui.sleep.model.UserModel getUserInfo() {
        return null;
    }
    
    public UserRepository() {
        super();
    }
}