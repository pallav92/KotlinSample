package com.example.yatraonlinev_pallavsrivastava.kotlinsample.activity

import android.os.Bundle
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.R
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.R.id.rl_container
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.fragment.MainFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            changeFragment(MainFragment(),rl_container)
        }
    }
}
