package com.example.controldepto;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.bumptech.glide.Glide;
import com.example.controldepto.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {



    private FragmentSecondBinding mBinding;


    private int luces, dormitorio, cocina, baño, normal, regular, malo;
    public int total;
    private String image, textProject, textunit;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!= null){
            image = getArguments().getString("clave1");
            textProject = getArguments().getString("clave2");
            textunit = getArguments().getString("clave3");

         }
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        mBinding = FragmentSecondBinding.inflate(inflater,container,false);
        return mBinding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.tVProject.setText(textProject);
        mBinding.tVUnidad.setText(textunit);
        Glide.with(view).load(image).into(mBinding.iVBuild);




           mBinding.ButtonLight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Boolean indexLuces = mBinding.ButtonLight.isChecked();
                    int luces =0;
                    if (indexLuces == true) {
                        luces = 10;
                    }
                    String check1 = String.valueOf(luces);
                    mBinding.tVResultado.setText(check1);
                }
            });
            mBinding.ButtonBed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Boolean indexBed = mBinding.ButtonBed.isChecked();
                    int dormitorio = 0;
                    if (indexBed == true){
                        dormitorio = 20;
                    }
                    String check2 = String.valueOf(dormitorio);
                    mBinding.tVResultado.setText(check2);
                }
            });
            mBinding.ButtonKitch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Boolean indexCocina = mBinding.ButtonKitch.isChecked();
                    int cocina = 0;
                    if (indexCocina == true){
                        cocina = 30;
                    }
                    String check3 = String.valueOf(cocina);
                    mBinding.tVResultado.setText(check3);
                }
            });
            mBinding.ButtonWR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Boolean indexBaño = mBinding.ButtonWR.isChecked();
                    int baño = 0;
                    if (indexBaño == true){
                        baño = 40;
                    }
                    String check4 = String.valueOf(baño);
                    mBinding.tVResultado.setText(check4);
                }

            });
        mBinding.rG2.setOnCheckedChangeListener((group, checkedId) -> {
            int index2 = mBinding.rG2.indexOfChild(mBinding.rG2.findViewById(checkedId));
            int choice = 0;
            if (index2 == 0) {
                choice = 3;
            } else if (index2 == 1) {
                choice = 2;
            } else if (index2 == 2) {
                choice = 1;
            }

            String resultado = String.valueOf(choice);
            mBinding.tVResultado.setText(resultado);

        });



    }

    }



