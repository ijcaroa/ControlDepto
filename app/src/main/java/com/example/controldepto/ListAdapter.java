package com.example.controldepto;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.controldepto.databinding.ItemListDataBinding;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{
   private List<Apartment> list;

    public ListAdapter(List<Apartment> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       ItemListDataBinding mBinding = ItemListDataBinding
               .inflate(LayoutInflater.from(parent.getContext()),parent,false);

       return new ListViewHolder(mBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
    Apartment apartment = list.get(position);
    holder.textView.setText(apartment.getBuildingName());
    holder.textView.setText(apartment.getProjectName());
    holder.textView1.setText(apartment.getUnitId());
    holder.textView2.setText(apartment.getAddress());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private TextView textView1;
        private TextView textView2;
        public ListViewHolder(@NonNull ItemListDataBinding mBinding) {
            super(mBinding.getRoot());
            textView = mBinding.textViewName;
            textView1 = mBinding.textViewNumero;
            textView2 = mBinding.textViewDireccion;


        }
    }


}
