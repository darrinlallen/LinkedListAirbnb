package com.clone.Entity;

public class User {
    private UserLogin person;
    private String userAddress;
    private String userCreditCard;

    public User() {
    }

    public User(UserLogin person, String userAddress, String userCreditCard) {
        this.person = person;
        this.userAddress = userAddress;
        this.userCreditCard = userCreditCard;
    }

    public UserLogin getPerson() {
        return person;
    }

    public void setPerson(UserLogin person) {
        this.person = person;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserCreditCard() {
        return userCreditCard;
    }

    public void setUserCreditCard(String userCreditCard) {
        this.userCreditCard = userCreditCard;
    }
}
