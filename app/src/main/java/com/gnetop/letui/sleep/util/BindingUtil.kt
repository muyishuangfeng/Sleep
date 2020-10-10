package com.gnetop.letui.sleep.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.gnetop.letui.sleep.util.glide.GlideUtils

object BindingUtil {
    /**
     * 设置图片
     */
    @JvmStatic
    @BindingAdapter(value = ["imageUrl"], requireAll = false)
    fun loadImage(view: ImageView, url: String) {
        GlideUtils.loadPathWithCircle(view.context, url, view)
    }



}