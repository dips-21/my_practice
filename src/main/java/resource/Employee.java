package resource;

public abstract class Employee {
    private int hours;
    private int rate;

    public Employee(int hours, int rate) {
       this.hours = hours;
       this.rate = rate;
    }

    public int getHours() {
        return hours;
    }


    public void setHours(int hours) {
        hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getIncome() {
        double income = hours * rate;
        return income;
    }

    public double getTax() {
        double income = getIncome();
        if (income < 5000) {
            return 0;
        }
        if (income < 20000) {
            return 0.1 * income;
        }
        return 0.2 * income;
    }
}


