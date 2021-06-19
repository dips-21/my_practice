package finance;

class PersonalLoan extends Loan implements ITTaxable {

    public PersonalLoan(float principle, float period) {

        super(principle, period);
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

    @Override
    public double getTax() {
        return 0;
        //0-5k 0
        //5k-10 10%
        //>10k 20%

    }
}
