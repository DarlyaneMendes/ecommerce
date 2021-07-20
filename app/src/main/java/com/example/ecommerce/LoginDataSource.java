package com.example.ecommerce;

import com.example.ecommerce.model.LoggedInUser;

import java.io.IOException;

public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Darlyane");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Erro ao realizar login", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}