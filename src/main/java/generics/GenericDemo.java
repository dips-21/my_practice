package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        Lottery lottery=new Lottery();
        lottery.id=123;
        //lottery.id="123";
      String s= (String) lottery.getId();
      int i= (Integer) lottery.getId();
        System.out.println(i);

        GenericLottery<Integer> genericLottery=new GenericLottery<>();
        genericLottery.id=123;

        GenericLottery<String> genericLottery1=new GenericLottery<>();
        genericLottery1.id=(String) "123";

        List myList=new ArrayList<>();
        myList.add(1);
        int ii= (int) myList.get(0);
        myList=new ArrayList<>();
        myList.add("abcd");
        int ij= (int) myList.get(0);

        List<Integer> myIntList=new ArrayList<>();
        myIntList.add(123);

        List<String> myStringList=new ArrayList<>();
        myStringList.add("abc");

    }
}
