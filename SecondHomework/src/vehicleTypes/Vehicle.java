package vehicleTypes;


public class Vehicle {

	private String name;
	private double baggageCapacity; 
	private int dailyRental;  
	private double age;
	private String color; 
	private String model; 

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
