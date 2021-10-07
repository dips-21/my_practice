package finance1;

final class PersonalLoan extends Loan implements ITaxable {
    public PersonalLoan(double pri, float per) {
        super(pri, per);
    }

    public PersonalLoan() {
        this(100000, 5);
    }

    public float getRate() {
        if (principle <= 500000) {
            return 15.0f;
        } else {
            return 16.0f;
        }
    }

    public double getTax() {
        double tax;
        if ((getEMI() > 5000) && (getEMI() < 10000)) {
            System.out.printf("EMI:%.2f%n", getEMI());
            tax = 0.1 * getEMI();
        } else if (getEMI() > 10000) {
            tax = 0.2 * getEMI();
        } else tax = 0;
        return tax;
    }
}