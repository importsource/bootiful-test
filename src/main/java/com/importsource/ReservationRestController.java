package com.importsource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author hezhuofan
 */
@RestController
public class ReservationRestController {

    protected  final ReservationRepository reservationRepository;

    public ReservationRestController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping(value = "/reservations",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Collection<Reservation> reservations(){
        return reservationRepository.findAll();
        //return Collections.emptyList();
    }
}
