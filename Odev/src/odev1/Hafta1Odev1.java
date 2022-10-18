package odev1;

import java.util.Random;

public class Hafta1Odev1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int girilenNot = random.nextInt(100);
		
		if(girilenNot>=70 && girilenNot<=100) {
			System.out.println("AA ile geçtiniz");
		}
		else if(girilenNot>=50 && girilenNot<70) {
			System.out.println("BB ile geçtiniz");
		}
		else if(girilenNot>=35 && girilenNot<50) {
			System.out.println("DC ile geçtiniz");
		}
		else {
			System.out.println("FF ile kaldınız");
		}

	}

}
