package ru.mirea.lab11.dz1;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = new Student[5];
        students[0] = new Student("John", 123);
        students[1] = new Student("Alice", 345);
        students[2] = new Student("Mike", 567);
        students[3] = new Student("Emily", 234);
        students[4] = new Student("Mark", 789);

        System.out.println("Исходный массив студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка массива студентов по идентификатору (iDNumber) с использованием сортировки вставками
        insertionSort(students);

        System.out.println("\nОтсортированный массив студентов по iDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}

class Student {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", iDNumber=" + iDNumber + '}';
    }
}

