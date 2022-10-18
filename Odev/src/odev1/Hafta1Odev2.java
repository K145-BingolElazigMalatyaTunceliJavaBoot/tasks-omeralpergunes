package odev1;

public class Hafta1Odev2 {

	public static void main(String[] args) {
		for(int i=3; i<=100;i++)
		{
			int sayi = 0;
			
				for(int k=2;k<i;k++) {
					if(i%k==0) {
						sayi++;
					}
				}
				if(sayi==0) {
					System.out.println(i + " ");
				}
		}

	}

}
