package ru.mirea.lab4.human;

public class Leg {
    private int numberOfLegs;

    public Leg(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        return "Кол-во ног: " + numberOfLegs;
    }
}
