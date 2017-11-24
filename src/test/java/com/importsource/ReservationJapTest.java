package com.importsource;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hezhuofan
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class ReservationJapTest {
    @Autowired
    TestEntityManager testEntityManager;

    @Test
    public void mapping(){
        Reservation jane=testEntityManager.persistAndFlush(new Reservation(null,"Jane"));
        Assertions.assertThat(jane.getId()).isNotNull();
        Assertions.assertThat(jane.getReservationName()).isEqualTo("Jane");

    }
}
