package com.example.puppy.myapplication.login.view;

import com.example.puppy.myapplication.login.model.LoginModel;

/**
 * Created by puppy on 1/6/2018.
 */

public interface  LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome(LoginModel data);
}
