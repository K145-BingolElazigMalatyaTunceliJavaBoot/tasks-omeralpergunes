package vehicleTypes;

import services.RentACarService;

public class Sedan extends Vehicle implements RentACarService{

	private double monthRental;

	public double getMonthRental() {
		return monthRental  = getDailyRental(300)* 30;
	}

	public void setMonthRental(double monthRental) {
		this.monthRental = monthRental;
	}

	@Override
	public double dailyRental() {
		return dailyRental() + (55/getAge()*5);
	}
	

}