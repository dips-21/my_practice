package payroll;

public class StaffTest {
    public static void main(String[] args) {
        Staff[] staffArray = {new FullTimeStaff("sneha", "accountant", "botony", 20000),
                new PartTimeStaff("mansi", "pune", 30, 40),
                new FullTimeStaff("aashu", "banglore", "accountant", 20000),
                new PartTimeStaff("dips", "mumbai", 10, 50)};

        for (Staff staff : staffArray) {
            System.out.println(staff + " " + staff.getIncome());

        }
        try {
            new PartTimeStaff("dips", "mumbai", -20, 50);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }
}


