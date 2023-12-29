package ru.mirea.lab6.cl2;

public class Poodle extends Dog {
    public Poodle(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Poodle barks");
    }
}
