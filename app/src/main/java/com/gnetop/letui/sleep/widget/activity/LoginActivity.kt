package com.gnetop.letui.sleep.widget.activity

import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.base.ac.BaseVMActivity
import com.gnetop.letui.sleep.databinding.ActivityLoginBinding
import com.gnetop.letui.sleep.viewmodel.login.LoginViewModel

class LoginActivity : BaseVMActivity<LoginViewModel, ActivityLoginBinding>() {

    override fun getLayoutID() = R.layout.activity_login

    override fun viewModelClass() = LoginViewModel::class.java

}