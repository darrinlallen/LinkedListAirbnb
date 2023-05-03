package com.clone.Entity;


import com.clone.Interface.*;

import static java.lang.System.*;

public class Owner implements ICabin, IMansion, ICountrySide, ITreeHouse, IBarn {
    private String name;
    private String email;

    private Listing address;

    public Owner() {
    }

    public Owner(String name, String email, Listing address) {
        this.name = name;
        this.email = email;
        this.address = address;
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

    public Listing getAddress() {
        return address;
    }

    public void setAddress(Listing address) {
        this.address = address;
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