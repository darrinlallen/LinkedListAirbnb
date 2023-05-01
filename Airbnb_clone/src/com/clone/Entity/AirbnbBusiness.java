package com.clone.Entity;

public class AirbnbBusiness {
    public Owner owner;
    public Reservation reservation;
    public String creditCardtype;

    public AirbnbBusiness(Owner owner, Reservation reservation, String creditCardtype) {
        this.owner = owner;
        this.reservation = reservation;
        this.creditCardtype = creditCardtype;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getCreditCardtype() {
        return creditCardtype;
    }

    public void setCreditCardtype(String creditCardtype) {
        this.creditCardtype = creditCardtype;
    }
}
