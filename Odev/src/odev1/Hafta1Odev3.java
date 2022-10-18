package odev1;

public class Hafta1Odev3 {

	public static void main(String[] args) {

		int toplam =0;

		for(int i=201;i<=500;i++) {
			if(i%3==1 || i%3==2) {
				toplam = toplam + i;
		}
	}
		
		System.out.println("Toplam = " + toplam);
	}

}
