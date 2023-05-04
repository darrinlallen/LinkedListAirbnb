package com.clone.RentalListing;

import com.clone.Entity.Listing;
import com.clone.Entity.Owner;

import java.util.ArrayList;

public class Hotel {
    private Owner owner;
    private Listing listing;
    private String numRooms;
    private String pictures;
    
    public Hotel() {
    }

    public Hotel(Owner owner, Listing listing, String numRooms, String pictures) {
        this.owner = owner;
        this.listing = listing;
        this.numRooms = numRooms;
        this.pictures = pictures;

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

    public String getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(String numRooms) {
        this.numRooms = numRooms;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }
}
