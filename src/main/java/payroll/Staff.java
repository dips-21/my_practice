package payroll;

public abstract class Staff {
    String name;
    String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract  double getIncome();

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
