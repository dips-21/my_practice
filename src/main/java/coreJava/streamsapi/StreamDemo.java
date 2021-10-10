package coreJava.streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(Arrays.asList("Dips","Sleep","Disturbed"));
        Stream<String> stream = list.stream();

       // Stream<String> streamMapped = stream.map((value) -> value.toUpperCase()).sorted().limit(2);
        /*List<String> streamMapped = stream.map((value) -> value.toUpperCase()).
                sorted().limit(2).collect(Collectors.toList());*/
        List<String>  streamMapped = stream.map((value) -> value)
                .collect(Collectors.toList());
        System.out.println(streamMapped);
        boolean res=list==streamMapped;
       // String res=list==streamMapped;
        System.out.println("list==streamMapped   "+res ); //
        System.out.println("list.equals(streamMapped)  = "+ list.equals(streamMapped));
        /*List<String>  filterMapped= stream.map((value) -> value.toUpperCase()).
                filter(x->x.startsWith("D")).collect(Collectors.toList());*/ //stream already closed on collect earlier
        //illegalstate
        /*List<String>  filterMapped= list.stream().map((value) -> value.toUpperCase()).
                filter(x->x.startsWith("DIP")).collect(Collectors.toList());
        System.out.println(filterMapped);
*/
        List<String> filterMapped=list.stream().map((value)->value.toLowerCase()).filter(x->x.matches("Sleep")).
                collect(Collectors.toList());
        System.out.println(filterMapped);

    }
}
