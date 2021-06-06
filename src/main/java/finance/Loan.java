package finance;

public abstract class Loan {
    protected float principle;
    protected float period;

     public Loan(float principle,float period){
        this.principle=principle;
        this.period=period;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "principle=" + principle +
                ", period=" + period +
                '}';
    }

    public abstract float getRate();

    public float getPrinciple() {
        return principle;

    }

    public void setPrinciple(float principle) {
        this.principle = principle;
    }

    public float getPeriod() {
        return period;
    }

    public void setPeriod(float period) {
        this.period = period;
    }

 public float getEMI(){
     float emi= principle * (1 + getRate() * period / 100) / (12 * period);
     return emi;
 }
}
