package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Lifecycle", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "OnPause")
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