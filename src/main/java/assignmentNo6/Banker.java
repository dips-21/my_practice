package assignmentNo6;

public class Banker {

    public static Loan pl() {
        Loan p = new PersonalLoan();

        return p;

    }

    public static Loan pl(double p, float t) {
        Loan pl1 = new PersonalLoan(p, t);

        return pl1;

    }

    public static Loan hl() {
        Loan h = new HomeLoan();

        return h;

    }

    public static Loan hl(double p, float t) {
        Loan h = new HomeLoan(p, t);

        return h;

    }

    private Banker(int l1,int rate) {
    }
}

