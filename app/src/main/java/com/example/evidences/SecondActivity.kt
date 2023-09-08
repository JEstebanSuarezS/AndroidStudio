package com.example.evidences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var btnNext:Button
    private  lateinit var tvViewName:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnNext = findViewById(R.id.btnNextDos)
        tvViewName = findViewById(R.id.tvViewName)

        var fullName = intent.getStringExtra("keyFullName")

        tvViewName.text = fullName

        btnNext.setOnClickListener {
                val intent = Intent(this,ThirdActivity::class.java)
                startActivity(intent)
            }
        }
}