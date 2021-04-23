package com.cg.entities;

import java.time.LocalDate;

public class BusOperatorRequest {
	
	private int caseNumber;
	private String busOperatorUsername;
	private Bus bus;
	private String requestMsg;
	private String requestFor; // Possible values deleteBus,update Fare,Change Route , Change Time
	private boolean status; // approved = true , unapproved = false
	private LocalDate requestDate;
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}
	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public String getRequestMsg() {
		return requestMsg;
	}
	public void setRequestMsg(String requestMsg) {
		this.requestMsg = requestMsg;
	}
	public String getRequestFor() {
		return requestFor;
	}
	public void setRequestFor(String requestFor) {
		this.requestFor = requestFor;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDate getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	
	
	
}
