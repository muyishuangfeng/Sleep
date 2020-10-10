package com.gnetop.letui.sleep.widget.activity

import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.base.ac.BaseVMActivity
import com.gnetop.letui.sleep.common.ActivityManager
import com.gnetop.letui.sleep.databinding.ActivityMainBinding
import com.gnetop.letui.sleep.viewmodel.main.MainViewModel

class MainActivity : BaseVMActivity<MainViewModel, ActivityMainBinding>() {

    override fun getLayoutID() = R.layout.activity_main

    override fun viewModelClass() = MainViewModel::class.java

    override fun initBinding(binding: ActivityMainBinding) {
        super.initBinding(binding)
        binding.imgMainSetting.setOnClickListener { }
        binding.imgMainUser.setOnClickListener {
            //ActivityManager.start(UserActivity::class.java)
            ActivityManager.start(CustomActivity::class.java)
        }
    }
}