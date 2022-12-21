package com.luciuswong.behavioral.chainofresponsibility;


public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication leaveApplication);
    String getRole();
}