package com.example.puppy.myapplication.login.presenter;

/**
 * Created by puppy on 1/6/2018.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);
    void onDestroy();
}
