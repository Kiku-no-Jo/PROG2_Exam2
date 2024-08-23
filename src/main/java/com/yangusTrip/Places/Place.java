package com.yangusTrip.Places;

import java.util.List;

public abstract class Place {
    private int id;
    private String name;
    private List<GeographicalData> location;
    private String phoneNumber;
    private String email;
    private List<Review> reviews;

    public Place(int id, String name, List<GeographicalData> location, String phoneNumber, String email, List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.reviews = reviews;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GeographicalData> getLocation() {
        return location;
    }

    public void setLocation(List<GeographicalData> location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    };
}
