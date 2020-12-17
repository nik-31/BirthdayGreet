package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_wishes.*

class BirthdayWishes : AppCompatActivity() {
    companion object{
        const val nameExtra = "nameExtra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wishes)

        val name = intent.getStringExtra(nameExtra)

        textView3.text="Happy Birthday $name"
    }
}