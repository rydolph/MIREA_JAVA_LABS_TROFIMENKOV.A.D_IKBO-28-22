package ru.mirea.lab4.human;

public class Head {
    private int numberOfEyes;
    private int numberOfEars;

    public Head(int numberOfEyes, int numberOfEars) {
        this.numberOfEyes = numberOfEyes;
        this.numberOfEars = numberOfEars;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public int getNumberOfEars() {
        return numberOfEars;
    }

    @Override
    public String toString() {
        return "Голова: " + numberOfEyes + " - кол-во глаз, " + numberOfEars + " - кол-во ушей";
    }
}
