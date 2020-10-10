package com.gnetop.letui.sleep.net.exception;

import java.lang.System;

/**
 * 异常
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/gnetop/letui/sleep/net/exception/ApiException;", "Ljava/lang/RuntimeException;", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "app_debug"})
public final class ApiException extends java.lang.RuntimeException {
    private int code;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getMessage() {
        return null;
    }
    
    public void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ApiException(int code, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        super();
    }
}