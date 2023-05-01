package com.clone.Entity;
import java.util.Objects;
import java.lang.*;
public class Message {

    private String sender;
    private String receiver;

    private String message;
@Override
public int hashCode(){
    return Objects.hash(sender, receiver, message);
}

    public Message(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
