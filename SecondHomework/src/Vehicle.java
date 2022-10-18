package vehicleTypes;


public class Vehicle {

	private String name; //Araçlara isim girilecek
	private double baggageCapacity; //Bagaj kapasiteleri ondalık değer olabileceği düşünülerek double tipi verilmiştir.
	private int dailyRental; //Tüm araç tiplerinde günlük kiralama baz alınmıştır. 
	private double age; //Araç yaşının 1.5-2.5 gibi değerler olabileceği düşünülerek double tip verildi.
	private String color; //Renk ataması için girilmiştir.
	private String model; //Modeli yazılacaktır.

	//getters & settersler kullanıldı
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaggageCapacity() {
		return baggageCapacity;
	}

	public void setBaggageCapacity(double baggageCapacity) {
		this.baggageCapacity = baggageCapacity;
	}

	public int getDailyRental(int sayi) {
		return dailyRental;
	}

	public void setDailyRental(int dailyRental) {
		this.dailyRental = dailyRental;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
