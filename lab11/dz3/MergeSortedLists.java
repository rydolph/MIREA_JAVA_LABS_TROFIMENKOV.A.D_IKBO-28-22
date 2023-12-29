package ru.mirea.lab11.dz3;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("John", 123));
        list1.add(new Student("Alice", 345));
        list1.add(new Student("Mike", 567));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Emily", 234));
        list2.add(new Student("Mark", 789));

        List<Student> mergedList = mergeSortedLists(list1, list2);

        System.out.println("Объединенный отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            Student student1 = list1.get(index1);
            Student student2 = list2.get(index2);

            if (student1.getiDNumber() < student2.getiDNumber()) {
                mergedList.add(student1);
                index1++;
            } else {
                mergedList.add(student2);
                index2++;
            }
        }

        while (index1 < list1.size()) {
            mergedList.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            mergedList.add(list2.get(index2));
            index2++;
        }

        return mergedList;
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

