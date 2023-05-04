package com.clone.RentalListing;

import com.clone.Entity.Listing;
import com.clone.Entity.Owner;

public class
Mansion {
    private Owner owner;
    private Listing listing;

    private String pictures;
    private String numRooms;

    public Mansion() {
    }

    public Mansion(Owner owner, Listing listing, String pictures, String numRooms) {
        this.owner = owner;
        this.listing = listing;
        this.pictures = pictures;
        this.numRooms = numRooms;

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