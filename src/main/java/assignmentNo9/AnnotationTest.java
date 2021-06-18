package assignmentNo9;
import java.lang.reflect.Method;

public class AnnotationTest {

        public static void main(String[] args) throws Exception{
            int numOfDiscount = Integer.parseInt(args[0]);
            int numPassengers = Integer.parseInt(args[1]);
            Class<?> c = Class.forName(args[2]);  //class type

            Object scheme = c.getConstructor().newInstance();//object creation ,constructor call

            double totalCost=0;
            if(c.isAnnotationPresent(Discount.class)){
                System.out.printf("==Discount Applied== %n");
                Discount md = c.getAnnotation(Discount.class);/////////reference
                double discountValue= md.value();
                String methodName=args[3];
                Method category = c.getMethod(methodName, int.class , int.class); //method reference on class level obj
                //non static method call on object scheme , scheme.registered(5,89)
                totalCost = numOfDiscount * (float)category.invoke(scheme,numOfDiscount,numPassengers);
                totalCost = totalCost - (totalCost * discountValue /100);
                System.out.printf("Total cost = %.2f%n", totalCost);
            }
            else{
                System.out.printf("Total cost %.2f%n", totalCost);
            }
        }
    }

