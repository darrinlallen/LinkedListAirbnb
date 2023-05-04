package com.clone.Entity;

public class User {
    private UserLogin person;


    public User() {
    }

    public User(UserLogin person, String userAddress, String userCreditCard) {
        this.person = person;

    }

    public UserLogin getPerson() {
        return person;
    }

    public void setPerson(UserLogin person) {
        this.person = person;
    }

}