import Service.RentACarService;
import entities.Hatchback;
import entities.Sedan;
import entities.Suv;

public class Main {
    public static void main(String[] args) {

        RentACarService rentACarService = new RentACarService();

        Hatchback hatchback = new Hatchback();
        Suv suv = new Suv();
        Sedan sedan = new Sedan();


        hatchback.setName("Peugeot");
        hatchback.setAge(1);
        hatchback.setColor("Green");
        hatchback.setDailyRental(300);
        hatchback.setBaggageCapacity(478.8);

        suv.setName("Opel");
        suv.setAge(3);
        suv.setColor("Black");
        suv.setDailyRental(240);
        suv.setBaggageCapacity(750);
        suv.setMonthlyRental(2880);

        sedan.setName("Mercedes");
        sedan.setAge(8);
        sedan.setColor("Yellow");
        sedan.setDailyRental(400);
        sedan.setMonthlyRental(12000);
        sedan.setBaggageCapacity(462.4);



    }
    }
