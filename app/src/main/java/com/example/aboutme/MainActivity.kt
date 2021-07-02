package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText : TextView = findViewById<TextView>(R.id.nickname_edit)
        val nicknameTextView : TextView = findViewById<TextView>(R.id.nickname_text)
        val btnDone : Button = findViewById(R.id.done_button)

        btnDone.setOnClickListener{
            nicknameTextView.text = editText.text

            editText.visibility = View.GONE
            btnDone.visibility = View.GONE
            nicknameTextView.visibility = View.VISIBLE
        }

    }
}