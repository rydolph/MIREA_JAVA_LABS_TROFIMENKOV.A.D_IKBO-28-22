package ru.mirea.lab6.cl3;

public class Sofa extends Furniture {
    public Sofa(String name, int price) {
        super(name, price);
    }

    @Override
    public void info() {
        System.out.println("This is a sofa named " + getName() + " priced at " + getPrice() + " dollars.");
    }
}
