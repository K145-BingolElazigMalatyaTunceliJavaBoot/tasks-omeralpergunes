package companies.entities;

import services.SeatControlService;

public class Pegasus extends Flight{

    @SuppressWarnings("unused")
    private boolean abroadFood;

    public boolean isAbroadFood() {
        return abroadFood = true;
    }


    public void setAbroadFood(boolean abroadFood) {
        this.abroadFood = true;
    }


    public Pegasus() {

        this.setFlightCompanyName("Pegasus");
        this.setDomestic("Izmir");
        this.setAbroad("Sofya");
        this.setBusinessSeats(4500);
        this.setEconomicSeats(1000);
        this.setSeatLong(getSeatLong());
        this.setSeats(SeatControlService.seatControlService(getSeatLong()));

    }
}
