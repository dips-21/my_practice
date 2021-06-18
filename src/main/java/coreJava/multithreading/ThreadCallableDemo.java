package coreJava.multithreading;

import java.util.concurrent.*;

class ThreadCallableDemo {
    static class SumTillNCallable implements Callable<Integer> {
        int num;

        public SumTillNCallable(int num) {
            this.num = num;
        }

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                Thread.sleep(1000);
                sum += i;
            }
            // System.out.println("sum till "+num+" is "+sum);
            return sum;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // ThreadCallableDemo threadCallableDemo = new ThreadCallableDemo();
        //ThreadCallableDemo.SumTillNCallable s=ThreadCallableDemo.SumTillNCallable();
        ExecutorService executors = Executors.newFixedThreadPool(5);
        System.out.println("calculating sum til 5");
        Future<Integer> result1 = executors.submit(new SumTillNCallable(5));
        System.out.println("calculating sum til 10");
        Future<Integer> result2 =  executors.submit(new SumTillNCallable(10));
        System.out.println(" sum is "+result2.get());
        System.out.println("calculating sum til 15");
        Future<Integer> result3 =  executors.submit(new SumTillNCallable(15));
        System.out.println(" sum is "+result1.get());

        System.out.println(" sum is "+result3.get());
        executors.shutdown();
    }
}
