package com.gnetop.letui.sleep.util.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/gnetop/letui/sleep/util/event/EventUtil;", "", "()V", "register", "", "send", "event", "unRegister", "app_debug"})
public final class EventUtil {
    public static final com.gnetop.letui.sleep.util.event.EventUtil INSTANCE = null;
    
    /**
     * 发送
     */
    @org.greenrobot.eventbus.Subscribe()
    public final void send(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    /**
     * 注册
     */
    @org.greenrobot.eventbus.Subscribe()
    public final void register() {
    }
    
    /**
     * 反注册
     */
    @org.greenrobot.eventbus.Subscribe()
    public final void unRegister() {
    }
    
    private EventUtil() {
        super();
    }
}