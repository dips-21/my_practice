package coreJava;

import org.junit.Test;

import java.io.IOException;

public class FinalTest {

    @Test
    public void testFinally(){
        //findAverageIncome(100,0);
        findAverageIncome(600,0);
    }
    void f() throws IOException {
        //throw new IllegalArgumentException("invalid");
        throw new IOException("invalid");
    }

    void findAverageIncome(int total,int years){
      int avg=0;

        try{
            System.out.println("calculating");
            if(total>500)
                throw new IllegalArgumentException("invalid"); //unchecked

           avg= total/years;
            System.out.println("done");
        }
        catch (ArithmeticException e){
            System.out.println("exception");
          //  System.exit(0);
        }
        catch (IllegalArgumentException e){
            System.out.println("illegal argument");
        }
        catch (Exception e){
            System.out.println("all caught");
        }
        finally {
            System.out.println("finally");
        }
    }

}
