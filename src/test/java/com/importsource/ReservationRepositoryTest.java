package com.importsource;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

/**
 * @author hezhuofan
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class ReservationRepositoryTest {

    @Autowired
    ReservationRepository reservationRepository;

    @Test
    public void findByReservationName(){
       this.reservationRepository.save(new Reservation(null,"Jane"));
       Collection<Reservation> reservations=this.reservationRepository.findByReservationName("Jane");
       Assertions.assertThat(reservations.size()).isEqualTo(1);
       Assertions.assertThat(reservations.iterator().next().getId()).isGreaterThan(0);
       Assertions.assertThat(reservations.iterator().next().getReservationName().equals("Jane"));

    }
}

