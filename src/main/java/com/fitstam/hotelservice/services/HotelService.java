package com.fitstam.hotelservice.services;

import com.fitstam.hotelservice.entities.Hotel;

import java.util.List;

public interface HotelService {
    //create
    Hotel createHotel(Hotel hotel);
    //getAll
    List<Hotel> getAllHotels();
    //getSingle
    Hotel getHotel(String hotelId);
}
