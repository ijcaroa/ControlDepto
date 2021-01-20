package com.example.controldepto;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.controldepto.databinding.ItemListDataBinding;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

//Tengo que incluir la representación de los datos

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ListViewHolder(@NonNull ItemListDataBinding mBinding) {
            super(mBinding.getRoot());
            textView = mBinding.textViewName;
            textView = mBinding.textViewNumero;
            textView = mBinding.textViewDirección;


        }
    }


}
