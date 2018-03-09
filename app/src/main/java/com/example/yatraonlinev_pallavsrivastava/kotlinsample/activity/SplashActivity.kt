package com.example.yatraonlinev_pallavsrivastava.kotlinsample.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle


class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

        finish()
    }
}