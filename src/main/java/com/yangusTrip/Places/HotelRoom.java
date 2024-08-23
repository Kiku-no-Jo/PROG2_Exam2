package com.yangusTrip.Places;

import java.util.List;

public class HotelRoom {
    private String id;
    private Hotel hotel;
    private String description;
    private int capacity;
    private double price;
    private List<Review> reviews;

    public HotelRoom(String id, Hotel hotel, String description, int capacity, double price, List<Review> reviews) {
        this.id = id;
        this.hotel = hotel;
        this.description = description;
        this.capacity = capacity;
        this.price = price;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
}
