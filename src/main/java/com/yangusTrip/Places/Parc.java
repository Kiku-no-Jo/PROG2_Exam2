package com.yangusTrip.Places;

import java.util.List;

public class Parc extends Place{
    private List<Hotel> nearbyHotels;

    public Parc(int id,
                String name,
                List<GeographicalData> location,
                String phoneNumber,
                String email,
                List<Review> reviews,
                List<Hotel> availableHotels) {
        super(id, name, location, phoneNumber, email, reviews);
        this.nearbyHotels = availableHotels;
    }

    public List<Hotel> getAvailableHotels() {
        return nearbyHotels;
    }

    public void setAvailableHotels(List<Hotel> availableHotels) {
        this.nearbyHotels = availableHotels;
    }

    @Override
    public void addReview(Review newReview) {
        getReviews().add(newReview);
    }
}
