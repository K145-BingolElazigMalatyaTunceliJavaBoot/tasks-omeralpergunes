package aircraftCompanies.services;

import java.util.List;

import aircraftCompanies.Flight;

public class PegasusService implements IFlightService {

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
		System.out.println(flight.getSeats());

	}

	@Override
	public void buy(String deger) {

	}


}
