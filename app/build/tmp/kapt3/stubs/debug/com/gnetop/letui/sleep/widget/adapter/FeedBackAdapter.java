package com.gnetop.letui.sleep.widget.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R7\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lcom/gnetop/letui/sleep/widget/adapter/FeedBackAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/gnetop/letui/sleep/model/FeedBackImgModel;", "Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;", "Lcom/gnetop/letui/sleep/databinding/ItemFeedbackImgLayoutBinding;", "layoutID", "", "(I)V", "getLayoutID", "()I", "setLayoutID", "mOnItemDeleteListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "", "getMOnItemDeleteListener", "()Lkotlin/jvm/functions/Function1;", "setMOnItemDeleteListener", "(Lkotlin/jvm/functions/Function1;)V", "convert", "holder", "item", "app_debug"})
public final class FeedBackAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.gnetop.letui.sleep.model.FeedBackImgModel, com.chad.library.adapter.base.viewholder.BaseDataBindingHolder<com.gnetop.letui.sleep.databinding.ItemFeedbackImgLayoutBinding>> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> mOnItemDeleteListener;
    private int layoutID;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getMOnItemDeleteListener() {
        return null;
    }
    
    public final void setMOnItemDeleteListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.viewholder.BaseDataBindingHolder<com.gnetop.letui.sleep.databinding.ItemFeedbackImgLayoutBinding> holder, @org.jetbrains.annotations.NotNull()
    com.gnetop.letui.sleep.model.FeedBackImgModel item) {
    }
    
    public final int getLayoutID() {
        return 0;
    }
    
    public final void setLayoutID(int p0) {
    }
    
    public FeedBackAdapter(int layoutID) {
        super(0, null);
    }
    
    public FeedBackAdapter() {
        super(0, null);
    }
}