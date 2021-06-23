package college;

public class UnderGrad extends Student {

    @Override
    boolean isPassed(int grade) {
        if (grade > 70)
            return true;

        return false;
    }


    public UnderGrad(String name, int id, int age, String address) {
        super(name, id, age, address);
    }
}
