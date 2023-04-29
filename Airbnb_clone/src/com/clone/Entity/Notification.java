package com.clone.Entity;
public class Notification extends NotificationHistory {
    private String message;

    public Notification(User user, String message, String status) {
        super(status, user);
         message = message;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(int status) {
        status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        message = message;
    }
}
