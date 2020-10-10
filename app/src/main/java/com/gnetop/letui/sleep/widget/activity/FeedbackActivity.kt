package com.gnetop.letui.sleep.widget.activity

import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.base.ac.BaseVMActivity
import com.gnetop.letui.sleep.common.ActivityManager
import com.gnetop.letui.sleep.databinding.ActivityFeedbackBinding
import com.gnetop.letui.sleep.viewmodel.feedback.FeedbackViewModel
import com.yk.silence.toolbar.CustomTitleBar

class FeedbackActivity : BaseVMActivity<FeedbackViewModel, ActivityFeedbackBinding>() {

    override fun getLayoutID() = R.layout.activity_feedback

    override fun viewModelClass() = FeedbackViewModel::class.java

    override fun initBinding(binding: ActivityFeedbackBinding) {
        super.initBinding(binding)
        binding.titleFeedback.setTitleClickListener(object : CustomTitleBar.TitleClickListener {
            override fun onLeftClick() {
                ActivityManager.finish(FeedbackActivity::class.java)
            }

            override fun onRightClick() {

            }
        })

    }
}