package com.example.terms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        // Encuentra el botón por su ID
        val buttonRegister: Button = findViewById<Button>(R.id.buttonRegister)

        // Establece un OnClickListener en el botón
        buttonRegister.setOnClickListener {
            // Crea un Intent para iniciar AdditionalInfoActivity
            val intent = Intent(this, AdditionalInfoActivity::class.java)
            startActivity(intent)
        }
        val textViewRegisterWithGoogle: TextView = findViewById(R.id.textViewRegisterWithGoogle)

        // Establece un OnClickListener en el TextView
        textViewRegisterWithGoogle.setOnClickListener {
            // Crea un Intent para iniciar GoogleSignInActivity
            val intent = Intent(this, GoogleSignInActivity::class.java)
            startActivity(intent)
        }
    }
}