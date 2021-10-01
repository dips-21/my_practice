package coreJava.collections;

import coreJava.abstraction.Man;
import coreJava.comparable.Person;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionOfArrayListTest {
    @Test
    public void finalArrayListOfList() {
        final List<String> list = new ArrayList<>();
        list.add("re");
        list.set(0, "changed");
        assertThat(list.get(0), is("changed"));
        list.set(0, "belief is stupid");
        assertThat(list.get(0), is("belief is stupid"));
      //  list=new ArrayList<>(); cannot reassign
        final int i=5;
    }

    @Test
    public void arrayListOfList() {
        List<List<String>> perDayMovieChoices = new ArrayList<>();
        perDayMovieChoices.add(Arrays.asList("ddlj", "tarzan"));
        perDayMovieChoices.add(Arrays.asList("x-men", "tipu-sultan"));
        perDayMovieChoices.add(Arrays.asList("men", "tipu-sultan"));
        perDayMovieChoices.add(Arrays.asList("women", "tipu-sultan"));

        List<String> oneDayChoice = perDayMovieChoices.get(2);
        assertThat(oneDayChoice.get(0), is("men"));
        assertThat(perDayMovieChoices.get(3).get(0), is("women"));
    }
/*    class mlist{
        Object[] elements;
        Object get(int i){

        }
    }*/
    /*    class myslist<T>{  new myslist<Integer>
       (T[]) Object[] elements;
        T get(int i){
        (T)list.get(i) //cast Object to T
        }
    }*/

    /**
     * @see coreJava.collections.CollectionOfArrayListTest#genericArrayListIsSafe()
     */
    @Test(expected = ClassCastException.class)
    public void rawArrayListIsUnsafe() { //unsafe means failure at runtime
        List mylist = new ArrayList<>();
        mylist.add(50);
        mylist.add("ten");
        mylist.add(new Person("d", 50, 50, 8));
        Integer i = (Integer) mylist.get(1); //run time cast Object to Integer
    }

    @Test
    public void genericArrayListIsSafe() { //safe means compile time error
        List<Integer> mylist = new ArrayList<>();
        mylist.add(50);
        //mylist.add("ten"); //error
        // mylist.add(new Person("d",50,50,8)); //error
        mylist.add(70);
        Integer i = (Integer) mylist.get(1);
        List<String> mylistOfString = new ArrayList<>();
        mylistOfString.add("one");

    }

    @Test
    public void arrayIsCovariant() {
        Object[] objects = {"one", 123, "two"};
        String[] strings = {"one", "two", "three"};
        assertThat(objects instanceof Object[], is(true));
        assertThat(strings instanceof Object[], is(false));
        assertThat(strings instanceof String[], is(true));

    }

    @Test
    public void arrayListOfGenerics() {
        List<Person> persons = new ArrayList<>();
        // persons.add(1,);
    }

    @Test
    public void arrayListOfGenericsWithSameOrChildType() {
        List<Person> persons = new ArrayList<>();  //wildcard
        //persons.add();
        getPersonFromList(persons, 2);

    }

    Person getPersonFromList(List<? extends Person> persons, int i) {

        return persons.get(i);
    }

    @Test
    public void arrayListOfGenericsWithSameOrParenTypeOfMan() {
        List<? super Man> persons = new ArrayList<>();

    }

    @Test
    public void arrayListOfGenericsWithSameOrParenTypeOfPerson() {
        List<? super Person> persons = new ArrayList<>();

    }
}