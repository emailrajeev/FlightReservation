package com.rajeev.flightReservation.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Flight")
public class Flight extends AbstractEntity{
	
	@Column(name="FLIGHT_NUMBER")
	private String FLIGHT_NUMBER;
	
	@Column(name="OPERATION_AIRLINES")
	private String OPERATION_AIRLINES;
	
	@Column(name="DEPARTURE_CITY")
	private String from;
	
	@Column(name="ARRIVAL_CITY")
	private String to;
	
	@Column(name="DATE_OF_DEPARTUURE")
	private Date depaartureDate;
	
	@Column(name="ESTIMATED_DEPARTURE_TIME")
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

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getDepaartureDate() {
		return depaartureDate;
	}

	public void setDepaartureDate(Date depaartureDate) {
		this.depaartureDate = depaartureDate;
	}

	public Timestamp getESTIMATED_DEPARTURE_TIME() {
		return ESTIMATED_DEPARTURE_TIME;
	}

	public void setESTIMATED_DEPARTURE_TIME(Timestamp eSTIMATED_DEPARTURE_TIME) {
		ESTIMATED_DEPARTURE_TIME = eSTIMATED_DEPARTURE_TIME;
	}
	
	
}


