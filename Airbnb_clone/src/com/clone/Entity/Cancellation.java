package com.clone.Entity;

import com.clone.Exceptions.FlagReasonException;
import com.clone.Interface.ICancel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public final class Cancellation implements ICancel {
    private User user;
    private String reason;
    private static final Logger logger = LogManager.getLogger(AirbnbBusiness.class);

    public Cancellation() {
    }
    public Cancellation(User user, String reason) {

        this.user = user;
        this.reason = reason;
    }

public void cancelMessage(){
        logger.info("reservation canceed");
}

    public static void flagReason(String user, String reason) throws FlagReasonException,IOException {
                if (reason == "default"){
                    logger.info("Inside cancellation module");
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReason() {
        return reason;
    }


}
