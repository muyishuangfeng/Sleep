package com.gnetop.letui.sleep.widget.activity

import android.Manifest
import android.annotation.SuppressLint
import android.net.Uri
import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.base.ac.BaseActivity
import com.gnetop.letui.sleep.common.APPConfig.PATH_MP3
import com.gnetop.letui.sleep.common.APPConfig.PATH_MP3_MERGER
import com.gnetop.letui.sleep.common.APPConfig.PATH_MP3_SPLIT
import com.gnetop.letui.sleep.common.APPConfig.SLEEP_PATH
import com.gnetop.letui.sleep.common.ActivityManager
import com.gnetop.letui.sleep.databinding.ActivitySplashBinding
import com.gnetop.letui.sleep.ext.videoPath
import com.gnetop.letui.sleep.util.FileUtils
import com.yk.silent.permission.HiPermission
import com.yk.silent.permission.impl.PermissionCallback
import com.yk.silent.permission.model.PermissionItem

class SplashActivity : BaseActivity<ActivitySplashBinding>() {


    override fun getLayoutID() = R.layout.activity_splash

    override fun initBinding(binding: ActivitySplashBinding) {
        super.initBinding(binding)
        binding.video.setVideoURI(Uri.parse(videoPath()))
        binding.video.setOnCompletionListener {
            binding.video.start()
        }
        binding.video.start()
        binding.btnBottom.setOnClickListener {
            initPermission()
        }

    }


    /**
     * 获取权限
     */
    @SuppressLint("CheckResult")
    private fun initPermission() {
        val permissionItems = ArrayList<PermissionItem>()
        permissionItems.add(
            PermissionItem(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                resources.getString(R.string.text_write_storage), R.drawable.permission_ic_storage
            )
        )
        permissionItems.add(
            PermissionItem(
                Manifest.permission.CAMERA,
                resources.getString(R.string.text_camera), R.drawable.permission_ic_camera
            )
        )
        permissionItems.add(
            PermissionItem(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                resources.getString(R.string.text_read_storage), R.drawable.permission_ic_phone
            )
        )

        HiPermission.create(this)
            .title(resources.getString(R.string.permission_get))
            .msg(resources.getString(R.string.permission_desc))
            .permissions(permissionItems)
            .checkMutiPermission(object : PermissionCallback {
                override fun onClose() {
                }

                override fun onDeny(permission: String?, position: Int) {
                }

                override fun onFinish() {
                    if (!FileUtils.isFileExists(SLEEP_PATH)) {
                        FileUtils.createFile(SLEEP_PATH)
                    }
                    if (!FileUtils.isFileExists(PATH_MP3)) {
                        FileUtils.createFile(PATH_MP3)
                    }
                    if (!FileUtils.isFileExists(PATH_MP3_SPLIT)) {
                        FileUtils.createFile(PATH_MP3_SPLIT)
                    }
                    if (!FileUtils.isFileExists(PATH_MP3_MERGER)) {
                        FileUtils.createFile(PATH_MP3_MERGER)
                    }
                    ActivityManager.start(MainActivity::class.java)
                    ActivityManager.finish(SplashActivity::class.java)
                }

                override fun onGuarantee(permission: String?, position: Int) {

                }
            })
    }


}