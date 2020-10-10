package com.gnetop.letui.sleep.base.fg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH&R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/gnetop/letui/sleep/base/fg/BaseVMFragment;", "VM", "Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;", "V", "Landroidx/databinding/ViewDataBinding;", "Lcom/gnetop/letui/sleep/base/fg/BaseFragment;", "()V", "lazyLoaded", "", "mViewModel", "getMViewModel", "()Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;", "setMViewModel", "(Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;)V", "Lcom/gnetop/letui/sleep/base/vm/BaseViewModel;", "checkLogin", "then", "Lkotlin/Function0;", "", "initData", "initView", "initViewModel", "lazyLoadData", "observe", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "viewModelClass", "Ljava/lang/Class;", "app_debug"})
public abstract class BaseVMFragment<VM extends com.gnetop.letui.sleep.base.vm.BaseViewModel, V extends androidx.databinding.ViewDataBinding> extends com.gnetop.letui.sleep.base.fg.BaseFragment<V> {
    @org.jetbrains.annotations.NotNull()
    protected VM mViewModel;
    private boolean lazyLoaded = false;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getMViewModel() {
        return null;
    }
    
    protected final void setMViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Class<VM> viewModelClass();
    
    /**
     * 初始化viewModel
     */
    private final void initViewModel() {
    }
    
    /**
     * 如果有需要初始化
     */
    public void initData() {
    }
    
    /**
     * 如果有需要初始化
     */
    public void initView() {
    }
    
    /**
     * 如果有需要初始化
     */
    public void lazyLoadData() {
    }
    
    public void observe() {
    }
    
    /**
     * 是否登录，如果登录了就执行then，没有登录就直接跳转登录界面
     * @return true-已登录，false-未登录
     */
    public final boolean checkLogin(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> then) {
        return false;
    }
    
    public BaseVMFragment() {
        super();
    }
}