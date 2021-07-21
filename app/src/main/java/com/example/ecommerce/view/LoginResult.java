package com.example.ecommerce.view;

import androidx.annotation.Nullable;

public class LoginResult {
    @Nullable
    private LoggedInUserView success;
    @Nullable
    private Integer error;

    public LoginResult(@Nullable Integer error) {

        this.error = error;
    }


    public LoginResult(@Nullable LoggedInUserView success) {
        this.success = success;
    }

    @Nullable
    com.example.ecommerce.view.LoggedInUserView getSuccess() {

        return success;
    }

    @Nullable
    Integer getError() {

        return error;
    }
}