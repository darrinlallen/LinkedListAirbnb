package com.clone.Entity;

public class AirbnbBusiness {
    public User user;
    public Reservation reservation;

    public AirbnbBusiness() {
    }

    public AirbnbBusiness(User user, Reservation reservation) {
        this.user = user;
        this.reservation = reservation;
    }

    public User getOwner() {
        return user;
    }

    public void setOwner(User user) {
        this.user = user;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }


}
