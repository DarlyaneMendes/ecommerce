package com.example.ecommerce.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import com.example.ecommerce.R;
import com.example.ecommerce.databinding.FragmentMenuBinding;
import com.example.ecommerce.viewModel.MenuViewModel;

public class MenuFragment extends Fragment {

    private MenuViewModel menuViewModel;
    public FragmentMenuBinding binding;
    private FrameLayout fragmentMenu;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        menuViewModel =
                new ViewModelProvider(this).get(MenuViewModel.class);

        binding = FragmentMenuBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        final ImageButton imageButtonCliente = binding.imageButtonCliente;
        final TextView textViewCliente = binding.textViewCliente;
        final ImageButton imageButtonProduto = binding.imageButtonProduto;
        final TextView textViewProduto = binding.textViewProduto;
        final ImageButton imageButtonPedido = binding.imageButtonPedido;
        final TextView textViewPedido = binding.textViewPedido;
        final ImageButton imageButtonCategoria = binding.imageButtonCategoria;
        final TextView textViewCategoria = binding.textViewCategoria;
        final ImageButton imageButtonRelatorio = binding.imageButtonRelatorio;
        final TextView textViewRelatorio = binding.textViewRelatorio;

        fragmentMenu = (FrameLayout) view.findViewById(R.id.mainFragment);


        imageButtonCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaClienteActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Cadastro de Cliente",
                        Toast.LENGTH_LONG).show();
            }
        });

        textViewCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaClienteActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Cadastro de Cliente",
                        Toast.LENGTH_LONG).show();
            }
        });

        imageButtonProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaProdutoActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Cadastro de Produto",
                        Toast.LENGTH_LONG).show();
            }
        });

        textViewProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaProdutoActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Cadastro de Produto",
                        Toast.LENGTH_LONG).show();
            }
        });

        imageButtonPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaPedidoActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Pedido",
                        Toast.LENGTH_LONG).show();
            }
        });

        textViewPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaPedidoActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext()," Pedido",
                        Toast.LENGTH_LONG).show();
            }
        });

        imageButtonCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaCategoriaActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Cadastro de Categoria",
                        Toast.LENGTH_LONG).show();
            }
        });

        textViewCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaCategoriaActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Cadastro de Categoria",
                        Toast.LENGTH_LONG).show();
            }
        });

        imageButtonRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaRelatorioActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Relatório",
                        Toast.LENGTH_LONG).show();
            }
        });

        textViewRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListaRelatorioActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity().getApplicationContext(),"Relatório",
                        Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}