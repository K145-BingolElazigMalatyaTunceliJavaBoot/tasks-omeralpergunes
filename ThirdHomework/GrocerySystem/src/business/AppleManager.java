package business;

import entities.Apple;

public class AppleManager implements IAppleService {

	@Override
	public void Add(Apple apple, double kg) {
		apple.setKg(kg);
	}

	@Override
	public void Buy(Apple apple, double kg){
		if(apple.getUnitsInStocks()<kg) {
			System.out.println ("Elma ürünü " + kg + "kilogram olarak bulunmamaktadır" );
		}
		else {
			System.out.println("Elma ürünü için istediğiniz " + kg + "kilogram sepetinize eklendi");
		}
	}

	
}
