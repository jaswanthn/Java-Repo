package oops;

import java.util.ArrayList;
import java.util.List;

public class OopsDemo {

    public Student[] st;

    public void addStudent() {
        st = new Student[2];
        st[0] = new Student(1234, "Kiran", "kr@gmail.com",
                9123312330l, 5.5, 15);
        st[1] = new Student(1235, "Kumar", "ku@gmail.com",
                9123382330l, 3.5, 13);

    }

    public void printStudent() {
        for(Student s: st) {
            System.out.println(s.getStudentName() + " ");
        }
    }

    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student(1234, "Kiran", "kr@gmail.com",
                9123312330l, 5.5, 15));
        studentsList.add(new Student(1235, "Kumar", "ku@gmail.com",
                9123382330l, 3.5, 13));
        studentsList.add(new Student(1236, "Varun", "vr@gmail.com",
                9126582330l, 4.5, 12));
        studentsList.add(new Student(1237, "Nitesh", "nt@gmail.com",
                9126582330l, 6, 17));


        // Arrange students
        ArrangeStudents.arrangeByAge(studentsList);

        for (Student s : studentsList) {
            System.out.println("Student Name: " + s.getStudentName() + ", Student Age: " + s.getStudentAge());
        }

        ArrangeStudents.arrangeByHeight(studentsList);

        for (Student s : studentsList) {
            System.out.println("Student Name: " + s.getStudentName() + ", Student Height: " + s.getStudentHeight());
        }

        // Find Student By Name

        Student stByName =  SearchStudent.search("Kiran", studentsList);
        System.out.println("Student with name " + stByName.getStudentName() +  " was found");

        OopsDemo od = new OopsDemo();
        od.addStudent();
        od.printStudent();
    }
}
