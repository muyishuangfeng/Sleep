package com.gnetop.letui.sleep.net.retrofit;

import java.lang.System;

/**
 * Retrofit
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/gnetop/letui/sleep/net/retrofit/RetrofitClient;", "", "()V", "apiService", "Lcom/gnetop/letui/sleep/net/api/ApiService;", "getApiService", "()Lcom/gnetop/letui/sleep/net/api/ApiService;", "cookieJar", "Lcom/franmontiel/persistentcookiejar/PersistentCookieJar;", "loggerInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getLoggerInterceptor", "()Lokhttp3/logging/HttpLoggingInterceptor;", "okHttpClient", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "clearCookie", "", "app_debug"})
public final class RetrofitClient {
    private static final com.franmontiel.persistentcookiejar.PersistentCookieJar cookieJar = null;
    private static final okhttp3.OkHttpClient okHttpClient = null;
    private static final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.gnetop.letui.sleep.net.api.ApiService apiService = null;
    public static final com.gnetop.letui.sleep.net.retrofit.RetrofitClient INSTANCE = null;
    
    /**
     * 清空cookies
     */
    public final void clearCookie() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gnetop.letui.sleep.net.api.ApiService getApiService() {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor getLoggerInterceptor() {
        return null;
    }
    
    private RetrofitClient() {
        super();
    }
}