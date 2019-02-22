package com.rajeev.flightReservation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rajeev.flightReservation.Repo.UserRepogietrery;
import com.rajeev.flightReservation.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightReservationApplicationTests {
    @Autowired
	UserRepogietrery user;
	
	@Test
	public void contextLoads() {
		User u=new User();
		user.save(u);
	}

	
}
