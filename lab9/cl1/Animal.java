package ru.mirea.lab9.cl1;

public class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
