package com.example.a4_intent_login_simple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        
        var back:Button = findViewById(R.id.button)
        back.setOnClickListener {

            startActivity(Intent(this,MainActivity::class.java))

        }
    }
}