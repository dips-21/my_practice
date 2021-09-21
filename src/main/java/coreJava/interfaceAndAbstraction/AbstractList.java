package coreJava.interfaceAndAbstraction;

import java.util.List;

public abstract class AbstractList implements List {


    boolean equals(AbstractList list){
        for (int i = 0; i < list.size(); i++) {
            //this.get(i)==list.get(i);
        }
        return false;
    }
    abstract void add(int num);
}
