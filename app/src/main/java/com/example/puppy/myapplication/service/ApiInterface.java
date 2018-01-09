package com.example.puppy.myapplication.service;

import com.example.puppy.myapplication.login.model.LoginModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by puppy on 1/7/2018.
 */

public interface  ApiInterface {
    @GET("users/defunkt")
    Call<LoginModel> getList();

}
