package searializeAndDeserialize;

import java.io.Serializable;

public class Student implements Serializable{

    long studentId;
    String studentName;
    long studentContactNo;

    public Student(long studentId, String studentName, long studentContactNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentContactNo = studentContactNo;
    }

    public String toString() {
        return ("Student Id:" + studentId + " Student Name:" + studentName + " Student Contact:" + studentContactNo);
    }

}
