package com.luciuswong.behavioral.chainofresponsibility;

import java.time.LocalDate;

public class LeaveApplicationBuilder {
    private LeaveApplication.Type type;
    private LocalDate from;
    private LocalDate to;
    private LeaveApplication leaveApplication;

    public LeaveApplicationBuilder() {

    }

    public LeaveApplicationBuilder withType(LeaveApplication.Type type) {
        this.type = type;
        return this;
    }

    public LeaveApplicationBuilder from(LocalDate from) {
        this.from = from;
        return this;
    }

    public LeaveApplicationBuilder to(LocalDate to) {
        this.to = to;
        return this;
    }

    public LeaveApplication build() {
        leaveApplication = new LeaveApplication(type, from, to);
        return leaveApplication;
    }

    public LeaveApplication getApplication() {
        return leaveApplication;
    }
}