package ru.mirea.lab6.cl2;

public class Test {
    public static void main(String[] args) {
        Dog labrador = new Labrador("Tom", 3);
        Dog bulldog = new Bulldog("Max", 5);
        Dog poodle = new Poodle("Charlie", 2);

        labrador.bark();
        bulldog.bark();
        poodle.bark();

        System.out.println("Labrador: " + labrador.getName() + ", " + labrador.getAge() + " years old");
        System.out.println("Bulldog: " + bulldog.getName() + ", " + bulldog.getAge() + " years old");
        System.out.println("Poodle: " + poodle.getName() + ", " + poodle.getAge() + " years old");
    }
}
