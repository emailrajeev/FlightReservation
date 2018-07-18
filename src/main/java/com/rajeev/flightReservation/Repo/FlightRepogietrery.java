package com.rajeev.flightReservation.Repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rajeev.flightReservation.entity.Flight;

public interface FlightRepogietrery extends JpaRepository<Flight, Long>{
	@Query(value="SELECT * FROM flight",nativeQuery = true)
	List<Flight> findFlight(String from, String to, Date depaartureDate);
}
