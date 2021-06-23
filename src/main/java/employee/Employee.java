package employee;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private double commission;

    public Employee(String name, int age, double salary, double commission) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.commission = commission;
        System.out.println("object created");
    }
    public Employee(){
        this("default",0,0,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getCommission() {
        return commission;
    }

    public void setCommission( double commission) {
        this.commission = commission;
    }


    public double income() {
        double i = salary * 1.1;
        return i;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", commission=" + commission +
                '}';
    }
}
