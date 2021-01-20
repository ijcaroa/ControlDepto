package com.example.controldepto.model;

public class VerificadorPass {

    public String password;

    public boolean verificador (String password){
        if (verificador("123Pass") ){
            return true;
        } else {
            return false;
        }
    }

}
