package com.gnetop.letui.sleep.ext

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.gnetop.letui.sleep.util.glide.GlideUtils

object BindAdapter {


    /**
     * 设置图片
     */
    @JvmStatic
    @BindingAdapter(value = ["imageUrl", "placeholderResID"])
    fun loadImage(view: ImageView, url: String, placeholder: Drawable) {
        GlideUtils.loadWithAlpha(view.context,url,placeholder,view)
    }
}