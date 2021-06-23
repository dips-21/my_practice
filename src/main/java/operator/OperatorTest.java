package operator;

import java.util.Arrays;

public class OperatorTest {
    public static void main(String[] args) {
        MathOpeartor mathOpeartor = new AddOpeartor();
        MathOpeartor mathOpeartor1 = new MultiplyOperator();


        int[] array = {10, 20, 30};//overriding call is based on its
        // matching parameters
        System.out.println("sum : " + mathOpeartor.evaluate(array));
        System.out.println("multiply : " + mathOpeartor1.evaluate(array));


        //  Person[] person = new Person[5];
        Person[] persons = {new Person(1, 56, 5.6, "dips"),
                new Person(2, 56, 5.6, "sneha"),
                new Person(3, 56, 5.6, "hitler"),
                new Person(4, 56, 5.6, "saguna")};
       // Arrays.sort(persons);  //Exception if Person does not implement comparable
        Arrays.sort(persons,new PersonNameComparator()); //Overloaded sort method
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
