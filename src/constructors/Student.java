package constructors;

public class Student {

    //public static int b;

    long studentId;
    String studentName;
    String studentAddress;
    long studentHomePhone;

    public Student() {
        //System.out.println("Default constructor initiated");
    }

    public Student(long studentId) {
        this();
        this.studentId = studentId;
    }

    public Student(long studentId, String studentName) {
        this(studentId);
        this.studentName = studentName;
    }

    public Student(long studentId, String studentName, String studentAddress) {
        this(studentId, studentName);
        this.studentAddress = studentAddress;
    }

    public Student(long studentId, String studentName, String studentAddress, long studentHomePhone) {
        this(studentId, studentName, studentAddress);
        this.studentHomePhone = studentHomePhone;
    }

    public void display() {
        System.out.println(" StudentId: " + this.studentId + " StudentName: " + this.studentName + " StudentAddress: "
                + this.studentAddress + " StudentHomePhone: " + this.studentHomePhone);
    }


    public static void main(String[] args) {
        Student st1 = new Student();
        st1.display();

        Student st2 = new Student(1000001);
        st2.display();

        Student st3 = new Student(1000002, "Kiran");
        st3.display();

        Student st4 = new Student(1000003, "Ravi", "Guntur" );
        st4.display();

        Student st5 = new Student(1000004, "Mohan", "Chennai", 90103423410l);
        st5.display();

    }
}
