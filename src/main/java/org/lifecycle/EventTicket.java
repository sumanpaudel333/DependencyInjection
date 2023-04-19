package org.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EventTicket {
    private String eventName;
    private double eventPrice;

    public EventTicket() {
    }

    @Override
    public String toString() {
        return "EventTicket{" +
                "eventName='" + eventName + '\'' +
                ", eventPrice=" + eventPrice +
                '}';
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(double eventPrice) {
        this.eventPrice = eventPrice;
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting:");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroying!");
    }
}
