package entities;

public abstract class Fruit {

	private String name;
	private double kg;
	private double unitsInStocks;
	
	public Fruit() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public double getUnitsInStocks() {
		return unitsInStocks;
	}

	public void setUnitsInStocks(double unitsInStocks) {
		this.unitsInStocks = unitsInStocks;
	}
	
	
	
	
	
}
