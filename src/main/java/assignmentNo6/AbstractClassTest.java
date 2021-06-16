package assignmentNo6;

class AbstractClassTest{

    public static void main(String[] args){
        Loan jack = Banker.pl();
        System.out.printf("Jack's EMI for Personal Loan: %.2f%n", jack.getEMI());

        if(jack instanceof ITaxable){
            ITaxable k = (ITaxable) jack;
            System.out.printf("Tax : %.2f%n", k.getTax());
        }

        Loan jill = Banker.pl(200000, 4);
        System.out.printf("Jill's EMI for Personal Loan: %.2f%n", jill.getEMI());
        if(jill instanceof ITaxable){
            ITaxable j = (ITaxable) jill;
            System.out.printf("Tax : %.2f%n", j.getTax());
        }

        Loan john = Banker.hl();
        System.out.printf("John's EMI for Home Loan: %.2f%n", john.getEMI());
        if(john instanceof Discountable){
            Discountable j = (Discountable) john;
            System.out.printf("Discount : %.2f%n", j.getDiscount());
        }

        Loan jason = Banker.hl(5000000, 35);
        System.out.printf("Jason's EMI for Home Loan: %.2f%n", jason.getEMI());
        if(jason instanceof Discountable){
            Discountable j = (Discountable) jason;
            System.out.printf("Discount : %.2f%n", j.getDiscount());
        }

    }

}
