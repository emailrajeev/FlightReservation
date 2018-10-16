package com.rajeev.flightReservation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajeev.flightReservation.entity.Passenger;

public interface PassengerRepositry extends JpaRepository<Passenger,Long>{

}
