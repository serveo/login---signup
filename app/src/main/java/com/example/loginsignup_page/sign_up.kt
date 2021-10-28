package com.example.loginsignup_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        lateinit var button: Button
        lateinit var email : EditText
        lateinit var username: EditText
        lateinit var password: EditText
        lateinit var confirm_password: EditText
        lateinit var tologin: TextView

        button = findViewById(R.id.sign_up)
        email = findViewById(R.id.Email)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        confirm_password = findViewById(R.id.confirm_password)
        tologin = findViewById(R.id.to_login)

        tologin.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
       button.setOnClickListener(){
           if(email.text.toString().isBlank()||username.text.toString().isBlank()||password.text.toString().isBlank()||confirm_password.text.toString().isBlank()){
               Toast.makeText(this, "please fill all fields ", Toast.LENGTH_SHORT).show()
           }else{
               Toast.makeText(this, "congrats", Toast.LENGTH_SHORT).show()
           }
       }

    }
}