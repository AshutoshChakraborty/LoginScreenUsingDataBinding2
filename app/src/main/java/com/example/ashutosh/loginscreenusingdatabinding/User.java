package com.example.ashutosh.loginscreenusingdatabinding;

import com.example.ashutosh.loginscreenusingdatabinding.BR;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {
    private String email;
    private String password;

    @Bindable
    public String getEmail() {
        return email == null ? "" : email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password == null ? "" : password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable({"email"})
    public String getEmailError() {
        return !Utills.isValidEmail(getEmail()) ? "Please Enter proper email" : "";

    }

    @Bindable({"password"})
    public String getPasswordError() {
        return !Utills.isValidPassword(getPassword())? "Please enter a password" : "";

    }

}
