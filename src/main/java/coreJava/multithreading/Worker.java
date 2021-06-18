package coreJava.multithreading;

public class Worker {

        public static int doWork(int count) {
            //23:52:56:300  23:52:56:400    //1000ms =1s
            long t = System.currentTimeMillis() + 100 * count;
            while(System.currentTimeMillis() < t); //Thread spinning
            return count * count;
        }
    }

