package com.example.controldepto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    private boolean choice;
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
        // Inflate the layout for this fragment
        mBinding = FragmentSecondBinding.inflate(inflater,container,false);
        return mBinding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
            mBinding.tVProject.setText(textProject);
            mBinding.tVUnidad.setText(textunit);
            Glide.with(view).load(image).into(mBinding.iVBuild);

            mBinding.rG1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int index  = mBinding.rG1.indexOfChild(mBinding.rG1.findViewById(checkedId));
                    if(index == 0){
                        luces = 10;
                    }else luces = 0;
                    if (index == 1){
                        dormitorio = 20;
                    } else dormitorio = 0;
                    if (index == 2){
                        cocina = 30;
                    }else cocina = 0;
                    if (index == 3){
                        baño = 40;
                    }else baño = 0;

                    int suma = luces + dormitorio + cocina + baño;

                    mBinding.tVResultado.setText(""+ suma);

                }
            });


            //mBinding.rG2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              //  @Override
                //public void onCheckedChanged(RadioGroup group, int checkedId) {
                  //  int index2 = mBinding.rG2.indexOfChild(mBinding.rG2.findViewById(checkedId));
                //}
            //});
            

    }

}