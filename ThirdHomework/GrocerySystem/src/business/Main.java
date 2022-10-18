package business;

import entities.Apple;
import entities.Cherry;
import entities.Pear;

public class Main {

	public static void main(String[] args) {

		AppleManager appleManager = new AppleManager();
		CherryManager cherryManager = new CherryManager();
		PearManager pearManager = new PearManager();
		
		Apple apple = new Apple();
		Pear pear = new Pear();
		Cherry cherry = new Cherry();
		
		appleManager.Add(apple, 1);
		appleManager.Buy(apple, 2.5);
		
		cherryManager.Add(cherry, 50);
		cherryManager.Buy(cherry, 15.3);
		
		pearManager.Add(pear, 8);
		pearManager.Buy(pear, 2.5);
		
		
	}

}
