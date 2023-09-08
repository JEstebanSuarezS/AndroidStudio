package com.example.evidences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var tvWorld:TextView
    private lateinit var Fullname:EditText
    private lateinit var btnView:Button
    private lateinit var btnView2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvWorld = findViewById(R.id.textWorld)
        Fullname = findViewById(R.id.Fullname)
        btnView = findViewById(R.id.btnView)
        btnView2 = findViewById(R.id.btnView2)

        btnView.setOnClickListener {
            tvWorld.text = Fullname.text
        }

        btnView2.setOnClickListener {
            if (!Fullname.text.isNullOrEmpty()){
                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("keyFullName", "${Fullname.text}")
                startActivity(intent)
            }else{
                Toast.makeText(this, "El input no puede estar vacio", Toast.LENGTH_SHORT).show()
            }
        }

        tvWorld.text = "Este es un mensaje de más"
    }
}