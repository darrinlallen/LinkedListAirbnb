package src.Entity.PropertyType;

import src.Entity.App.*;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Hotel extends Availability {
    private Owner owner;
    private Listing listing;
    private String numRooms;
    private String pictures;
    private ArrayList<String> roomsAvailable = new ArrayList<>();
    private static Logger logger = Logger.getLogger(String.valueOf(Hotel.class));

    public Hotel() {
    }

    public Hotel(Owner owner, Listing listing, String numRooms, String pictures, ArrayList<String> roomsAvailable) {
        this.owner = owner;
        this.listing = listing;
        this.numRooms = numRooms;
        this.pictures = pictures;
        this.roomsAvailable = roomsAvailable;

    }
    public void availability(){

        logger.info("no rooms available");
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

    public ArrayList<String> getRoomsAvailable() {
        return roomsAvailable;
    }

    public void setRoomsAvailable(ArrayList<String> roomsAvailable) {
        this.roomsAvailable = roomsAvailable;
    }
}
