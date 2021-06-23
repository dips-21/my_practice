package finance;

public class FinanceDemo {
    public static void main(String[] args) {
        Loan loan=new PersonalLoan(5000,2);
        //loan=new Loan(5000,2);
        System.out.println(loan.getEMI());

        loan=new BasicLoan(20000,5);
        System.out.println(loan);
        System.out.println(loan.getEMI());

        loan=new HomeLoan(10000,20);
        System.out.println(loan.getEMI());

        loan.setPeriod(8);
        System.out.println(loan.toString());
        System.out.println(loan.getEMI());

        loan=new PersonalLoan(5000,4);
        System.out.println(loan.getEMI());
        FinanceDemo financeDemo=new FinanceDemo();
       Loan loan1=new HomeLoan(10000,20);
        financeDemo.print((HomeLoan) loan1);
        financeDemo.print(null);
    }

   /* void print(String s){
        System.out.println("s");
    }*/
    void print(Loan loan){
        System.out.println("loan");
    }

    void print(HomeLoan loan){
        System.out.println("homeloan");
    }
}
