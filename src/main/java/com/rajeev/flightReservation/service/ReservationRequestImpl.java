package com.rajeev.flightReservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeev.flightReservation.Repo.FlightRepogietrery;
import com.rajeev.flightReservation.Repo.PassengerRepositry;
import com.rajeev.flightReservation.entity.Reservtion;
@Service
public class ReservationRequestImpl implements ReservationService {
	@Autowired
	FlightRepogietrery fRepo;
	@Autowired
	PassengerRepositry pRepo;
	@Autowired
	ReservationRequest rReq;
	
	public Reservtion bookFlight(ReservationRequest request) {
		
		return null;
	}

}
