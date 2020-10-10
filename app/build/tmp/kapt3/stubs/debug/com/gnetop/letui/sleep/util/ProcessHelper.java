package com.gnetop.letui.sleep.util;

import java.lang.System;

/**
 * 进程帮助类
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/gnetop/letui/sleep/util/ProcessHelper;", "", "()V", "currentProcessName", "", "context", "Landroid/content/Context;", "isMainProcess", "", "app_debug"})
public final class ProcessHelper {
    public static final com.gnetop.letui.sleep.util.ProcessHelper INSTANCE = null;
    
    /**
     * 是否是主进程
     */
    public final boolean isMainProcess(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 当前进程的名称
     */
    private final java.lang.String currentProcessName(android.content.Context context) {
        return null;
    }
    
    private ProcessHelper() {
        super();
    }
}