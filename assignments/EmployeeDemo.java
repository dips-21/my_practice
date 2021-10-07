package assignments;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(5000, 500.0, 800);
        System.out.println("annual gross income = " + employee.getAnnualGrossIncome());
        System.out.println(employee.getDetails());


        employee = new Employee();
        System.out.println("annual gross income = " + employee.getAnnualGrossIncome());
        System.out.println(employee.getDetails());

        employee = new Employee(50000, 60);
        System.out.println("annual gross income = " + employee.getAnnualGrossIncome());
        System.out.println(employee.getDetails());
        try {
            employee = new Employee(-50);
            System.out.println("annual gross income = " + employee.getAnnualGrossIncome());
            System.out.println(employee.getDetails());
        } catch (IllegalArgumentException e) {
            System.out.println("Income cannot be calculated for negative salary.");
        }
        employee = new Employee(50000);
        System.out.println("annual gross income = " + employee.getAnnualGrossIncome());
        System.out.println(employee.getDetails());


    }
}
