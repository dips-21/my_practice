package met;

public class DACA implements FeesCalculator{

    @Override
    public double getInterest() {
        return 8;
    }

    @Override
    public double getFees() {
        return 79000;
    }

    @Override
    public short getPeriod() {
        return 6;
    }

    double getMonthlyFees() {
        return (getFees() + (getInterest()) * getFees() / getPeriod());
    }
}
