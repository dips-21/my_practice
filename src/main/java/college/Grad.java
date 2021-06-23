package college;

public class Grad extends Student {

    @Override
    boolean isPassed(int grade) {
        if (grade > 80)
            return true;
        return false;
    }

    public Grad(String name, int id, int age, String address) {
        super(name, id, age, address);
    }
}
