package com.gnetop.letui.sleep.util;

import java.lang.System;

/**
 * 拍照和从相册选择结果接口
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/gnetop/letui/sleep/util/OnCameraResultListener;", "", "onAlbumResult", "", "path", "", "onCameraResult", "app_debug"})
public abstract interface OnCameraResultListener {
    
    public abstract void onCameraResult(@org.jetbrains.annotations.Nullable()
    java.lang.String path);
    
    public abstract void onAlbumResult(@org.jetbrains.annotations.Nullable()
    java.lang.String path);
}