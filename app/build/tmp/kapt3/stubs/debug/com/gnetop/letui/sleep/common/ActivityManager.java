package com.gnetop.letui.sleep.common;

import java.lang.System;

/**
 * activity管理类
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J/\u0010\b\u001a\u00020\t2\"\u0010\n\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f0\u000b\"\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\u00a2\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010J4\u0010\u000e\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f2\u0006\u0010\u0015\u001a\u00020\u0016J,\u0010\u0017\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010J,\u0010\u0019\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/gnetop/letui/sleep/common/ActivityManager;", "", "()V", "activities", "", "Landroid/app/Activity;", "getActivities", "()Ljava/util/List;", "finish", "", "clazz", "", "Ljava/lang/Class;", "([Ljava/lang/Class;)V", "start", "params", "", "", "img", "Landroidx/appcompat/widget/AppCompatImageView;", "startForResult", "code", "", "startService", "Landroid/app/Service;", "stopService", "app_debug"})
public final class ActivityManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<android.app.Activity> activities = null;
    public static final com.gnetop.letui.sleep.common.ActivityManager INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.app.Activity> getActivities() {
        return null;
    }
    
    /**
     * 开始
     */
    public final void start(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends android.app.Activity> clazz, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
    }
    
    /**
     * 开始服务
     */
    public final void startService(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends android.app.Service> clazz, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
    }
    
    /**
     * 停止服务
     */
    public final void stopService(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends android.app.Service> clazz, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
    }
    
    /**
     * 开始
     */
    public final void startForResult(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends android.app.Activity> clazz, int code) {
    }
    
    /**
     * 开始
     */
    public final void start(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends android.app.Activity> clazz, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView img) {
    }
    
    /**
     * finish指定的一个或多个Activity
     */
    public final void finish(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends android.app.Activity>... clazz) {
    }
    
    private ActivityManager() {
        super();
    }
}