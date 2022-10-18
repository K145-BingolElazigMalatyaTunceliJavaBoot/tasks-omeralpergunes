import java.util.Random;

public class Odev1 {
    public static void main(String[] args) {
        Random random = new Random();
        int deger = random.nextInt(100);
        System.out.println(deger);

        if(deger>=70 && deger<=100){
            System.out.println("AA ile geçtiniz");
        } else if (deger >= 50 && deger < 70) {
            System.out.println("BB ile geçtiniz");
        } else if (deger >= 35 && deger < 50) {
            System.out.println("DC ile geçtiniz");
        } else {
            System.out.println("FF ile kaldınız");
        }
    }
}
