package finance1;
final class HomeLoan extends Loan implements Discountable {
    private double limit = 2500000;
    public HomeLoan(double principle, float period) {
        super(principle, period);
    }
    public HomeLoan() {
        this(100000, 5);
    }
    public float getRate() {
        if (principle <= 2000000)
            return 10.0f;
        else if
        (principle > 2500000)
            return 12.0f;
        return 11.0f;
    }
    public double getDiscount() {
        double discount;
        if ((getEMI() > 5000) && (getEMI() < 10000)) {
            System.out.printf("EMI:%.2f%n", getEMI());
            discount = 0.1 * getEMI();
        } else if (getEMI() > 10000) {
            discount = 0.2 * getEMI();
        } else discount = 0;
        return discount;
    }
}

