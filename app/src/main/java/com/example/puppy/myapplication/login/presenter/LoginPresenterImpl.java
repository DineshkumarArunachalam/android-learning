package com.example.puppy.myapplication.login.presenter;

import com.example.puppy.myapplication.login.model.LoginModel;
import com.example.puppy.myapplication.login.view.LoginView;
import com.example.puppy.myapplication.service.ApiInterface;
import com.example.puppy.myapplication.service.ApiUrl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by puppy on 1/6/2018.
 */

public class LoginPresenterImpl implements LoginPresenter {

    ApiInterface apiService;
    LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {

         apiService = ApiUrl.getClient().create(ApiInterface.class);
         this.loginView=loginView;
    }
    //validate the credintialse by calling service
    @Override
    public void validateCredentials(String username, String password) {
        loginView.showProgress();
        if(username.length()>5 && password.length()>5)
          LoginMethod(username,password);
        else {
            loginView.hideProgress();
            loginView.setUsernameError();
        }
    }

    @Override
    public void onDestroy() {

    }

    /**
     * api call to validate the creditianls
     * @param username
     * @param password
     */
    public void LoginMethod(String username, String password) {
        Call<LoginModel> call =apiService.getList();
        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                LoginModel data=response.body();
                loginView.hideProgress();
                loginView.navigateToHome(data);
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {

            }
        });
    }
}
