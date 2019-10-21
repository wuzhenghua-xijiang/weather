package com.imou

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

inline fun <reified T> AppCompatActivity.startActivity(content:String?=null) {
    val i = Intent(this, T::class.java)// ::class.java类似Java.class
    if (!content.isNullOrBlank()) {
        i.putExtra(Intent.EXTRA_TEXT, content)
    }
    startActivity(i)
}

open abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layoutResId())
        initView()
        initData()
    }

    abstract fun layoutResId(): Int
    open fun initView() {}
    open fun initData() {}
}