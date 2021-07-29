package com.example.ecommerce.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ecommerce.R;
import com.example.ecommerce.databinding.FragmentSairBinding;
import com.example.ecommerce.viewModel.MenuViewModel;

public class SairFragment extends Fragment {

    private MenuViewModel menuViewModel;
    public FragmentSairBinding binding;
    private FrameLayout fragmentSair;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        menuViewModel =
                new ViewModelProvider(this).get(MenuViewModel.class);

        binding = FragmentSairBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        final TextView textViewSair = binding.textViewSair;
        final Button buttonSair = binding.buttonSair;


        fragmentSair = (FrameLayout) view.findViewById(R.id.sairFragment);

        textViewSair.setText("Esta ação irá encerrar seu aplicativo. Para continuar clique no botão Sair.");

        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);

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