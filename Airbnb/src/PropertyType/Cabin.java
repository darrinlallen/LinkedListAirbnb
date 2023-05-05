package com.clone.PropertyType;

import com.clone.Entity.Availability;
import com.clone.Entity.Listing;
import com.clone.Entity.Owner;

import java.util.ArrayList;
import java.util.logging.Logger;

public  class Cabin extends Availability {
    private Owner owner;
    private Listing listing;
    private String pictures;
    private int numRooms;
    private ArrayList<String> roomsAvailable = new ArrayList<>();
    private static Logger logger = Logger.getLogger(String.valueOf(Cabin.class));

    public Cabin() {
    }

    public Cabin(Owner owner, Listing listing, String pictures, int numRooms, ArrayList<String> roomsAvailable) {

        this.owner = owner;
        this.listing = listing;
        this.pictures = pictures;
        this.numRooms = numRooms;
        this.roomsAvailable = roomsAvailable;

    }

    public void availability(){
        logger.info("room is available");
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