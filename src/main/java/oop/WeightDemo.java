package oop;

public class WeightDemo {
    public static void main(String[] args) {
        Weight w=new Weight(2,400);
        Weight w1=new Weight(3,900);
        Weight w2=new Weight(5,800);
        System.out.println(w.toString());
          System.out.println(w1.toString());
        System.out.println(w1==w2);
        Weight w3=w;
        System.out.println(w3=w);
        //Weight result=Weight.add(w1,w2);
        //System.out.println("result ="+result);
        w1.add(w2);
        System.out.println("w1 ="+w1);
        System.out.println("w2 ="+w2);
        w2.add(w);
        System.out.println("w2 ="+w2);
        System.out.println("w=  "+w);
    }
}
