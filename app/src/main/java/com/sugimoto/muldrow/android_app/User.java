package com.sugimoto.muldrow.android_app;

import com.facebook.AccessToken;

/**
 * Created by benjaminmuldrow on 10/7/16.
 */

public class User {

    private final AccessToken ACCESS_TOKEN;

    private String firstName;
    private String lastName;

    public User(AccessToken accessToken) {
        this.ACCESS_TOKEN = accessToken;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
