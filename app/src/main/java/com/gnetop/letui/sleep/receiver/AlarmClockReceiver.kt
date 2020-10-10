package com.gnetop.letui.sleep.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import com.gnetop.letui.sleep.common.APPConfig


class AlarmClockReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val mMediaPlayerOne = MediaPlayer()
        mMediaPlayerOne.setAudioStreamType(AudioManager.STREAM_MUSIC)
        mMediaPlayerOne.setDataSource(APPConfig.PATH_MP3 + "清晨鸟鸣.mp3")
        mMediaPlayerOne.prepareAsync()
        mMediaPlayerOne.setOnPreparedListener {
            if (!mMediaPlayerOne.isPlaying) {
                mMediaPlayerOne.start()
            }
        }
        mMediaPlayerOne.setOnCompletionListener {
            mMediaPlayerOne.stop()
            mMediaPlayerOne.release()
        }
    }
}