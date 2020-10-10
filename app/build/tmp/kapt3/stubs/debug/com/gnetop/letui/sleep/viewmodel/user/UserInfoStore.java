package com.gnetop.letui.sleep.viewmodel.user;

import java.lang.System;

/**
 * 处理用户数据
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/gnetop/letui/sleep/viewmodel/user/UserInfoStore;", "", "()V", "KEY_USER_INFO", "", "SP_USER_INFO", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "clearUserInfo", "", "getUserInfo", "Lcom/gnetop/letui/sleep/model/UserModel;", "isLogin", "", "setUserInfo", "userModel", "app_debug"})
public final class UserInfoStore {
    private static final java.lang.String SP_USER_INFO = "sp_user_info";
    private static final java.lang.String KEY_USER_INFO = "userInfo";
    private static final kotlin.Lazy mGson$delegate = null;
    public static final com.gnetop.letui.sleep.viewmodel.user.UserInfoStore INSTANCE = null;
    
    private final com.google.gson.Gson getMGson() {
        return null;
    }
    
    /**
     * 用户是否登录
     */
    public final boolean isLogin() {
        return false;
    }
    
    /**
     * 获取用户信息
     */
    @org.jetbrains.annotations.Nullable()
    public final com.gnetop.letui.sleep.model.UserModel getUserInfo() {
        return null;
    }
    
    /**
     * 设置用户信息
     */
    public final void setUserInfo(@org.jetbrains.annotations.NotNull()
    com.gnetop.letui.sleep.model.UserModel userModel) {
    }
    
    /**
     * 清除用户信息
     */
    public final void clearUserInfo() {
    }
    
    private UserInfoStore() {
        super();
    }
}