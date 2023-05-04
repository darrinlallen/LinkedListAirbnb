package com.clone.Entity;

import java.util.HashMap;

public class UserLogin {
    HashMap<String, String> user = new HashMap<String, String>();

    public UserLogin() {
    }

    public HashMap<String, String> getUser() {
        return user;
    }

    public void setUser(HashMap<String, String> user) {
        this.user = user;
    }

    public UserLogin(HashMap<String, String> user) {
        this.user = user;
    }

}