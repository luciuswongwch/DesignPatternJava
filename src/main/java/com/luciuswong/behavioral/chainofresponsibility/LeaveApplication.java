package com.luciuswong.behavioral.chainofresponsibility;

import java.time.LocalDate;
import java.time.Period;

public class LeaveApplication {
	public enum Type { SickLeave, PaidTimeOff, LongTimeOff };
	public enum Status { Pending, Approved, Rejected };

	private Type type;
	private LocalDate from;
	private LocalDate to;
	private String processorRole;
	private Status status;
	
	public LeaveApplication(Type type, LocalDate from, LocalDate to) {
		this.type = type;
		this.from = from;
		this.to = to;
		this.status = Status.Pending; 
	}
	
	public Type getType() {
		return type;
	}
	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}
	public String getProcessorRole() {
		return processorRole;
	}
	public Status getStatus() {
		return status;
	}

	public int getNoOfDays() {
		return Period.between(from, to).getDays();
	}

	public void approve(String role) {
		this.status = Status.Approved;
		this.processorRole = role;
	}

	public void reject(String role) {
		this.status = Status.Rejected;
		this.processorRole = role;
	}
	
	@Override
	public String toString() {
		return type + " leave for " + getNoOfDays() + " day(s) " + status + " by " + processorRole;
	}
}