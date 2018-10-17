package com.rajeev.flightReservation.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservtion extends AbstractEntity{
	private Boolean checkIn;
	private int numberOfBang;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	public Boolean getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Boolean checkIn) {
		this.checkIn = checkIn;
	}
	public int getNumberOfBang() {
		return numberOfBang;
	}
	public void setNumberOfBang(int numberOfBang) {
		this.numberOfBang = numberOfBang;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	
}
