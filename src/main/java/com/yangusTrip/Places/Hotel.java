package com.yangusTrip.Places;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Place {
    private List<HotelRoom> hotelRooms;
    private List<Parc> nearbyParcs;

    public Hotel(int id,
                 String name,
                 List<GeographicalData> location,
                 String phoneNumber,
                 String email,
                 List<Review> reviews,
                 List<Parc> nearbyParcs) {
        super(id, name, location, phoneNumber, email, reviews);
        this.hotelRooms = hotelRooms;
        this.nearbyParcs = nearbyParcs;
    }


    public List<HotelRoom> getHotelRooms() {
        return hotelRooms;
    }

    public void setHotelRooms(List<HotelRoom> hotelRooms) {
        this.hotelRooms = hotelRooms;
    }

    public List<Parc> getNearbyParcs() {
        return nearbyParcs;
    }

    public void setNearbyParcs(List<Parc> nearbyParcs) {
        this.nearbyParcs = nearbyParcs;
    }

    @Override
    public void addReview(Review review) {
        getReviews().add(review);
    };
}
