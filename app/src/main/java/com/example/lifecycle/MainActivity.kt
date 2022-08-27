package com.example.lifecycle

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    private var position: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this, R.raw.ai_2)
        Log.i("Lifecycle", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        mediaPlayer.start()
        Log.i("Lifecycle", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "OnPause")
        mediaPlayer.pause()
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle", "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Lifecycle", "OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle", "OnDestroy")
    }

}