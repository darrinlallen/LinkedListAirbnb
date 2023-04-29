package com.clone.Entity;


import com.clone.Interface.*;

import static java.lang.System.*;

public class User implements ICabin, IMansion, ICountrySide, ITreeHouse, IBarn {
    private String name;
    private String email;
    private String password;

    private Listing address;

    private float price;
    private String paymentInfo;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public Listing getAddress() {
        return address;
    }

    public void setAddress(Listing address) {
        this.address = address;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public void clientNum(String nickName){
        out.println(nickName+ " 999");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getBarn(String livestock, String chickensPresent) {
        out.println("livestock " + livestock +" chickens "+ chickensPresent);;
        return livestock;
    }

    @Override
    public String getCabin(String numWindows, String numDoors) {
        out.println("windows " + numWindows+ " doors");;
        return numWindows;
    }

    @Override
    public String getCountrySide(String location) {
        out.println("location "+ location);;
        return location;
    }

    @Override
    public String getMansion(String roomsNumber, String squareFootage) {
        out.println("rooms "+ roomsNumber + " squarefoot "+ squareFootage);;
        return roomsNumber;
    }

    @Override
    public void getTreeHouse(String treeType) {
        System.out.println("type " + treeType);
    }
}