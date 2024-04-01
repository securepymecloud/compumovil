package com.example.terms

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.terms.ui.theme.TermsTheme
import androidx.appcompat.app.AppCompatActivity

class TermsAndConditionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_and_conditions)

        val textViewTerms: TextView = findViewById<TextView>(R.id.textViewTerms)
        textViewTerms.text = getString(R.string.terms_and_conditions)

        val acceptButton: Button = findViewById<Button>(R.id.acceptButton)
        val rejectButton: Button = findViewById<Button>(R.id.rejectButton)

        acceptButton.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

        rejectButton.setOnClickListener {
            // Aquí iría el código que quieres ejecutar cuando el usuario rechace los términos
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TermsTheme {
        Greeting("Android")
    }
}