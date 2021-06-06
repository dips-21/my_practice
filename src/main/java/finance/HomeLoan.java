package finance;

public class HomeLoan extends Loan {
    /*HomeLoan(){
        super(1.0f,1.0f);
    }*/
    HomeLoan(float principle,float period){
        super(principle,period);
    }

    @Override
    public float getRate() {
        if(this.principle<2000000){
            return 10;
        }
        else{
            return 11;
        }

    }

}
