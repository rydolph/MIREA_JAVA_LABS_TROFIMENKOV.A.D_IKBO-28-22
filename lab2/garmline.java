package ru.mirea.lab2;

public class garmline {
    public static void main(String[] args) {
        double garmline = 1;
        System.out.println("1 число = "+garmline);
        for(double i = 2; i < 11; i++){
            garmline = 1/i;
            int b = (int) i;
            System.out.println( b+ " число = " +garmline);
        }
    }
}
