package user;

import vehicleTypes.Hatchback;
import vehicleTypes.PickUp;
import vehicleTypes.Sedan;
import vehicleTypes.Suv;

public class Users {

	private boolean users;
	
	
	public Users (boolean users) {
		this.users=users;
	}
	
	public void citizensRental(Hatchback hatchback) { 
		if(users) {
			System.out.println("Sadece Hatchback tipi araçları görebilirsiniz");
		}
		else {
			System.out.println("HatchBack tip araç dışındaki araçlar görüntülenemez.");
		}
		
	}
	public void companiesRental(Suv suv, Hatchback hatchback, Sedan sedan, PickUp pickUp) {
		if(users) {
			System.out.println("Dört tip aracı da seçebilirsiniz");
		}
		else {
			System.out.println("Belirtilen değer dışında bir değer seçtiniz. Lütfen, tekrar deneyiniz.");
		}
	}
}
