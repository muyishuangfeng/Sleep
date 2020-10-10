package com.gnetop.letui.sleep.base.ac;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000eR\u001c\u0010\u0005\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/gnetop/letui/sleep/base/ac/BaseActivity;", "V", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mBinding", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "mDialogFragment", "Lcom/gnetop/letui/sleep/ui/ProgressDialogFragment;", "getLayoutID", "", "getResources", "Landroid/content/res/Resources;", "hideProgressDialog", "", "initBinding", "binding", "initSaveState", "savedInstanceState", "Landroid/os/Bundle;", "(Landroidx/databinding/ViewDataBinding;Landroid/os/Bundle;)V", "onCreate", "onResume", "showProgressDialog", "message", "app_debug"})
public abstract class BaseActivity<V extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public V mBinding;
    private com.gnetop.letui.sleep.ui.ProgressDialogFragment mDialogFragment;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final V getMBinding() {
        return null;
    }
    
    public final void setMBinding(@org.jetbrains.annotations.NotNull()
    V p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * 获取跟布局
     */
    public abstract int getLayoutID();
    
    /**
     * 初始化数据
     */
    public void initBinding(@org.jetbrains.annotations.NotNull()
    V binding) {
    }
    
    public void initSaveState(@org.jetbrains.annotations.NotNull()
    V mBinding, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 显示进度对话框
     */
    public final void showProgressDialog(int message) {
    }
    
    /**
     * 隐藏进度对话框
     */
    public final void hideProgressDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.res.Resources getResources() {
        return null;
    }
    
    public BaseActivity() {
        super();
    }
}