package com.example.controldepto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.controldepto.databinding.ActivityMainBinding;
import com.example.controldepto.model.VerificadorPass;

public class LoginActivity extends AppCompatActivity implements IViewPresenterLogin {

    private ActivityMainBinding mBinding;
    private LoginPresenter presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        presentador = new LoginPresenter(this);
        mBinding.buttonLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            presentador.verifyPass("Correcta");
            }
        });
    }

    @Override
    public void showPass(String Pass) {
        makeIntent();

    }

    private void makeIntent(){
        Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
        Intent mIntent = new Intent(LoginActivity.this, SecondActivity.class);
        startActivity(mIntent);


    }

}