package ru.mirea.lab6.cl3;

public class Chair extends Furniture {
    public Chair(String name, int price) {
        super(name, price);
    }

    @Override
    public void info() {
        System.out.println("This is a chair named " + getName() + " priced at " + getPrice() + " dollars.");
    }
}
