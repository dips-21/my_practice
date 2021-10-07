package finance1;

class AbstractClassTest2 {
    private static double payTotalEMI(Loan[] list) {
        double totalEMI = 0;
        for (Loan acc : list) {
            totalEMI = totalEMI + acc.getEMI();
        }
        return totalEMI;
    }

    public static void main(String[] args) {
        Loan[] a = new Loan[5];
        a[0] = Banker.l1(200000, 8);
        a[1] = Banker.l(220000, 8);
        a[2] = Banker.l1(2100000, 8);
        a[3] = Banker.l(100000, 8);
        a[4] = Banker.l1(2400000, 8);
        System.out.printf("EMI of HomeLoan1=%f%n", a[0].getEMI());
        System.out.printf("EMI of PersonalLoan1=%f%n", a[1].getEMI());
        System.out.printf("EMI of HomeLoan2=%f%n", a[2].getEMI());
        System.out.printf("EMI of PersonalLoan2=%f%n", a[3].getEMI());
        System.out.printf("EMI of HomeLoan3=%f%n", a[4].getEMI());
        System.out.printf("TOTAL EMI=%f%n", payTotalEMI(a));
    }
}

