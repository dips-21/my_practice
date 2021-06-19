package met;

enum Gender {MALE, FEMALE};

public class Employee implements Comparable<Employee> {
    private String empName;
    private double height;
    private double weight;
    private double salary;
    private Gender gender;


    public Employee(String empName, double height, double weight, double salary, Gender gender) {
        this.empName = empName;
        this.height = height;
        this.weight = weight;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getEmpName() {
        return empName;
    }
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }
    @Override
    public int compareTo(Employee o) {
        char[] thisName = this.empName.toCharArray();
        char[] otherName = o.empName.toCharArray();
        return compareString(thisName, otherName);
    }

    static int compareString(char[] thisName, char[] otherName) {
        int minLength;
        if (thisName.length < otherName.length)
            minLength = thisName.length;
        else
            minLength = otherName.length;     //Orpnge Other

        for (int i = 0; i < minLength; i++) {
            if (thisName[i] > otherName[i]) {
                return 1;
            }
            if (thisName[i] < otherName[i]) {
                return -1;
            }
        }
        return 0;
    }
}


//return this.empName.compareTo(o.empName);