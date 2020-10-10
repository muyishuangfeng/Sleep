package com.gnetop.letui.sleep.util.glide;

import java.lang.System;

/**
 * Created by Silence on 2018/1/5.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J.\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\rJ.\u0010\u0013\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ.\u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\rJ\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rJ \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\rJ,\u0010\u001a\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ6\u0010\u001d\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020!2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001e\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rJ \u0010&\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\rJ&\u0010\'\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\r\u00a8\u0006*"}, d2 = {"Lcom/gnetop/letui/sleep/util/glide/GlideUtils;", "", "()V", "clearCache", "", "context", "Landroid/content/Context;", "loadBitmapFromUrl", "url", "", "diskCacheStrategy", "Lcom/bumptech/glide/load/engine/DiskCacheStrategy;", "imageView", "Landroid/widget/ImageView;", "loadFile", "activity", "file", "Ljava/io/File;", "img", "loadGifFromUrl", "loadImageWithCache", "loadPath", "filePath", "loadPathWithCircle", "path", "loadPathWithOutCache", "loadResource", "resource", "", "loadStream", "image", "", "thumbnailSize", "", "loadUri", "mContext", "Landroid/app/Activity;", "uri", "loadUrl", "loadWithAlpha", "placeholder", "Landroid/graphics/drawable/Drawable;", "app_debug"})
public final class GlideUtils {
    public static final com.gnetop.letui.sleep.util.glide.GlideUtils INSTANCE = null;
    
    /**
     * 清除缓存
     */
    private final void clearCache(android.content.Context context) {
    }
    
    /**
     * 通过uri加载图片
     */
    public final void loadWithAlpha(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable placeholder, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView img) {
    }
    
    /**
     * 通过uri加载图片
     */
    public final void loadUri(@org.jetbrains.annotations.NotNull()
    android.app.Activity mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView img) {
    }
    
    /**
     * 通过url加载图片
     */
    public final void loadUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView img) {
    }
    
    /**
     * 通过文件路径加载图片
     */
    public final void loadPathWithOutCache(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.Nullable()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView img) {
    }
    
    /**
     * 通过文件路径加载图片
     */
    public final void loadPath(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.Nullable()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView img) {
    }
    
    /**
     * 通过文件加载图片
     */
    public final void loadFile(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.Nullable()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView img) {
    }
    
    /**
     * 圆角
     */
    public final void loadPathWithCircle(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView img) {
    }
    
    /**
     * 加载原始尺寸的网络图片
     *
     * @param context           上下文
     * @param url               url
     * @param diskCacheStrategy 缓存
     * @param imageView         图片
     */
    public final void loadImageWithCache(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView imageView) {
    }
    
    /**
     * 加载Gif图片
     */
    public final void loadGifFromUrl(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView imageView) {
    }
    
    /**
     * 加载静态图片
     */
    public final void loadBitmapFromUrl(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView imageView) {
    }
    
    /**
     * 加载应用资源
     *
     * @param context           上下文
     * @param diskCacheStrategy 缓存
     * @param imageView         资源文件
     */
    public final void loadResource(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int resource, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView imageView) {
    }
    
    /**
     * 加载流资源
     *
     * @param context           上下文
     * @param diskCacheStrategy 缓存
     * @param thumbnailSize     缩略图大小
     * @param imageView         资源文件
     */
    public final void loadStream(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    byte[] image, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy, float thumbnailSize, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView imageView) {
    }
    
    private GlideUtils() {
        super();
    }
}