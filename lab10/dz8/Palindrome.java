package ru.mirea.lab10.dz8;

public class Palindrome {
    public static void main(String[] args) {
        String word = "sosos";

        // Проверка на палиндром
        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        } else {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                return isPalindrome(word.substring(1, word.length() - 1));
            } else {
                return false;
            }
        }
    }
}
