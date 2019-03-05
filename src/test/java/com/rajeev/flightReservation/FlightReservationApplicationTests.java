package com.rajeev.flightReservation;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.rajeev.flightReservation.Repo.FlightRepogietrery;
import com.rajeev.flightReservation.entity.Flight;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightReservationApplicationTests {
	@Autowired
	FlightRepogietrery repo;
	/*
	
	private String ARRIVAL_CITY;Date DATE_OF_DEPARTUURE;*/

//	private Timestamp ESTIMATED_DEPARTURE_TIME;

	
	@Test
	public void contextLoads() {
		
		
		
	}

}
