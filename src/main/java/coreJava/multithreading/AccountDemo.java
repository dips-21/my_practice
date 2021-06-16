package coreJava.multithreading;

import datastructure.arrays.RunningSum;

import java.util.Random;

public class AccountDemo {
    int balance = 25000;
    int count = 0;
final Object lock=new Object();
    void withdraw(int amount) throws InterruptedException {
        Thread.sleep(Math.abs(new Random(100).nextInt() % 300)); //20000
        balance -= amount;

        while (count < 100) {
            synchronized (lock) {
                count++;
                Thread.sleep(Math.abs(new Random(100).nextInt() % 100)); //20000
                System.out.println("withdraw count= " + count);
            }
        }

    }


boolean flag=false;
    void deposit(int amount) throws InterruptedException {
        //Thread.sleep(Math.abs(new Random(100).nextInt()%300));
        balance += amount;
        while (count < 100) {
            synchronized (lock) {
                count++;
                Thread.sleep(Math.abs(new Random(100).nextInt() % 100)); //20000
                System.out.println("deposit count= " + count);
                flag=true;
            }
        }
    }

    static class Counter implements Runnable {
        int num = 0;

        @Override
        public void run() {
            while (true) {
                System.out.println(" " + num);
                num++;
                if (num > 20)
                    break;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //  Counter counter = new Counter();
        AccountDemo accountDemo = new AccountDemo();
        Runnable depositRunnable = () -> {
            try {
                accountDemo.deposit(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable withdrawRunnable = () -> {
            try {
                accountDemo.withdraw(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(depositRunnable);
        thread.setName("deposit-thread");
        thread.start();
        Thread thread1 = new Thread(withdrawRunnable);
        thread1.setName("withdraw-thread");
        thread1.start();
        System.out.println("thread started");
        int c = 0;
        while (true) {
            if (c > 50) break;
            ;
            // System.out.println( ""+accountDemo.balance);
            c++;
            Thread.sleep(Math.abs(new Random(100).nextInt() % 300));
        }
        thread.join();
        thread1.join();
        System.out.println("main finished");
    }
}

