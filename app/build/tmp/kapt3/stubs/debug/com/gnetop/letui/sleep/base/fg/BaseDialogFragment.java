package com.gnetop.letui.sleep.base.fg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/gnetop/letui/sleep/base/fg/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "mCancelListener", "Lcom/gnetop/letui/sleep/impl/OnDialogCancelListener;", "mOnCallDialog", "Lcom/gnetop/letui/sleep/impl/OnCallDialog;", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "Companion", "app_debug"})
public final class BaseDialogFragment extends androidx.fragment.app.DialogFragment {
    private com.gnetop.letui.sleep.impl.OnDialogCancelListener mCancelListener;
    private com.gnetop.letui.sleep.impl.OnCallDialog mOnCallDialog;
    public static final com.gnetop.letui.sleep.base.fg.BaseDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * 创建对话框
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * 开始
     */
    @java.lang.Override()
    public void onStart() {
    }
    
    /**
     * 取消
     */
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    public BaseDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/gnetop/letui/sleep/base/fg/BaseDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/gnetop/letui/sleep/base/fg/BaseDialogFragment;", "call", "Lcom/gnetop/letui/sleep/impl/OnCallDialog;", "cancelable", "", "cancelListener", "Lcom/gnetop/letui/sleep/impl/OnDialogCancelListener;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.gnetop.letui.sleep.base.fg.BaseDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        com.gnetop.letui.sleep.impl.OnCallDialog call, boolean cancelable) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.gnetop.letui.sleep.base.fg.BaseDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        com.gnetop.letui.sleep.impl.OnCallDialog call, boolean cancelable, @org.jetbrains.annotations.Nullable()
        com.gnetop.letui.sleep.impl.OnDialogCancelListener cancelListener) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}