package finance;

public class FinanceDemo {
    public static void main(String[] args) {
        Loan loan=new PersonalLoan(5000,2);
        System.out.println(loan.getEMI());

        loan=new BasicLoan(20000,5);
        System.out.println(loan.getEMI());

        loan=new HomeLoan(10000,20);
        System.out.println(loan.getEMI());

        loan.setPeriod(8);
        System.out.println(loan);
        System.out.println(loan.getEMI());

        loan=new PersonalLoan(5000,4);
        System.out.println(loan.getEMI());
    }
}
