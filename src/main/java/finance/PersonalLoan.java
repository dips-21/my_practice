package finance;

class PersonalLoan extends Loan{

    public PersonalLoan(float principle,float period){

        super(principle,period);
    }
    public PersonalLoan(){

        this(100000,5);
    }
    public float getRate(){

        if(principle<=500000){
            return 15.0f;
        } else{
            return 16.0f;
        }
    }
}
