package resource;

//f(emp) {emp.getIncome()}
public class SalesPerson extends Employee {
    int sales;

    SalesPerson(int hours, int rate, int sales) {
        super(hours, rate);
        this.sales = sales;
    }

    public double getIncome() {
        double income = super.getIncome();
        return income + 0.25 * income;
    }
}
