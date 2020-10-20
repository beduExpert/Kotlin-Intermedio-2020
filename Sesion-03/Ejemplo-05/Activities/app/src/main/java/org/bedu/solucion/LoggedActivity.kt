package org.bedu.solucion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


class LoggedActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)

        val textName = findViewById<TextView>(R.id.name)
        val textEmail = findViewById<TextView>(R.id.email)

        val bundle = intent.extras

        val name = bundle?.getString(USER_NAME)
        val email = bundle?.getString(USER_EMAIL)
        val phone = intent.getStringExtra(USER_PHONE)

        textName.text = name
        textEmail.text = email

        Log.d("activities","El telefono es $phone")
    }
}
