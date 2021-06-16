package assignmentNo6;
//import finance1.*;
final class HomeLoan extends Loan implements Discountable {

    private double limit = 2500000;
    EMIAdjustmentCalculator emiAdjustmentCalculator;

    public HomeLoan(double pr, float pe) {
        super(pr, pe);
        emiAdjustmentCalculator = new EMIAdjustmentCalculator();
    }

    public HomeLoan(double pr, float pe,EMIAdjustmentCalculator calculator) {
        super(pr, pe);
        emiAdjustmentCalculator = calculator;
    }

    public HomeLoan() {

        this(1000000, 5);

    }

    public float getRate() {

        if (getPrinciple() <= limit)
            return 10;
        else if (getPrinciple() > limit)
            return 12;
        return 11;
    }

    public double getDiscount() {
        double emi = getEMI();
        return emiAdjustmentCalculator.get(emi);
    }

    @Override
    public String toString() {
        return "HomeLoan{" +
                "principle=" + principle +
                ", period=" + period +
                '}';
    }
}

