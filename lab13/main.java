package ru.mirea.lab13;

public class main {
    public static void main(String[] args) {

        String name = "src/ru/mirea/lab13/test.txt";

        alltasks task = new alltasks();
        System.out.println("1: Реализовать запись в файл введённой с клавиатуры информации");
        task.enterToFile(name);
        System.out.println("2: Реализовать вывод информации из файла на экран");
        task.replaceInFile(name);
        System.out.println('\n' + "3: Заменить информацию в файле на информацию, введённую с клавиатуры");
        task.enterToFile(name);
        System.out.println("4: Добавить в конец исходного файла текст, введённый с клавиатуры");
        task.appendToFile(name);
        System.out.println("Result");
        task.replaceInFile(name);




    }
}
