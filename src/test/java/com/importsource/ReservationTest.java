package com.importsource;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author hezhuofan
 */
public class ReservationTest {

    @Test
    public void creation(){
        Reservation reservation=new Reservation(1L,"Jane");
        Assert.assertEquals(reservation.getId(),(Long)1L);
       /* Assert.assertThat(reservation.getId(), new BaseMatcher<Long>() {
            @Override
            public boolean matches(Object o) {
                return false;
            }

            @Override
            public void describeTo(Description description) {

            }
        });*/

        //Assert.assertThat(reservation.getId(), Matchers.eq(1L));
        Assertions.assertThat(reservation.getReservationName()).isEqualTo("Jane");

    }
}
