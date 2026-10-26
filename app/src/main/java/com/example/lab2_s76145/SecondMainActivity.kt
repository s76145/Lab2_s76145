package com.example.lab2_s76145

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.accessibility.AccessibilityManagerCompat

class SecondMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtName = findViewById<TextView>(R.id.txtDisplayName)
        val txtAge = findViewById<TextView>(R.id.txtDisplayAge)

        val dataName = intent.getStringExtra("EXTRA_NAME") ?: "No name input"
        val dataAge = intent.getStringExtra("EXTRA_AGE") ?: "No age input"

        txtName.text = "Name: $dataName"
        txtAge.text = "Age : $dataAge"
    }
}