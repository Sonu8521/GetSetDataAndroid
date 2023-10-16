package com.example.tot_proj

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class Third : AppCompatActivity() {


    private lateinit var textUserName : TextView
    private lateinit var textage : TextView
    private lateinit var textcontant : TextView
    private lateinit var textEmail : TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)



        textUserName = findViewById(R.id.tv_name)
         textage = findViewById(R.id.tv_age)
        textcontant = findViewById(R.id.tv_contant)
        textEmail = findViewById(R.id.tv_Email)


        val userName = intent.getStringExtra("username")
        val userage = intent.getStringExtra("Age")
        val usercontant = intent.getStringExtra("contant")
        val userEmail = intent.getStringExtra("Email")


        textUserName.text = "username : "+userName
        textage.text = "password : "+userage
        textcontant.text = "contant : "+usercontant
        textEmail.text = "Email : "+userEmail

    }
}