package finance;

public class PersonalLoan extends Loan {
    PersonalLoan(float principle, float period) {
        super(principle, period);
    }

    @Override
    public float getRate() {
        if (this.principle < 500000) {
            return 15;
        } else {
            return 16;
        }
    }

}
