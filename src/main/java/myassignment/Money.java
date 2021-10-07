package myassignment;

public class Money {
    private int rupees;
    private int paisa;

    //r=1
    // r=31*r+rupee
    //r=31*r+paise

    public Money(int rupees, int paisa) {
        this.rupees = rupees + paisa / 100;
        this.paisa = paisa % 100;
    }

    public Money() {
        this(0, 0);
    }

    public Money(int rupees) {
        this(rupees, 0);
    }

    public int getPaisa() {
        return paisa;
    }

    public int getRupees() {
        return rupees;
    }

    public void setPaisa(int paisa) {
        this.paisa = paisa;
    }

    public void setRupees(int rupees) {
        this.rupees = rupees;
    }

    public void setTotal(int rupees, int paisa) {
        this.rupees = rupees;
    }

    @Override
    public String toString() {
        return "Total{" +
                "rupees=" + rupees + "," +
                " paisa=" + paisa + '}';
    }

    static Money total(Money first, Money second) {
        int rupees = first.rupees + second.rupees;
        int paisa = first.paisa + second.paisa;
        return new Money(rupees, paisa);
    }

    @Override
        public int hashCode() {
        int r = 1;
        r = r * 31 + rupees;
        r = r * 31 + paisa;
        return r;
    }
}
