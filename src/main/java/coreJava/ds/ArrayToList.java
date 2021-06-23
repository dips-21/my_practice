package coreJava.ds;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    public static void main(String args[]) {
//Creating Array
        String[] array = {"Java", "Python", "PHP", "C++"};
        System.out.println("Printing Array: " + array);
//Converting Array to List
        List<String> list = new ArrayList<String>();
        for (String lang : array) {
            list.add(lang);
        }
        System.out.println("Printing List: " + list);

    }
}


