package com.clone.Entity;

import com.clone.Exceptions.FlagReviewException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Review {
    private User user;

    private String review;
    private Listing listing;
    private String rating;

    // rate on cleanliness, value, size, pool, neighbors
    private int[] ratingNum = new int[5];


    public Review(User user,String rating, String review, int [] ratingNum) {
        this.user = user;
        this.rating = rating;
        this.review = review;
        this.ratingNum = ratingNum;
    }
    public static void flagReason(String review) throws FlagReviewException, IOException {
        if (review == ""){
            System.out.println("Inside review module");
            BufferedWriter writer = new BufferedWriter(new FileWriter("review.txt"));
            writer.write("review cannot be blank");
            writer.close();
            throw new FlagReviewException("review cannot be blank");


        }
    }

    public User getUser() {
        return user;
    }

    public Listing getListing() {
        return listing;
    }

    public String getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int[] getRatingNum() {
        return ratingNum;
    }

    public void setRatingNum(int[] ratingNum) {
        this.ratingNum = ratingNum;
    }

}