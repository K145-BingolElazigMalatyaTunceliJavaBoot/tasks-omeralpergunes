package vehicleTypes;

import services.RentACarService;

public class PickUp extends Vehicle implements RentACarService{

	//Pick-Up classı ödev haricinde ek olarak açılmıştır.


	@Override
	public double dailyRental() {
		return dailyRental() + (100/getAge()*15);
		
	}

	public double monthlyRental() {
		return monthlyRental() + (150/getAge()*8);
	}
	
	
}
