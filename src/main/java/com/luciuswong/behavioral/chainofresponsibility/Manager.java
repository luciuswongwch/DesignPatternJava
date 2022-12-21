package com.luciuswong.behavioral.chainofresponsibility;


public class Manager extends Employee {
	public Manager(LeaveApprover successor) {
		super("Manager", successor);
	}
	@Override
	protected boolean processRequest(LeaveApplication leaveApplication) {
		switch (leaveApplication.getType()) {
		case SickLeave:
			leaveApplication.approve(getRole());
			return true;
        case PaidTimeOff:
			if(leaveApplication.getNoOfDays() <= 5) {
				leaveApplication.approve(getRole());
				return true;
			}
		}
		return false;
	}
}