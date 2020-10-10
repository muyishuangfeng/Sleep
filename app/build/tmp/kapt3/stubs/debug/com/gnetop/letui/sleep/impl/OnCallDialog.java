package com.gnetop.letui.sleep.impl;

import java.lang.System;

/**
 * 获取对话框
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/gnetop/letui/sleep/impl/OnCallDialog;", "", "getDialog", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "app_debug"})
public abstract interface OnCallDialog {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Dialog getDialog(@org.jetbrains.annotations.Nullable()
    android.content.Context context);
}