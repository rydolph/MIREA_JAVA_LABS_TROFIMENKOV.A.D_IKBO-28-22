package ru.mirea.lab6.cl2;

public abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void bark();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

