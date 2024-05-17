package com.example.noteit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.noteit.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        viewBinding.createButton.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }

        viewBinding.LoginButton.setOnClickListener {
            val dashboardIntent = Intent(this@LoginActivity, DashboardActivity::class.java)
            startActivity(dashboardIntent)
        }
    }
}
