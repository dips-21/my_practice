package conditionals;

public class TaxCalculator {

     static double getTax(int salary, int age) {
        double actual_tax = 0;
        if (salary >= 150000 && salary <= 500000) {
            actual_tax = ((double) 15 / 100) * salary;
        } else if ((salary >= 500000 && salary <= 2000000)) {
            if (age <= 60)
                actual_tax = ((double) 20 / 100) * salary;
            else
                actual_tax = ((double) 15 / 100) * salary;

        } else if (salary >= 2000000) {
            if (age <= 60)
                actual_tax = ((double) 30 / 100) * salary;
            else
                actual_tax = ((double) 25 / 100) * salary;
        } else
            actual_tax=0;
        return actual_tax;
    }
}
