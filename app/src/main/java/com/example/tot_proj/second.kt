package com.example.tot_proj

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.net.PasswordAuthentication

class second : AppCompatActivity() {

//    private lateinit var textUserid: TextView
//    private lateinit var textuserpassword: TextView


    private lateinit var save: Button
    private lateinit var edituserName: EditText
    private lateinit var edituserage: EditText
    private lateinit var editusercontant: EditText
    private lateinit var edituserEmail: EditText


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        textUserid = findViewById(R.id.tv_user)
//        textuserpassword = findViewById(R.id.tv_password)

//        val userid = intent.getStringExtra("userid")
//        val userpassword = intent.getStringExtra("password")


//        textUserid.text = "username : " + userid
//        textuserpassword.text = "password : " + userpassword






        save = findViewById(R.id.save)
        edituserName = findViewById(R.id.tv_name)
        edituserage = findViewById(R.id.tv_age)
        editusercontant = findViewById(R.id.tv_contant)
        edituserEmail = findViewById(R.id.tv_Email)

        save.setOnClickListener {

            startActivity(
                Intent(this, Third::class.java)
                    .putExtra("username", edituserName.text.toString())
                    .putExtra("Age", edituserage.text.toString())
                    .putExtra("contant", editusercontant.text.toString())
                    .putExtra("Email", edituserEmail.text.toString())
            )


            val secondbutton = findViewById<Button>(R.id.second_button)
            secondbutton.setOnClickListener {
                val Intent = Intent(this, second::class.java)
                startActivity(Intent)

            }


        }
    }
}
