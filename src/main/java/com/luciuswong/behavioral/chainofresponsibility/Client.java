package com.luciuswong.behavioral.chainofresponsibility;


import java.time.LocalDate;

public class Client {
	public static void main(String[] args) {
	   LeaveApplication application = new LeaveApplicationBuilder()
			   .withType(LeaveApplication.Type.SickLeave)
			   .from(LocalDate.now())
			   .to(LocalDate.now().plusDays(10))
			   .build();
	   System.out.println(application);
	   LeaveApprover approver = createApprovalChain();
	   approver.processLeaveApplication(application);
	   System.out.println(application);
	}

	private static LeaveApprover createApprovalChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
}