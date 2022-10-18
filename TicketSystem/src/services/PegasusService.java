package services;

import companies.entities.Flight;

import java.util.List;

public class PegasusService implements IFlightService {

    @Override
    public void buy(String deger) {

    }

    @Override
    public void buySeats(Flight flight, List<String> seats) {
        List<String> pegasusSeats = flight.getSeats();
        for (Object planes : seats) {
            if (!pegasusSeats.contains(planes)) {
                System.err.println("Seçilen koltuk dolu veya satılmamaktadır. Lutfen baska bir koltuk seciniz.");
            } else {
                pegasusSeats.remove(planes);

            }
        }
    }

    @Override
    public void emptySeats(Flight flight) {

    }
}
