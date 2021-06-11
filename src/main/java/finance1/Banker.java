package finance1;

public class Banker {
    public static Loan l(){
        Loan l=new PersonalLoan();
        return l;
     }
     public static Loan l(double pr,float pe){
        Loan l=new PersonalLoan(pr,pe);
        return l;
    }
    public static Loan l1() {
        Loan l1 = new HomeLoan();
        return l1;
    }
    public static Loan l1(double pr,float pe){
        Loan l1=new HomeLoan(pr,pe);
        return l1;
    }
        private Banker(){}
    }

