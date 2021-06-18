package multithreading;

import java.lang.reflect.Constructor;

public class CurrentThreadDemo {
    public static void main(String[] args)  {
       /* int[] arr={9};
        int i=arr[5];
        Thread a=null;
        a.start();*/
        Thread r=Thread.currentThread();
        System.out.println("current thread "+r);
        r.setName("new thread");
        System.out.println("after change name "+r);
        try {
            printNum();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void printNum() throws InterruptedException {
        for (int i = 5; i >0 ; i--) {
            System.out.println(i);
                Thread.sleep(1000);

        }
    }
}
