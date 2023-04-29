package com.clone.Entity;
public class Reservation extends ResNumber{

    private User user;
    private Listing listing;
    private String start;
    private String end;

    public Reservation(User user, Listing listing, String start, String end) {
        this.user = user;
        this.listing = listing;
        this.start = start;
        this.end = end;
    }
    public  void clientNum(String num){
        System.out.println(num);;
    }

    public void setUser(User user) {
        this.user = user;
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

    public User getUser() {
        return user;
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
}
