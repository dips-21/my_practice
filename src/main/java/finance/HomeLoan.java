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
float rate;
        if(principle<=2000000)
            rate= 10.0f;
        else
            rate=11.0f;

        if(principle>limit){
            return 1+rate;
        }
        return rate;
    }
}
