package assignmentNo6;
import java.util.ArrayList;
import java.util.List;


public class LoanTest {
    public static void main(String[] args) {
        System.out.println("Array");
        new LoanTest().printLoan();


    }
    //@Test
    static public void printLoan(){
        Loan[] loans={new HomeLoan(),new HomeLoan(100f,40f),new PersonalLoan(),new PersonalLoan(5000f,300f)};
        Loan.printLoanDetails(loans);
    }


    public void printLoan_02(){
        //  Loan[] loans={new HomeLoan(),new HomeLoan(100f,40f),new PersonalLoan(),new PersonalLoan(5000f,300f)};
        // List<Loan> loanList= Arrays.asList(loans);
        List<Loan> loanList =new ArrayList<>();
        loanList.add(new HomeLoan());
        loanList.add(new HomeLoan(100f,40f));
        loanList.add(new PersonalLoan());
        loanList.add(new PersonalLoan(10000f,400f));
        Loan.printLoanDetails(loanList);
    }

}