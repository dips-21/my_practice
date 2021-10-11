package recursion;

import org.junit.Test;

public class PowerOfNumTest {

    PowerOfNum powerOfNum=new PowerOfNum();
    @Test
    public void getPowerOfNumber() {
   double result= powerOfNum.getPower(2,3);
        System.out.println(result);
    }


    @Test
    public void getPowerOfNumberInNegative() {
        double result= powerOfNum.getPower(2,-3);
        System.out.println(result);
    }



    @Test
    public void getPowerOfNumberInNegative02() {
        double result= powerOfNum.getPower(2,-6);
        System.out.println(result);
    }

    @Test
    public void getPowerOfTwoInNegative() {
        double result= powerOfNum.getPower(2,-1);
        System.out.println(result);
    }

}
