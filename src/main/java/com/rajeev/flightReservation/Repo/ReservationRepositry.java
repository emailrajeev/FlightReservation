package com.rajeev.flightReservation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajeev.flightReservation.entity.Reservtion;

public interface ReservationRepositry extends JpaRepository<Reservtion,Long>{

}
