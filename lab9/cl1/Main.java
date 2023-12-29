package ru.mirea.lab9.cl1;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Земля");
        System.out.println("Название планеты: " + planet.getName());

        Nameable car = new Car("Toyota");
        System.out.println("Название машины: " + car.getName());

        Nameable animal = new Animal("Лев");
        System.out.println("Название животного: " + animal.getName());
    }
}
