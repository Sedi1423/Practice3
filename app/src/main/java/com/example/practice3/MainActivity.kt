package com.example.practice3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var nameInput: EditText
    lateinit var studentnumberInput:EditText
    lateinit var btnLogin: Button
    lateinit var btnExit:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        nameInput=findViewById(R.id.nameInput)
        studentnumberInput=findViewById(R.id.studentnumberInput)
        btnLogin=findViewById(R.id.btnLogin)
        btnExit=findViewById(R.id.btnExit)

        btnExit.setOnClickListener{
           //closing app
            finishAffinity()

        }
        btnLogin.setOnClickListener {
//button to login and go to the next screen

            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        



        }


    }
}