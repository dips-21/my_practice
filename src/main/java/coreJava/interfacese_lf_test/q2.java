package coreJava.interfacese_lf_test;

public class q2 {
    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}

class Top {
    public Top(String s) {
        System.out.print("B");
    }
}

class Bottom2 extends Top {
    Bottom2(String s) {
        super(s);
        System.out.print("D");
    }


}

