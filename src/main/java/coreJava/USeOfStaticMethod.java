package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class USeOfStaticMethod {

    static int num = getInitial();

    private static int getInitial() {
        return 5;
    }

    static {
        System.out.println("Static Block 1");
        System.out.println( num = 68) ;
        //initialisation code for static fields (class level) ,Run only once on class loading
        //for eg College software ,all students will share same college object
        //static final Logger ,System.Out(not needed class)
    }

    static {
        System.out.println("Static Block 2");
        num = 98;
    }

    static int sum(int a, int b) {         //static method need not hold any state of object like in sort method of array
        return a + b;                  //  it ll not take any other method reference or cl to other .its not depend of another
                                        //method,it simply takes parameter sort them n return it.
    }

    void sort(int[] num) {

        Arrays.sort(num);                                 //compile time binding ,no overhead of run time lookup
        // Collections.sort(list); Utility methods ,do not need to access(state) non static fields of this class
        // Collections.binarySearch()
        //       Arrays.binarySearch()
    }


    public static void main(String args[]) {
        System.out.println("Value of num: " + num);
        USeOfStaticMethod staticMethod = new USeOfStaticMethod();
        System.out.println(staticMethod.sum(5, 10));
        int[] num = {10, 40, 20, 40, 30, 70};
        staticMethod.sort(num);
        System.out.println(Arrays.toString(num));
    }
}

