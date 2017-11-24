package com.importsource;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * @author hezhuofan
 */
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    Collection<Reservation> findByReservationName(String reservationName);
}
