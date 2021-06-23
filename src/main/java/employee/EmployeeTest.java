package employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Employee employee1=new Employee("Dips",26,50000,5000);
        System.out.println(employee1);
        System.out.println(employee);

        System.out.println("salary of first employee is :"+employee.income());
        System.out.println("salary of second employee is :"+employee1.income());
    }
}
