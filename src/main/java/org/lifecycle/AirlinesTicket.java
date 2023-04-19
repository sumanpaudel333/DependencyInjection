package org.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AirlinesTicket implements InitializingBean, DisposableBean {
    private String airlinesName;
    private double ticketPrice;

    public AirlinesTicket() {
    }

    @Override
    public String toString() {
        return "AirlinesTicket{" +
                "airlinesName='" + airlinesName + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    public String getAirlinesName() {
        return airlinesName;
    }

    public void setAirlinesName(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Purchasing Airlines Ticket : init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Airlines Ticket after flight completion");
    }
}
