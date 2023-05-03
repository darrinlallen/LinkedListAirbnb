package com.clone.Entity;
public class Reservation extends ResNumber{

    private Owner owner;
    private Listing listing;

    private String guestNum;
    private String start;
    private String end;

    public Reservation(Owner owner, Listing listing, String start, String end, String guestNum) {
        this.owner = owner;
        this.listing = listing;
        this.start = start;
        this.end = end;
        this.guestNum = guestNum;
    }
    public  void clientNum(String num){
        System.out.println(num);
    }

    public void setUser(Owner owner) {
        this.owner = owner;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Owner getUser() {
        return owner;
    }

    public Listing getListing() {
        return listing;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getGuestNum() {
        return guestNum;
    }

    public void setGuestNum(String guestNum) {
        this.guestNum = guestNum;
    }
}
