package companies.entities;

import java.util.List;

public class Flight {
    private String flightCompanyName;
    private List seats;
    private int seatLong;
    private int businessSeats;
    private int economicSeats;
    private String domestic;
    private String abroad;

    public String getFlightCompanyName() {
        return flightCompanyName;
    }

    public void setFlightCompanyName(String flightCompanyName) {
        this.flightCompanyName = flightCompanyName;
    }

    public List getSeats() {
        return seats;
    }

    public void setSeats(List seats) {
        this.seats = seats;
    }

    public int getSeatLong() {
        return seatLong;
    }

    public void setSeatLong(int seatLong) {
        this.seatLong = seatLong;
    }

    public int getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }

    public int getEconomicSeats() {
        return economicSeats;
    }

    public void setEconomicSeats(int economicSeats) {
        this.economicSeats = economicSeats;
    }

    public String getDomestic() {
        return domestic;
    }

    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }

    public String getAbroad() {
        return abroad;
    }

    public void setAbroad(String abroad) {
        this.abroad = abroad;
    }

}
