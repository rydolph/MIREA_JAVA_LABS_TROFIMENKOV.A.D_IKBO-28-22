package ru.mirea.lab6.cl1;

class Cup extends Dish {
    private int volume;

    public Cup(String material, int price, int volume) {
        super(material, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void use() {
        System.out.println("Drinking from a cup.");
    }
}