package coreJava.comparable;


public class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;
    int age;


    public Person(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;

    }

    @Override
    public int compareTo(Person person) {
        int result = this.name.compareTo(person.name);

        if (result == 0) {
            if (this.age == person.age) {
                return Integer.compare(this.weight, person.weight);
            }

            if (this.age > person.age) {
                return 1;
            }
        }
        if (result > 0) {
            return 1;
        }
        return -1;
    }
}
