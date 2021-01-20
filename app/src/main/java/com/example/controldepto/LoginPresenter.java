package com.example.controldepto;

import android.widget.Toast;

import com.example.controldepto.model.VerificadorPass;

public class LoginPresenter {

    private IViewPresenterLogin viewPresenter;
    private VerificadorPass model;

    public LoginPresenter(IViewPresenterLogin viewPresenter) {
        this.viewPresenter = viewPresenter;
        this.model = new VerificadorPass();
    }

    public void verifyPass(String password) {
        if (model.verificador("Correcta")) {
            viewPresenter.showPass("Correcta");

        } else {
            viewPresenter.showPass("Incorrecta");


        }

    }
}
