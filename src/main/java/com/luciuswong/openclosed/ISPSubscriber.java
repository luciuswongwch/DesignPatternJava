package com.luciuswong.openclosed;

import java.util.List;

public class ISPSubscriber extends Subscriber {

    private long freeUsage;

    public ISPSubscriber() {

    }

    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(this.getSubscriberId());
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData * this.getBaseRate() / 100;
    }

    public long getFreeUsage() {
        return freeUsage;
    }
    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    
}