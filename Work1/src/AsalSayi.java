public class AsalSayi {
    public static void main(String[] args) {

        int asal = 0;
        for (int i = 3; i <= 100; i++) {

            int asalkontrol=0;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    asalkontrol=1;
                    break;
                }
            }
            if (asalkontrol==0) {
                asal = asal+i;
                }
        }
        System.out.println("Asal sayıların toplamı => " +  asal);
    }
}