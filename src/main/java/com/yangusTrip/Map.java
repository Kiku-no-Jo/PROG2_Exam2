package com.yangusTrip;

import com.yangusTrip.Places.Hotel;
import com.yangusTrip.Places.HotelRoom;
import com.yangusTrip.Places.Parc;
import com.yangusTrip.Places.Review;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int id;
    private String name;
    private List<Parc> availableParcs;
    private List<Hotel> availableHotels;

    public Map(int id, String name, List<Parc> availableParcs, List<Hotel> availableHotels) {
        this.id = id;
        this.name = name;
        this.availableParcs = availableParcs;
        this.availableHotels = availableHotels;
    }

    public int getId() {
        return id;
    }

    public List<Parc> getAvailableParcs() {
        return availableParcs;
    }

    public String getName() {
        return name;
    }

    public List<Hotel> getAvailableHotels() {
        return availableHotels;
    }

    public List<Review> getAllReviews (Hotel newHotel, Parc newParc, HotelRoom newRoom){
        List<Review> listH = newHotel.getReviews();

        List<Review> listP = newParc.getReviews();

        List<Review> listR = newRoom.getReviews();

        ArrayList<Review> totalReviews = new ArrayList<>();
        totalReviews.addAll(listH);
        totalReviews.addAll(listP);
        totalReviews.addAll(listR);

        return totalReviews;
    }

    public Hotel findTheBestHotel(List<Hotel> availableHotels){
        Hotel bestHotel = availableHotels.stream()
                .filter(hotel -> hotel.getNearbyParcs().size())
    }

    @Override
    public String toString() {
        return "Map{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", availableParcs=" + availableParcs +
                ", availableHotels=" + availableHotels +
                '}';
    }
}
