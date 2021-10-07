package finance1;
    class AbstractClassTest {
        public static void main(String[] args) {
            Loan jack = Banker.l();
            System.out.printf("jack emi for personal loan: %.2f%n", jack.getEMI());
            Loan jill = Banker.l(4000000, 2);
            System.out.printf("jill emi for personal loan: %.2f%n", jill.getEMI());
            if (jill instanceof ITaxable) {
                ITaxable t = (ITaxable) jill;
                System.out.printf("Tax for Personal tax: %f%n", t.getTax());
            }
            Loan john = Banker.l1();
            System.out.printf("john emi for home loan: %.2f%n", john.getEMI());
            Loan jason = Banker.l1(5000000, 40);
            System.out.printf("jason emi for home loan: %.2f%n", jason.getEMI());
            if (jason instanceof Discountable) {
                Discountable d = (Discountable) jason;
                System.out.printf("Tax for Home Discount: %f%n", d.getDiscount());
            }
        }
    }

