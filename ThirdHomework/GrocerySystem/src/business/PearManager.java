package business;

import entities.Pear;

public class PearManager implements IPearService{

	@Override
	public void Add(Pear pear, double kg) {
		pear.setKg(kg);
		
	}

	@Override
	public void Buy(Pear pear, double kg){
		if(pear.getUnitsInStocks()<kg) {
			System.out.println("Armut meyvesi " + kg + "kilogram olarak bulunmamaktadır");
		}
		else {
			System.out.println("Armut meyvesi için " + kg + "belirlediğiniz kilogram cinsinden sepetinize eklendi.");
		}
	}

	
}
