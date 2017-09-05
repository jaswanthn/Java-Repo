package Exceptions;

public class Employee {

    private long emplyId;
    private String emplyName;
    private int emplySalary;

    public Employee() {
    }

    public Employee(long emplyId, String emplyName, int emplySalary) {
        this.emplyId = emplyId;
        this.emplyName = emplyName;
        this.emplySalary = emplySalary;
    }

    public long getEmplyId() {
        return emplyId;
    }

    public void setEmplyId(long emplyId) {
        this.emplyId = emplyId;
    }

    public String getEmplyName() {
        return emplyName;
    }

    public void setEmplyName(String emplyName) {
        this.emplyName = emplyName;
    }

    public int getEmplySalary() {
        return emplySalary;
    }

    public void setEmplySalary(int emplySalary) {
        this.emplySalary = emplySalary;
    }
}
