package com.rajeev.flightReservation.service;

import com.rajeev.flightReservation.entity.Reservtion;

public interface ReservationService {
	public Reservtion bookFlight(ReservationRequest request);
}
