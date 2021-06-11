package payroll;

public class SubClassTest1 {
    private static double tax(payroll.Employee emp){
        double i=emp.income();
        return i > 10000 ? 0.15 * (i - 10000) : 0;
    }

    public static void main(String[] args) {
    Employee jack=new Employee();
     jack.getHours();
     jack.setRate(52);
     System.out.printf("Jack's ID is %d, INCOME is %.2f and TAX is %.2f%n", jack.getId(), jack.income(), tax(jack));
     //var jill=new payroll.SalesPerson(186,52,48000);
      //  System.out.printf("jill's Id is %d,Income is %.2f and Tax is %.2f",jill.getId(),jill.income(),tax(jill));
    }
}
