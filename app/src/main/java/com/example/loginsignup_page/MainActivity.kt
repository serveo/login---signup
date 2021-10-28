package com.example.loginsignup_page
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var logbutton: Button
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var signUp: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        signUp = findViewById(R.id.sign_up)
        logbutton = findViewById(R.id.log_button)

        signUp.setOnClickListener() {
            val intent = Intent(this, sign_up::class.java)
            startActivity(intent)

        }
        logbutton.setOnClickListener() {
            if (username.text.toString().isBlank() || password.text.toString().isBlank())
                Toast.makeText(this, "please fill all fields", Toast.LENGTH_SHORT).show()
            else {
                Toast.makeText(this, "loged in", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


