package operator;

public class AddOpeartor implements MathOpeartor{

    @Override
    public int evaluate(int[] arr) {
        int total = 0;
        for (int element : arr) {
            total += element;
        }
        return total;
    }

    @Override
    public Person evaluate(Person person1, Person person2) {
        return null;
    }
}
