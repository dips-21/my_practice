package coreJava.multithreading;
public class MethodTest {
    interface Utility {
        boolean allowed(int n);
    }
    static class OddUtility implements Utility {
        public boolean allowed(int n) {
            return ((n % 2) != 0);
        }
    }
    static class EvenUtility implements Utility {
        public boolean allowed(int n) {
            return ((n % 2) == 0);
        }
    }
    static class MethodDemoTest {
        static boolean isPrime(int n) {
            if (n == 1)
                return false;
            if (n == 2)
                return true;
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
        static void printNumber(int[] numbers, Utility check) {
            for (int n : numbers) {
                if (check.allowed(n)) {
                    System.out.printf("%d ", n);
                }
            }
            System.out.printf("%n ====================================%n");
        }
        public static void main(String args[]) {
            int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Even numbers");
            //PrintNumber takes and object of class which implements utility interface
            //which is a function interface
            //in place of that we can pass method reference or Lamda expression also
            printNumber(numbers, new EvenUtility());
            printNumber(numbers, new OddUtility());
            printNumber(numbers, MethodDemoTest::isPrime);
        }
    }
}
//Below is an example of object of anonymous class which implements
//Utility is being passed , that is allowed
		/*printNumber(numbers, new Utility(){
          public boolean allowed(int n){
				if (n == 1)
					return false;
				if (n == 2)
					return true;
				for(int i = 2; i < n/2; i++){
					if (n%i == 0)
						return false;
				}
				return true;
			}

		});*/
