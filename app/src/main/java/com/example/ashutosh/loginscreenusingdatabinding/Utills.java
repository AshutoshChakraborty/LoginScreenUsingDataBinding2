package com.example.ashutosh.loginscreenusingdatabinding;

public class Utills {
    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 4;
    }
}
