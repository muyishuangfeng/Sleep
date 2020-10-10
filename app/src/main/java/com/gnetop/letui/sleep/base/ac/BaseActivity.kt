package com.gnetop.letui.sleep.base.ac

import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.gnetop.letui.sleep.common.ActivityManager
import com.gnetop.letui.sleep.ui.ProgressDialogFragment
import me.jessyan.autosize.AutoSize

abstract class BaseActivity<V : ViewDataBinding> : AppCompatActivity() {

    lateinit var mBinding: V
    private lateinit var mDialogFragment: ProgressDialogFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        AutoSize.autoConvertDensityBaseOnHeight(this, 667f)
        mBinding = DataBindingUtil.setContentView(this, getLayoutID())
        initSaveState(mBinding, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        initBinding(mBinding)
    }

    /**
     * 获取跟布局
     */
    abstract fun getLayoutID(): Int

    /**
     * 初始化数据
     */
    open fun initBinding(binding: V) {
        this.mBinding = binding
    }

    open fun initSaveState(mBinding: V, savedInstanceState: Bundle?) {
        this.mBinding = mBinding
    }

    /**
     * 显示进度对话框
     */
    fun showProgressDialog(message: Int) {
        if (!this::mDialogFragment.isInitialized) {
            mDialogFragment = ProgressDialogFragment.newInstance()
        }
        mDialogFragment.show(supportFragmentManager, message, false)
    }

    /**
     * 隐藏进度对话框
     */
    fun hideProgressDialog() {
        if (this::mDialogFragment.isInitialized && mDialogFragment.isVisible) {
            mDialogFragment.dismiss()
        }
    }

    // 在BaseActivity 中重写
    override fun getResources(): Resources {
        val res: Resources = super.getResources()
        val config = Configuration()
        config.setToDefaults()
        res.updateConfiguration(config, res.displayMetrics)
        return res
    }




}