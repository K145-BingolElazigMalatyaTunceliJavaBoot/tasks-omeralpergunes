package aircraftCompanies.services;

import java.util.List;

import aircraftCompanies.Flight;

public interface IFlightService {
	
	void buy(String deger);
	void buySeats(Flight flight, List<String> seats);
	void emptySeats(Flight flight);
	
}
