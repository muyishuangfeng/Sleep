package com.gnetop.letui.sleep.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/gnetop/letui/sleep/ext/BindAdapter;", "", "()V", "loadImage", "", "view", "Landroid/widget/ImageView;", "url", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "app_debug"})
public final class BindAdapter {
    public static final com.gnetop.letui.sleep.ext.BindAdapter INSTANCE = null;
    
    /**
     * 设置图片
     */
    @androidx.databinding.BindingAdapter(value = {"imageUrl", "placeholderResID"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable placeholder) {
    }
    
    private BindAdapter() {
        super();
    }
}