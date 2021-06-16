
package assignmentNo6;

import java.util.List;

public abstract class Loan {

    double principle;
    float period;

    public Loan(double pr, float pe) {
        principle = pr;
        period = pe;
    }

    public Loan() {
        this(0, 0);
    }

    public final double getPrinciple() {
        return principle;
    }

    public final void setPrinciple(double value) {
        principle = value;
    }


    public final float getPeriod() {
        return period;
    }

    public final void setPeriod(float value) {
        period = value;
    }

    public abstract float getRate();

    public final double getEMI() {
        double emi = this.getPrinciple() * (1 + this.getRate() * this.getPeriod() / 100) / (12 * this.getPeriod());

        return emi;
    }

    static void printLoanDetails(Loan[] loans) {
        for (Loan loan : loans) {
            print(loan);
        }
    }

    static void printLoanDetails(List<Loan> loans) {
        for (Loan loan : loans) {
            print(loan);
        }
    }
    private static void print(Loan loan) {
            System.out.print(loan);
            if (loan instanceof Discountable) {
                Discountable discountable = ((Discountable) loan);
                System.out.println("discount on loan " + loan + " is :" + discountable.getDiscount());
            } else if (loan instanceof ITaxable) {
                ITaxable iTaxable = (ITaxable) loan;
                System.out.println("Tax on loan " + loan + " is:" + iTaxable.getTax());
            }

    }

 /*   static void print(Loan loan){
       // System.out.println("= "+discountable.getDiscount());
    }

    static void print(ITaxable iTaxable){
        System.out.println("= "+iTaxable.getTax());
    }*/
}








