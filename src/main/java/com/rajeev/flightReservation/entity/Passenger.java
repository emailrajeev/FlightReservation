package com.rajeev.flightReservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Passenger")
public class Passenger extends AbstractEntity {
	@Column(name = "FIRST_NAME")
	private String FIRST_NAME;

	@Column(name = "LAST_NAME")
	private String LAST_NAME;

	@Column(name = "MIDDLE_NAME")
	private String MIDDLE_NAME;

	@Column(name = "EMAIL")
	private String EMAIL;

	@Column(name = "PHONE")
	private String PHONE;

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public String getMIDDLE_NAME() {
		return MIDDLE_NAME;
	}

	public void setMIDDLE_NAME(String mIDDLE_NAME) {
		MIDDLE_NAME = mIDDLE_NAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}

}
