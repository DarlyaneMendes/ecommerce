package com.example.ecommerce.viewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.ecommerce.LoginDataSource;
import com.example.ecommerce.LoginRepository;

public class LoginViewModelFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LoginViewModel.class)) {
            return (T) new LoginViewModel(LoginRepository
                    .getInstance(new LoginDataSource()));
        } else {
            throw new IllegalArgumentException("Classe ViewModel não encontrada");
        }
    }
}