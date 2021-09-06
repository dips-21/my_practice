package aggregation;

import java.util.Iterator;

public class AggregationTest {
    public static void main(String[] args) {
       // String[] dep={};
        //String[] dep1=new String[5];
        //String[] dep2=new String[]{"comp","bio","physi"};
        College college=new College(new String[]{"comp","bio","physics","botony","zoology"},"st");
       // Iterator<String> iterator= college.new DeptIterator();
        Iterator<String> iterator= college.getDepartmentIterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s);
        }
    }
}
