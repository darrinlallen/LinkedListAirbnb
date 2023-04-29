package com.clone.Entity;

import com.clone.Exceptions.FlagReasonException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public final class Cancellation {
    private String user;
    private String reason = "default reason";

    public Cancellation(String user, String reason) {

        this.user = user;
        this.reason = reason;
    }


            public static void flagReason(String user, String reason) throws FlagReasonException,IOException {
                if (reason == "default"){
                    System.out.println("Inside cancellation module");
                    BufferedWriter writer = new BufferedWriter(new FileWriter("cancel.txt"));
                    writer.write("Invalid cancellation reason");
                    writer.close();
                    throw new FlagReasonException("cancellation reason cannot be default");


                }
            }


    public final static String description(String reason){
        return "The reason we canceled is" + reason;
    }
    @Override
public String toString (){
    return "name  " + user + "    reason  "+ reason;
}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getReason() {
        return reason;
    }


}
