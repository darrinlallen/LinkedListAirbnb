package com.clone.Entity;

public class Mansion {
    private Owner owner;
    private Listing listing;

    public Mansion() {
    }

    public Mansion(Owner owner, Listing listing) {
        this.owner = owner;
        this.listing = listing;

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

}