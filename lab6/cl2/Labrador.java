package ru.mirea.lab6.cl2;

public class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Labrador barks");
    }
}
