package ru.mirea.lab4.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circ = new Circle(10);
        System.out.println(circ);

        circ.setDiametr(25);
        System.out.println(circ);
    }
}
