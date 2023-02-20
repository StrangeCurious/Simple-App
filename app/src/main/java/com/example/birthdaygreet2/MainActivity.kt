package com.example.birthdaygreet2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateCard.setOnClickListener {

            val name = etName.editableText.toString()

            val intent = Intent(this,BirthdayGreetActivity::class.java)
            intent.putExtra("name1",name)
            startActivity(intent)

        }
    }
}