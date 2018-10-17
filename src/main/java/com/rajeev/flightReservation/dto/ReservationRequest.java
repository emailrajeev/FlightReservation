package com.rajeev.flightReservation.dto;

public class ReservationRequest {
    private Long flightId;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String EMAIL;
    private String PHONE;
    private String nameOfCatd;
    private String cardNumber;
    private String expiryDate;
    private String threeDigitSecCode;
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
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
	public String getNameOfCatd() {
		return nameOfCatd;
	}
	public void setNameOfCatd(String nameOfCatd) {
		this.nameOfCatd = nameOfCatd;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getThreeDigitSecCode() {
		return threeDigitSecCode;
	}
	public void setThreeDigitSecCode(String threeDigitSecCode) {
		this.threeDigitSecCode = threeDigitSecCode;
	}
    
}
