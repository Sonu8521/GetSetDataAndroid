package com.example.tot_proj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

//    private lateinit var second_button : Button
//    private lateinit var edituserid : EditText
//    private lateinit var edituserpassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        second_button = findViewById(R.id.second_button)
//        edituserid = findViewById(R.id.tv_user)
//        edituserpassword = findViewById(R.id.tv_password)


//        second_button.setOnClickListener{
//
//            startActivity(Intent(this,Third::class.java)
//                .putExtra("username",edituserid.text.toString())
//                .putExtra("Age",edituserpassword.text.toString())
//

        val secondbutton = findViewById<Button>(R.id.second_button)
        secondbutton.setOnClickListener {
            val Intent = Intent(this, second::class.java)
            startActivity(Intent)





        }

    }

}


