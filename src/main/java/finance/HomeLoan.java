package finance;

public class HomeLoan extends Loan{
    private double limit=2500000;
    public HomeLoan(float principle,float period){
        super(principle,period);
    }
    public HomeLoan(){

        this(100000,5);
    }

    public float getRate(){

        if(principle<=2000000)
            return 10.0f;
        else if
        (principle>2500000)

            return 12.0f;

        return 11.0f;
    }
}
