package com.gnetop.letui.sleep.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002\u00a8\u0006\b"}, d2 = {"Lcom/gnetop/letui/sleep/common/APP;", "Landroid/app/Application;", "()V", "init", "", "onCreate", "registerActivityCallbacks", "Companion", "app_debug"})
public final class APP extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static com.gnetop.letui.sleep.common.APP sInstance;
    public static final com.gnetop.letui.sleep.common.APP.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * 初始化
     */
    private final void init() {
    }
    
    /**
     * 监听activity回调
     */
    private final void registerActivityCallbacks() {
    }
    
    public APP() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/gnetop/letui/sleep/common/APP$Companion;", "", "()V", "sInstance", "Lcom/gnetop/letui/sleep/common/APP;", "getSInstance", "()Lcom/gnetop/letui/sleep/common/APP;", "setSInstance", "(Lcom/gnetop/letui/sleep/common/APP;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.gnetop.letui.sleep.common.APP getSInstance() {
            return null;
        }
        
        public final void setSInstance(@org.jetbrains.annotations.NotNull()
        com.gnetop.letui.sleep.common.APP p0) {
        }
        
        private Companion() {
            super();
        }
    }
}