package Exceptions;

import java.util.Scanner;

public class ExceptionsDemo2 {

    static Employee[] emp;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of employee records you want to save");
        int totalEmpl = sc.nextInt();
        emp = new Employee[totalEmpl];
        for (int i = 0; i < totalEmpl; i++) {
            Employee e = new Employee();
            System.out.println("Enter employee details\n Enter Id");
            e.setEmplyId(sc.nextLong());
            System.out.println("Enter Name");
            e.setEmplyName(sc.next());
            System.out.println("Enter salary");
            e.setEmplySalary(sc.nextInt());
            emp[i] = e;
        }

        System.out.println("Enter emp id to search");
        searchById(sc.nextLong());

    }

    public static void searchById(long id) {

        Scanner sc = new Scanner(System.in);
        boolean foundEmp = false;
        try {
            for (int i = 0; i < emp.length; i++) {
                if (emp[i].getEmplyId() == id) {
                    foundEmp = true;
                    System.out.println("Employee Found with Id: " + emp[i].getEmplyId() + " Name: " + emp[i].getEmplyName());
                }
            }

            if (!foundEmp) {
                throw new EmployeeException("Employee not found exception");
            }
        } catch (EmployeeException e) {
            e.printStackTrace();
            System.out.println("Enter correct id");
            searchById(sc.nextLong());
        } finally {

        }
    }
}
