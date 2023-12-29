package ru.mirea.lab2;

public class factorial {

    public static void factorial(int n){
        int a = 1;
        for(int i = 1; i < n+1; i++){
            a *= i;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        int arg = 5;
        factorial(5);
    }
}
