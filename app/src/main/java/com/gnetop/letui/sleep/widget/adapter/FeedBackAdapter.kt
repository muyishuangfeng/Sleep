package com.gnetop.letui.sleep.widget.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder
import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.databinding.ItemFeedbackImgLayoutBinding
import com.gnetop.letui.sleep.model.FeedBackImgModel

class FeedBackAdapter(var layoutID: Int = R.layout.item_feedback_img_layout) :
    BaseQuickAdapter<FeedBackImgModel, BaseDataBindingHolder<ItemFeedbackImgLayoutBinding>>(layoutID) {

    var mOnItemDeleteListener: ((position: Int) -> Unit)? = null

    override fun convert(
        holder: BaseDataBindingHolder<ItemFeedbackImgLayoutBinding>,
        item: FeedBackImgModel
    ) {
        holder.dataBinding?.feedBack=item
        holder.itemView.run {
            setOnClickListener {
                mOnItemDeleteListener?.invoke(holder.adapterPosition)
            }
        }
    }
}