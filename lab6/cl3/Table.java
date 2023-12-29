package ru.mirea.lab6.cl3;

public class Table extends Furniture {
    public Table(String name, int price) {
        super(name, price);
    }

    @Override
    public void info() {
        System.out.println("This is a table named " + getName() + " priced at " + getPrice() + " dollars.");
    }
}
