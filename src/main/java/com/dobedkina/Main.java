package com.dobedkina;

public class Main {
    public static void main(String[] args) {

        Car Kia = new Car("Kia", "синий", 190, "2019", 55, 30);
        Car Toyota = new Car("Toyota", "черный", 220, "2015", 60);
        Car Subaru = new Car("Subaru", "серый", 220, "2018", 65, 65);
        Car BMW = new Car("BMW", "белый", 270, "2021", 60, 60);
        Car Ferrari = new Car("Ferrari", "красный", 320, "2021", 80, 75);

        Car[] cars = new Car[5];
        cars[0] = Kia;
        cars[1] = Toyota;
        cars[2] = Subaru;
        cars[3] = BMW;
        cars[4] = Ferrari;

        //выводим всю информацию о машинах
        for (Car car : cars) {
            car.showCarInfo();
        }

        //сравниваем скорости машин
        System.out.println(BMW.compareSpeed(Ferrari));
        System.out.println(Toyota.compareSpeed(Subaru));
        System.out.println(BMW.compareSpeed(Kia));
        System.out.println("\n");

        //добавляем топливо в бензобак
        BMW.fillTank(11);
        Kia.fillTank(15);
        Ferrari.fillTank(20);
        //выводим кол-во топлива в бензобаке после дозаправки
        System.out.println("У BMW в бензобаке " + BMW.getFuelInTank() + " литров");
        System.out.println("У Kia в бензобаке " + Kia.getFuelInTank() + " литров");
        System.out.println("У Ferrari в бензобаке " + Ferrari.getFuelInTank() + " литров");
        System.out.println("\n");

        //машина проезжает N километров
        Kia.driveNKilometers(0);
        Ferrari.driveNKilometers(10);
        Subaru.driveNKilometers(-5);
    }
}
