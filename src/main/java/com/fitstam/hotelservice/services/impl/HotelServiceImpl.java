package com.fitstam.hotelservice.services.impl;

import com.fitstam.hotelservice.entities.Hotel;
import com.fitstam.hotelservice.exceptions.ResourceNotFoundException;
import com.fitstam.hotelservice.repos.HotelRepo;
import com.fitstam.hotelservice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepo repo;
    @Override
    public Hotel createHotel(Hotel hotel) {
       hotel.setHotelId(UUID.randomUUID().toString());
        return repo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return repo.findAll();
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return repo.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel is not available by given id "+hotelId));
    }
}
