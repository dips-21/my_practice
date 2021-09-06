import college.Student;

import java.util.ArrayList;

public class StringIntern {
    public static void main(String[] args) {
        String s1 = "point";

        String s11 = "java";         //literal
        String s2 = s1.intern();     //intern
        String poolobj = "Javatpoint";
        String s3 = new String(poolobj);
        String s4 = s3.intern();
        String s5 = "dips";
        String s6 = "Javatpoint";
        String s7 = new String("dips");


        checkEqual(s1, s2, "s2==s11");
        checkEqual(s4, s3, "s4==s3");
        checkEqual(s4, s3.intern(), "s4==s3.intern()");
        checkEqual(s1, s11, "s1==s11");
        checkEqual(poolobj, s4, "poolobj==s4");
        checkEqual(s6, poolobj, "s6==poolobj");
        checkEqual(s3, s6, "s3==s6");

        // String s5 = null;
        System.out.println(s1.equals(s5));
        //  System.out.println(s5.equals(s1)); //nullpointer

    }

    private static void checkEqual(String s1, String s2, String msg) {
        boolean result = s1 == s2;
        System.out.println(msg + " = " + result); // False
    }
}

