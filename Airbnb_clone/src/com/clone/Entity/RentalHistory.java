package com.clone.Entity;

import java.util.ArrayList;

public class RentalHistory extends Message {
    private ArrayList<String> rentalHistory = new ArrayList<>() ;


    public RentalHistory(ArrayList<String> rentalHistory, String sender, String receiver, String message) {
        super(sender, receiver,message);
        this.rentalHistory = rentalHistory;

    }

    public ArrayList<String> getMessageHistory() {
        return rentalHistory;
    }

    public void setMessageHistory(ArrayList<String> messageHistory) {
        this.rentalHistory = messageHistory;
    }
}
