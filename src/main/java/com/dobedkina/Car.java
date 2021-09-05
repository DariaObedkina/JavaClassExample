package com.dobedkina;

public class Car {
    private String brand;
    private String color;
    private int maxSpeed;
    private String year;
    private int tankCapacity;
    private double fuelInTank;

    /*public Car() {

    }*/

    public Car(String brand, String color, int maxSpeed, String year, int tankCapacity) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.tankCapacity = tankCapacity;
    }

    public Car(String brand, String color, int maxSpeed, String year, int tankCapacity, double fuelInTank) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.tankCapacity = tankCapacity;
        this.fuelInTank = fuelInTank;
    }


    //вывести всю информацию о машине
    public void showCarInfo() {
        System.out.println("Марка: " + brand + "\n"
                + "Цвет: " + color + "\n"
                + "Максимальная скорость: " + maxSpeed + "\n"
                + "Год выпуска: " + year + "\n"
                + "Объем топливного бака: " + tankCapacity + "\n"
                + "Топливо в баке: " + fuelInTank + "\n");

    }

    //сравнить скорость машин
    public String compareSpeed(Car car) {
        if (this.maxSpeed > car.maxSpeed) {
            return this.brand + " быстрее, чем " + car.brand;
        } else if (this.maxSpeed < car.getMaxSpeed()) {
            return car.brand + " быстрее, чем " + this.brand;
        } else
            return "У машин " + car.brand + " и " + this.brand + " одинаковая максимальная скорость";
    }

    //добавить определенное кол-во литров топлива в бензобак
    public void fillTank(double liters) {
        if (liters <= 0) {
            System.out.println("Введите число > 0");
        } else {
            if (liters < this.fuelCanBeAdded(this.fuelInTank)) {
                this.fuelInTank += liters;
                System.out.println("Машина заправлена!");
            } else if (liters > this.fuelCanBeAdded(this.fuelInTank) && fuelInTank != tankCapacity) {
                this.fuelInTank = tankCapacity;
                System.out.println("Машина заправлена!");
            } else System.out.println("Бак полон, дозаправка невозможна.");
        }

    }

    //проехать N километров
    public void driveNKilometers(int n) {
        if (n == 0) {
            System.out.println(brand +  " стоит на месте.");
        } else if (n < 0) {
            System.out.println(brand + " сдает назад.");
            for (int i = 0; i < Math.abs(n); i++) {
                System.out.println("Vroom-vroom!");
            }
        } else {
            System.out.println(brand + " едет.");
            for (int i = 0; i < n; i++) {
                System.out.println("Vroom-vroom!");
            }
        }
        System.out.println("\n");
    }

    //узнать, сколько литров топлива можно добавить в бензобак
    private double fuelCanBeAdded(double fuelInTank) {
        return (double) tankCapacity - fuelInTank;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }

    public void setFuelInTank(double fuelInTank) {
        this.fuelInTank = fuelInTank;
    }
}
