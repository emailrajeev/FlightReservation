package com.rajeev.flightReservation.entity;
import javax.persistence.*;

@Entity
@Table(name="user")
public class User extends AbstractEntity {
	
	@Column(name="FIRST_NAME")
    private String FIRST_NAME;
	
	@Column(name="LAST_NAME")
   	private String LAST_NAME;
	
	@Column(name="EMAIL")
    private String EMAIL;
	
	@Column(name="PASSWORD")
    private String PASSWORD;
	
	@Column(name="conform_password")
	private String conformPassword;
	
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
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getConformPassword() {
		return conformPassword;
	}
   
}
