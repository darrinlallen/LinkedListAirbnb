package src.Entity.App;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AirbnbBusiness {
    private User user;
    private Reservation reservation;

    private String email;
    private String phone;
    private String address;

    private static final Logger logger = LogManager.getLogger(AirbnbBusiness.class);

    public AirbnbBusiness() {
    }

    public AirbnbBusiness(User user, Reservation reservation, String email, String phone, String address) {
        this.user = user;
        this.reservation = reservation;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}