package collections1;

import java.io.*;
import java.util.ArrayList;

public class Employee implements Serializable{

    long emplyId;
     String emplyName;
     int emplySalary;

    public Employee(long emplyId, String emplyName, int emplySalary) {
        this.emplyId = emplyId;
        this.emplyName = emplyName;
        this.emplySalary = emplySalary;
    }

    public String toString() {
        return "Employee Id:" + emplyId + " Employee Name:" + emplyName + " Employee Salary:" + emplySalary + "\n";
    }

}

class ArrayListDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            ArrayList al = new ArrayList();
            al.add(new Employee(10001,"Kiran", 10000));
            al.add(new Employee(10002, "Mahesh", 20000));
            al.add(new Employee(10003, "Murthy", 30000));

            oos.writeObject(al);

            FileInputStream fi = new FileInputStream("employee.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.println(oi.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
