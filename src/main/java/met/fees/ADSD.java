package met.fees;

public class ADSD implements FeesCalculator {

    @Override
    public double getInterest() {
        return 5;
    }

    @Override
    public double getFees() {
        return 108000;
    }

    @Override
    public short getPeriod() {
        return 12;
    }

    public double getMonthlyFees() {
        return (getFees() + (getInterest()) * getFees() / getPeriod());

    }

   public double getMonthlyConcession() {
        return getMonthlyFees()/2;
    }
}
