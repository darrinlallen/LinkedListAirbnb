package com.clone.Entity;
public class NotificationHistory {
    protected String status;
    protected Owner owner;

    public NotificationHistory(String status, Owner owner) {
        this.status = status;
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Owner getUser() {
        return owner;
    }

    public void setUser(Owner owner) {
        this.owner = owner;
    }
}
