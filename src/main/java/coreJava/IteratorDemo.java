package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo{
    static void f(int ... p){ //var args

    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("Dips","jean,mytique","jill"));
       // f(1);
        //f(1,2);
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()){
            String next = listIterator.next();
            list.add("raven");
            System.out.println(next);
        }
    }
}
