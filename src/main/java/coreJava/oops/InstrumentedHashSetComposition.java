package coreJava.oops;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSetComposition<E> {    //this has a set
    HashSet<E> set;
    int addCount=0;
    public InstrumentedHashSetComposition(){
        set=new HashSet<>();
    }
    public InstrumentedHashSetComposition(int initCap, float loadFactor) {
        set=new HashSet<>(initCap, loadFactor);
    }

    public boolean add(E e) {
        addCount++;
        return set.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return set.addAll(c);                //implementation detail of super.addAll
    }

    public int getAddCount() {
        return addCount;
    }
}
