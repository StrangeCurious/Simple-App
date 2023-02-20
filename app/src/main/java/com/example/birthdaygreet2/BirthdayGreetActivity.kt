package com.example.birthdaygreet2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday_greet.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name = intent.getStringExtra("name1")

        birthdayGreeting.setText("Happy Birthday $name")
    }
}