package ru.mirea.lab17.exe2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Студент", 67, 12, 18));
        s.add(new Student("Студент", 57, 12, 18));
        s.add(new Student("Студент", 93, 12, 19));
        s.add(new Student("Студент", 24, 2, 18));
        s.add(new Student("Студент", 66, 12, 18));

        new LabClassUI(s);
    }

}
