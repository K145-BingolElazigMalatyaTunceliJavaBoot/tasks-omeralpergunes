package vehicleTypes;

import services.RentACarService;

public class Hatchback extends Vehicle implements RentACarService {
	
	//Hatchback tipi araçlar için kilometre bazında litre tüketim durumu eklenmiştir.
	
	private double litreKm;

	public double getLitreKm() {
		return litreKm;
	}

	public void setLitreKm(double litreKm) {
		this.litreKm = litreKm;
	}

	@Override
	public double dailyRental() {
		return dailyRental() + (50/getAge()*12);
	}

	
}
