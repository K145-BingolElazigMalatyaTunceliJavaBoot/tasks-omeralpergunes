package odev1;

import java.util.Random;

public class Hafta1Odev4 {

	public static void main(String[] args) {
		int counter = 0;
		Random random = new Random();
		boolean secim = true;
		
		while(secim) {
			counter++;
			int rndNum = random.nextInt(500);
			if(rndNum>=50 && rndNum<=100) {
				secim = false;
			}
		}
		System.out.println(counter + ". Seçim");
	}

}
