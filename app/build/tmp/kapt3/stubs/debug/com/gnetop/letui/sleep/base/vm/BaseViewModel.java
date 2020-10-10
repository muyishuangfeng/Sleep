package com.gnetop.letui.sleep.base.vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J:\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u00102\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0004J\u00c2\u0001\u0010\u001a\u001a\u00020\u00192\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122H\b\u0002\u0010\u001b\u001aB\b\u0001\u0012&\u0012$0\u001dj\u0011`\u001e\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u001c2H\b\u0002\u0010\"\u001aB\b\u0001\u0012&\u0012$0\u001dj\u0011`\u001e\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u001cH\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0005J\u0014\u0010%\u001a\u00020\u00172\n\u0010!\u001a\u00060\u001dj\u0002`\u001eH\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "loginStatusInvalid", "Landroidx/lifecycle/MutableLiveData;", "", "getLoginStatusInvalid", "()Landroidx/lifecycle/MutableLiveData;", "mUserRepository", "Lcom/gnetop/letui/sleep/viewmodel/user/UserRepository;", "getMUserRepository", "()Lcom/gnetop/letui/sleep/viewmodel/user/UserRepository;", "mUserRepository$delegate", "Lkotlin/Lazy;", "async", "Lkotlinx/coroutines/Deferred;", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Deferred;", "cancelJob", "", "job", "Lkotlinx/coroutines/Job;", "launch", "error", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", "e", "cancel", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "loginState", "onError", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mUserRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginStatusInvalid = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.gnetop.letui.sleep.viewmodel.user.UserRepository getMUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoginStatusInvalid() {
        return null;
    }
    
    /**
     * 创建并执行协程
     * @param block 协程中执行
     * @param error 错误时执行
     * @return Job
     */
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.Job launch(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> error, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> cancel) {
        return null;
    }
    
    /**
     * 创建并执行协程
     */
    @org.jetbrains.annotations.NotNull()
    protected final <T extends java.lang.Object>kotlinx.coroutines.Deferred<T> async(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block) {
        return null;
    }
    
    /**
     * 取消协程
     */
    protected final void cancelJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job job) {
    }
    
    /**
     * 统一处理错误
     * @param e 异常
     */
    private final void onError(java.lang.Exception e) {
    }
    
    /**
     * 登录状态
     */
    public final boolean loginState() {
        return false;
    }
    
    public BaseViewModel() {
        super();
    }
}