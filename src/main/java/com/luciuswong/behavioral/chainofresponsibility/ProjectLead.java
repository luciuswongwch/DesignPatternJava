package com.luciuswong.behavioral.chainofresponsibility;


public class ProjectLead extends Employee {
    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }
    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == LeaveApplication.Type.SickLeave && leaveApplication.getNoOfDays() <= 2) {
            leaveApplication.approve(getRole());
            return true;
        }
        return false;
    }
}