package assignments;

public class Employee {
    private double salary;
    private double commission;
    private double bonus;

    public Employee() {
        this.salary = 5000;
        this.bonus = salary / 5;
        this.commission = salary * 20 / 100;
    }

    public Employee(double salary) {
        this.salary = salary;
        validate();
        this.bonus = salary / 20;
        this.commission = salary * 20 / 100;
    }

    public Employee(double salary, double commission, double bonus) {
        this.salary = salary;
        validate();
        this.commission = commission;
        this.bonus = bonus;
    }

    public Employee(double salary, double bonus) {
        this.salary = salary;
        validate();
        this.commission = salary * 20 / 100;
        this.bonus = bonus;
    }

    private void validate() {
        if (salary < 0)
            throw new IllegalArgumentException("Salary must be greater than zero.");
    }


    public double getAnnualGrossIncome() {
        return (salary + commission) * 12 + bonus;
    }

    String getDetails() {
        return "salary :" + salary + " commision: " + commission + " bonus: " + bonus;
    }


}
