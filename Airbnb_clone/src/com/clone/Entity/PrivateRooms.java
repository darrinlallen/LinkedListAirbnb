package com.clone.Entity;

public class PrivateRooms {
    private Owner owner;
    private Listing listing;
    private  String start;
    private  String end;

    public PrivateRooms() {
    }

    public PrivateRooms(Owner owner, Listing listing, String start, String end) {
        this.owner = owner;
        this.listing = listing;
        this.start = start;
        this.end = end;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Listing getListing() {
        return listing;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
