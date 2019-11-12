package oops;

public class Student {

    private long studentId;
    private String studentName;
    private String studentEmail;
    private long studentContactNo;
    private double studentHeight;
    private int studentAge;

    public Student(long studentId, String studentName, String studentEmail, long studentContactNo, double studentHeight, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentContactNo = studentContactNo;
        this.studentHeight = studentHeight;
        this.studentAge = studentAge;
    }

    public Student(long studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentContactNo = studentContactNo;
        this.studentHeight = studentHeight;
        this.studentAge = studentAge;
    }

    // default constructor
    public Student() {
        this.studentId = 0;
        this.studentName = null;
        this.studentEmail = null;
        this.studentContactNo = 0;
        this.studentHeight = 0.0;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public long getStudentContactNo() {
        return studentContactNo;
    }

    public void setStudentContactNo(long studentContactNo) {
        this.studentContactNo = studentContactNo;
    }

    public double getStudentHeight() {
        return studentHeight;
    }

    public void setStudentHeight(double studentHeight) {
        this.studentHeight = studentHeight;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
