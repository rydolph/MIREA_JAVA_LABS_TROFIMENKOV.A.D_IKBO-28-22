package ru.mirea.lab6.cl1;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate("ceramic", 10, 20);
        System.out.println("Material: " + plate.getMaterial());
        System.out.println("Price: " + plate.getPrice());
        System.out.println("Diameter: " + plate.getDiameter());
        plate.use();

        Cup cup = new Cup("glass", 5, 250);
        System.out.println("Material: " + cup.getMaterial());
        System.out.println("Price: " + cup.getPrice());
        System.out.println("Volume: " + cup.getVolume());
        cup.use();
    }
}
