package oops;

import java.util.List;

public class SearchStudent {

    public static Student search(String name, List<Student> studentList) {

        for(Student st : studentList) {

            if (name.equals(st.getStudentName())) {
                return st;
            }

        }

        return new Student();

    }

    public static Student search(long id, List<Student> studentList) {


        for(Student st : studentList) {

            if (id == st.getStudentId()) {
                return st;
            }

        }

        return new Student();

    }

//    public static Student searchByPhoneNo(long phone, List<Student> studentList) {
//
//        for(Student st : studentList) {
//
//            if (phone == st.getStudentContactNo()) {
//                return st;
//            }
//
//        }
//
//        return new Student();
//
//    }
}
