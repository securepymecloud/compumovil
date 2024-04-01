package com.example.terms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.common.SignInButton

class GoogleSignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_sign_in)

        val signInButton = findViewById<SignInButton>(R.id.sign_in_button)
        signInButton.setSize(SignInButton.SIZE_WIDE)
        signInButton.setOnClickListener {
            val intent = Intent(this, AdditionalInfoActivity::class.java)
            startActivity(intent)
        }
    }
}