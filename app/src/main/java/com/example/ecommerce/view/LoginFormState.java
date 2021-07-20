package com.example.ecommerce.view;

import android.support.annotation.Nullable;

public class LoginFormState {
    @Nullable
    public Integer usernameError;
    @Nullable
    public Integer passwordError;
    public boolean isDataValid;

    public LoginFormState(@Nullable Integer usernameError, @Nullable Integer passwordError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.isDataValid = false;
    }

    public LoginFormState(boolean isDataValid) {
        this.usernameError = null;
        this.passwordError = null;
        this.isDataValid = isDataValid;
    }

    @Nullable
    Integer getUsernameError() {

        return usernameError;
    }

    @Nullable
    Integer getPasswordError() {

        return passwordError;
    }

    boolean isDataValid() {

        return isDataValid;
    }
}