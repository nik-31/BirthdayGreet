package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun birthdayGreeting(view: View) {
        val name = PersonName.editableText.toString()

        val intent = Intent(this,BirthdayWishes::class.java)
        intent.putExtra(BirthdayWishes.nameExtra,name)
        startActivity(intent)
    }
}