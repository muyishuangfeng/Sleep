package com.gnetop.letui.sleep.util

import android.app.Activity
import android.content.Intent
import com.gnetop.letui.sleep.util.glide.GlideEngine
import com.huantansheng.easyphotos.EasyPhotos
import com.huantansheng.easyphotos.models.album.entity.Photo

const val REQUEST_CODE_TAKE_PHOTO = 1
const val REQUEST_CODE_OPEN_PHOTO_ALBUM = 2

object CameraUtil {

    /**
     * 打开相机
     */
    fun openCamera(context: Activity) {
        EasyPhotos.createCamera(context)
            .setFileProviderAuthority(AppUtil.getPackageName(context) + ".fileprovider")
            .start(REQUEST_CODE_TAKE_PHOTO)
    }

    /**
     * 打开相册
     */
    fun openAlbum(context: Activity) {
        EasyPhotos.createAlbum(context, false, GlideEngine.getInstance())
            .start(REQUEST_CODE_OPEN_PHOTO_ALBUM)
    }

    /**
     * 回调
     */
    fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?,
        mListener: OnCameraResultListener
    ) {
        if (Activity.RESULT_OK == resultCode) {
            when (requestCode) {
                REQUEST_CODE_TAKE_PHOTO -> {//拍照
                    if (data != null) {
                        val mPhotoList: java.util.ArrayList<Photo>? =
                            data.getParcelableArrayListExtra(EasyPhotos.RESULT_PHOTOS)
                        if (mPhotoList!!.size > 0) {
                            mListener.onCameraResult(mPhotoList[0].path)
                        }

                    }

                }
                REQUEST_CODE_OPEN_PHOTO_ALBUM -> {//从相册选择
                    if (data != null) {
                        val mPhotoList: java.util.ArrayList<Photo>? =
                            data.getParcelableArrayListExtra(EasyPhotos.RESULT_PHOTOS)
                        if (mPhotoList!!.size > 0) {
                            mListener.onAlbumResult(mPhotoList[0].path)
                        }

                    }
                }
            }
        }
    }
}

/**
 * 拍照和从相册选择结果接口
 */
interface OnCameraResultListener {

    fun onCameraResult(path: String?)

    fun onAlbumResult(path: String?)
}