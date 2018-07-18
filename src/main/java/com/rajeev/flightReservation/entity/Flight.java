package com.rajeev.flightReservation.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Flight extends AbstractEntity{
	private String FLIGHT_NUMBER;
	private String OPERATION_AIRLINES;
	private String DEPARTURE_CITY;
	private String ARRIVAL_CITY;
	private Date DATE_OF_DEPARTUURE;
	private Timestamp ESTIMATED_DEPARTURE_TIME;
	
	public String getFLIGHT_NUMBER() {
		return FLIGHT_NUMBER;
	}
	public void setFLIGHT_NUMBER(String fLIGHT_NUMBER) {
		FLIGHT_NUMBER = fLIGHT_NUMBER;
	}
	public String getOPERATION_AIRLINES() {
		return OPERATION_AIRLINES;
	}
	public void setOPERATION_AIRLINES(String oPERATION_AIRLINES) {
		OPERATION_AIRLINES = oPERATION_AIRLINES;
	}
	public String getDEPARTURE_CITY() {
		return DEPARTURE_CITY;
	}
	public void setDEPARTURE_CITY(String dEPARTURE_CITY) {
		DEPARTURE_CITY = dEPARTURE_CITY;
	}
	public String getARRIVAL_CITY() {
		return ARRIVAL_CITY;
	}
	public void setARRIVAL_CITY(String aRRIVAL_CITY) {
		ARRIVAL_CITY = aRRIVAL_CITY;
	}
	public Date getDATE_OF_DEPARTUURE() {
		return DATE_OF_DEPARTUURE;
	}
	public void setDATE_OF_DEPARTUURE(Date dATE_OF_DEPARTUURE) {
		DATE_OF_DEPARTUURE = dATE_OF_DEPARTUURE;
	}
	public Timestamp getESTIMATED_DEPARTURE_TIME() {
		return ESTIMATED_DEPARTURE_TIME;
	}
	public void setESTIMATED_DEPARTURE_TIME(Timestamp eSTIMATED_DEPARTURE_TIME) {
		ESTIMATED_DEPARTURE_TIME = eSTIMATED_DEPARTURE_TIME;
	}
}


