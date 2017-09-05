package oops;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrangeStudents {

    public static void arrangeByAge(List<Student> ls) {

        Collections.sort(ls, new AgeComparator());
        System.out.println("Students are arranged based on their age");
    }

    public static void arrangeByHeight(List<Student> ls) {

        Collections.sort(ls, new HeightComparator());
        System.out.println("Students are arranged based on their heights");
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStudentAge() - s2.getStudentAge();
    }
}

class HeightComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return (int)Math.round(s1.getStudentHeight() - s2.getStudentHeight());
    }
}