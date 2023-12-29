package ru.mirea.lab6.cl1;

class Plate extends Dish {
    private int diameter;

    public Plate(String material, int price, int diameter) {
        super(material, price);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void use() {
        System.out.println("Eating from a plate.");
    }
}
