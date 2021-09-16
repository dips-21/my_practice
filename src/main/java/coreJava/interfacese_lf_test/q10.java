package coreJava.interfacese_lf_test;

public class q10 {
}

class Tenor extends Singer {

    public static String sing() {
        return "fa";
    }

    public static void main(String[] args) {
         Tenor t = new Tenor();
         Singer s = new Tenor();
         System.out.println(t.sing() + " " + s.sing());

    }
}

class Singer {
    public static String sing() {
        return "la";
    }
}
