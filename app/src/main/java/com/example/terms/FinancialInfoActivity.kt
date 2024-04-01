package com.example.terms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FinancialInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financial_info)
        val buttonFinalize: Button = findViewById<Button>(R.id.buttonFinalize)
        buttonFinalize.setOnClickListener {
            val intent = Intent(this, Sign_inActivity::class.java)
            startActivity(intent)
        }
    }
}