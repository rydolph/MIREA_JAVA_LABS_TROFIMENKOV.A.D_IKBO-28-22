package ru.mirea.lab11.dz2;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("John", 123, 3.8);
        students[1] = new Student("Alice", 345, 3.5);
        students[2] = new Student("Mike", 567, 4.0);
        students[3] = new Student("Emily", 234, 3.2);
        students[4] = new Student("Mark", 789, 3.9);

        System.out.println("Исходный список студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nОтсортированный список студентов по итоговым баллам (в порядке убывания):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int iDNumber;
    private double gpa;

    public Student(String name, int iDNumber, double gpa) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iDNumber=" + iDNumber +
                ", gpa=" + gpa +
                '}';
    }
}

