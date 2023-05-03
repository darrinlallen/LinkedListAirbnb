package com.clone.Entity;

import com.clone.Exceptions.FlagReviewException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Review {
    private Owner owner;

    private String review;
    private Listing listing;
    private String rating;

    // rate on cleanliness, value, size, pool, neighbors
    private int[] ratingNum = new int[5];

    public Review() {
    }

    public Review(Owner owner, String rating, String review, int [] ratingNum) {
        this.owner = owner;
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

    public Owner getUser() {
        return owner;
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

    public void setUser(Owner owner) {
        this.owner = owner;
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