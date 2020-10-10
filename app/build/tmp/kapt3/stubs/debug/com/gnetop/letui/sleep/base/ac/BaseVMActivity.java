package com.gnetop.letui.sleep.base.ac;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH&R\u001c\u0010\u0007\u001a\u00028\u0000X\u0094.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/gnetop/letui/sleep/base/ac/BaseVMActivity;", "VM", "Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;", "V", "Landroidx/databinding/ViewDataBinding;", "Lcom/gnetop/letui/sleep/base/ac/BaseActivity;", "()V", "mViewModel", "getMViewModel", "()Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;", "setMViewModel", "(Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;)V", "Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;", "checkLoginState", "", "then", "Lkotlin/Function0;", "", "initData", "initView", "initViewModel", "observer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "viewModelClass", "Ljava/lang/Class;", "app_debug"})
public abstract class BaseVMActivity<VM extends com.gnetop.letui.sleep.base.vm.BaseViewModel, V extends androidx.databinding.ViewDataBinding> extends com.gnetop.letui.sleep.base.ac.BaseActivity<V> {
    @org.jetbrains.annotations.NotNull()
    protected VM mViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected VM getMViewModel() {
        return null;
    }
    
    protected void setMViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Class<VM> viewModelClass();
    
    /**
     * 初始化viewModel
     */
    private final void initViewModel() {
    }
    
    /**
     * 如有需要可以初始化
     */
    public void initView() {
    }
    
    /**
     * 如有需要可以初始化
     */
    public void initData() {
    }
    
    /**
     * 如有需要可以初始化
     */
    public void observer() {
    }
    
    /**
     * 是否登录，如果登录了就执行then，没有登录就直接跳转登录界面
     * @return true-已登录，false-未登录
     */
    public final boolean checkLoginState(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> then) {
        return false;
    }
    
    public BaseVMActivity() {
        super();
    }
}