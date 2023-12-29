package ru.mirea.lab4.human;

public class Hand {
    private int numberOfHands;

    public Hand(int numberOfHands) {
        this.numberOfHands = numberOfHands;
    }

    public int getNumberOfHands() {
        return numberOfHands;
    }

    @Override
    public String toString() {
        return "Рука: " + numberOfHands + " - кол-во рук";
    }
}
