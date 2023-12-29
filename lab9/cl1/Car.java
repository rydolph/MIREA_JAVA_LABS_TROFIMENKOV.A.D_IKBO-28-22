package ru.mirea.lab9.cl1;

public class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
