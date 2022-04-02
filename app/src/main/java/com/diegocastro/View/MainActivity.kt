package com.diegocastro.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.diegocastro.Presenter.LoginPresenter
import com.diegocastro.kotlinmvplogin.R

class MainActivity : AppCompatActivity(), ILoginView {



    internal lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_login = findViewById<Button>(R.id.btn_login)
        var edt_email = findViewById<EditText>(R.id.edt_email)
        var edt_password = findViewById<EditText>(R.id.edt_password)

        loginPresenter=LoginPresenter(this)

        btn_login.setOnClickListener{
            loginPresenter.onLogin(edt_email.text.toString(),edt_password.text.toString() )
        }

    }

    override fun onLoginResult(message: String) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }

}