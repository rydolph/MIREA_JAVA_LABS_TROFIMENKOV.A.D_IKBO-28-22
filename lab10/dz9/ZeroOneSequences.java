package ru.mirea.lab10.dz9;

public class ZeroOneSequences {
    public static void main(String[] args) {
        int a = 5; // Количество нулей
        int b = 2; // Количество единиц

        int count = countSequences(a, b);
        System.out.println(count);
    }

    public static int countSequences(int a, int b) {
        if (a == 0 && b == 0) {
            return 1;
        }
        if (a > 0) {
            return countSequences(a - 1, b) + (b > 0 && a < a + b ? countSequences(a, b - 1) : 0);
        }
        return 0;
    }
}
