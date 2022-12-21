package com.luciuswong.behavioral.chainofresponsibility;

import com.luciuswong.behavioral.chainofresponsibility.LeaveApplication.Type;


public class Director extends Employee {
	public Director(LeaveApprover successor) {
		super("Director", successor);
	}
	@Override
	protected boolean processRequest(LeaveApplication leaveApplication) {
		if (leaveApplication.getType() == Type.SickLeave ||
				leaveApplication.getType() == Type.PaidTimeOff ||
				leaveApplication.getType() == Type.LongTimeOff) {
			leaveApplication.approve(getRole());
			return true;
		}
		return false;
	}
}