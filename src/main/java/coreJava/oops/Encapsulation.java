package coreJava.oops;

public class Encapsulation {

    public static void main(String[] args) {
        Person1 dipsy = new Person1();
        //dipsy.handLtength=-1;
        //dipsy.legLength=50;
        dipsy.setSize(30);
        dipsy.setAge(20);
        System.out.println(dipsy.getAge());
       // dipsy.setSize(-9);
    }
}
//chaos
class Person1 {
    private int legLength ;
    private int handLength ;
    private int age;//
    public void setSize(int length) {
        if (length < 0)
            throw new IllegalArgumentException("invalid length ,cannot be negative");
        legLength = length;
        handLength = length / 3;
    }   // lots of complex test code here}Now co


    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException("invalid age");
        }
        this.age=age;
    }

    }

