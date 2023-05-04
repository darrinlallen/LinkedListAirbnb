package com.clone.Entity;
import com.clone.Exceptions.FlagReasonException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.lang.*;


public class Chatroom {
    private static String name;


    private String message;

    private static final Logger logger = LogManager.getLogger(AirbnbBusiness.class);

    public Chatroom() {
    }

    public Chatroom(String name, String message)  {
        this.name = name;
        this.message = message;

    }
    public static void flagLength(String name, String message) throws FlagReasonException,IOException {
        if (message == ""){
            logger.info("Inside chatroom module");
            BufferedWriter writer = new BufferedWriter(new FileWriter("chat.txt"));
            writer.write("chatroom message cannot be blank");
            writer.close();
            throw new FlagReasonException("chatroom message cannot be blank");


        }
    }

    public static void testExcept() throws NumberFormatException, IOException {
        try {
            System.out.println(Integer.parseInt(name));
        } catch (NumberFormatException ex) {
            logger.info("I  was unable to parse name variable");
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("I was unable to parse Name variable");
            writer.close();
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        } finally {
            logger.info("This message is from chatroom from the chatroom");
        }
    }


    @Override
    public boolean equals(Object o){
        if (o == this || o == null) {return true;}
        if (!( o instanceof Chatroom)){
            return false;
        }
        Chatroom chat = (Chatroom) o;
        return name == chat.name && Objects.equals(name, chat.name)
                && Objects.equals(message, chat.message);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsers() {
        return message;
    }

    public void setUsers(String users) {
        this.message = users;
    }
}
