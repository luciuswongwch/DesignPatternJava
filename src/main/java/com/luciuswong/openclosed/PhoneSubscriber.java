package com.luciuswong.openclosed;

import java.util.List;

public class PhoneSubscriber extends Subscriber {
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(this.getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration * this.getBaseRate() / 100;
    }
}