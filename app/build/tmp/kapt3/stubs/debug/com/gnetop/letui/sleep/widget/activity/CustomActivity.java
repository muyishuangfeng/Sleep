package com.gnetop.letui.sleep.widget.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/gnetop/letui/sleep/widget/activity/CustomActivity;", "Lcom/gnetop/letui/sleep/base/ac/BaseActivity;", "Lcom/gnetop/letui/sleep/databinding/BalanceUserDataLayoutBinding;", "()V", "alarmIntent", "Landroid/app/PendingIntent;", "alarmMgr", "Landroid/app/AlarmManager;", "mHour", "", "mMediaPlayerOne", "Landroid/media/MediaPlayer;", "mMediaPlayerThree", "mMediaPlayerTwo", "mMinute", "getLayoutID", "initBinding", "", "binding", "registerReceiver", "setProgress", "MyVolumeReceiver", "app_debug"})
public final class CustomActivity extends com.gnetop.letui.sleep.base.ac.BaseActivity<com.gnetop.letui.sleep.databinding.BalanceUserDataLayoutBinding> {
    private android.media.MediaPlayer mMediaPlayerOne;
    private android.media.MediaPlayer mMediaPlayerTwo;
    private android.media.MediaPlayer mMediaPlayerThree;
    private int mHour = 0;
    private int mMinute = 0;
    private android.app.PendingIntent alarmIntent;
    private android.app.AlarmManager alarmMgr;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutID() {
        return 0;
    }
    
    @java.lang.Override()
    public void initBinding(@org.jetbrains.annotations.NotNull()
    com.gnetop.letui.sleep.databinding.BalanceUserDataLayoutBinding binding) {
    }
    
    private final void setProgress() {
    }
    
    /**
     * 注册当音量发生变化时接收的广播
     */
    private final void registerReceiver() {
    }
    
    public CustomActivity() {
        super();
    }
    
    /**
     * 处理音量变化时的界面显示
     * @author long
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/gnetop/letui/sleep/widget/activity/CustomActivity$MyVolumeReceiver;", "Landroid/content/BroadcastReceiver;", "activity", "Lcom/gnetop/letui/sleep/widget/activity/CustomActivity;", "(Lcom/gnetop/letui/sleep/widget/activity/CustomActivity;)V", "weakReference", "Ljava/lang/ref/WeakReference;", "getWeakReference", "()Ljava/lang/ref/WeakReference;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    static final class MyVolumeReceiver extends android.content.BroadcastReceiver {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.ref.WeakReference<com.gnetop.letui.sleep.widget.activity.CustomActivity> weakReference = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.ref.WeakReference<com.gnetop.letui.sleep.widget.activity.CustomActivity> getWeakReference() {
            return null;
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        public MyVolumeReceiver(@org.jetbrains.annotations.NotNull()
        com.gnetop.letui.sleep.widget.activity.CustomActivity activity) {
            super();
        }
    }
}