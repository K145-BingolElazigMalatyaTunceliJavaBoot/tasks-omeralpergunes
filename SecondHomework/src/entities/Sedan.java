package entities;

public class Sedan extends Vehicle{

    private int monthlyRental;

    public int getMonthlyRental() {
        return monthlyRental;
    }

    public void setMonthlyRental(int dailyRental) {
        this.monthlyRental = dailyRental;
    }

    public int monthlyRental(){
        return super.getDailyRental() + (100 / getAge() * 30);
    }
}
