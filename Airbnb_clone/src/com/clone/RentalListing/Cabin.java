package com.clone.RentalListing;

import com.clone.Entity.Listing;
import com.clone.Entity.Owner;

import java.util.ArrayList;

public final class Cabin {
    private Owner owner;
    private Listing listing;
    private String pictures;
    private int numRooms;
    private ArrayList<String> roomsAvailable = new ArrayList<>();

    public Cabin() {
    }

    public Cabin(Owner owner, Listing listing, String pictures, int numRooms, ArrayList<String> roomsAvailable) {

        this.owner = owner;
        this.listing = listing;
        this.pictures = pictures;
        this.numRooms = numRooms;
        this.roomsAvailable = roomsAvailable;

    }

    public ArrayList<String> getRoomsAvailable() {
        return roomsAvailable;
    }

    public void setRoomsAvailable(ArrayList<String> roomsAvailable) {
        this.roomsAvailable = roomsAvailable;
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

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }
}