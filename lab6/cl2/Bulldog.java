package ru.mirea.lab6.cl2;

public class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Bulldog barks");
    }
}

