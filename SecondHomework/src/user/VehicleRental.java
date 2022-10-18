package user;

import vehicleTypes.Hatchback;
import vehicleTypes.PickUp;
import vehicleTypes.Sedan;
import vehicleTypes.Suv;

public class VehicleRental {

	public static void main(String[] args) {
			
			//Nesneleri tanımlandıktan sonra ekranda çıktı almak için değerler girildi
			//Setters'ler için yazma, Getters'ler için okuma diyebiliriz.
			//Ödev'den bağımsız, Pick-up araç tipi de eklenmiştir.
		
			Sedan sedan = new Sedan(); 
			Hatchback hatchback = new Hatchback();
			Suv suv = new Suv();
			PickUp pickUp = new PickUp();
			
			sedan.setName("Mercedes CLA");
			sedan.setMonthRental(8);
			sedan.setAge(4);
			sedan.setBaggageCapacity(400.9);
			sedan.setDailyRental(4);
			sedan.setColor("Orange");
			sedan.setModel("2018");
			
			hatchback.setName("Renault");
			hatchback.setAge(9);
			hatchback.setBaggageCapacity(250.3);
			hatchback.setColor("Purple");
			hatchback.setDailyRental(7);
			hatchback.setModel("2013");
			hatchback.setLitreKm(0.2);
			
			
			suv.setName("BMW X5");
			suv.setAge(6.5);
			suv.setBaggageCapacity(550.2);
			suv.setColor("Black");
			suv.setDailyRental(3);
			suv.setModel("2016");
			
			pickUp.setName("Ford Ranger");
			pickUp.setAge(2.5);
			pickUp.setBaggageCapacity(950.75);
			pickUp.setColor("Brown");
			pickUp.setModel("2019");
			
			
			System.out.println("Araç İsmi" + pickUp.getName());
			System.out.println("Araç Yaşı" + pickUp.getAge());
			System.out.println("Bagaj Kapasitesi" + pickUp.getBaggageCapacity());
			System.out.println("Araç Rengi" + pickUp.getColor());
			
			Users citizens = new Users(true);
			citizens.citizensRental(hatchback); // Değer true döndükçe diğer vatandaşlar sadece hatchback model aracı görebilecek..
			
			Users companies = new Users(true);
			companies.companiesRental(suv, hatchback, sedan, pickUp); // Değer true döndükçe şirketler 4 tip aracı da görebilecek.
			
			

	}}
