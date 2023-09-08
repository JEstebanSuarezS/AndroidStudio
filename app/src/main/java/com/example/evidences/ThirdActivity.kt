package com.example.evidences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    private lateinit var tvNumRandom:TextView
    private lateinit var tvCount:TextView
    private lateinit var  countDownTimer: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        tvNumRandom = findViewById(R.id.tvNumRandom)
        tvCount = findViewById(R.id.tvCount)

        countDownTimer = object : CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {
                tvCount.text = "Cuenta regresiva ${p0/1000}"
            }

            override fun onFinish() {
                createRandom()
                countDownTimer.start()
            }

        }.start()
    }

    private fun createRandom() {
        tvNumRandom.text = (0..100).random().toString()
    }
}