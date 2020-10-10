package com.gnetop.letui.sleep.common

import android.os.Environment
import java.io.File

object APPConfig {


    const val USER_AVATAR =
        "https://nightlesson.oss-cn-hangzhou.aliyuncs.com/0053f885c4fd91f98f.jpg"

    private var SDK_PATH = Environment
        .getExternalStorageDirectory().path + File.separator

    val SLEEP_PATH = SDK_PATH + "Sleep" + File.separator

    val PATH_MP3 = SLEEP_PATH + "mp3" + File.separator

    /***图片路径 */
    val PICTURE_DIR: String = SDK_PATH + "picture" + File.separator

    /***截取的路径 */
    val PATH_MP3_SPLIT: String = SDK_PATH + "split" + File.separator

    /***合并的路径 */
    val PATH_MP3_MERGER: String = SDK_PATH + "merger" + File.separator


}

