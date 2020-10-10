package com.gnetop.letui.sleep.widget.activity

import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.base.ac.BaseVMActivity
import com.gnetop.letui.sleep.common.ActivityManager
import com.gnetop.letui.sleep.databinding.ActivityUserBinding
import com.gnetop.letui.sleep.viewmodel.user.UserViewModel

class UserActivity : BaseVMActivity<UserViewModel, ActivityUserBinding>() {

    override fun getLayoutID() = R.layout.activity_user

    override fun viewModelClass() = UserViewModel::class.java

    override fun initBinding(binding: ActivityUserBinding) {
        super.initBinding(binding)
        binding.txtUserAbout.setOnClickListener {}
        binding.txtUserClear.setOnClickListener { }
        binding.txtUserFeedback.setOnClickListener { }
        binding.txtUserProtocol.setOnClickListener { }
        binding.btnUserLogin.setOnClickListener {
            ActivityManager.start(LoginActivity::class.java)
        }
        binding.btnUserOpen.setOnClickListener {
            checkLoginState {
                ActivityManager.start(RechargeActivity::class.java)
            }
        }

    }
}