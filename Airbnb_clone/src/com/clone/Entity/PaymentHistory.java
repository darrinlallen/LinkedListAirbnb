package com.clone.Entity;
public class PaymentHistory {
    private Owner owner;
    private int amount;

    public PaymentHistory(Owner owner, int amount) {
        this.owner = owner;
        this.amount = amount;
    }

    public Owner getuser() {
        return owner;
    }

    public void setuser(Owner owner) {
        this.owner = owner;
    }

    public int getamount() {
        return amount;
    }

    public void setamount(int amount) {
        this.amount = amount;
    }
}
