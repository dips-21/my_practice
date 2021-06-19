package resource;

public class IncomeTest {
    public static void main(String[] args) {
        Employee[]employees ={new Accountant(30,1000),new SalesPerson(7,99999,1200),new Accountant(8,9000)};
        double totalTax=0;
        for (Employee emp:employees) {
            System.out.println("income= "+emp.getIncome()+" tax= "+emp.getTax());
          totalTax+= emp.getTax();

        }
        System.out.println(totalTax);
    }
}
