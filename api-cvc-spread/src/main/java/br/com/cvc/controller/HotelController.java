package br.com.cvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.config.HotelConfig;

@RestController
@RequestMapping(value = "")
public class HotelController {

	HotelConfig hotelList;
	
	//HotelConfig hotelConfig;
	
	
    @GetMapping(path = "{id}")
    public ResponseEntity<?> getHotelById(@PathVariable("id") Long id ) {
    	return new ResponseEntity<>(hotelList, HttpStatus.OK);
        
        
        
	}
}

