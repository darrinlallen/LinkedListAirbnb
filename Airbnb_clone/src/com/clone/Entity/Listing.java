package com.clone.Entity;
public class Listing {
    private Review reviews;
    private String name;
    private String description;
    private String address;
    private int price;
    private int bedrooms;
    private int bathrooms;
    private boolean pet_friendly;
    private boolean smoking_allowed;



    public Listing(Review reviews , String name, String description, String address, int price, int bedrooms, int bathrooms, boolean pet_friendly, boolean smoking_allowed) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.pet_friendly = pet_friendly;
        this.smoking_allowed = smoking_allowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean isPet_friendly() {
        return pet_friendly;
    }

    public void setPet_friendly(boolean pet_friendly) {
        this.pet_friendly = pet_friendly;
    }

    public boolean isSmoking_allowed() {
        return smoking_allowed;
    }

    public void setSmoking_allowed(boolean smoking_allowed) {
        this.smoking_allowed = smoking_allowed;
    }
    public Review getReviews() {
        return reviews;
    }

    public void setReviews(Review reviews) {
        this.reviews = reviews;
    }
}
