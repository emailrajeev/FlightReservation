package com.rajeev.flightReservation.Repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rajeev.flightReservation.entity.Flight;

public interface FlightRepogietrery extends JpaRepository<Flight, Long>{

	@Query("from Flight where DEPARTURE_CITY=:DEPARTURE_CITY and ARRIVAL_CITY=:ARRIVAL_CITY and DATE_OF_DEPARTUURE=:DATE_OF_DEPARTUURE")
	public List<Flight> findFlight(@Param("DEPARTURE_CITY")String from,@Param("ARRIVAL_CITY")String to,@Param("DATE_OF_DEPARTUURE")Date depaartureDate);
	
}
