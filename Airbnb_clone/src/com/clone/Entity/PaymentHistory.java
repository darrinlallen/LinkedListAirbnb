package com.clone.Entity;
public class PaymentHistory {
    private User user;
    private int amount;

    public PaymentHistory(User user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    public User getuser() {
        return user;
    }

    public void setuser(User user) {
        this.user = user;
    }

    public int getamount() {
        return amount;
    }

    public void setamount(int amount) {
        this.amount = amount;
    }
}
