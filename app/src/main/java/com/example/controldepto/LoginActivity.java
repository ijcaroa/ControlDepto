package com.example.controldepto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.controldepto.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.editTextMail.setText("Ingrese su mail");
        mBinding.editTextPassword.setText("");

        mBinding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String password = mBinding.editTextPassword.getText().toString();
                String mail = mBinding.editTextMail.getText().toString();
                Boolean pass = password.equals("123Pass") && mail.equals("ignacio@mail.cl");
                if (!pass == true) {
                    Toast.makeText(LoginActivity.this, "Ingreso Incorrecto", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(LoginActivity.this, "Ingreso Correcto", Toast.LENGTH_SHORT).show();
                    passSecond();
                }
            }
        });

    }

    public void passSecond(){

        Intent intent = new Intent(LoginActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    }

