package com.gnetop.letui.sleep.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"copyTextIntoClipboard", "", "Landroid/content/Context;", "text", "", "label", "", "showToast", "message", "", "app_debug"})
public final class ContentExtKt {
    
    /**
     * 实现将特定文本复制到剪贴板的功能。
     * @param[label] User-visible label for the clip data.
     * @param[text] The actual text in the clip.
     */
    public static final void copyTextIntoClipboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$copyTextIntoClipboard, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
    java.lang.String label) {
    }
    
    /**
     * 显示toast
     */
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showToast, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence message) {
    }
    
    /**
     * 显示toast
     */
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showToast, @androidx.annotation.StringRes()
    int message) {
    }
}