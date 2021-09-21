package coreJava.comparable;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PersonTest {

    @Test
    public void compareTo() {
        Person person = new Person("dips", 6, 56, 27);
        Person person1 = new Person("sona", 7, 57, 29);
        assertThat(person.compareTo(person1), is(-1));
    }

    @Test
    public void compareTo01() {
        Person person1 = new Person("dips", 6, 56, 27);
        Person person2 = new Person("sona", 7, 57, 29);
        assertThat(person1.compareTo(person2), is(-1));
        assertThat(person2.compareTo(person1), is(1));
    }

    @Test
    public void compareTo02() {
        Student student1 = new Student("dips", 6, 56, 27, 80);
        Student student2 = new Student("ruhi", 7, 57, 29, 89);
        Student student3 = new Student("ruhi", 7, 57, 28, 89);
        assertThat(student1.compareTo(student2), is(-1));
        assertThat(student2.compareTo(student1), is(1));
        assertThat(student2.compareTo(student3), is(0));
    }

    @Test
    public void compareWithSameMarksDifferentName() {
        Student student1 = new Student("dips", 6, 56, 27, 80);
        Student student2 = new Student("ruhi", 7, 57, 29, 80);
        assertThat(student2.compareTo(student1), is(1));
        assertThat(student1.compareTo(student2), is(-1));
    }

    @Test
    public void compareModel() {
        Model model1 = new Model("mansi", 4, 56, 26, 6, "fair");
        Model model2 = new Model("Mystique", 7, 57, 25, 5, "sky blue");
        assertThat(model1.compareTo(model2), is(1));
        assertThat(model2.compareTo(model1), is(-1));
    }

    @Test
    public void compareModel01() {
        Model model1 = new Model("dips", 4, 56, 26, 6, "fair");
        Model model2 = new Model("Mystique", 7, 57, 25, 6, "sky blue");
        assertThat(model1.compareTo(model2), is(Matchers.lessThan(0)));
        assertThat(model2.compareTo(model1), is(Matchers.greaterThan(0)));
    }

    @Test
    public void compareModelComparable() {
        Model model1 = new Model("dips", 4, 56, 26, 6, "fair");
        Model model2 = new Model("Mystique", 7, 57, 25, 6, "sky blue");
        assertThat(model1.compareTo(model2), is(Matchers.lessThan(0)));
        assertThat(model2.compareTo(model1), is(Matchers.greaterThan(0)));
    }

    @Test
    public void compareModelComparator() {
        Model model1 = new Model("dips", 4, 56, 26, 6, "fair");
        Model model2 = new Model("Mystique", 4, 56, 25, 7, "sky blue");
        HeightWeightHairLengthComparator comparator = new HeightWeightHairLengthComparator();
        assertThat(comparator.compare(model1, model2), is(Matchers.lessThan(0)));
        assertThat(comparator.compare(model2, model1), is(Matchers.greaterThan(0)));
        HeightWeightComparator comparator1 = new HeightWeightComparator();
        assertThat(comparator1.compare(model1, model2), is(0));
    }

    @Test
    public void compareModelComparable01() {
        Model model1 = new Model("", 4, 56, 26, 6, "");
        Model model2 = new Model("", 7, 57, 25, 6, "");
        assertThat(model1.name.compareTo(model1.name), is(""));

    }

}