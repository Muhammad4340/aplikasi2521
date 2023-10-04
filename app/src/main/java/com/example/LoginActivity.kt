package com.example.bp_2521

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.LoginModel
import com.example.myapplication.HomeActivity
import com.example.myapplication.R

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instace
        val btnLogin: Button = findViewById(R.id.ButtonLogin)
        val txtUsername:EditText =findViewById(R.id.editTextUsername)
        val txtPassword:EditText =findViewById(R.id.editTextPassword)
        val LogModel = LoginModel()
        //event btn login di-klik
        btnLogin.setOnClickListener{
            //input
            LogModel = txtUsername.text.toString()
            LogModel.password = txtPassword.text.toString()
            //validasi login
            if {LogModel.loginCek() == true){
                //coll home activity
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
            }else{
             Toast.makeText(this,"Username/Password salah", Toast.LENGTH_SHORT).show()
                }
                }
        }

    }
