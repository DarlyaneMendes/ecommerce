package com.example.ecommerce.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.R;
import com.example.ecommerce.viewModel.CategoriaViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CategoriaAdapter extends RecyclerView.Adapter {

    private List<CategoriaViewModel> categoriaList;
    private Context context;

    public CategoriaAdapter(List<CategoriaViewModel> lista) {
        this.categoriaList = lista;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewCodCategoria, textViewNomeCategoria;
        public ImageButton imageButtonNovo, imageButtonExcluir;

        public MyViewHolder(View itemView) {
            super(itemView);

            textViewCodCategoria = itemView.findViewById(R.id.textViewCodCategoria);
            textViewNomeCategoria = itemView.findViewById(R.id.textViewNomeCategoria);

            }
        }

        @Override
        public MyViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            View categoriaView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.line_view, parent, false);

            return new MyViewHolder(categoriaView);

        }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder viewHolder, int position) {

        MyViewHolder holder = (MyViewHolder) viewHolder;
        CategoriaViewModel categoria = categoriaList.get(position);

        holder.textViewCodCategoria.setText(categoria.getCodCategoria());
        holder.textViewNomeCategoria.setText(categoria.getNomeCategoria());

    }

    @Override
    public int getItemCount(){

        return categoriaList != null ? 0 : categoriaList.size();
    }
}
