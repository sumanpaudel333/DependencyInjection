package org.lifecycle;

public class MovieTicket {
    private double price;
    private String movieName;

    public MovieTicket() {
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "price=" + price +
                ", movieName='" + movieName + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Price");
        this.price = price;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        System.out.println("Setting Movie Name");
        this.movieName = movieName;
    }
    public void init(){
        System.out.println("Inside Init");
    }
    public void destroy(){
        System.out.println("Inside Destroy");
    }
}
