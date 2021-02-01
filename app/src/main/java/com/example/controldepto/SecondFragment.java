package com.example.controldepto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.controldepto.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding mBinding;
    CheckBox chBLight, chBBed, chBKitch, chBWR;
    private int luces, dormitorio, cocina, baño;
    public int total,choice;
    private String image, textProject, textunit;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            image = getArguments().getString("clave1");
            textProject = getArguments().getString("clave2");
            textunit = getArguments().getString("clave3");


        }

    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        mBinding = FragmentSecondBinding.inflate(inflater, container, false);
        return mBinding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.tVProject.setText(textProject);
        mBinding.tVUnidad.setText(textunit);
        Glide.with(view).load(image).into(mBinding.iVBuild);

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
            int numFinal = (luces + dormitorio +cocina+baño) * choice;
            String total = String.valueOf(numFinal);
            mBinding.tVResultado.setText(total);
        });

        mBinding.chBLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean indexLuces = mBinding.chBLight.isChecked();
                luces =0;
                if (indexLuces == true) {
                    luces += 10;
                }
            }
        });
       mBinding.chBBed.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Boolean indexBed = mBinding.chBBed.isChecked();
               dormitorio = 0;
               if (indexBed == true){
                   dormitorio += 20;
               }
           }
       });
    mBinding.chBKitch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Boolean indexCocina = mBinding.chBKitch.isChecked();
            cocina = 0;
            if (indexCocina == true){
            cocina += 30;
            }
        }
});
       mBinding.chBWR.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Boolean indexBaño = mBinding.chBWR.isChecked();
               baño = 0;
               if (indexBaño == true) {
                   baño += 40;
               }
           }
       });
    }
}
































