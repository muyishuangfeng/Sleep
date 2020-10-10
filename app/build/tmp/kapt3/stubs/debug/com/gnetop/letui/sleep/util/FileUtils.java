package com.gnetop.letui.sleep.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0004\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\u0006J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u0010\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010#\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0004J\u0012\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0002J\"\u0010\'\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020\u0004J\u001a\u0010*\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001a\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010\u0006J\u001e\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006\u00a8\u00061"}, d2 = {"Lcom/gnetop/letui/sleep/util/FileUtils;", "", "()V", "copyFile", "", "oldPath", "", "newPath", "createAvatarPath", "userName", "createFile", "", "path", "filePath", "fileName", "deleteFiles", "getDiskCacheDir", "context", "Landroid/content/Context;", "getExtensionName", "filename", "getFile", "", "Ljava/io/File;", "file", "getFileByPath", "getFileNameFromPath", "filepath", "getFileSize", "size", "", "fileSize", "", "getString", "getUserAvatarPath", "isFileExists", "isSdCardExist", "isSpace", "s", "modifyFile", "content", "append", "renameFile", "unzip", "is", "Ljava/io/InputStream;", "dir", "writeToFile", "strcontent", "app_debug"})
public final class FileUtils {
    public static final com.gnetop.letui.sleep.util.FileUtils INSTANCE = null;
    
    public final boolean isSdCardExist() {
        return false;
    }
    
    /**
     * 创建图像路径
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String createAvatarPath(@org.jetbrains.annotations.Nullable()
    java.lang.String userName) {
        return null;
    }
    
    /**
     * 用户图像路径
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserAvatarPath(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return null;
    }
    
    public final void unzip(@org.jetbrains.annotations.Nullable()
    java.io.InputStream is, @org.jetbrains.annotations.Nullable()
    java.lang.String dir) throws java.io.IOException {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFileSize(@org.jetbrains.annotations.NotNull()
    java.lang.Number fileSize) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFileSize(long size) {
        return null;
    }
    
    /**
     * 获取文件扩展名
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtensionName(@org.jetbrains.annotations.Nullable()
    java.lang.String filename) {
        return null;
    }
    
    /**
     * 获取文件名
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFileNameFromPath(@org.jetbrains.annotations.Nullable()
    java.lang.String filepath) {
        return null;
    }
    
    /**
     * 判断文件是否存在
     *
     * @param filePath 文件路径
     * @return `true`: 存在<br></br>`false`: 不存在
     */
    public final boolean isFileExists(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
        return false;
    }
    
    /**
     * 判断文件是否存在
     *
     * @param file 文件
     * @return `true`: 存在<br></br>`false`: 不存在
     */
    public final boolean isFileExists(@org.jetbrains.annotations.Nullable()
    java.io.File file) {
        return false;
    }
    
    /**
     * 根据文件路径获取文件
     *
     * @param filePath 文件路径
     * @return 文件
     */
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getFileByPath(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
        return null;
    }
    
    /**
     * 创建文件夹
     */
    public final void createFile(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    /**
     * 判断字符串是否为null或全为空格
     *
     * @param s 待校验字符串
     * @return `true`: null或全空格<br></br> `false`: 不为null且不全空格
     */
    private final boolean isSpace(java.lang.String s) {
        return false;
    }
    
    /**
     * 创建文件
     *
     * @param filePath 文件地址
     * @param fileName 文件名
     * @return
     */
    public final boolean createFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return false;
    }
    
    /**
     * 遍历文件夹下的文件
     *
     * @param file 地址
     */
    private final java.util.List<java.io.File> getFile(java.io.File file) {
        return null;
    }
    
    /**
     * 删除文件
     *
     * @param filePath 文件地址
     * @return
     */
    public final boolean deleteFiles(@org.jetbrains.annotations.Nullable()
    java.lang.String filePath) {
        return false;
    }
    
    /**
     * 向文件中添加内容
     *
     * @param strcontent 内容
     * @param filePath   地址
     * @param fileName   文件名
     */
    public final void writeToFile(@org.jetbrains.annotations.NotNull()
    java.lang.String strcontent, @org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
    }
    
    /**
     * 修改文件内容（覆盖或者添加）
     *
     * @param path    文件地址
     * @param content 覆盖内容
     * @param append  指定了写入的方式，是覆盖写还是追加写(true=追加)(false=覆盖)
     */
    public final void modifyFile(@org.jetbrains.annotations.Nullable()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.lang.String content, boolean append) {
    }
    
    /**
     * 读取文件内容
     *
     * @param filePath 地址
     * @param filename 名称
     * @return 返回内容
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
    
    /**
     * 重命名文件
     *
     * @param oldPath 原来的文件地址
     * @param newPath 新的文件地址
     */
    public final void renameFile(@org.jetbrains.annotations.Nullable()
    java.lang.String oldPath, @org.jetbrains.annotations.Nullable()
    java.lang.String newPath) {
    }
    
    /**
     * 复制文件
     * @param oldPath 源文件路径
     * @param newPath 目标文件路径
     */
    public final boolean copyFile(@org.jetbrains.annotations.NotNull()
    java.lang.String oldPath, @org.jetbrains.annotations.NotNull()
    java.lang.String newPath) {
        return false;
    }
    
    /**
     * 获取缓存路径
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiskCacheDir(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private FileUtils() {
        super();
    }
}