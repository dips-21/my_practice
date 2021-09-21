package coreJava.oops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InstrumentedHashSetTest {

    @Test
    public void add() {
        InstrumentedHashSet<String> set=new InstrumentedHashSet<>();

        set.addAll(Arrays.asList("dips","jean","jack"));
        System.out.println(set.getAddCount());


    }

    @Test
    public void add01() {
        InstrumentedHashSetComposition<String> set=new InstrumentedHashSetComposition<>();
        set.addAll(Arrays.asList("dips","jean","jack"));
        System.out.println(set.getAddCount());
    }

}