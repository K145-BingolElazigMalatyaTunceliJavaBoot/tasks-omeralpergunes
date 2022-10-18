package aircraftCompanies;

import aircraftCompanies.services.SeatControlService;

public class TurkishAirlines extends Flight {

	private boolean domesticFood;
	private boolean abroadFood;
	
	
	public boolean isDomesticFood() {
		return abroadFood = true;
	}

	public void setDomesticFood(boolean domesticFood) {
		this.domesticFood = true;
	}



	public boolean isAbroadFood() {
		return abroadFood = true;
	}



	public void setAbroadFood(boolean abroadFood) {
		this.abroadFood = abroadFood;
	}



	public TurkishAirlines() {
		this.setFlightCompanyName("Turk Hava Yollari");
		this.setDomestic("Ankara");
		this.setAbroad("Viyana");
		this.setBusinessSeats(4500);
		this.setSeats(SeatControlService.seatControlService(getSeatLong()));
		this.setEconomicSeats(1200);
		this.setSeatLong(getSeatLong());

	}


}
