package ru.mirea.lab2;

public class forwhiledo {
    public static void main(String[] args) {
        int[] b = new int[] {1,2,3,4,5,6,7,8,9};
        int a = 0;

        for (int i = 0; i < b.length; i++){
            a = a + b[i];
            System.out.println("i = "+ i+", a = "+a+", b["+i+"] = "+b[i]);
        }
        System.out.println(a);


        a = 0; int i = 0;
        while(i < b.length){
            a += b[i];
            i++;
        }
        System.out.println(a);


        a = 0; i = 0;
        do{
            a += b[i];
            i++;
        }while (i < b.length);
        System.out.println(a);
    }
}
