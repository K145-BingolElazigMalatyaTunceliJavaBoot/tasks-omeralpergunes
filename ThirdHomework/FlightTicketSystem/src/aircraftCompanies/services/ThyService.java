package aircraftCompanies.services;

import java.util.List;

import aircraftCompanies.Flight;

public class ThyService implements IFlightService {

	@Override
	public void buySeats(Flight flight, List<String> seats) {
		List<String> thySeats = flight.getSeats();
		for (Object planes : seats) {
			if (!thySeats.contains(planes)) {
				System.err.println("Secilen koltuk dolu veya satilmamaktadir. Lutfen baska bir koltuk seciniz.");
			} else {
				thySeats.remove(planes);

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
