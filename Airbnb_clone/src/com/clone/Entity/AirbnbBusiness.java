package com.clone.Entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AirbnbBusiness {
    private User user;
    private Reservation reservation;

    private String email;
    private String phone;
    private  String address;

    public AirbnbBusiness() {
    }
    private static final Logger logger = LogManager.getLogger(AirbnbBusiness.class);

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
