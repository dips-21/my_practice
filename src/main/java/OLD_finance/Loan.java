package finance1;

public abstract class Loan{
    double principle;
    float period;
    public Loan(double pri,float per){
        principle=pri;
        period=per;
    }
    public Loan(){
        this(0,0);
    }
    public final double getPrinciple(){return principle;}
    public final void setPrinciple(double value) {principle=value;}
    public final float getPeriod(){return period;}
    public final void setPeriod(float value){period=value;}
    public abstract float getRate();
    public final double getEMI(){
        double emi=(principle*(1+this.getRate()*period/100)/(12*period));
        return emi;

        }

    }

