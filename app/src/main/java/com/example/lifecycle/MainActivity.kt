package com.example.lifecycle

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var binding: ActivityMainBinding
    private var position: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCheck.setOnClickListener {
            startActivity(Intent(this, DialogActivity::class.java))
        }
        Log.i("Lifecycle", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        mediaPlayer = MediaPlayer.create(this, R.raw.ai_2)
        Log.i("Lifecycle", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        mediaPlayer.start()
        mediaPlayer.seekTo(position)
        Log.i("Lifecycle", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer.pause()
        position = mediaPlayer.currentPosition
        Log.i("Lifecycle", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer.stop()
        mediaPlayer.release()
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