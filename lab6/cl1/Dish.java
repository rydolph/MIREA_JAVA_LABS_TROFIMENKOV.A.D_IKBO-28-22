package ru.mirea.lab6.cl1;

abstract class Dish {
    private String material;
    private int price;

    public Dish(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public abstract void use();
}