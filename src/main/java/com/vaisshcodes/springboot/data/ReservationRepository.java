package com.vaisshcodes.springboot.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    Iterable<Reservation> findReservationByReservationDate(Date date);

}
