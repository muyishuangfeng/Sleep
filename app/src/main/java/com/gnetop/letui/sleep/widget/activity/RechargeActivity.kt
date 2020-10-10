package com.gnetop.letui.sleep.widget.activity

import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.base.ac.BaseVMActivity
import com.gnetop.letui.sleep.databinding.ActivityRechargeBinding
import com.gnetop.letui.sleep.viewmodel.recharge.RechargeViewModel

class RechargeActivity : BaseVMActivity<RechargeViewModel, ActivityRechargeBinding>() {

    override fun getLayoutID() = R.layout.activity_recharge

    override fun viewModelClass() = RechargeViewModel::class.java

    override fun initBinding(binding: ActivityRechargeBinding) {
        super.initBinding(binding)
    }
}