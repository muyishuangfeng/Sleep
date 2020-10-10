package com.gnetop.letui.sleep.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.VideoView

internal class CustomVideoView @JvmOverloads constructor(
    context: Context?,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : VideoView(context, attrs, defStyleAttr) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val w = MeasureSpec.getSize(widthMeasureSpec)
        setMeasuredDimension(w, (w / 0.56f).toInt())
    }
}