package vehicleTypes;

import services.RentACarService;

public class Suv extends Vehicle implements RentACarService {

	private double monthRental;

	public double getMonthRental() {
		return monthRental;
	}

	public void setMonthRental(double monthRental) {
		this.monthRental = monthRental;
	}

	@Override
	public double dailyRental() {
		return dailyRental() + (75/getAge()*4);
	}
	
}
