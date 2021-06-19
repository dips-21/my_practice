package met;

public interface FeesCalculator{
    double getInterest();
    double getFees();
    short getPeriod();

    default double getMonthlyFees() {
        return (getFees() + (getInterest()) * getFees() / getPeriod());
    }

}
