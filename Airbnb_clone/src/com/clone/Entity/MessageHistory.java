package com.clone.Entity;
public class MessageHistory extends Message {
    private Message user;


    public MessageHistory(Message user, String sender, String receiver, String message) {
        super(sender, receiver,message);
        this.user = user;

    }

    public Message getUser() {
        return user;
    }

    public void setUser(Message user) {
        this.user = user;
    }


}
