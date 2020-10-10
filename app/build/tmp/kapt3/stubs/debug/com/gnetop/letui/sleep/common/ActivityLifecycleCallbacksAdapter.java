package com.gnetop.letui.sleep.common;

import java.lang.System;

/**
 * activity生命周期回调适配器
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u00c2\u0002\u0012<\b\u0002\u0010\u0002\u001a6\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\b\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012:\b\u0002\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0013J\u001a\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016RB\u0010\u0002\u001a6\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\b\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R@\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/gnetop/letui/sleep/common/ActivityLifecycleCallbacksAdapter;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "Lkotlin/Function2;", "Landroid/app/Activity;", "Lkotlin/ParameterName;", "name", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityStarted", "Lkotlin/Function1;", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "app_debug"})
public final class ActivityLifecycleCallbacksAdapter implements android.app.Application.ActivityLifecycleCallbacks {
    private kotlin.jvm.functions.Function2<? super android.app.Activity, ? super android.os.Bundle, kotlin.Unit> onActivityCreated;
    private kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityStarted;
    private kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityResumed;
    private kotlin.jvm.functions.Function2<? super android.app.Activity, ? super android.os.Bundle, kotlin.Unit> onActivitySaveInstanceState;
    private kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityPaused;
    private kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityStopped;
    private kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityDestroyed;
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public ActivityLifecycleCallbacksAdapter(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super android.app.Activity, ? super android.os.Bundle, kotlin.Unit> onActivityCreated, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityStarted, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityResumed, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super android.app.Activity, ? super android.os.Bundle, kotlin.Unit> onActivitySaveInstanceState, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityPaused, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityStopped, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> onActivityDestroyed) {
        super();
    }
    
    public ActivityLifecycleCallbacksAdapter() {
        super();
    }
}