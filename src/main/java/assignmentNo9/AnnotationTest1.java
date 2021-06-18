package assignmentNo9;
import java.lang.reflect.Method;
import java.util.Scanner;

public class AnnotationTest1 {
    //boilerplate
      //java AnnotationTest1 5 25 tours.BusinessTour nonRegistered
        public static void main(String[] args)throws Exception{
            Scanner scanner=new Scanner(System.in);
            //int numOfDiscount = Integer.parseInt(args[0]);
            int numOfDiscount = scanner.nextInt() ;
           // int numOfPassenger = Integer.parseInt(args[1]);
            int numOfPassenger = scanner.nextInt();
            //Object obj=new Object();
            //obj.getClass()
            String className =scanner.next();
            Class<?> c = Class.forName(className);
            Object scheme = c.getConstructor().newInstance();

            double totalCost=0;
            if(c.isAnnotationPresent(Tax.class)){
                System.out.printf("==Tax Applied== %n");
                String methodName = scanner.next();
                Method category = c.getMethod(methodName, int.class , int.class);
                totalCost = numOfDiscount * (float)category.invoke(scheme,numOfDiscount,numOfPassenger); //scheme.registered(numOfDiscount,numOfPassenger)

                Tax md = c.getAnnotation(Tax.class);
                double percentTaxValue= md.value();
                totalCost = totalCost + (totalCost * percentTaxValue /100);
                System.out.printf("Total cost = %.2f%n", totalCost);
            }
            else{
                System.out.printf("Total cost %.2f%n", totalCost);
            }
        }
    }
