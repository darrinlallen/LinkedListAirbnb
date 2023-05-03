package com.clone.Entity;

public class AirbnbBusiness {
    public Owner owner;
    public Reservation reservation;
    public String creditCard;

    public AirbnbBusiness() {
    }

    public AirbnbBusiness(Owner owner, Reservation reservation, String creditCardtype) {
        this.owner = owner;
        this.reservation = reservation;
        this.creditCard = creditCard;
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
        return creditCard;
    }

    public void setCreditCardtype(String creditCardtype) {
        this.creditCard = creditCardtype;
    }
}
