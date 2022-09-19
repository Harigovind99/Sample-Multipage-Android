package com.seshhari.testlearnapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MYTAG", "SecondActivity:OnCreate")
        val userName = intent.getStringExtra("USER")
        val textview = findViewById<TextView>(R.id.tvOffers)
        val message = "Congratulations $userName you get access to Prime Membership for 1 month "
        textview.text = message
    }
    override fun onStart() {
        super.onStart()
        Log.i("MYTAG", "SecondActivity:OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG", "SecondActivity:OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG", "SecondActivity:OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG", "SecondActivity:OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG", "SecondActivity:OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG", "SecondActivity:OnRestart")
    }
}