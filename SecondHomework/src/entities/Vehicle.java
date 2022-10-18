package entities;

public abstract class Vehicle {
    private String name;
    private String color;
    private int dailyRental;
    private double baggageCapacity;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(double baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public int getDailyRental() {
        return dailyRental;
    }

    public void setDailyRental(int dailyRental) {
        this.dailyRental = dailyRental;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



