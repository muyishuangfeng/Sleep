package com.gnetop.letui.sleep.widget.activity

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.media.AudioManager
import android.media.MediaPlayer
import android.widget.SeekBar
import android.widget.Toast
import androidx.core.view.drawToBitmap
import com.gnetop.letui.sleep.R
import com.gnetop.letui.sleep.base.ac.BaseActivity
import com.gnetop.letui.sleep.common.APPConfig.PATH_MP3
import com.gnetop.letui.sleep.common.APPConfig.USER_AVATAR
import com.gnetop.letui.sleep.databinding.BalanceUserDataLayoutBinding
import com.gnetop.letui.sleep.receiver.AlarmClockReceiver
import com.gnetop.letui.sleep.util.DateUtil
import com.gnetop.letui.sleep.util.EasyBlur
import java.lang.ref.WeakReference
import java.util.*


class CustomActivity : BaseActivity<BalanceUserDataLayoutBinding>() {

    private var mMediaPlayerOne: MediaPlayer? = null
    private var mMediaPlayerTwo: MediaPlayer? = null
    private var mMediaPlayerThree: MediaPlayer? = null
    private var mHour = 0
    private var mMinute = 0
    private var alarmIntent: PendingIntent? = null
    private var alarmMgr: AlarmManager? = null


    override fun getLayoutID() = R.layout.balance_user_data_layout

    override fun initBinding(binding: BalanceUserDataLayoutBinding) {
        super.initBinding(binding)
        binding.imageUrl = USER_AVATAR
        binding.btnOneStart.setOnClickListener {
            if (mMediaPlayerOne == null) {
                mMediaPlayerOne = MediaPlayer()
                mMediaPlayerOne!!.setAudioStreamType(AudioManager.STREAM_MUSIC)
                mMediaPlayerOne!!.setDataSource(PATH_MP3 + "木鱼笃笃.mp3")
                mMediaPlayerOne!!.prepareAsync()
                mMediaPlayerOne!!.setOnPreparedListener {
                    if (!mMediaPlayerOne!!.isPlaying) {
                        mMediaPlayerOne!!.start()
                    }
                }
                mMediaPlayerOne!!.setOnCompletionListener {
                    mMediaPlayerOne!!.release()
                    mMediaPlayerOne = null
                }
            }


        }

        binding.btnOneStop.setOnClickListener {
            if (mMediaPlayerOne != null)
                if (mMediaPlayerOne!!.isPlaying) {
                    mMediaPlayerOne!!.stop()
                    mMediaPlayerOne!!.release()
                    mMediaPlayerOne = null
                }

        }
        binding.btnTwoStart.setOnClickListener {
            if (mMediaPlayerTwo == null) {
                mMediaPlayerTwo = MediaPlayer()
                mMediaPlayerTwo!!.setAudioStreamType(AudioManager.STREAM_MUSIC)
                mMediaPlayerTwo!!.setDataSource(PATH_MP3 + "诵经礼佛.mp3")
                mMediaPlayerTwo!!.prepareAsync()
                mMediaPlayerTwo!!.setOnPreparedListener {
                    if (!mMediaPlayerTwo!!.isPlaying) {
                        mMediaPlayerTwo!!.start()
                    }
                }
                mMediaPlayerTwo!!.setOnCompletionListener {
                    mMediaPlayerTwo!!.release()
                    mMediaPlayerTwo = null
                }
            }


        }
        binding.btnTwoStop.setOnClickListener {
            if (mMediaPlayerTwo != null)
                if (mMediaPlayerTwo!!.isPlaying) {
                    mMediaPlayerTwo!!.stop()
                    mMediaPlayerTwo!!.release()
                    mMediaPlayerTwo = null
                }

        }
        binding.btnThirdStart.setOnClickListener {
            if (mMediaPlayerThree == null) {
                mMediaPlayerThree = MediaPlayer()
                mMediaPlayerThree!!.setAudioStreamType(AudioManager.STREAM_MUSIC)
                mMediaPlayerThree!!.setDataSource(PATH_MP3 + "清晨鸟鸣.mp3")
                mMediaPlayerThree!!.prepareAsync()
                mMediaPlayerThree!!.isLooping = true
                mMediaPlayerThree!!.setOnPreparedListener {
                    if (!mMediaPlayerThree!!.isPlaying) {
                        mMediaPlayerThree!!.start()
                    }
                }
                mMediaPlayerThree!!.setOnCompletionListener {
                    mMediaPlayerThree!!.release()
                    mMediaPlayerThree = null
                }
            }

        }
        binding.btnThirdStop.setOnClickListener {
            if (mMediaPlayerThree != null)
                if (mMediaPlayerThree!!.isPlaying) {
                    mMediaPlayerThree!!.stop()
                    mMediaPlayerThree!!.release()
                    mMediaPlayerThree = null
                }

        }
        setProgress()
        binding.btnSure.setOnClickListener {
            if (mHour != 0 && mMinute != 0) {
                // 24h
                val INTERVAL = 1000 * 60 * 60 * 24
                val intent = Intent(this, AlarmClockReceiver::class.java)
                alarmIntent = PendingIntent.getBroadcast(
                    this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT
                )
                val calendar = Calendar.getInstance()
                alarmMgr = getSystemService(ALARM_SERVICE) as AlarmManager
                calendar.set(Calendar.HOUR_OF_DAY, mHour)
                calendar.set(Calendar.MINUTE, mMinute)
                alarmMgr?.setRepeating(
                    AlarmManager.RTC_WAKEUP,
                    calendar.timeInMillis,
                    INTERVAL.toLong(),
                    alarmIntent
                )
                Toast.makeText(this,"闹铃设置成功",Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnCancel.setOnClickListener {
            if (alarmIntent != null && alarmMgr != null) {
                alarmMgr?.cancel(alarmIntent)
            }
        }
        binding.hourPicker.setTime(DateUtil.getHour(), DateUtil.getMinute())
        binding.hourPicker.setOnTimeSelectedListener { hour, minute ->
            mHour = hour
            mMinute = minute
        }
    }

    private fun setProgress() {
        //初始化音频管理器
        val mAudioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        //获取系统最大音量
        val maxVolume = mAudioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        // 获取设备当前音量
        val currentVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
        // 设置seekbar的最大值
        mBinding.progress.max = maxVolume
        // 显示音量
        mBinding.progress.progress = currentVolume
        mBinding.progress.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                mAudioManager.setStreamVolume(AudioManager.STREAM_SYSTEM, progress, 0)
                mAudioManager.setStreamVolume(3, progress, 0)// 3 代表 AudioManager.STREAM_MUSIC
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
        registerReceiver()
    }

    /**
     * 注册当音量发生变化时接收的广播
     */
    private fun registerReceiver() {
        val mVolumeReceiver = MyVolumeReceiver(this)
        val filter = IntentFilter()
        filter.addAction("android.media.VOLUME_CHANGED_ACTION")
        registerReceiver(mVolumeReceiver, filter)
    }

    /**
     * 处理音量变化时的界面显示
     * @author long
     */
    private class MyVolumeReceiver(activity: CustomActivity) : BroadcastReceiver() {

        val weakReference: WeakReference<CustomActivity> = WeakReference(activity)


        override fun onReceive(context: Context, intent: Intent) {
            //如果音量发生变化则更改seekbar的位置
            if (intent.action == "android.media.VOLUME_CHANGED_ACTION") {
                val mAudioManager =
                    context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
                val currVolume =
                    mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC) // 当前的媒体音量
                weakReference.get()!!.mBinding.progress.progress = currVolume
            }
        }
    }
}