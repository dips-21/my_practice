package assignmentJni;

public class NativeMethodTest {
        private native static double CalculatedInterest(double principle,double rate, int period);

        public static void main(String[] args){
            System.loadLibrary("nmtsup");

            double p = Double.parseDouble(args[0]);
            double r = Double.parseDouble(args[1]);
            int pp = Integer.parseInt(args[2]);
            System.out.println(CalculatedInterest(p,r,pp));
        }
    }

