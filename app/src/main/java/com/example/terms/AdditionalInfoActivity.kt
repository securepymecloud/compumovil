package com.example.terms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdditionalInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_additional_info)
        val buttonNext: Button = findViewById<Button>(R.id.buttonNext)
        buttonNext.setOnClickListener {
            val intent = Intent(this, FinancialInfoActivity::class.java)
            startActivity(intent)
        }
    }
}