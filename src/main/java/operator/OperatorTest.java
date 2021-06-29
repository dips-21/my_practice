package operator;

import java.util.Arrays;

public class OperatorTest {
    public static void main(String[] args) {
        MathOpeartor addOpeartor = new AddOpeartor();
        MathOpeartor multiplyOperator = new MultiplyOperator();


        int[] array = {10, 20, 30};//overriding call is based on its
        // matching parameters
        System.out.println("sum : " + addOpeartor.evaluate(array));
        System.out.println("multiply : " + multiplyOperator.evaluate(array));


        //Person[] persons = new Person[5];//                      created array or
        Person[] persons = {new Person(1, 56, 5.6, "dips"),
                new Person(2, 56, 5.6, "sneha"),
                new Person(3, 56, 5.6, "hitler"),
                new Person(4, 56, 5.6, "saguna")};
       //Arrays.sort(persons);  //Exception if Person does not implement comparable  (class cast exception)
        //Arrays.sort(persons,new PersonNameComparator()); //Overloaded sort method   person.campareto we use that in above statement
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
