package met;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FeesTest {
    public static void main(String[] args) throws Exception {
       // FeesCalculator dac=new DAC();
       //double dac_fees=  dac.getMonthlyFees();
       String className=args[0];
       String methodName=args[1];
        Class<?> clazz = Class.forName(className);

       Object feesCalci= clazz.getConstructor().newInstance();
      Method method=clazz.getDeclaredMethod(methodName);
        double fees= (double) method.invoke(feesCalci);
        System.out.println(fees +" ");
    }
}
