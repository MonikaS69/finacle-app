package com.example.thebestappintheworld.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.thebestappintheworld.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_register)
    }
}