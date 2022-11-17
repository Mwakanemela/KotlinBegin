package com.example.kotlinbegin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button was clicked")
            Toast.makeText(this, "Button click", Toast.LENGTH_SHORT).show()
        }

        btnSendToNextActivity.setOnClickListener {


            val message: String = etUserMessage.text.toString()


            //explicit intent because i know were i want to go
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }

    }
}