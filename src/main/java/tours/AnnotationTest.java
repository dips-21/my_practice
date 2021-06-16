package tours;
import java.lang.reflect.Method;

public class AnnotationTest {

        public static void main(String[] args)throws Exception{
            int numOfDiscount = Integer.parseInt(args[0]);
            int numPassengers = Integer.parseInt(args[1]);
            Class<?> c = Class.forName(args[2]);

            Object scheme = c.getConstructor().newInstance();

            double totalCost=0;
            if(c.isAnnotationPresent(Discount.class)){
                System.out.printf("==Discount Applied== %n");
                Discount md = c.getAnnotation(Discount.class);
                double discountValue= md.value();
                String methodName=args[3];
                Method category = c.getMethod(methodName, int.class , int.class);
                totalCost = numOfDiscount * (float)category.invoke(scheme,numOfDiscount,numPassengers);
                totalCost = totalCost - (totalCost * discountValue /100);
                System.out.printf("Total cost = %.2f%n", totalCost);
            }
            else{
                System.out.printf("Total cost %.2f%n", totalCost);
            }
        }
    }

