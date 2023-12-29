package ru.mirea.lab4.human;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return "Человек:\n" + head.toString() + "\n" + leg.toString() + "\n" + hand.toString();
    }
}
