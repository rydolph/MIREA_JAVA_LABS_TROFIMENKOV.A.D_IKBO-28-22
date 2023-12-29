package ru.mirea.lab4.human;

public class TestHuman {
    public static void main(String[] args) {
        Head head = new Head(2, 2);
        Leg leg = new Leg(2);
        Hand hand = new Hand(2);

        Human human = new Human(head, leg, hand);

        System.out.println(human.toString());
    }
}
