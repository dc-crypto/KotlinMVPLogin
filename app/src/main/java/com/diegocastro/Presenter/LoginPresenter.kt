package com.diegocastro.Presenter

import com.diegocastro.Model.User
import com.diegocastro.View.ILoginView

class LoginPresenter (internal var iLoginView: ILoginView):ILoginPresenter{
    override fun onLogin(email: String, password: String) {
        val user= User(email, password)
        val isLoginSucces=user.isDataValid

        if (isLoginSucces)
            iLoginView.onLoginResult("Login OK")
        else
            iLoginView.onLoginResult("Login error")
    }
}