package services;

import companies.entities.Flight;

import java.util.List;

public interface IFlightService {

    void buy(String deger);
    void buySeats(Flight flight, List<String> seats);
    void emptySeats(Flight flight);
}
