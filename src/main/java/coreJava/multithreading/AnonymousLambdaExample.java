package coreJava.multithreading;

public class AnonymousLambdaExample {
    int num=0;
     class incrementsRunnable implements Runnable{
        @Override
        public void run() {
         num=num+5;
        }
    }
    //Runnable incrementRunnable=new incrementsRunnable();
    Runnable incrementRunnable=new Runnable() {              //anonymous
        @Override
        public void run() {
            num = num + 5;
        }
    };

}
