package javatutorial.hr;

public class EmployeeTest {
    public static void main (String[]args){
        Employee e1 = new Employee();
        Employee e2 = new Employee(45000,5000);
        e1.setSal(50000);
        e1.setComm(2000);
        System.out.printf("Income of Dips=%.2f with Id=%d%n",e1.Income(),e1.getId());
        System.out.printf("Income of Mansi=%.2f with Id=%d%n",e2.Income(),e2.getId());
        System.out.printf("total of id=%d%n",Employee.getCount());
    }
}
