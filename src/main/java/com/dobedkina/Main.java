package com.dobedkina;

public class Main {
    public static void main(String[] args) {

        Car Kia = new Car("Kia", "синий",190, "2019",55, 30);
        Car Toyota  = new Car ("Toyota", "черный", 220, "2015", 60);
        Car Subaru = new Car ("Subaru", "серый", 220, "2018", 65, 65);
        Car BMW = new Car ("BMW", "белый", 270, "2021",  60, 60);
        Car Ferrari  = new Car ("Ferrari", "красный", 320, "2021", 80, 75);

        Car[] cars = new Car[5];
        cars[0] = Kia;
        cars[1] = Toyota;
        cars[2] = Subaru;
        cars[3] = BMW;
        cars[4] = Ferrari;

        for (Car car : cars) {
            car.showCarInfo();
        }

        System.out.println("\n");

        System.out.println(BMW.compareSpeed(Ferrari));
        System.out.println(Toyota.compareSpeed(Subaru));
        System.out.println(BMW.compareSpeed(Kia));
        System.out.println("\n");

        BMW.fillTank(11);
        Kia.fillTank(15);
        Ferrari.fillTank(20);
        System.out.println(BMW.getFuelInTank());
        System.out.println(Kia.getFuelInTank());
        System.out.println((Ferrari.getFuelInTank()));
        System.out.println("\n");

        Kia.driveNKilometers(0);
        Ferrari.driveNKilometers(10);
        Subaru.driveNKilometers(-5);
    }
}
