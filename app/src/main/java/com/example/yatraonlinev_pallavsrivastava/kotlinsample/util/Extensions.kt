package com.example.yatraonlinev_pallavsrivastava.kotlinsample.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by YATRAONLINE\v-pallav.srivastava on 22/2/18.
 */


fun View.visible() {
    this.visibility = View.VISIBLE
}

fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}

fun ImageView.loadUrl(url: String) {
    Glide.with(context).load(url).into(this)
}
