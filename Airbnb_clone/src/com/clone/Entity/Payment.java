package com.clone.Entity;

import com.clone.Exceptions.FlagLengthException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Payment {

    private Owner owner;
    private Listing listing;
    private float amount;

    public Payment() {
    }

    public Payment(Owner owner, Listing listing, float amount) {
        this.owner = owner;
        this.listing = listing;
        this.amount = amount;

    }
    public static void flagPayment(float amount) throws IOException, FlagLengthException {
        if (amount == 0){
            System.out.println("Inside Payment module");
            BufferedWriter writer = new BufferedWriter(new FileWriter("payment.txt"));
            writer.write("Payment cannot be zero");
            writer.close();
            throw new FlagLengthException("Payment cannot be zero");


        }
    }
    public void setUser(Owner owner) {
        this.owner = owner;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Owner getUser() {
        return owner;
    }

    public Listing getListing() {
        return listing;
    }

    public float getAmount() {
        return amount;
    }
}