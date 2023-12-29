package ru.mirea.lab13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class alltasks {
    public void enterToFile(String name) {
        try(FileWriter writer = new FileWriter(name, false))
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String text = sc.nextLine();
            writer.append(text);
            writer.flush();
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
    public void replaceInFile(String name) {
        try(FileReader reader = new FileReader(name))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public void appendToFile(String name) {
        try(FileWriter writer = new FileWriter(name, true))
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String text = sc.nextLine();
            writer.append(text);
            writer.flush();
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}
