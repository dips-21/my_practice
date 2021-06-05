package finance;

public class BasicLoan extends Loan {
    BasicLoan(float principle,float period){
        super(principle, period);
    }
  @Override
    public float getRate(){
        return 10;
  }
}
