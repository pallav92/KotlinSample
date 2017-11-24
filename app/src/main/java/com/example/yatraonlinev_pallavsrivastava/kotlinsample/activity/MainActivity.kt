package com.example.yatraonlinev_pallavsrivastava.kotlinsample.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import butterknife.BindView
import butterknife.ButterKnife
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.R

class MainActivity : AppCompatActivity() {

    @BindView(R.id.rl_container)
    lateinit var container: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
    }

    fun ViewGroup.inflate(layoutRes: Int): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, false)
    }
}
