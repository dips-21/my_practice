package met;

public class DAC implements FeesCalculator{

    @Override
    public double getInterest() {
        return 10;
    }

    @Override
    public double getFees() {
        return 89000;
    }

    @Override
    public short getPeriod() {
        return 6;
    }

  /*  double getMonthlyFees() {
        return (getFees() + (getInterest()) * getFees() / getPeriod());
    }*/
}
