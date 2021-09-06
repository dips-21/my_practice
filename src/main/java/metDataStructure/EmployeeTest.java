package metDataStructure;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        int ch;
        EmployeeData employeeData= new EmployeeData();
        Scanner in = new Scanner(System.in);
        employeeData.createStack();
        do{
            System.out.println("\n1. Add Employee\n" +
                    "2. Delete Employee\n" +
                    "3. Search Employee\n" +
                    "4. Print Employees\n" +
                    "0. Exit : ");
            ch=in.nextInt();

            switch (ch) {
                case 1://add
                    System.out.println("Enter Employee id, name and salary :");
                    int id = in.nextInt();
                    String name = in.next();
                    double salary = in.nextInt();
                    employeeData.addEmployee(id, name ,salary);
                    break;

                case 2://delete
                    employeeData.deleteEmployee();
                    break;

                case 3://search
                    System.out.println("Enter Employee ID :");
                    int val = in.nextInt();
                    employeeData.searchEmployee(val);
                    break;

                case 4://print
                    employeeData.printEmployee();
                    break;

                case 0://exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        } while(ch != 0);
    }
}
