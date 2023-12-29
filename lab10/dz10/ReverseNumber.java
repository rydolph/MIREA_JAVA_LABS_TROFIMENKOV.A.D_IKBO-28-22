package ru.mirea.lab10.dz10;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;

        int reversed = reverseNumber(n);
        System.out.println(reversed);
    }

    public static int reverseNumber(int n) {
        if (n < 10) {
            return n;
        }

        int lastDigit = n % 10;
        int remainingDigits = n / 10;

        int reversedRemaining = reverseNumber(remainingDigits);

        int reversed = lastDigit * (int) Math.pow(10, (int) Math.log10(reversedRemaining) + 1) + reversedRemaining;
        return reversed;
    }
}
