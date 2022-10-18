package business;

import entities.Cherry;

public class CherryManager implements ICherryService{

	@Override
	public void Add(Cherry cherry, double kg) {
		cherry.setKg(kg);
	}

	@Override
	public void Buy(Cherry cherry, double kg){
		if(cherry.getUnitsInStocks()<kg) {
			System.out.println("Kiraz Meyvesi" + kg + " olarak kilogram bulunmamaktadır");
		}
		else {
			System.out.println("Kiraz Meyvesi " + kg + " belirlediğiniz kilogram cinsinden sepetinize eklendi");
		}
	}

	
}
