package coreJava.collections;

import coreJava.abstraction.Child;
import coreJava.abstraction.Man;
import coreJava.abstraction.Person;
import coreJava.abstraction.Women;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HashMapTest {

    @Test
    public void testMapPutGet() {  //hash code and equals matters of key
        HashMap<Women, Man> womenToManMap = new HashMap<>();
        womenToManMap.put(new Women("dips", 26, "worrying"), new Man("jo-bhi", 26, "timepass"));
        Man man = womenToManMap.get(new Women("dips", 26, "worrying"));
        assertThat(man.getName(), is("jo-bhi"));
    }

    @Test
    public void testMapSourceDestination() {
        HashMap<String, List<String>> womenToManMap = new HashMap<>();

    }

    @Test
    public void testWordCountMap() {
        String[] words = {"worry", "lorry", "fear", "belief", "irritate", "tension", "worry", "belief", "worry"};
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (!wordCountMap.containsKey(word)) {
                wordCountMap.put(word, 1);
            } else {
                int prevCount = wordCountMap.get(word);
                wordCountMap.put(word, prevCount + 1);
            }
        }
        System.out.println(wordCountMap);
        assertThat(wordCountMap.get("worry"), is(3));
        assertThat(wordCountMap.get("belief"), is(2));

    }

    @Test
    public void testPersonNotFoundOnGetWithoutHashcodeEquals() {
        Person[] allPersons = {new Person("dips", 26, "cry"),
                new Person("dips", 26, "cry"),
                new Person("tips", 26, "cry"),
                new Person("dips", 26, "cry"),
                new Person("dips", 26, "cry"),
                new Person("sanju", 23, "walk")};
        HashMap<Person, Integer> personCountMap = new HashMap<>();

        //   hashMap.put(new Person("sanju",23,"walk"),hashMap.put());
        for (Person p : allPersons) {
            if (!personCountMap.containsKey(p)) {
                personCountMap.put(p, 1);
            } else {
                Integer prevCount = personCountMap.get(p);
                personCountMap.put(p, prevCount + 1);
            }
        }
        Assert.assertNull(personCountMap.get(new Person("dips", 26, "cry")));
    }

    @Test
    public void testPersonNotFoundOnGetWithHashcodeEquals() {
        Person[] allPersons = {new Women("dips", 26, "cry"),
                new Women("dips", 26, "cry"),
                new Women("tips", 26, "cry"),
                new Women("dips", 26, "cry"),
                new Women("dips", 26, "cry"),
                new Women("sanju", 23, "walk")};

        HashMap<Person, Integer> hashMap = new HashMap<>();

        //   hashMap.put(new Person("sanju",23,"walk"),hashMap.put());
        for (Person p : allPersons) {
            if (!hashMap.containsKey(p)) {
                hashMap.put(p, 1);
            } else {
                Integer prevCount = hashMap.get(p);
                hashMap.put(p, prevCount + 1);
            }
        }
        assertThat(hashMap.get(new Women("dips", 26, "cry")), is(4));
    }

    @Test
    public void testChildOnGetWithEqualsAndWithoutHashCodeDoesNotGet() {
        Person[] allPersons = {new Child("dips", 26, "cry"),
                new Child("dips", 26, "cry"),
                new Child("tips", 26, "cry"),
                new Child("dips", 26, "cry"),
                new Child("dips", 26, "cry"),
                new Child("sanju", 23, "walk")};

        HashMap<Person, Integer> hashMap = new HashMap<>();

        //   hashMap.put(new Person("sanju",23,"walk"),hashMap.put());
        for (Person p : allPersons) {
            if (!hashMap.containsKey(p)) {
                hashMap.put(p, 1);
            } else {
                Integer prevCount = hashMap.get(p);
                hashMap.put(p, prevCount + 1);
            }
        }
        assertThat(hashMap.get(new Child("dips", 26, "cry")), is(4));
    }
}
