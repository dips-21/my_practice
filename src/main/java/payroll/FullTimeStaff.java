package payroll;

public class FullTimeStaff extends Staff{
    String Department;
    double salary;

    public FullTimeStaff(String name,String address,String department, double salary) {
        super(name, address);
        Department = department;
        this.salary = salary;
    }

    @Override
    double getIncome() {
        return salary;
    }
}
