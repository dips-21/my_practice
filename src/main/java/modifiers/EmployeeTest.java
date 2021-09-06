package modifiers;

import modifiers.os.Process;

public class EmployeeTest {
    public static void main(String[] args) {
 /*       Employee employee = new Employee(100, "dips", "aurangabad",5000,18);
        employee.setSal(-5000);

        employee.sal1=-9;
        System.out.println(employee);

        Employee employee1 = new Employee(100, "dips", "aurangabad",-100,18);
        System.out.println(employee1);

        Process p = new Process("dips-firefox", "12");
        System.out.println(p);

        Process p2 = new Process("dips-firefox-new-tab", "124","123", p);
        //p2.kill(); protected - outside package ,only through subclass instance
        TimedProcess tp = new TimedProcess("dips-firefox", "12");

        tp.kill();
        //p.p*/


        PermanentEmployee child = new PermanentEmployee(1, "d", "c", 10000, 19);
        System.out.println(child);
        child.print();
        System.out.println(((Employee) child).getAge());
        System.out.println();

    }

}
