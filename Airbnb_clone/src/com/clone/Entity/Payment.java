package com.clone.Entity;

import com.clone.Exceptions.FlagLengthException;
import com.clone.Interface.IPay;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Payment implements IPay {

    private Owner owner;
    private Listing listing;
    private float amount;
    private static final Logger logger = LogManager.getLogger(AirbnbBusiness.class);

    public Payment() {
    }

    public Payment(Owner owner, Listing listing, float amount) {
        this.owner = owner;
        this.listing = listing;
        this.amount = amount;

    }
    public void payMessage(){
        logger.info("payment complete");
    }
    public static void flagPayment(float amount) throws IOException, FlagLengthException {
        if (amount == 0){
            logger.info("Inside Payment module");
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