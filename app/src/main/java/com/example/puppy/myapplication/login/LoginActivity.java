package com.example.puppy.myapplication.login;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.puppy.myapplication.R;
import com.example.puppy.myapplication.login.model.LoginModel;
import com.example.puppy.myapplication.login.presenter.LoginPresenter;
import com.example.puppy.myapplication.login.presenter.LoginPresenterImpl;
import com.example.puppy.myapplication.login.view.LoginView;

/**
 * Created by puppy on 1/6/2018.
 */

// Activity implement login view
public class LoginActivity  extends AppCompatActivity implements LoginView, View.OnClickListener {

    private LoginPresenter presenter;
    private Button butt;
    private TextView test ;
    private ProgressBar pd;
    @Override
    public void onCreate(Bundle savedInstanceState,PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
       /* setContentView(R.layout.activity_tt);
        Log.e("testinside","test");
        butt=findViewById(R.id.button);
        test=findViewById(R.id.test);
        pd=findViewById(R.id.progress);
        butt.setOnClickListener(this);
        presenter=new LoginPresenterImpl(this);*/
    }

    @Override
    public void showProgress() {
     pd.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        pd.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void navigateToHome(LoginModel data) {
        test.setText(data.getAvatarUrl());
    }

    @Override
    public void onClick(View view) {
       presenter.validateCredentials("test","test");
    }
}
