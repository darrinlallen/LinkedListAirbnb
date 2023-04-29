package com.clone.Entity;
public final class Booking {
    private User user;
    private Listing listing;
    private  String Start;
    private  String End;


    public void setStart(String start) {
        Start = start;
    }

    public void setEnd(String end) {
        End = end;
    }

    public Booking(User user, Listing listing, String Start, String End) {

        this.user = user;
        this.listing = listing;
        this.Start = Start;
        this.End = End;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Listing getListing() {
        return listing;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }

    public String getStart() {
        return Start;
    }



    public String getEnd() {
        return End;
    }


}
