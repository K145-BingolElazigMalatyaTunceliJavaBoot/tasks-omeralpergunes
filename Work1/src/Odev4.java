import java.util.Random;

public class Odev4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean sayi = true;
        int sayac = 0;
        while (sayi) {
            int randomSayi = rnd.nextInt(500);
            sayac++;
            if (randomSayi >= 50 && randomSayi < 100) {
                sayi = false;
            }
        }
        System.out.println(sayac);
    }
    }

