package com.clone.Entity;
public class Notification extends NotificationHistory {
    private String dateWorked;

    public Notification(Owner owner, String status) {
        super(status, owner);
        dateWorked = dateWorked;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public Owner getUser() {
        return owner;
    }

    public void setUser(Owner owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(int status) {
        status = status;
    }

    public String getDateWorked() { return dateWorked;}

    public void setDateWorked(String dateWorked){dateWorked = dateWorked;}
}

