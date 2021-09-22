package coreJava.collections;

import coreJava.abstraction.Child;
import coreJava.abstraction.Man;
import coreJava.abstraction.Person;
import coreJava.abstraction.Women;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class CollectionsDemoTest {

    @Test
    public void arrayList() {
        ArrayList<String> arrayList = new ArrayList<>();     //to string of abstract list and equals of set list
        arrayList.add("Dips");
        arrayList.add("Simmi");
        arrayList.add("sonakshi");
        arrayList.add("Raadha");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().length());
            System.out.println(arrayList.indexOf("sonakshi"));
            arrayList.add(2, "Harshada");

        }
    }

    @Test
    public void vector() {
        Vector<String> vector = new Vector<>();
        vector.add("ruhi");
        vector.add("dips");
        vector.add("hitesh");
        vector.add("gauri");

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().length());

        }
    }


    @Test
    public void HashSetContains() {
        HashSet<Person> hashSet = getTestHashSet();
        assertThat(hashSet.contains(new Man("ravi", 25, "learn")), is(true));

    }

    @Test
    public void HashSetRemove() {
        HashSet<Person> hashSet = getTestHashSet();
        assertThat(hashSet.remove(new Man("ravi", 25, "learn")), is("true"));
        System.out.println("after" + "" + hashSet.remove("ravi"));
        assertThat(hashSet.contains(new Man("ravi", 25, "learn")), is(false));

    }

    @Test
    public void HashSetDirectRemove() {
        HashSet<Person> hashSet = getTestHashSet();
        Iterator<Person> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println("before " + " " + itr.next());
            assertThat(hashSet.remove(new Man("ravi", 25, "learn")), is("true"));
        }
        System.out.println("after" + "" + hashSet.remove("ravi"));
        assertThat(hashSet.contains(new Man("ravi", 25, "learn")), is(false));

    }

    @Test
    public void HashSetAddDuplicates() {
        HashSet<Person> hashSet = getTestHashSet();
        hashSet.add(new Women("dips", 26, "fear"));
        hashSet.add(new Man("ravi", 25, "learn"));
        hashSet.add(new Child("sonu", 6, "play"));
        assertThat(hashSet.size(),is(5));
    }
    @Test
    public void HashSetAddDuplicates01() {
        HashSet<Person> hashSet = new HashSet<>();
        Women w1 = new Women("dips", 26, "fear");
        Man m1 = new Man("ravi", 25, "learn");
        Child c = new Child("sonu", 6, "play");

        hashSet.add(w1);
        hashSet.add(m1);
        hashSet.add(c);

        hashSet.add(w1);
        hashSet.add(m1);
        hashSet.add(c);
        assertThat(hashSet.size(),is(3));
    }

    @Test
    public void HashSetAddDuplicatesMan01() {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Man("ravi", 25, "learn"));
        hashSet.add(new Man("ravi", 25, "learn"));
        assertThat(hashSet.size(),is(2));
    }

    @Test
    public void HashSetAddDuplicatesChild01() {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Child("sonu", 6, "play")); //in rare case of hash code collision
        hashSet.add(new Child("sonu", 6, "play")); //of separate child objects
        assertThat(hashSet.size(),is(2)); //undefined behavior ,may be 1 in case of collision
    }

    private HashSet<Person> getTestHashSet() {

        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Women("dips", 26, "fear"));
        hashSet.add(new Man("ravi", 25, "learn"));
        hashSet.add(new Child("sonu", 6, "play"));
        return hashSet;
    }
}

