package com.rajeev.flightReservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeev.flightReservation.Repo.FlightRepogietrery;
import com.rajeev.flightReservation.Repo.PassengerRepositry;
import com.rajeev.flightReservation.Repo.ReservationRepositry;
import com.rajeev.flightReservation.dto.ReservationRequest;
import com.rajeev.flightReservation.entity.Flight;
import com.rajeev.flightReservation.entity.Passenger;
import com.rajeev.flightReservation.entity.Reservtion;

@Service
public class ReservationRequestImpl implements ReservationService {

	@Autowired
	FlightRepogietrery fRepo;

	@Autowired
	PassengerRepositry pRepo;

	@Autowired
	ReservationRepositry rReq;

	public Reservtion bookFlight(ReservationRequest request) {
		// Make Payment
		Long flightId = request.getFlightId();
		Flight flight = fRepo.findOne(flightId);
		Passenger passenger = new Passenger();
		passenger.setFIRST_NAME(request.getFIRST_NAME());
		passenger.setLAST_NAME(request.getLAST_NAME());
		passenger.setEMAIL(request.getEMAIL());
		passenger.setPHONE(request.getPHONE());
		Passenger save = pRepo.save(passenger);
		Reservtion reservtion = new Reservtion();
		reservtion.setFlight(flight);
		reservtion.setPassenger(save);
		reservtion.setCheckIn(false);
		Reservtion saveReservation = rReq.save(reservtion);
		return saveReservation;
	}
}