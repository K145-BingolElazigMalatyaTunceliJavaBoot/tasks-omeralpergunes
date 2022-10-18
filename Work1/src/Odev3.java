public class Odev3 {
    public static void main(String[] args) {
        int deger = 0 ;
        for (int i = 200; i < 500; i++) {
            if(i % 3 == 1 || i % 3 == 2){
                deger += i;
            }
        }
        System.out.println(deger);
    }
}


