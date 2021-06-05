package payroll;

public class SubClassTest2 {
    private static double averageIncome;
public static double averageIncome(Employee[] group){
    double total=0;
    for(Employee emp:group){
        total+=emp.income();
    }
    return total/ group.length;
}
private static double totalSales(Employee[]group){
    double total=0;
    for(Employee emp:group){
        if(emp instanceof SalesPerson){
            SalesPerson sp = (SalesPerson) emp;
            total += sp.getSales();
        }
    }
    return total;
        }
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(186, 52); //employees[0].class => Employee.class
        employees[1] = new Employee(175, 95);
        employees[2] = new SalesPerson(190, 60, 65000); //implicit conversion from subclass type to superclass type required by LSP
        employees[3] = new Employee(200, 150);
        employees[4] = new SalesPerson(165, 45, 35000); //employees[4].class => SalesPerson.class
        System.out.printf("Average income = %.2f%n", averageIncome(employees));
        System.out.printf("Total sales = %.2f%n", totalSales(employees));

        for (Employee e:employees){
            System.out.println(e.hashCode());
        }
    }
}





