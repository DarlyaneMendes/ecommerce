package com.example.ecommerce.view;

public class LoggedInUserView {
    public String displayName;

    public LoggedInUserView(String displayName) {

        this.displayName = displayName;
    }

    String getDisplayName() {

        return displayName;
    }
}