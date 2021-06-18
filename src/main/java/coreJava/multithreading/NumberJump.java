package coreJava.multithreading;

public class NumberJump {
    int num = 0; //0 5 4 9 8 13 12 17 16
    final Object lock = new Object();
    boolean isIncrementTurn = true;

    Runnable incrementRunnable = () -> {
        while (true) {
            synchronized (lock) {
                if (isIncrementTurn == false) {           // if(!isIncrementTurn){..}
                    try {
                        Thread.sleep(1000);
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else { //flag true
                    num += 5;
                    System.out.println(Thread.currentThread().getName()+" " + num + " ");
                    isIncrementTurn = false;
                    lock.notify();
                }
            }
        }
    };


    Runnable decrementRunnable = () -> {
        while (true) {
            synchronized (lock) {
                if (isIncrementTurn == true) {
                    try {
                        Thread.sleep(1000);
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else { //flag false
                    num -= 5;
                    System.out.println(Thread.currentThread().getName()+" " + num + " ");
                    isIncrementTurn = true;
                    lock.notify();
                }
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        new NumberJump().incrementDecrement();
    }

    void incrementDecrement() throws InterruptedException {
        Thread incThread = new Thread(incrementRunnable,"inc-thread");
       // incThread.setDaemon(true);
        incThread.start();
        Thread decThread = new Thread(decrementRunnable,"dec-thread");
        //decThread.setDaemon(true);
        decThread.start();
        System.out.println("done");
        }
    }
