package com.fitstam.hotelservice.controller;

import com.fitstam.hotelservice.entities.Hotel;
import com.fitstam.hotelservice.services.HotelService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService service;

    @PostMapping("/createHotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createHotel(hotel));

    }

    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return  ResponseEntity.status(HttpStatus.OK).body(service.getAllHotels());
    }

    @GetMapping("/getHotel/{hotelId}")
    public ResponseEntity<Hotel> getAllHotels(@PathVariable String hotelId){
        return  ResponseEntity.status(HttpStatus.OK).body(service.getHotel(hotelId));
    }
}
