package coreJava.collections;

import coreJava.abstraction.Man;
import coreJava.abstraction.Person;
import coreJava.abstraction.Women;
import modifiers.PermanentEmployee;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HashMapTest {

    @Test
    public void testMapPutGet() {
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
    public void testWordCountMapOfPerson() {
        HashMap<Person,Integer>hashMap=new HashMap<>();


    }


}