package assignmentNo6;

final class PersonalLoan extends Loan implements ITaxable{

EMIAdjustmentCalculator emiAdjustmentCalculator;
    public PersonalLoan(double pr, float pe){
        super(pr, pe);
        emiAdjustmentCalculator=new EMIAdjustmentCalculator();
    }

    public PersonalLoan(){

        this(10000, 5);

    }

    public float getRate(){

        if(getPrinciple() <= 500000)
            return 15;

        return 16;
    }

    public double getTax() {

        double emi = getEMI();
        return emiAdjustmentCalculator.get(emi);
    }


    @Override
    public String toString() {
        return "PersonalLoan{" +
                "principle=" + principle +
                ", period=" + period +
                '}';
    }
}
