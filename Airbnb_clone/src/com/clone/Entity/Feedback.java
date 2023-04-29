package com.clone.Entity;
public class Feedback {
    private String feedback_loop;

    public Feedback(String feedback_loop) {
        this.feedback_loop = feedback_loop;
    }

    {
        // Print statement
        System.out.print("feedback: "+ feedback_loop);
    }
    public String getFeedback_loop() {
        return feedback_loop;
    }

    public void setFeedback_loop(String feedback_loop) {
        this.feedback_loop = feedback_loop;
    }
}
