package com.example.yatraonlinev_pallavsrivastava.kotlinsample.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import butterknife.BindView
import butterknife.ButterKnife
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.R
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.fragment.MainFragment

class MainActivity : BaseActivity() {

    @BindView(R.id.rl_container)
    lateinit var container: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        if (savedInstanceState == null) {
            changeFragment(MainFragment(),R.id.rl_container)
        }
    }
}
